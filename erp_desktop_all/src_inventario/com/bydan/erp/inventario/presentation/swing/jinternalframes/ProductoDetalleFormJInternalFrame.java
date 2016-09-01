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
public class ProductoDetalleFormJInternalFrame extends ProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProducto;
	
	protected JMenuBar jmenuBarDetalleProducto;
	
	protected JMenu jmenuDetalleProducto;
	protected JMenu jmenuDetalleArchivoProducto;
	protected JMenu jmenuDetalleAccionesProducto;
	protected JMenu jmenuDetalleDatosProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProducto;	
	protected GridBagConstraints gridBagConstraintsProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProducto;		
	
	
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
	
	

	public ProveedorProductoBeanSwingJInternalFrame proveedorproductoBeanSwingJInternalFrame=null;
	public ProveedorProductoBeanSwingJInternalFrame proveedorproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProveedorProducto=false;
	public ProveedorProductoSessionBean proveedorproductoSessionBean;

	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;
	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrecio=false;
	public PrecioSessionBean precioSessionBean;

	public DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFrame=null;
	public DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleImpuestoInven=false;
	public DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean;

	public PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame=null;
	public PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentas=false;
	public PresupuestoVentasSessionBean presupuestoventasSessionBean;

	public PoliticaProductoBeanSwingJInternalFrame politicaproductoBeanSwingJInternalFrame=null;
	public PoliticaProductoBeanSwingJInternalFrame politicaproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticaProducto=false;
	public PoliticaProductoSessionBean politicaproductoSessionBean;

	public SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFrame=null;
	public SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSerieProducto=false;
	public SerieProductoSessionBean serieproductoSessionBean;

	public UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFrame=null;
	public UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUbicacionProdu=false;
	public UbicacionProduSessionBean ubicacionproduSessionBean;

	public ParametroProductoBeanSwingJInternalFrame parametroproductoBeanSwingJInternalFrame=null;
	public ParametroProductoBeanSwingJInternalFrame parametroproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroProducto=false;
	public ParametroProductoSessionBean parametroproductoSessionBean;

	public ProductoUnidadBeanSwingJInternalFrame productounidadBeanSwingJInternalFrame=null;
	public ProductoUnidadBeanSwingJInternalFrame productounidadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoUnidad=false;
	public ProductoUnidadSessionBean productounidadSessionBean;

	public IngredienteBeanSwingJInternalFrame ingredienteBeanSwingJInternalFrame=null;
	public IngredienteBeanSwingJInternalFrame ingredienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteIngrediente=false;
	public IngredienteSessionBean ingredienteSessionBean;

	public ProductoCaracBeanSwingJInternalFrame productocaracBeanSwingJInternalFrame=null;
	public ProductoCaracBeanSwingJInternalFrame productocaracBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoCarac=false;
	public ProductoCaracSessionBean productocaracSessionBean;

	public ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFrame=null;
	public ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteServicioCliente=false;
	public ServicioClienteSessionBean servicioclienteSessionBean;

	public ProductoPromocionBeanSwingJInternalFrame productopromocionBeanSwingJInternalFrame=null;
	public ProductoPromocionBeanSwingJInternalFrame productopromocionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoPromocion=false;
	public ProductoPromocionSessionBean productopromocionSessionBean;

	public ProductoEspeciBeanSwingJInternalFrame productoespeciBeanSwingJInternalFrame=null;
	public ProductoEspeciBeanSwingJInternalFrame productoespeciBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoEspeci=false;
	public ProductoEspeciSessionBean productoespeciSessionBean;

	public ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame=null;
	public ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoReempla=false;
	public ProductoReemplaSessionBean productoreemplaSessionBean;

	public ProductoEstadisticaBeanSwingJInternalFrame productoestadisticaBeanSwingJInternalFrame=null;
	public ProductoEstadisticaBeanSwingJInternalFrame productoestadisticaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoEstadistica=false;
	public ProductoEstadisticaSessionBean productoestadisticaSessionBean;

	public PoliticaFactuBeanSwingJInternalFrame politicafactuBeanSwingJInternalFrame=null;
	public PoliticaFactuBeanSwingJInternalFrame politicafactuBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticaFactu=false;
	public PoliticaFactuSessionBean politicafactuSessionBean;

	public ProductoCuentaContableBeanSwingJInternalFrame productocuentacontableBeanSwingJInternalFrame=null;
	public ProductoCuentaContableBeanSwingJInternalFrame productocuentacontableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoCuentaContable=false;
	public ProductoCuentaContableSessionBean productocuentacontableSessionBean;

	public BodegaProductoBeanSwingJInternalFrame bodegaproductoBeanSwingJInternalFrame=null;
	public BodegaProductoBeanSwingJInternalFrame bodegaproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBodegaProducto=false;
	public BodegaProductoSessionBean bodegaproductoSessionBean;

	public PresupuestoProductoBeanSwingJInternalFrame presupuestoproductoBeanSwingJInternalFrame=null;
	public PresupuestoProductoBeanSwingJInternalFrame presupuestoproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoProducto=false;
	public PresupuestoProductoSessionBean presupuestoproductoSessionBean;

	public SaldoMesProductoBeanSwingJInternalFrame saldomesproductoBeanSwingJInternalFrame=null;
	public SaldoMesProductoBeanSwingJInternalFrame saldomesproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSaldoMesProducto=false;
	public SaldoMesProductoSessionBean saldomesproductoSessionBean;
	
	
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
	
	public ProductoLogic productoLogic;
	
	public JScrollPane jScrollPanelDatosProducto;
	public JScrollPane jScrollPanelDatosEdicionProducto;
	public JScrollPane jScrollPanelDatosGeneralProducto;
	
	protected JPanel jPanelCamposProducto;    
	protected JPanel jPanelCamposOcultosProducto;    	
	protected JPanel jPanelAccionesProducto;
	protected JPanel jPanelAccionesFormularioProducto;
    
	
	
	protected JTabbedPane jTabbedPaneCamposProducto;	
	protected Integer iXPanelCamposProducto=0;
	protected Integer iYPanelCamposProducto=0;
	
	protected Integer iXPanelCamposOcultosProducto=0;
	protected Integer iYPanelCamposOcultosProducto=0;
	
	

	protected JPanel jPanelCamposIniciogeneralProducto;
	protected Integer iXPanelCamposIniciogeneralProducto=0;
	protected Integer iYPanelCamposIniciogeneralProducto=0;

	protected JPanel jPanelCamposIniciodatoProducto;
	protected Integer iXPanelCamposIniciodatoProducto=0;
	protected Integer iYPanelCamposIniciodatoProducto=0;

	protected JPanel jPanelCamposIniciocaracteristicaProducto;
	protected Integer iXPanelCamposIniciocaracteristicaProducto=0;
	protected Integer iYPanelCamposIniciocaracteristicaProducto=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProducto;
	public JButton jButtonModificarProducto;
	public JButton jButtonActualizarProducto;
    public JButton jButtonEliminarProducto;
	public JButton jButtonCancelarProducto;
    public JButton jButtonGuardarCambiosProducto;
	public JButton jButtonGuardarCambiosTablaProducto;
	protected JButton jButtonCerrarProducto;
	
	
	protected JButton jButtonProcesarInformacionProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProducto;
	protected JButton jButtonModificarToolBarProducto;
	protected JButton jButtonActualizarToolBarProducto;
    protected JButton jButtonEliminarToolBarProducto;
	protected JButton jButtonCancelarToolBarProducto;
    protected JButton jButtonGuardarCambiosToolBarProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarProducto;
	protected JButton jButtonCerrarToolBarProducto;
	
	protected JButton jButtonProcesarInformacionToolBarProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProducto;
	protected JMenuItem jMenuItemModificarProducto;
	protected JMenuItem jMenuItemActualizarProducto;
    protected JMenuItem jMenuItemEliminarProducto;
	protected JMenuItem jMenuItemCancelarProducto;
    protected JMenuItem jMenuItemGuardarCambiosProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProducto;
	protected JMenuItem jMenuItemCerrarProducto;
	protected JMenuItem jMenuItemDetalleCerrarProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProducto;
	protected JMenuItem jMenuItemMostrarOcultarProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProducto;
	public JLabel jLabelIdProducto;
	public JLabel jLabelidProducto;
	public JButton jButtonidProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProducto;
	public JLabel jLabelcodigoProducto;
	public JTextField jTextFieldcodigoProducto;
	public JButton jButtoncodigoProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreProducto;
	public JLabel jLabelnombreProducto;
	public JTextArea jTextAreanombreProducto;
	public JScrollPane jscrollPanenombreProducto;
	public JButton jButtonnombreProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_extranjeroProducto;
	public JLabel jLabelnombre_extranjeroProducto;
	public JTextArea jTextAreanombre_extranjeroProducto;
	public JScrollPane jscrollPanenombre_extranjeroProducto;
	public JButton jButtonnombre_extranjeroProductoBusqueda= new JButtonMe();

	public JPanel jPanelresumen_detalleProducto;
	public JLabel jLabelresumen_detalleProducto;
	public JTextArea jTextArearesumen_detalleProducto;
	public JScrollPane jscrollPaneresumen_detalleProducto;
	public JButton jButtonresumen_detalleProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_barraProducto;
	public JLabel jLabelcodigo_barraProducto;
	public JTextField jTextFieldcodigo_barraProducto;
	public JButton jButtoncodigo_barraProductoBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoProducto;
	public JLabel jLabelesta_activoProducto;
	public JCheckBox jCheckBoxesta_activoProducto;
	public JButton jButtonesta_activoProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProducto;
	public JLabel jLabeldescripcionProducto;
	public JTextArea jTextAreadescripcionProducto;
	public JScrollPane jscrollPanedescripcionProducto;
	public JButton jButtondescripcionProductoBusqueda= new JButtonMe();

	public JPanel jPanelprecioProducto;
	public JLabel jLabelprecioProducto;
	public JTextField jTextFieldprecioProducto;
	public JButton jButtonprecioProductoBusqueda= new JButtonMe();

	public JPanel jPanelivaProducto;
	public JLabel jLabelivaProducto;
	public JTextField jTextFieldivaProducto;
	public JButton jButtonivaProductoBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorProducto;
	public JLabel jLabeliva_valorProducto;
	public JTextField jTextFieldiva_valorProducto;
	public JButton jButtoniva_valorProductoBusqueda= new JButtonMe();

	public JPanel jPaneliceProducto;
	public JLabel jLabeliceProducto;
	public JTextField jTextFieldiceProducto;
	public JButton jButtoniceProductoBusqueda= new JButtonMe();

	public JPanel jPanelice_valorProducto;
	public JLabel jLabelice_valorProducto;
	public JTextField jTextFieldice_valorProducto;
	public JButton jButtonice_valorProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoProducto;
	public JLabel jLabeldescuentoProducto;
	public JTextField jTextFielddescuentoProducto;
	public JButton jButtondescuentoProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorProducto;
	public JLabel jLabeldescuento_valorProducto;
	public JTextField jTextFielddescuento_valorProducto;
	public JButton jButtondescuento_valorProductoBusqueda= new JButtonMe();

	public JPanel jPanelarancel_porcentajeProducto;
	public JLabel jLabelarancel_porcentajeProducto;
	public JTextField jTextFieldarancel_porcentajeProducto;
	public JButton jButtonarancel_porcentajeProductoBusqueda= new JButtonMe();

	public JPanel jPanelarancel_valorProducto;
	public JLabel jLabelarancel_valorProducto;
	public JTextField jTextFieldarancel_valorProducto;
	public JButton jButtonarancel_valorProductoBusqueda= new JButtonMe();

	public JPanel jPanelcomisionProducto;
	public JLabel jLabelcomisionProducto;
	public JTextField jTextFieldcomisionProducto;
	public JButton jButtoncomisionProductoBusqueda= new JButtonMe();

	public JPanel jPanelcomision_valorProducto;
	public JLabel jLabelcomision_valorProducto;
	public JTextField jTextFieldcomision_valorProducto;
	public JButton jButtoncomision_valorProductoBusqueda= new JButtonMe();

	public JPanel jPaneldias_produccionProducto;
	public JLabel jLabeldias_produccionProducto;
	public JTextField jTextFielddias_produccionProducto;
	public JButton jButtondias_produccionProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_stock_negativoProducto;
	public JLabel jLabelcon_stock_negativoProducto;
	public JCheckBox jCheckBoxcon_stock_negativoProducto;
	public JButton jButtoncon_stock_negativoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_precio_minimoProducto;
	public JLabel jLabelcon_precio_minimoProducto;
	public JCheckBox jCheckBoxcon_precio_minimoProducto;
	public JButton jButtoncon_precio_minimoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_loteProducto;
	public JLabel jLabelcon_loteProducto;
	public JCheckBox jCheckBoxcon_loteProducto;
	public JButton jButtoncon_loteProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_confirmacionProducto;
	public JLabel jLabelcon_confirmacionProducto;
	public JCheckBox jCheckBoxcon_confirmacionProducto;
	public JButton jButtoncon_confirmacionProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_presupuestoProducto;
	public JLabel jLabelcon_presupuestoProducto;
	public JCheckBox jCheckBoxcon_presupuestoProducto;
	public JButton jButtoncon_presupuestoProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_importacionProducto;
	public JLabel jLabelcon_importacionProducto;
	public JCheckBox jCheckBoxcon_importacionProducto;
	public JButton jButtoncon_importacionProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_finalProducto;
	public JLabel jLabelcon_finalProducto;
	public JCheckBox jCheckBoxcon_finalProducto;
	public JButton jButtoncon_finalProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_consepProducto;
	public JLabel jLabelcon_consepProducto;
	public JCheckBox jCheckBoxcon_consepProducto;
	public JButton jButtoncon_consepProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_serieProducto;
	public JLabel jLabelcon_serieProducto;
	public JCheckBox jCheckBoxcon_serieProducto;
	public JButton jButtoncon_serieProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_balanzaProducto;
	public JLabel jLabelcon_balanzaProducto;
	public JCheckBox jCheckBoxcon_balanzaProducto;
	public JButton jButtoncon_balanzaProductoBusqueda= new JButtonMe();

	public JPanel jPanelaltoProducto;
	public JLabel jLabelaltoProducto;
	public JTextField jTextFieldaltoProducto;
	public JButton jButtonaltoProductoBusqueda= new JButtonMe();

	public JPanel jPanelanchoProducto;
	public JLabel jLabelanchoProducto;
	public JTextField jTextFieldanchoProducto;
	public JButton jButtonanchoProductoBusqueda= new JButtonMe();

	public JPanel jPanellargoProducto;
	public JLabel jLabellargoProducto;
	public JTextField jTextFieldlargoProducto;
	public JButton jButtonlargoProductoBusqueda= new JButtonMe();

	public JPanel jPanelvolumenProducto;
	public JLabel jLabelvolumenProducto;
	public JTextField jTextFieldvolumenProducto;
	public JButton jButtonvolumenProductoBusqueda= new JButtonMe();

	public JPanel jPanelpesoProducto;
	public JLabel jLabelpesoProducto;
	public JTextField jTextFieldpesoProducto;
	public JButton jButtonpesoProductoBusqueda= new JButtonMe();

	public JPanel jPanelgramosProducto;
	public JLabel jLabelgramosProducto;
	public JTextField jTextFieldgramosProducto;
	public JButton jButtongramosProductoBusqueda= new JButtonMe();

	public JPanel jPanelunidades_cajaProducto;
	public JLabel jLabelunidades_cajaProducto;
	public JTextField jTextFieldunidades_cajaProducto;
	public JButton jButtonunidades_cajaProductoBusqueda= new JButtonMe();

	public JPanel jPanelmargenProducto;
	public JLabel jLabelmargenProducto;
	public JTextField jTextFieldmargenProducto;
	public JButton jButtonmargenProductoBusqueda= new JButtonMe();

	public JPanel jPanelfactorProducto;
	public JLabel jLabelfactorProducto;
	public JTextField jTextFieldfactorProducto;
	public JButton jButtonfactorProductoBusqueda= new JButtonMe();

	public JPanel jPanelfobProducto;
	public JLabel jLabelfobProducto;
	public JTextField jTextFieldfobProducto;
	public JButton jButtonfobProductoBusqueda= new JButtonMe();

	public JPanel jPanelfob2Producto;
	public JLabel jLabelfob2Producto;
	public JTextField jTextFieldfob2Producto;
	public JButton jButtonfob2ProductoBusqueda= new JButtonMe();

	public JPanel jPanelgrupoProducto;
	public JLabel jLabelgrupoProducto;
	public JTextArea jTextAreagrupoProducto;
	public JScrollPane jscrollPanegrupoProducto;
	public JButton jButtongrupoProductoBusqueda= new JButtonMe();

	public JPanel jPanelreferenciaProducto;
	public JLabel jLabelreferenciaProducto;
	public JTextArea jTextAreareferenciaProducto;
	public JScrollPane jscrollPanereferenciaProducto;
	public JButton jButtonreferenciaProductoBusqueda= new JButtonMe();

	public JPanel jPanelaplicacionProducto;
	public JLabel jLabelaplicacionProducto;
	public JTextArea jTextAreaaplicacionProducto;
	public JScrollPane jscrollPaneaplicacionProducto;
	public JButton jButtonaplicacionProductoBusqueda= new JButtonMe();

	public JPanel jPanelprocedenciaProducto;
	public JLabel jLabelprocedenciaProducto;
	public JTextArea jTextAreaprocedenciaProducto;
	public JScrollPane jscrollPaneprocedenciaProducto;
	public JButton jButtonprocedenciaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProducto;
	public JLabel jLabelid_empresaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProducto;
	public JButton jButtonid_empresaProducto= new JButtonMe();
	public JButton jButtonid_empresaProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProducto;
	public JLabel jLabelid_sucursalProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProducto;
	public JButton jButtonid_sucursalProducto= new JButtonMe();
	public JButton jButtonid_sucursalProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaProducto;
	public JLabel jLabelid_lineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaProducto;
	public JButton jButtonid_lineaProducto= new JButtonMe();
	public JButton jButtonid_lineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoProducto;
	public JLabel jLabelid_linea_grupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoProducto;
	public JButton jButtonid_linea_grupoProducto= new JButtonMe();
	public JButton jButtonid_linea_grupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaProducto;
	public JLabel jLabelid_linea_categoriaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaProducto;
	public JButton jButtonid_linea_categoriaProducto= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_marcaProducto;
	public JLabel jLabelid_linea_marcaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaProducto;
	public JButton jButtonid_linea_marcaProducto= new JButtonMe();
	public JButton jButtonid_linea_marcaProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaProductoArbol= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioProducto;
	public JLabel jLabelid_tipo_producto_servicioProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioProducto;
	public JButton jButtonid_tipo_producto_servicioProducto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicio_invenProducto;
	public JLabel jLabelid_tipo_producto_servicio_invenProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicio_invenProducto;
	public JButton jButtonid_tipo_producto_servicio_invenProducto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_costeoProducto;
	public JLabel jLabelid_tipo_costeoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costeoProducto;
	public JButton jButtonid_tipo_costeoProducto= new JButtonMe();
	public JButton jButtonid_tipo_costeoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costeoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProducto;
	public JLabel jLabelid_unidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProducto;
	public JButton jButtonid_unidadProducto= new JButtonMe();
	public JButton jButtonid_unidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidad_pesoProducto;
	public JLabel jLabelid_unidad_pesoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_pesoProducto;
	public JButton jButtonid_unidad_pesoProducto= new JButtonMe();
	public JButton jButtonid_unidad_pesoProductoUpdate= new JButtonMe();
	public JButton jButtonid_unidad_pesoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_arancelProducto;
	public JLabel jLabelid_arancelProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_arancelProducto;
	public JButton jButtonid_arancelProducto= new JButtonMe();
	public JButton jButtonid_arancelProductoUpdate= new JButtonMe();
	public JButton jButtonid_arancelProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteProducto;
	public JLabel jLabelid_clienteProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteProducto;
	public JButton jButtonid_clienteProducto= new JButtonMe();
	public JButton jButtonid_clienteProductoUpdate= new JButtonMe();
	public JButton jButtonid_clienteProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_cliente_proveedor_defectoProducto;
	public JLabel jLabelid_cliente_proveedor_defectoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedor_defectoProducto;
	public JButton jButtonid_cliente_proveedor_defectoProducto= new JButtonMe();
	public JButton jButtonid_cliente_proveedor_defectoProductoUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedor_defectoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoProducto;
	public JLabel jLabelid_tipo_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoProducto;
	public JButton jButtonid_tipo_productoProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_color_productoProducto;
	public JLabel jLabelid_color_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_productoProducto;
	public JButton jButtonid_color_productoProducto= new JButtonMe();
	public JButton jButtonid_color_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_color_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_clase_productoProducto;
	public JLabel jLabelid_clase_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clase_productoProducto;
	public JButton jButtonid_clase_productoProducto= new JButtonMe();
	public JButton jButtonid_clase_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_clase_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_efecto_productoProducto;
	public JLabel jLabelid_efecto_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_efecto_productoProducto;
	public JButton jButtonid_efecto_productoProducto= new JButtonMe();
	public JButton jButtonid_efecto_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_efecto_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_marca_productoProducto;
	public JLabel jLabelid_marca_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_marca_productoProducto;
	public JButton jButtonid_marca_productoProducto= new JButtonMe();
	public JButton jButtonid_marca_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_marca_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_modelo_productoProducto;
	public JLabel jLabelid_modelo_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_modelo_productoProducto;
	public JButton jButtonid_modelo_productoProducto= new JButtonMe();
	public JButton jButtonid_modelo_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_modelo_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_material_productoProducto;
	public JLabel jLabelid_material_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_material_productoProducto;
	public JButton jButtonid_material_productoProducto= new JButtonMe();
	public JButton jButtonid_material_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_material_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_segmento_productoProducto;
	public JLabel jLabelid_segmento_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_segmento_productoProducto;
	public JButton jButtonid_segmento_productoProducto= new JButtonMe();
	public JButton jButtonid_segmento_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_segmento_productoProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_talla_productoProducto;
	public JLabel jLabelid_talla_productoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_talla_productoProducto;
	public JButton jButtonid_talla_productoProducto= new JButtonMe();
	public JButton jButtonid_talla_productoProductoUpdate= new JButtonMe();
	public JButton jButtonid_talla_productoProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProducto;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=2002;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProducto=new JPanel();
				this.jPanelAccionesFormularioProducto=new JPanel();
				this.jmenuBarDetalleProducto=new JMenuBar();
				this.jTtoolBarDetalleProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
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
	
	
	public JButton getjButtonActualizarToolBarProducto() {
		return this.jButtonActualizarToolBarProducto;
	}
	
	public JButton getjButtonEliminarToolBarProducto() {
		return this.jButtonEliminarToolBarProducto;
	}
	
	public JButton getjButtonCancelarToolBarProducto() {
		return this.jButtonCancelarToolBarProducto;
	}		
	
	public JButton getjButtonProcesarInformacionProducto() {
		return this.jButtonProcesarInformacionProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProducto)	{
		this.jButtonProcesarInformacionProducto = jButtonProcesarInformacionProducto;
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
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProducto() {
		return this.jComboBoxTiposAccionesFormularioProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProducto(
			JComboBox jComboBoxTiposAccionesFormularioProducto) {
		this.jComboBoxTiposAccionesFormularioProducto = jComboBoxTiposAccionesFormularioProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoSessionBean=new ProductoSessionBean();
		
		this.productoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		//this.precioSessionBean=new PrecioSessionBean();
		//this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		//this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		//this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
		//this.serieproductoSessionBean=new SerieProductoSessionBean();
		//this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		//this.parametroproductoSessionBean=new ParametroProductoSessionBean();
		//this.productounidadSessionBean=new ProductoUnidadSessionBean();
		//this.ingredienteSessionBean=new IngredienteSessionBean();
		//this.productocaracSessionBean=new ProductoCaracSessionBean();
		//this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		//this.productopromocionSessionBean=new ProductoPromocionSessionBean();
		//this.productoespeciSessionBean=new ProductoEspeciSessionBean();
		//this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		//this.productoestadisticaSessionBean=new ProductoEstadisticaSessionBean();
		//this.politicafactuSessionBean=new PoliticaFactuSessionBean();
		//this.productocuentacontableSessionBean=new ProductoCuentaContableSessionBean();
		//this.bodegaproductoSessionBean=new BodegaProductoSessionBean();
		//this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		//this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		}
		
			
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
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProducto=new JButtonMe();
				this.jButtonModificarToolBarProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProducto,this.jTtoolBarDetalleProducto,
							"actualizar","actualizar","Actualizar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProducto,this.jTtoolBarDetalleProducto,
							"eliminar","eliminar","Eliminar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProducto,this.jTtoolBarDetalleProducto,
							"cancelar","cancelar","Cancelar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProducto,this.jTtoolBarDetalleProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProducto.add(this.jMenuItemDetalleCerrarProducto);
		
		this.jmenuDetalleAccionesProducto.add(this.jMenuItemActualizarProducto);
		this.jmenuDetalleAccionesProducto.add(this.jMenuItemEliminarProducto);
		this.jmenuDetalleAccionesProducto.add(this.jMenuItemCancelarProducto);		
		
		//this.jmenuDetalleDatosProducto.add(this.jMenuItemDetalleAbrirOrderByProducto);				
		this.jmenuDetalleDatosProducto.add(this.jMenuItemDetalleMostarOcultarProducto);				
				
		//this.jmenuDetalleAccionesProducto.add(this.jMenuItemGuardarCambiosProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProducto.add(this.jmenuDetalleArchivoProducto);		
		this.jmenuBarDetalleProducto.add(this.jmenuDetalleAccionesProducto);		
		this.jmenuBarDetalleProducto.add(this.jmenuDetalleDatosProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProducto.add(this.jmenuDetalleProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProducto);				
	}
	
	
	public void inicializarElementosCamposProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProducto = new JLabelMe();
		jLabelIdProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProducto= new GridBagLayout();

		this.jPanelidProducto.setLayout(this.gridaBagLayoutProducto);

		jLabelidProducto = new JLabel();
		jLabelidProducto.setText("Id");

		jLabelidProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProducto = new JLabelMe();
		this.jLabelcodigoProducto.setText(""+ProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProducto.setToolTipText("Codigo");
		this.jLabelcodigoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcodigoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldcodigoProducto= new JTextFieldMe();

		jTextFieldcodigoProducto.setEnabled(false);
		jTextFieldcodigoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProductoBusqueda= new JButtonMe();
		this.jButtoncodigoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProductoBusqueda.setText("U");
		this.jButtoncodigoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreProducto = new JLabelMe();
		this.jLabelnombreProducto.setText(""+ProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProducto.setToolTipText("Nombre");
		this.jLabelnombreProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProducto.setToolTipText(ProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelnombreProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreanombreProducto= new JTextAreaMe();
		jTextAreanombreProducto.setEnabled(false);
		jTextAreanombreProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProducto.setLineWrap(true);
		jTextAreanombreProducto.setWrapStyleWord(true);
		jTextAreanombreProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProducto = new JScrollPane(jTextAreanombreProducto);
		jscrollPanenombreProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProductoBusqueda= new JButtonMe();
		this.jButtonnombreProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProductoBusqueda.setText("U");
		this.jButtonnombreProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_extranjeroProducto = new JLabelMe();
		this.jLabelnombre_extranjeroProducto.setText(""+ProductoConstantesFunciones.LABEL_NOMBREEXTRANJERO+" :");
		this.jLabelnombre_extranjeroProducto.setToolTipText("Nombre Extranjero");
		this.jLabelnombre_extranjeroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_extranjeroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_extranjeroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_extranjeroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_extranjeroProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_extranjeroProducto.setToolTipText(ProductoConstantesFunciones.LABEL_NOMBREEXTRANJERO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelnombre_extranjeroProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreanombre_extranjeroProducto= new JTextAreaMe();
		jTextAreanombre_extranjeroProducto.setEnabled(false);
		jTextAreanombre_extranjeroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_extranjeroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_extranjeroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_extranjeroProducto.setLineWrap(true);
		jTextAreanombre_extranjeroProducto.setWrapStyleWord(true);
		jTextAreanombre_extranjeroProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_extranjeroProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_extranjeroProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_extranjeroProducto = new JScrollPane(jTextAreanombre_extranjeroProducto);
		jscrollPanenombre_extranjeroProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_extranjeroProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_extranjeroProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_extranjeroProductoBusqueda= new JButtonMe();
		this.jButtonnombre_extranjeroProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_extranjeroProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_extranjeroProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_extranjeroProductoBusqueda.setText("U");
		this.jButtonnombre_extranjeroProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_extranjeroProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_extranjeroProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_extranjeroProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_extranjeroProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_extranjeroProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_extranjeroProductoBusqueda.setVisible(false);		}


					
		this.jLabelresumen_detalleProducto = new JLabelMe();
		this.jLabelresumen_detalleProducto.setText(""+ProductoConstantesFunciones.LABEL_RESUMENDETALLE+" :");
		this.jLabelresumen_detalleProducto.setToolTipText("Resumen Detalle");
		this.jLabelresumen_detalleProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelresumen_detalleProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelresumen_detalleProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelresumen_detalleProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresumen_detalleProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresumen_detalleProducto.setToolTipText(ProductoConstantesFunciones.LABEL_RESUMENDETALLE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelresumen_detalleProducto.setLayout(this.gridaBagLayoutProducto);


		jTextArearesumen_detalleProducto= new JTextAreaMe();
		jTextArearesumen_detalleProducto.setEnabled(false);
		jTextArearesumen_detalleProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesumen_detalleProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesumen_detalleProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesumen_detalleProducto.setLineWrap(true);
		jTextArearesumen_detalleProducto.setWrapStyleWord(true);
		jTextArearesumen_detalleProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesumen_detalleProducto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextArearesumen_detalleProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresumen_detalleProducto = new JScrollPane(jTextArearesumen_detalleProducto);
		jscrollPaneresumen_detalleProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresumen_detalleProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresumen_detalleProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonresumen_detalleProductoBusqueda= new JButtonMe();
		this.jButtonresumen_detalleProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresumen_detalleProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresumen_detalleProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresumen_detalleProductoBusqueda.setText("U");
		this.jButtonresumen_detalleProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresumen_detalleProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresumen_detalleProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesumen_detalleProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesumen_detalleProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"resumen_detalleProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresumen_detalleProductoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_barraProducto = new JLabelMe();
		this.jLabelcodigo_barraProducto.setText(""+ProductoConstantesFunciones.LABEL_CODIGOBARRA+" :");
		this.jLabelcodigo_barraProducto.setToolTipText("Codigo Barra");
		this.jLabelcodigo_barraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_barraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_barraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_barraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_barraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_barraProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CODIGOBARRA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcodigo_barraProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldcodigo_barraProducto= new JTextFieldMe();

		jTextFieldcodigo_barraProducto.setEnabled(false);
		jTextFieldcodigo_barraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_barraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_barraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_barraProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_barraProductoBusqueda= new JButtonMe();
		this.jButtoncodigo_barraProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_barraProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_barraProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_barraProductoBusqueda.setText("U");
		this.jButtoncodigo_barraProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_barraProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_barraProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_barraProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_barraProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_barraProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_barraProductoBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoProducto = new JLabelMe();
		this.jLabelesta_activoProducto.setText(""+ProductoConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoProducto.setToolTipText("Esta Activo");
		this.jLabelesta_activoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelesta_activoProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxesta_activoProducto= new JCheckBoxMe();
		jCheckBoxesta_activoProducto.setEnabled(false);

		jCheckBoxesta_activoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoProductoBusqueda= new JButtonMe();
		this.jButtonesta_activoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoProductoBusqueda.setText("U");
		this.jButtonesta_activoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProducto = new JLabelMe();
		this.jLabeldescripcionProducto.setText(""+ProductoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProducto.setToolTipText(ProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPaneldescripcionProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreadescripcionProducto= new JTextAreaMe();
		jTextAreadescripcionProducto.setEnabled(false);
		jTextAreadescripcionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProducto.setLineWrap(true);
		jTextAreadescripcionProducto.setWrapStyleWord(true);
		jTextAreadescripcionProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProducto.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProducto = new JScrollPane(jTextAreadescripcionProducto);
		jscrollPanedescripcionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionProductoBusqueda= new JButtonMe();
		this.jButtondescripcionProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoBusqueda.setText("U");
		this.jButtondescripcionProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoBusqueda.setVisible(false);		}


					
		this.jLabelprecioProducto = new JLabelMe();
		this.jLabelprecioProducto.setText(""+ProductoConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioProducto.setToolTipText("Precio");
		this.jLabelprecioProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioProducto.setToolTipText(ProductoConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelprecioProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldprecioProducto= new JTextFieldMe();
		jTextFieldprecioProducto.setEnabled(false);
		jTextFieldprecioProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioProducto.setText("0.0");

		this.jButtonprecioProductoBusqueda= new JButtonMe();
		this.jButtonprecioProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioProductoBusqueda.setText("U");
		this.jButtonprecioProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioProductoBusqueda.setVisible(false);		}


					
		this.jLabelivaProducto = new JLabelMe();
		this.jLabelivaProducto.setText(""+ProductoConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaProducto.setToolTipText("Iva");
		this.jLabelivaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelivaProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldivaProducto= new JTextFieldMe();
		jTextFieldivaProducto.setEnabled(false);
		jTextFieldivaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaProducto.setText("0.0");

		this.jButtonivaProductoBusqueda= new JButtonMe();
		this.jButtonivaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaProductoBusqueda.setText("U");
		this.jButtonivaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaProductoBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorProducto = new JLabelMe();
		this.jLabeliva_valorProducto.setText(""+ProductoConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorProducto.setToolTipText("Iva Valor");
		this.jLabeliva_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPaneliva_valorProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldiva_valorProducto= new JTextFieldMe();
		jTextFieldiva_valorProducto.setEnabled(false);
		jTextFieldiva_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorProducto.setText("0.0");

		this.jButtoniva_valorProductoBusqueda= new JButtonMe();
		this.jButtoniva_valorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorProductoBusqueda.setText("U");
		this.jButtoniva_valorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorProductoBusqueda.setVisible(false);		}


					
		this.jLabeliceProducto = new JLabelMe();
		this.jLabeliceProducto.setText(""+ProductoConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceProducto.setToolTipText("Ice");
		this.jLabeliceProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPaneliceProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldiceProducto= new JTextFieldMe();
		jTextFieldiceProducto.setEnabled(false);
		jTextFieldiceProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceProducto.setText("0.0");

		this.jButtoniceProductoBusqueda= new JButtonMe();
		this.jButtoniceProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceProductoBusqueda.setText("U");
		this.jButtoniceProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceProductoBusqueda.setVisible(false);		}


					
		this.jLabelice_valorProducto = new JLabelMe();
		this.jLabelice_valorProducto.setText(""+ProductoConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorProducto.setToolTipText("Ice Valor");
		this.jLabelice_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelice_valorProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldice_valorProducto= new JTextFieldMe();
		jTextFieldice_valorProducto.setEnabled(false);
		jTextFieldice_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorProducto.setText("0.0");

		this.jButtonice_valorProductoBusqueda= new JButtonMe();
		this.jButtonice_valorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorProductoBusqueda.setText("U");
		this.jButtonice_valorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoProducto = new JLabelMe();
		this.jLabeldescuentoProducto.setText(""+ProductoConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoProducto.setToolTipText("Descuento");
		this.jLabeldescuentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPaneldescuentoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFielddescuentoProducto= new JTextFieldMe();
		jTextFielddescuentoProducto.setEnabled(false);
		jTextFielddescuentoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoProducto.setText("0.0");

		this.jButtondescuentoProductoBusqueda= new JButtonMe();
		this.jButtondescuentoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoProductoBusqueda.setText("U");
		this.jButtondescuentoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorProducto = new JLabelMe();
		this.jLabeldescuento_valorProducto.setText(""+ProductoConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorProducto.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorProducto.setToolTipText(ProductoConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPaneldescuento_valorProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFielddescuento_valorProducto= new JTextFieldMe();
		jTextFielddescuento_valorProducto.setEnabled(false);
		jTextFielddescuento_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorProducto.setText("0.0");

		this.jButtondescuento_valorProductoBusqueda= new JButtonMe();
		this.jButtondescuento_valorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorProductoBusqueda.setText("U");
		this.jButtondescuento_valorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorProductoBusqueda.setVisible(false);		}


					
		this.jLabelarancel_porcentajeProducto = new JLabelMe();
		this.jLabelarancel_porcentajeProducto.setText(""+ProductoConstantesFunciones.LABEL_ARANCELPORCENTAJE+" : *");
		this.jLabelarancel_porcentajeProducto.setToolTipText("Arancel %");
		this.jLabelarancel_porcentajeProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarancel_porcentajeProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarancel_porcentajeProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelarancel_porcentajeProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarancel_porcentajeProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarancel_porcentajeProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ARANCELPORCENTAJE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelarancel_porcentajeProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldarancel_porcentajeProducto= new JTextFieldMe();
		jTextFieldarancel_porcentajeProducto.setEnabled(false);
		jTextFieldarancel_porcentajeProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarancel_porcentajeProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarancel_porcentajeProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldarancel_porcentajeProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldarancel_porcentajeProducto.setText("0.0");

		this.jButtonarancel_porcentajeProductoBusqueda= new JButtonMe();
		this.jButtonarancel_porcentajeProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarancel_porcentajeProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarancel_porcentajeProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarancel_porcentajeProductoBusqueda.setText("U");
		this.jButtonarancel_porcentajeProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarancel_porcentajeProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarancel_porcentajeProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldarancel_porcentajeProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldarancel_porcentajeProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"arancel_porcentajeProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarancel_porcentajeProductoBusqueda.setVisible(false);		}


					
		this.jLabelarancel_valorProducto = new JLabelMe();
		this.jLabelarancel_valorProducto.setText(""+ProductoConstantesFunciones.LABEL_ARANCELVALOR+" : *");
		this.jLabelarancel_valorProducto.setToolTipText("Arancel Valor");
		this.jLabelarancel_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarancel_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarancel_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelarancel_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarancel_valorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarancel_valorProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ARANCELVALOR);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelarancel_valorProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldarancel_valorProducto= new JTextFieldMe();
		jTextFieldarancel_valorProducto.setEnabled(false);
		jTextFieldarancel_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarancel_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarancel_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldarancel_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldarancel_valorProducto.setText("0.0");

		this.jButtonarancel_valorProductoBusqueda= new JButtonMe();
		this.jButtonarancel_valorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarancel_valorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarancel_valorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarancel_valorProductoBusqueda.setText("U");
		this.jButtonarancel_valorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarancel_valorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarancel_valorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldarancel_valorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldarancel_valorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"arancel_valorProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarancel_valorProductoBusqueda.setVisible(false);		}


					
		this.jLabelcomisionProducto = new JLabelMe();
		this.jLabelcomisionProducto.setText(""+ProductoConstantesFunciones.LABEL_COMISION+" : *");
		this.jLabelcomisionProducto.setToolTipText("Comision");
		this.jLabelcomisionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomisionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomisionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcomisionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcomisionProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcomisionProducto.setToolTipText(ProductoConstantesFunciones.LABEL_COMISION);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcomisionProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldcomisionProducto= new JTextFieldMe();
		jTextFieldcomisionProducto.setEnabled(false);
		jTextFieldcomisionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomisionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomisionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcomisionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcomisionProducto.setText("0.0");

		this.jButtoncomisionProductoBusqueda= new JButtonMe();
		this.jButtoncomisionProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomisionProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomisionProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncomisionProductoBusqueda.setText("U");
		this.jButtoncomisionProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncomisionProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncomisionProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcomisionProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcomisionProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"comisionProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncomisionProductoBusqueda.setVisible(false);		}


					
		this.jLabelcomision_valorProducto = new JLabelMe();
		this.jLabelcomision_valorProducto.setText(""+ProductoConstantesFunciones.LABEL_COMISIONVALOR+" : *");
		this.jLabelcomision_valorProducto.setToolTipText("Comision Valor");
		this.jLabelcomision_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomision_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomision_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcomision_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcomision_valorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcomision_valorProducto.setToolTipText(ProductoConstantesFunciones.LABEL_COMISIONVALOR);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcomision_valorProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldcomision_valorProducto= new JTextFieldMe();
		jTextFieldcomision_valorProducto.setEnabled(false);
		jTextFieldcomision_valorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomision_valorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomision_valorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcomision_valorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcomision_valorProducto.setText("0.0");

		this.jButtoncomision_valorProductoBusqueda= new JButtonMe();
		this.jButtoncomision_valorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomision_valorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomision_valorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncomision_valorProductoBusqueda.setText("U");
		this.jButtoncomision_valorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncomision_valorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncomision_valorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcomision_valorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcomision_valorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"comision_valorProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncomision_valorProductoBusqueda.setVisible(false);		}


					
		this.jLabeldias_produccionProducto = new JLabelMe();
		this.jLabeldias_produccionProducto.setText(""+ProductoConstantesFunciones.LABEL_DIASPRODUCCION+" : *");
		this.jLabeldias_produccionProducto.setToolTipText("Dias Produccion");
		this.jLabeldias_produccionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_produccionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_produccionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_produccionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_produccionProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_produccionProducto.setToolTipText(ProductoConstantesFunciones.LABEL_DIASPRODUCCION);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPaneldias_produccionProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFielddias_produccionProducto= new JTextFieldMe();
		jTextFielddias_produccionProducto.setEnabled(false);
		jTextFielddias_produccionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_produccionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_produccionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_produccionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_produccionProducto.setText("0.0");

		this.jButtondias_produccionProductoBusqueda= new JButtonMe();
		this.jButtondias_produccionProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_produccionProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_produccionProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_produccionProductoBusqueda.setText("U");
		this.jButtondias_produccionProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_produccionProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_produccionProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_produccionProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_produccionProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_produccionProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_produccionProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_stock_negativoProducto = new JLabelMe();
		this.jLabelcon_stock_negativoProducto.setText(""+ProductoConstantesFunciones.LABEL_CONSTOCKNEGATIVO+" : *");
		this.jLabelcon_stock_negativoProducto.setToolTipText("Con Stock Negativo");
		this.jLabelcon_stock_negativoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_stock_negativoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_stock_negativoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_stock_negativoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_stock_negativoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_stock_negativoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONSTOCKNEGATIVO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_stock_negativoProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_stock_negativoProducto= new JCheckBoxMe();
		jCheckBoxcon_stock_negativoProducto.setEnabled(false);

		jCheckBoxcon_stock_negativoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_stock_negativoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_stock_negativoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_stock_negativoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_stock_negativoProductoBusqueda= new JButtonMe();
		this.jButtoncon_stock_negativoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_stock_negativoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_stock_negativoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_stock_negativoProductoBusqueda.setText("U");
		this.jButtoncon_stock_negativoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_stock_negativoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_stock_negativoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_stock_negativoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_stock_negativoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_stock_negativoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_stock_negativoProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_precio_minimoProducto = new JLabelMe();
		this.jLabelcon_precio_minimoProducto.setText(""+ProductoConstantesFunciones.LABEL_CONPRECIOMINIMO+" : *");
		this.jLabelcon_precio_minimoProducto.setToolTipText("Con Precio Minimo");
		this.jLabelcon_precio_minimoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precio_minimoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precio_minimoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precio_minimoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precio_minimoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precio_minimoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONPRECIOMINIMO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_precio_minimoProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_precio_minimoProducto= new JCheckBoxMe();
		jCheckBoxcon_precio_minimoProducto.setEnabled(false);

		jCheckBoxcon_precio_minimoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precio_minimoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precio_minimoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precio_minimoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precio_minimoProductoBusqueda= new JButtonMe();
		this.jButtoncon_precio_minimoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precio_minimoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precio_minimoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precio_minimoProductoBusqueda.setText("U");
		this.jButtoncon_precio_minimoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precio_minimoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precio_minimoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precio_minimoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precio_minimoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precio_minimoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precio_minimoProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_loteProducto = new JLabelMe();
		this.jLabelcon_loteProducto.setText(""+ProductoConstantesFunciones.LABEL_CONLOTE+" : *");
		this.jLabelcon_loteProducto.setToolTipText("Con Lote");
		this.jLabelcon_loteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_loteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_loteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_loteProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_loteProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_loteProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONLOTE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_loteProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_loteProducto= new JCheckBoxMe();
		jCheckBoxcon_loteProducto.setEnabled(false);

		jCheckBoxcon_loteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_loteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_loteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_loteProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_loteProductoBusqueda= new JButtonMe();
		this.jButtoncon_loteProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_loteProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_loteProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_loteProductoBusqueda.setText("U");
		this.jButtoncon_loteProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_loteProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_loteProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_loteProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_loteProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_loteProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_loteProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_confirmacionProducto = new JLabelMe();
		this.jLabelcon_confirmacionProducto.setText(""+ProductoConstantesFunciones.LABEL_CONCONFIRMACION+" : *");
		this.jLabelcon_confirmacionProducto.setToolTipText("Con Confirmacion");
		this.jLabelcon_confirmacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_confirmacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_confirmacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_confirmacionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_confirmacionProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_confirmacionProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONCONFIRMACION);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_confirmacionProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_confirmacionProducto= new JCheckBoxMe();
		jCheckBoxcon_confirmacionProducto.setEnabled(false);

		jCheckBoxcon_confirmacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_confirmacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_confirmacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_confirmacionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_confirmacionProductoBusqueda= new JButtonMe();
		this.jButtoncon_confirmacionProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_confirmacionProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_confirmacionProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_confirmacionProductoBusqueda.setText("U");
		this.jButtoncon_confirmacionProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_confirmacionProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_confirmacionProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_confirmacionProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_confirmacionProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_confirmacionProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_confirmacionProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_presupuestoProducto = new JLabelMe();
		this.jLabelcon_presupuestoProducto.setText(""+ProductoConstantesFunciones.LABEL_CONPRESUPUESTO+" : *");
		this.jLabelcon_presupuestoProducto.setToolTipText("Con Presupuesto Cantidad");
		this.jLabelcon_presupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_presupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_presupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_presupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_presupuestoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_presupuestoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONPRESUPUESTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_presupuestoProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_presupuestoProducto= new JCheckBoxMe();
		jCheckBoxcon_presupuestoProducto.setEnabled(false);

		jCheckBoxcon_presupuestoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_presupuestoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_presupuestoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_presupuestoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_presupuestoProductoBusqueda= new JButtonMe();
		this.jButtoncon_presupuestoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_presupuestoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_presupuestoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_presupuestoProductoBusqueda.setText("U");
		this.jButtoncon_presupuestoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_presupuestoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_presupuestoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_presupuestoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_presupuestoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_presupuestoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_presupuestoProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_importacionProducto = new JLabelMe();
		this.jLabelcon_importacionProducto.setText(""+ProductoConstantesFunciones.LABEL_CONIMPORTACION+" : *");
		this.jLabelcon_importacionProducto.setToolTipText("Es Importado");
		this.jLabelcon_importacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_importacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_importacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_importacionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_importacionProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_importacionProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONIMPORTACION);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_importacionProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_importacionProducto= new JCheckBoxMe();
		jCheckBoxcon_importacionProducto.setEnabled(false);

		jCheckBoxcon_importacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_importacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_importacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_importacionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_importacionProductoBusqueda= new JButtonMe();
		this.jButtoncon_importacionProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_importacionProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_importacionProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_importacionProductoBusqueda.setText("U");
		this.jButtoncon_importacionProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_importacionProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_importacionProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_importacionProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_importacionProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_importacionProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_importacionProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_finalProducto = new JLabelMe();
		this.jLabelcon_finalProducto.setText(""+ProductoConstantesFunciones.LABEL_CONFINAL+" : *");
		this.jLabelcon_finalProducto.setToolTipText("Es Final");
		this.jLabelcon_finalProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_finalProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_finalProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_finalProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_finalProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_finalProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONFINAL);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_finalProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_finalProducto= new JCheckBoxMe();
		jCheckBoxcon_finalProducto.setEnabled(false);

		jCheckBoxcon_finalProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_finalProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_finalProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_finalProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_finalProductoBusqueda= new JButtonMe();
		this.jButtoncon_finalProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_finalProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_finalProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_finalProductoBusqueda.setText("U");
		this.jButtoncon_finalProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_finalProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_finalProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_finalProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_finalProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_finalProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_finalProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_consepProducto = new JLabelMe();
		this.jLabelcon_consepProducto.setText(""+ProductoConstantesFunciones.LABEL_CONCONSEP+" : *");
		this.jLabelcon_consepProducto.setToolTipText("Autorizacion Consep");
		this.jLabelcon_consepProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_consepProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_consepProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_consepProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_consepProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_consepProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONCONSEP);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_consepProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_consepProducto= new JCheckBoxMe();
		jCheckBoxcon_consepProducto.setEnabled(false);

		jCheckBoxcon_consepProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_consepProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_consepProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_consepProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_consepProductoBusqueda= new JButtonMe();
		this.jButtoncon_consepProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_consepProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_consepProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_consepProductoBusqueda.setText("U");
		this.jButtoncon_consepProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_consepProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_consepProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_consepProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_consepProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_consepProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_consepProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_serieProducto = new JLabelMe();
		this.jLabelcon_serieProducto.setText(""+ProductoConstantesFunciones.LABEL_CONSERIE+" : *");
		this.jLabelcon_serieProducto.setToolTipText("Con Serie");
		this.jLabelcon_serieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_serieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_serieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_serieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_serieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_serieProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONSERIE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_serieProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_serieProducto= new JCheckBoxMe();
		jCheckBoxcon_serieProducto.setEnabled(false);

		jCheckBoxcon_serieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_serieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_serieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_serieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_serieProductoBusqueda= new JButtonMe();
		this.jButtoncon_serieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_serieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_serieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_serieProductoBusqueda.setText("U");
		this.jButtoncon_serieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_serieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_serieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_serieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_serieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_serieProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_serieProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_balanzaProducto = new JLabelMe();
		this.jLabelcon_balanzaProducto.setText(""+ProductoConstantesFunciones.LABEL_CONBALANZA+" : *");
		this.jLabelcon_balanzaProducto.setToolTipText("Con Balanza");
		this.jLabelcon_balanzaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_balanzaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_balanzaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_balanzaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_balanzaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_balanzaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_CONBALANZA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelcon_balanzaProducto.setLayout(this.gridaBagLayoutProducto);


		jCheckBoxcon_balanzaProducto= new JCheckBoxMe();
		jCheckBoxcon_balanzaProducto.setEnabled(false);

		jCheckBoxcon_balanzaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_balanzaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_balanzaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_balanzaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_balanzaProductoBusqueda= new JButtonMe();
		this.jButtoncon_balanzaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_balanzaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_balanzaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_balanzaProductoBusqueda.setText("U");
		this.jButtoncon_balanzaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_balanzaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_balanzaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_balanzaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_balanzaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_balanzaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_balanzaProductoBusqueda.setVisible(false);		}


					
		this.jLabelaltoProducto = new JLabelMe();
		this.jLabelaltoProducto.setText(""+ProductoConstantesFunciones.LABEL_ALTO+" : *");
		this.jLabelaltoProducto.setToolTipText("Alto");
		this.jLabelaltoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaltoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaltoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaltoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaltoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaltoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ALTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelaltoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldaltoProducto= new JTextFieldMe();
		jTextFieldaltoProducto.setEnabled(false);
		jTextFieldaltoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaltoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaltoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaltoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldaltoProducto.setText("0.0");

		this.jButtonaltoProductoBusqueda= new JButtonMe();
		this.jButtonaltoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaltoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaltoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaltoProductoBusqueda.setText("U");
		this.jButtonaltoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaltoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaltoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaltoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaltoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"altoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaltoProductoBusqueda.setVisible(false);		}


					
		this.jLabelanchoProducto = new JLabelMe();
		this.jLabelanchoProducto.setText(""+ProductoConstantesFunciones.LABEL_ANCHO+" : *");
		this.jLabelanchoProducto.setToolTipText("Ancho");
		this.jLabelanchoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanchoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanchoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanchoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanchoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanchoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_ANCHO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelanchoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldanchoProducto= new JTextFieldMe();
		jTextFieldanchoProducto.setEnabled(false);
		jTextFieldanchoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanchoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanchoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanchoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanchoProducto.setText("0.0");

		this.jButtonanchoProductoBusqueda= new JButtonMe();
		this.jButtonanchoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanchoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanchoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanchoProductoBusqueda.setText("U");
		this.jButtonanchoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanchoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanchoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanchoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanchoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anchoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanchoProductoBusqueda.setVisible(false);		}


					
		this.jLabellargoProducto = new JLabelMe();
		this.jLabellargoProducto.setText(""+ProductoConstantesFunciones.LABEL_LARGO+" : *");
		this.jLabellargoProducto.setToolTipText("Largo");
		this.jLabellargoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellargoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellargoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellargoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellargoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellargoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_LARGO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanellargoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldlargoProducto= new JTextFieldMe();
		jTextFieldlargoProducto.setEnabled(false);
		jTextFieldlargoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlargoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlargoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlargoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldlargoProducto.setText("0.0");

		this.jButtonlargoProductoBusqueda= new JButtonMe();
		this.jButtonlargoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlargoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlargoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlargoProductoBusqueda.setText("U");
		this.jButtonlargoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlargoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlargoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlargoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlargoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"largoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlargoProductoBusqueda.setVisible(false);		}


					
		this.jLabelvolumenProducto = new JLabelMe();
		this.jLabelvolumenProducto.setText(""+ProductoConstantesFunciones.LABEL_VOLUMEN+" : *");
		this.jLabelvolumenProducto.setToolTipText("Volumen");
		this.jLabelvolumenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvolumenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvolumenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvolumenProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvolumenProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvolumenProducto.setToolTipText(ProductoConstantesFunciones.LABEL_VOLUMEN);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelvolumenProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldvolumenProducto= new JTextFieldMe();
		jTextFieldvolumenProducto.setEnabled(false);
		jTextFieldvolumenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvolumenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvolumenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvolumenProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvolumenProducto.setText("0.0");

		this.jButtonvolumenProductoBusqueda= new JButtonMe();
		this.jButtonvolumenProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvolumenProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvolumenProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvolumenProductoBusqueda.setText("U");
		this.jButtonvolumenProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvolumenProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvolumenProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvolumenProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvolumenProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"volumenProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvolumenProductoBusqueda.setVisible(false);		}


					
		this.jLabelpesoProducto = new JLabelMe();
		this.jLabelpesoProducto.setText(""+ProductoConstantesFunciones.LABEL_PESO+" : *");
		this.jLabelpesoProducto.setToolTipText("Peso");
		this.jLabelpesoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpesoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpesoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpesoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpesoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpesoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_PESO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelpesoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldpesoProducto= new JTextFieldMe();
		jTextFieldpesoProducto.setEnabled(false);
		jTextFieldpesoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpesoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpesoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpesoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpesoProducto.setText("0.0");

		this.jButtonpesoProductoBusqueda= new JButtonMe();
		this.jButtonpesoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpesoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpesoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpesoProductoBusqueda.setText("U");
		this.jButtonpesoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpesoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpesoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpesoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpesoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pesoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpesoProductoBusqueda.setVisible(false);		}


					
		this.jLabelgramosProducto = new JLabelMe();
		this.jLabelgramosProducto.setText(""+ProductoConstantesFunciones.LABEL_GRAMOS+" : *");
		this.jLabelgramosProducto.setToolTipText("Gramos");
		this.jLabelgramosProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgramosProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgramosProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgramosProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgramosProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgramosProducto.setToolTipText(ProductoConstantesFunciones.LABEL_GRAMOS);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelgramosProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldgramosProducto= new JTextFieldMe();
		jTextFieldgramosProducto.setEnabled(false);
		jTextFieldgramosProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgramosProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgramosProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgramosProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgramosProducto.setText("0.0");

		this.jButtongramosProductoBusqueda= new JButtonMe();
		this.jButtongramosProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongramosProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongramosProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongramosProductoBusqueda.setText("U");
		this.jButtongramosProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongramosProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongramosProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgramosProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgramosProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gramosProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongramosProductoBusqueda.setVisible(false);		}


					
		this.jLabelunidades_cajaProducto = new JLabelMe();
		this.jLabelunidades_cajaProducto.setText(""+ProductoConstantesFunciones.LABEL_UNIDADESCAJA+" : *");
		this.jLabelunidades_cajaProducto.setToolTipText("Unidades Caja");
		this.jLabelunidades_cajaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelunidades_cajaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelunidades_cajaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelunidades_cajaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelunidades_cajaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelunidades_cajaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_UNIDADESCAJA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelunidades_cajaProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldunidades_cajaProducto= new JTextFieldMe();
		jTextFieldunidades_cajaProducto.setEnabled(false);
		jTextFieldunidades_cajaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldunidades_cajaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldunidades_cajaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldunidades_cajaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldunidades_cajaProducto.setText("0.0");

		this.jButtonunidades_cajaProductoBusqueda= new JButtonMe();
		this.jButtonunidades_cajaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonunidades_cajaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonunidades_cajaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonunidades_cajaProductoBusqueda.setText("U");
		this.jButtonunidades_cajaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonunidades_cajaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonunidades_cajaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldunidades_cajaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldunidades_cajaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"unidades_cajaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonunidades_cajaProductoBusqueda.setVisible(false);		}


					
		this.jLabelmargenProducto = new JLabelMe();
		this.jLabelmargenProducto.setText(""+ProductoConstantesFunciones.LABEL_MARGEN+" : *");
		this.jLabelmargenProducto.setToolTipText("Margen");
		this.jLabelmargenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmargenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmargenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmargenProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmargenProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmargenProducto.setToolTipText(ProductoConstantesFunciones.LABEL_MARGEN);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelmargenProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldmargenProducto= new JTextFieldMe();
		jTextFieldmargenProducto.setEnabled(false);
		jTextFieldmargenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmargenProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmargenProducto.setText("0.0");

		this.jButtonmargenProductoBusqueda= new JButtonMe();
		this.jButtonmargenProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargenProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargenProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmargenProductoBusqueda.setText("U");
		this.jButtonmargenProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmargenProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmargenProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmargenProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmargenProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"margenProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmargenProductoBusqueda.setVisible(false);		}


					
		this.jLabelfactorProducto = new JLabelMe();
		this.jLabelfactorProducto.setText(""+ProductoConstantesFunciones.LABEL_FACTOR+" : *");
		this.jLabelfactorProducto.setToolTipText("Factor");
		this.jLabelfactorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfactorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfactorProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfactorProducto.setToolTipText(ProductoConstantesFunciones.LABEL_FACTOR);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelfactorProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldfactorProducto= new JTextFieldMe();
		jTextFieldfactorProducto.setEnabled(false);
		jTextFieldfactorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfactorProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfactorProducto.setText("0.0");

		this.jButtonfactorProductoBusqueda= new JButtonMe();
		this.jButtonfactorProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactorProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactorProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfactorProductoBusqueda.setText("U");
		this.jButtonfactorProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfactorProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfactorProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfactorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfactorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"factorProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfactorProductoBusqueda.setVisible(false);		}


					
		this.jLabelfobProducto = new JLabelMe();
		this.jLabelfobProducto.setText(""+ProductoConstantesFunciones.LABEL_FOB+" : *");
		this.jLabelfobProducto.setToolTipText("Fob");
		this.jLabelfobProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfobProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfobProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfobProducto.setToolTipText(ProductoConstantesFunciones.LABEL_FOB);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelfobProducto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldfobProducto= new JTextFieldMe();
		jTextFieldfobProducto.setEnabled(false);
		jTextFieldfobProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfobProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfobProducto.setText("0.0");

		this.jButtonfobProductoBusqueda= new JButtonMe();
		this.jButtonfobProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfobProductoBusqueda.setText("U");
		this.jButtonfobProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfobProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfobProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfobProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfobProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fobProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfobProductoBusqueda.setVisible(false);		}


					
		this.jLabelfob2Producto = new JLabelMe();
		this.jLabelfob2Producto.setText(""+ProductoConstantesFunciones.LABEL_FOB2+" : *");
		this.jLabelfob2Producto.setToolTipText("Fob 2");
		this.jLabelfob2Producto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfob2Producto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfob2Producto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfob2Producto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfob2Producto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfob2Producto.setToolTipText(ProductoConstantesFunciones.LABEL_FOB2);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelfob2Producto.setLayout(this.gridaBagLayoutProducto);


		jTextFieldfob2Producto= new JTextFieldMe();
		jTextFieldfob2Producto.setEnabled(false);
		jTextFieldfob2Producto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfob2Producto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfob2Producto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfob2Producto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfob2Producto.setText("0.0");

		this.jButtonfob2ProductoBusqueda= new JButtonMe();
		this.jButtonfob2ProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfob2ProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfob2ProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfob2ProductoBusqueda.setText("U");
		this.jButtonfob2ProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfob2ProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfob2ProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfob2Producto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfob2Producto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fob2ProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfob2ProductoBusqueda.setVisible(false);		}


					
		this.jLabelgrupoProducto = new JLabelMe();
		this.jLabelgrupoProducto.setText(""+ProductoConstantesFunciones.LABEL_GRUPO+" :");
		this.jLabelgrupoProducto.setToolTipText("Grupo");
		this.jLabelgrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgrupoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_GRUPO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelgrupoProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreagrupoProducto= new JTextAreaMe();
		jTextAreagrupoProducto.setEnabled(false);
		jTextAreagrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupoProducto.setLineWrap(true);
		jTextAreagrupoProducto.setWrapStyleWord(true);
		jTextAreagrupoProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreagrupoProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreagrupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanegrupoProducto = new JScrollPane(jTextAreagrupoProducto);
		jscrollPanegrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtongrupoProductoBusqueda= new JButtonMe();
		this.jButtongrupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongrupoProductoBusqueda.setText("U");
		this.jButtongrupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongrupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongrupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreagrupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreagrupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"grupoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongrupoProductoBusqueda.setVisible(false);		}


					
		this.jLabelreferenciaProducto = new JLabelMe();
		this.jLabelreferenciaProducto.setText(""+ProductoConstantesFunciones.LABEL_REFERENCIA+" :");
		this.jLabelreferenciaProducto.setToolTipText("Referencia");
		this.jLabelreferenciaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreferenciaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreferenciaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreferenciaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_REFERENCIA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelreferenciaProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreareferenciaProducto= new JTextAreaMe();
		jTextAreareferenciaProducto.setEnabled(false);
		jTextAreareferenciaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaProducto.setLineWrap(true);
		jTextAreareferenciaProducto.setWrapStyleWord(true);
		jTextAreareferenciaProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreareferenciaProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreareferenciaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanereferenciaProducto = new JScrollPane(jTextAreareferenciaProducto);
		jscrollPanereferenciaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanereferenciaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanereferenciaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonreferenciaProductoBusqueda= new JButtonMe();
		this.jButtonreferenciaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreferenciaProductoBusqueda.setText("U");
		this.jButtonreferenciaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreferenciaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreferenciaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreareferenciaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreareferenciaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"referenciaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreferenciaProductoBusqueda.setVisible(false);		}


					
		this.jLabelaplicacionProducto = new JLabelMe();
		this.jLabelaplicacionProducto.setText(""+ProductoConstantesFunciones.LABEL_APLICACION+" :");
		this.jLabelaplicacionProducto.setToolTipText("Aplicacion");
		this.jLabelaplicacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaplicacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaplicacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaplicacionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaplicacionProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaplicacionProducto.setToolTipText(ProductoConstantesFunciones.LABEL_APLICACION);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelaplicacionProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreaaplicacionProducto= new JTextAreaMe();
		jTextAreaaplicacionProducto.setEnabled(false);
		jTextAreaaplicacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaplicacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaplicacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaaplicacionProducto.setLineWrap(true);
		jTextAreaaplicacionProducto.setWrapStyleWord(true);
		jTextAreaaplicacionProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaaplicacionProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaaplicacionProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneaplicacionProducto = new JScrollPane(jTextAreaaplicacionProducto);
		jscrollPaneaplicacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneaplicacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneaplicacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonaplicacionProductoBusqueda= new JButtonMe();
		this.jButtonaplicacionProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaplicacionProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaplicacionProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaplicacionProductoBusqueda.setText("U");
		this.jButtonaplicacionProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaplicacionProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaplicacionProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaaplicacionProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaaplicacionProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aplicacionProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaplicacionProductoBusqueda.setVisible(false);		}


					
		this.jLabelprocedenciaProducto = new JLabelMe();
		this.jLabelprocedenciaProducto.setText(""+ProductoConstantesFunciones.LABEL_PROCEDENCIA+" :");
		this.jLabelprocedenciaProducto.setToolTipText("Procedencia");
		this.jLabelprocedenciaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocedenciaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocedenciaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprocedenciaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprocedenciaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprocedenciaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_PROCEDENCIA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelprocedenciaProducto.setLayout(this.gridaBagLayoutProducto);


		jTextAreaprocedenciaProducto= new JTextAreaMe();
		jTextAreaprocedenciaProducto.setEnabled(false);
		jTextAreaprocedenciaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaProducto.setLineWrap(true);
		jTextAreaprocedenciaProducto.setWrapStyleWord(true);
		jTextAreaprocedenciaProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprocedenciaProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaprocedenciaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprocedenciaProducto = new JScrollPane(jTextAreaprocedenciaProducto);
		jscrollPaneprocedenciaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocedenciaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocedenciaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprocedenciaProductoBusqueda= new JButtonMe();
		this.jButtonprocedenciaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocedenciaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocedenciaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprocedenciaProductoBusqueda.setText("U");
		this.jButtonprocedenciaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprocedenciaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprocedenciaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprocedenciaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprocedenciaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"procedenciaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprocedenciaProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProducto = new JLabelMe();
		this.jLabelid_empresaProducto.setText(""+ProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProducto.setToolTipText("Empresa");
		this.jLabelid_empresaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_empresaProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_empresaProducto= new JComboBoxMe();
		jComboBoxid_empresaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProducto.setEnabled(false);

		this.jButtonid_empresaProducto= new JButtonMe();
		this.jButtonid_empresaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProducto.setText("Buscar");
		this.jButtonid_empresaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProducto"));

		this.jButtonid_empresaProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoBusqueda.setText("U");
		this.jButtonid_empresaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoUpdate= new JButtonMe();
		this.jButtonid_empresaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoUpdate.setText("U");
		this.jButtonid_empresaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoUpdate"));



					
		this.jLabelid_sucursalProducto = new JLabelMe();
		this.jLabelid_sucursalProducto.setText(""+ProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_sucursalProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_sucursalProducto= new JComboBoxMe();
		jComboBoxid_sucursalProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProducto.setEnabled(false);

		this.jButtonid_sucursalProducto= new JButtonMe();
		this.jButtonid_sucursalProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProducto.setText("Buscar");
		this.jButtonid_sucursalProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProducto"));

		this.jButtonid_sucursalProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoBusqueda.setText("U");
		this.jButtonid_sucursalProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoUpdate.setText("U");
		this.jButtonid_sucursalProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoUpdate"));



					
		this.jLabelid_lineaProducto = new JLabelMe();
		this.jLabelid_lineaProducto.setText(""+ProductoConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaProducto.setToolTipText("Linea");
		this.jLabelid_lineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_lineaProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_lineaProducto= new JComboBoxMe();
		jComboBoxid_lineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaProducto= new JButtonMe();
		this.jButtonid_lineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaProducto.setText("Buscar");
		this.jButtonid_lineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProducto"));

		this.jButtonid_lineaProductoBusqueda= new JButtonMe();
		this.jButtonid_lineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductoBusqueda.setText("U");
		this.jButtonid_lineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_lineaProductoUpdate= new JButtonMe();
		this.jButtonid_lineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaProductoUpdate.setText("U");
		this.jButtonid_lineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoUpdate"));


		jButtonid_lineaProductoArbol= new JButtonMe();
		jButtonid_lineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaProductoArbol.setText("Arbol");
		jButtonid_lineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaProductoArbol"));



					
		this.jLabelid_linea_grupoProducto = new JLabelMe();
		this.jLabelid_linea_grupoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoProducto.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_linea_grupoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_linea_grupoProducto= new JComboBoxMe();
		jComboBoxid_linea_grupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoProducto= new JButtonMe();
		this.jButtonid_linea_grupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoProducto.setText("Buscar");
		this.jButtonid_linea_grupoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProducto"));

		this.jButtonid_linea_grupoProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductoBusqueda.setText("U");
		this.jButtonid_linea_grupoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoProductoUpdate= new JButtonMe();
		this.jButtonid_linea_grupoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoProductoUpdate.setText("U");
		this.jButtonid_linea_grupoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoUpdate"));


		jButtonid_linea_grupoProductoArbol= new JButtonMe();
		jButtonid_linea_grupoProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoProductoArbol.setText("Arbol");
		jButtonid_linea_grupoProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoProductoArbol"));



					
		this.jLabelid_linea_categoriaProducto = new JLabelMe();
		this.jLabelid_linea_categoriaProducto.setText(""+ProductoConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaProducto.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_linea_categoriaProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_linea_categoriaProducto= new JComboBoxMe();
		jComboBoxid_linea_categoriaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaProducto= new JButtonMe();
		this.jButtonid_linea_categoriaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaProducto.setText("Buscar");
		this.jButtonid_linea_categoriaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProducto"));

		this.jButtonid_linea_categoriaProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductoBusqueda.setText("U");
		this.jButtonid_linea_categoriaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaProductoUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaProductoUpdate.setText("U");
		this.jButtonid_linea_categoriaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoUpdate"));


		jButtonid_linea_categoriaProductoArbol= new JButtonMe();
		jButtonid_linea_categoriaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaProductoArbol.setText("Arbol");
		jButtonid_linea_categoriaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaProductoArbol"));



					
		this.jLabelid_linea_marcaProducto = new JLabelMe();
		this.jLabelid_linea_marcaProducto.setText(""+ProductoConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaProducto.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_linea_marcaProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_linea_marcaProducto= new JComboBoxMe();
		jComboBoxid_linea_marcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaProducto= new JButtonMe();
		this.jButtonid_linea_marcaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaProducto.setText("Buscar");
		this.jButtonid_linea_marcaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProducto"));

		this.jButtonid_linea_marcaProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductoBusqueda.setText("U");
		this.jButtonid_linea_marcaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaProductoUpdate= new JButtonMe();
		this.jButtonid_linea_marcaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaProductoUpdate.setText("U");
		this.jButtonid_linea_marcaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoUpdate"));


		jButtonid_linea_marcaProductoArbol= new JButtonMe();
		jButtonid_linea_marcaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_marcaProductoArbol.setText("Arbol");
		jButtonid_linea_marcaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_marcaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_marcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaProductoArbol"));



					
		this.jLabelid_tipo_producto_servicioProducto = new JLabelMe();
		this.jLabelid_tipo_producto_servicioProducto.setText(""+ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioProducto.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_tipo_producto_servicioProducto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioProducto= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioProducto.setText("Buscar");
		this.jButtonid_tipo_producto_servicioProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProducto"));

		this.jButtonid_tipo_producto_servicioProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductoBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioProductoUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioProductoUpdate"));



					
		this.jLabelid_tipo_producto_servicio_invenProducto = new JLabelMe();
		this.jLabelid_tipo_producto_servicio_invenProducto.setText(""+ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIOINVEN+" : *");
		this.jLabelid_tipo_producto_servicio_invenProducto.setToolTipText("Tipo Producto Servicio.");
		this.jLabelid_tipo_producto_servicio_invenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicio_invenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicio_invenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicio_invenProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicio_invenProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicio_invenProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIOINVEN);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_tipo_producto_servicio_invenProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_tipo_producto_servicio_invenProducto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicio_invenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicio_invenProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicio_invenProducto= new JButtonMe();
		this.jButtonid_tipo_producto_servicio_invenProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicio_invenProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicio_invenProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicio_invenProducto.setText("Buscar");
		this.jButtonid_tipo_producto_servicio_invenProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicio_invenProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicio_invenProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicio_invenProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicio_invenProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicio_invenProducto"));

		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicio_invenProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicio_invenProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicio_invenProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicio_invenProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicio_invenProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicio_invenProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicio_invenProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicio_invenProductoUpdate.setText("U");
		this.jButtonid_tipo_producto_servicio_invenProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicio_invenProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicio_invenProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicio_invenProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicio_invenProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicio_invenProductoUpdate"));



					
		this.jLabelid_tipo_costeoProducto = new JLabelMe();
		this.jLabelid_tipo_costeoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDTIPOCOSTEO+" : *");
		this.jLabelid_tipo_costeoProducto.setToolTipText("Tipo Costeo");
		this.jLabelid_tipo_costeoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costeoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costeoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costeoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_costeoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_costeoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDTIPOCOSTEO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_tipo_costeoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_tipo_costeoProducto= new JComboBoxMe();
		jComboBoxid_tipo_costeoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costeoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_costeoProducto= new JButtonMe();
		this.jButtonid_tipo_costeoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeoProducto.setText("Buscar");
		this.jButtonid_tipo_costeoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_costeoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_costeoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeoProducto"));

		this.jButtonid_tipo_costeoProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_costeoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costeoProductoBusqueda.setText("U");
		this.jButtonid_tipo_costeoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_costeoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_costeoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_costeoProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_costeoProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_costeoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costeoProductoUpdate.setText("U");
		this.jButtonid_tipo_costeoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_costeoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_costeoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeoProductoUpdate"));



					
		this.jLabelid_unidadProducto = new JLabelMe();
		this.jLabelid_unidadProducto.setText(""+ProductoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProducto.setToolTipText("Unidad");
		this.jLabelid_unidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_unidadProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_unidadProducto= new JComboBoxMe();
		jComboBoxid_unidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProducto= new JButtonMe();
		this.jButtonid_unidadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProducto.setText("Buscar");
		this.jButtonid_unidadProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProducto"));

		this.jButtonid_unidadProductoBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoBusqueda.setText("U");
		this.jButtonid_unidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoUpdate= new JButtonMe();
		this.jButtonid_unidadProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoUpdate.setText("U");
		this.jButtonid_unidadProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoUpdate"));



					
		this.jLabelid_unidad_pesoProducto = new JLabelMe();
		this.jLabelid_unidad_pesoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDUNIDADPESO+" : *");
		this.jLabelid_unidad_pesoProducto.setToolTipText("Unidad Peso");
		this.jLabelid_unidad_pesoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidad_pesoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidad_pesoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_pesoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidad_pesoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidad_pesoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDUNIDADPESO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_unidad_pesoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_unidad_pesoProducto= new JComboBoxMe();
		jComboBoxid_unidad_pesoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_pesoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_pesoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_pesoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidad_pesoProducto= new JButtonMe();
		this.jButtonid_unidad_pesoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_pesoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_pesoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_pesoProducto.setText("Buscar");
		this.jButtonid_unidad_pesoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidad_pesoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_pesoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidad_pesoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_pesoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_pesoProducto"));

		this.jButtonid_unidad_pesoProductoBusqueda= new JButtonMe();
		this.jButtonid_unidad_pesoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_pesoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_pesoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_pesoProductoBusqueda.setText("U");
		this.jButtonid_unidad_pesoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidad_pesoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_pesoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidad_pesoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_pesoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_pesoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidad_pesoProductoBusqueda.setVisible(false);		}

		this.jButtonid_unidad_pesoProductoUpdate= new JButtonMe();
		this.jButtonid_unidad_pesoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_pesoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_pesoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_pesoProductoUpdate.setText("U");
		this.jButtonid_unidad_pesoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidad_pesoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_pesoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidad_pesoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_pesoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_pesoProductoUpdate"));



					
		this.jLabelid_arancelProducto = new JLabelMe();
		this.jLabelid_arancelProducto.setText(""+ProductoConstantesFunciones.LABEL_IDARANCEL+" : *");
		this.jLabelid_arancelProducto.setToolTipText("Codigo Arancelario");
		this.jLabelid_arancelProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_arancelProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_arancelProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_arancelProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_arancelProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_arancelProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDARANCEL);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_arancelProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_arancelProducto= new JComboBoxMe();
		jComboBoxid_arancelProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_arancelProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_arancelProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_arancelProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_arancelProducto= new JButtonMe();
		this.jButtonid_arancelProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_arancelProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_arancelProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_arancelProducto.setText("Buscar");
		this.jButtonid_arancelProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_arancelProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_arancelProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_arancelProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_arancelProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_arancelProducto"));

		this.jButtonid_arancelProductoBusqueda= new JButtonMe();
		this.jButtonid_arancelProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_arancelProductoBusqueda.setText("U");
		this.jButtonid_arancelProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_arancelProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_arancelProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_arancelProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_arancelProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_arancelProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_arancelProductoBusqueda.setVisible(false);		}

		this.jButtonid_arancelProductoUpdate= new JButtonMe();
		this.jButtonid_arancelProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_arancelProductoUpdate.setText("U");
		this.jButtonid_arancelProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_arancelProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_arancelProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_arancelProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_arancelProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_arancelProductoUpdate"));



					
		this.jLabelid_clienteProducto = new JLabelMe();
		this.jLabelid_clienteProducto.setText(""+ProductoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteProducto.setToolTipText("Cliente");
		this.jLabelid_clienteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_clienteProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_clienteProducto= new JComboBoxMe();
		jComboBoxid_clienteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteProducto= new JButtonMe();
		this.jButtonid_clienteProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProducto.setText("Buscar");
		this.jButtonid_clienteProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProducto"));

		this.jButtonid_clienteProductoBusqueda= new JButtonMe();
		this.jButtonid_clienteProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProductoBusqueda.setText("U");
		this.jButtonid_clienteProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteProductoBusqueda.setVisible(false);		}

		this.jButtonid_clienteProductoUpdate= new JButtonMe();
		this.jButtonid_clienteProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProductoUpdate.setText("U");
		this.jButtonid_clienteProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProductoUpdate"));



					
		this.jLabelid_cliente_proveedor_defectoProducto = new JLabelMe();
		this.jLabelid_cliente_proveedor_defectoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDCLIENTEPROVEEDORDEFECTO+" : *");
		this.jLabelid_cliente_proveedor_defectoProducto.setToolTipText("Cliente Proveedor Defecto");
		this.jLabelid_cliente_proveedor_defectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cliente_proveedor_defectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cliente_proveedor_defectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedor_defectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_proveedor_defectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_proveedor_defectoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDCLIENTEPROVEEDORDEFECTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_cliente_proveedor_defectoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_cliente_proveedor_defectoProducto= new JComboBoxMe();
		jComboBoxid_cliente_proveedor_defectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedor_defectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedor_defectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedor_defectoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_proveedor_defectoProducto= new JButtonMe();
		this.jButtonid_cliente_proveedor_defectoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedor_defectoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedor_defectoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedor_defectoProducto.setText("Buscar");
		this.jButtonid_cliente_proveedor_defectoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_proveedor_defectoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedor_defectoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_proveedor_defectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedor_defectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedor_defectoProducto"));

		this.jButtonid_cliente_proveedor_defectoProductoBusqueda= new JButtonMe();
		this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setText("U");
		this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedor_defectoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_proveedor_defectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedor_defectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedor_defectoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_proveedor_defectoProductoBusqueda.setVisible(false);		}

		this.jButtonid_cliente_proveedor_defectoProductoUpdate= new JButtonMe();
		this.jButtonid_cliente_proveedor_defectoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedor_defectoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedor_defectoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedor_defectoProductoUpdate.setText("U");
		this.jButtonid_cliente_proveedor_defectoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_proveedor_defectoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedor_defectoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_proveedor_defectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedor_defectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedor_defectoProductoUpdate"));



					
		this.jLabelid_tipo_productoProducto = new JLabelMe();
		this.jLabelid_tipo_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoProducto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_tipo_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_tipo_productoProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoProducto= new JButtonMe();
		this.jButtonid_tipo_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoProducto.setText("Buscar");
		this.jButtonid_tipo_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoProducto"));

		this.jButtonid_tipo_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoProductoBusqueda.setText("U");
		this.jButtonid_tipo_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoProductoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoProductoUpdate.setText("U");
		this.jButtonid_tipo_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoProductoUpdate"));



					
		this.jLabelid_color_productoProducto = new JLabelMe();
		this.jLabelid_color_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDCOLORPRODUCTO+" : *");
		this.jLabelid_color_productoProducto.setToolTipText("Color Producto");
		this.jLabelid_color_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_color_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_color_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_color_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDCOLORPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_color_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_color_productoProducto= new JComboBoxMe();
		jComboBoxid_color_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_color_productoProducto= new JButtonMe();
		this.jButtonid_color_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_productoProducto.setText("Buscar");
		this.jButtonid_color_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_color_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_color_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_productoProducto"));

		this.jButtonid_color_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_color_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_productoProductoBusqueda.setText("U");
		this.jButtonid_color_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_color_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_color_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_color_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_color_productoProductoUpdate= new JButtonMe();
		this.jButtonid_color_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_productoProductoUpdate.setText("U");
		this.jButtonid_color_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_color_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_color_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_productoProductoUpdate"));



					
		this.jLabelid_clase_productoProducto = new JLabelMe();
		this.jLabelid_clase_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDCLASEPRODUCTO+" : *");
		this.jLabelid_clase_productoProducto.setToolTipText("Clase Producto");
		this.jLabelid_clase_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clase_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clase_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clase_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clase_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clase_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDCLASEPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_clase_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_clase_productoProducto= new JComboBoxMe();
		jComboBoxid_clase_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clase_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clase_productoProducto= new JButtonMe();
		this.jButtonid_clase_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clase_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clase_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clase_productoProducto.setText("Buscar");
		this.jButtonid_clase_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clase_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clase_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clase_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clase_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clase_productoProducto"));

		this.jButtonid_clase_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_clase_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clase_productoProductoBusqueda.setText("U");
		this.jButtonid_clase_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clase_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clase_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clase_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clase_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clase_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clase_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_clase_productoProductoUpdate= new JButtonMe();
		this.jButtonid_clase_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clase_productoProductoUpdate.setText("U");
		this.jButtonid_clase_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clase_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clase_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clase_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clase_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clase_productoProductoUpdate"));



					
		this.jLabelid_efecto_productoProducto = new JLabelMe();
		this.jLabelid_efecto_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDEFECTOPRODUCTO+" : *");
		this.jLabelid_efecto_productoProducto.setToolTipText("Efecto Producto");
		this.jLabelid_efecto_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_efecto_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_efecto_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_efecto_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_efecto_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_efecto_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDEFECTOPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_efecto_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_efecto_productoProducto= new JComboBoxMe();
		jComboBoxid_efecto_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_efecto_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_efecto_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_efecto_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_efecto_productoProducto= new JButtonMe();
		this.jButtonid_efecto_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_efecto_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_efecto_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_efecto_productoProducto.setText("Buscar");
		this.jButtonid_efecto_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_efecto_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_efecto_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_efecto_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_efecto_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_efecto_productoProducto"));

		this.jButtonid_efecto_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_efecto_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_efecto_productoProductoBusqueda.setText("U");
		this.jButtonid_efecto_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_efecto_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_efecto_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_efecto_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_efecto_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_efecto_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_efecto_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_efecto_productoProductoUpdate= new JButtonMe();
		this.jButtonid_efecto_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_efecto_productoProductoUpdate.setText("U");
		this.jButtonid_efecto_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_efecto_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_efecto_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_efecto_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_efecto_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_efecto_productoProductoUpdate"));



					
		this.jLabelid_marca_productoProducto = new JLabelMe();
		this.jLabelid_marca_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDMARCAPRODUCTO+" : *");
		this.jLabelid_marca_productoProducto.setToolTipText("Marca Producto");
		this.jLabelid_marca_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_marca_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_marca_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_marca_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_marca_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_marca_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDMARCAPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_marca_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_marca_productoProducto= new JComboBoxMe();
		jComboBoxid_marca_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_marca_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_marca_productoProducto= new JButtonMe();
		this.jButtonid_marca_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_marca_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_marca_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_marca_productoProducto.setText("Buscar");
		this.jButtonid_marca_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_marca_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_marca_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_marca_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_marca_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_marca_productoProducto"));

		this.jButtonid_marca_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_marca_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_marca_productoProductoBusqueda.setText("U");
		this.jButtonid_marca_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_marca_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_marca_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_marca_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_marca_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_marca_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_marca_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_marca_productoProductoUpdate= new JButtonMe();
		this.jButtonid_marca_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_marca_productoProductoUpdate.setText("U");
		this.jButtonid_marca_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_marca_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_marca_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_marca_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_marca_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_marca_productoProductoUpdate"));



					
		this.jLabelid_modelo_productoProducto = new JLabelMe();
		this.jLabelid_modelo_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDMODELOPRODUCTO+" : *");
		this.jLabelid_modelo_productoProducto.setToolTipText("Modelo Producto");
		this.jLabelid_modelo_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_modelo_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_modelo_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_modelo_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_modelo_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_modelo_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDMODELOPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_modelo_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_modelo_productoProducto= new JComboBoxMe();
		jComboBoxid_modelo_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_modelo_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_modelo_productoProducto= new JButtonMe();
		this.jButtonid_modelo_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_modelo_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_modelo_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_modelo_productoProducto.setText("Buscar");
		this.jButtonid_modelo_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_modelo_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_modelo_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_modelo_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_modelo_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_modelo_productoProducto"));

		this.jButtonid_modelo_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_modelo_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_modelo_productoProductoBusqueda.setText("U");
		this.jButtonid_modelo_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_modelo_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_modelo_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_modelo_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_modelo_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_modelo_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_modelo_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_modelo_productoProductoUpdate= new JButtonMe();
		this.jButtonid_modelo_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_modelo_productoProductoUpdate.setText("U");
		this.jButtonid_modelo_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_modelo_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_modelo_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_modelo_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_modelo_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_modelo_productoProductoUpdate"));



					
		this.jLabelid_material_productoProducto = new JLabelMe();
		this.jLabelid_material_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDMATERIALPRODUCTO+" : *");
		this.jLabelid_material_productoProducto.setToolTipText("Material Producto");
		this.jLabelid_material_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_material_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_material_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_material_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_material_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_material_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDMATERIALPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_material_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_material_productoProducto= new JComboBoxMe();
		jComboBoxid_material_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_material_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_material_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_material_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_material_productoProducto= new JButtonMe();
		this.jButtonid_material_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_material_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_material_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_material_productoProducto.setText("Buscar");
		this.jButtonid_material_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_material_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_material_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_material_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_material_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_material_productoProducto"));

		this.jButtonid_material_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_material_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_material_productoProductoBusqueda.setText("U");
		this.jButtonid_material_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_material_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_material_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_material_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_material_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_material_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_material_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_material_productoProductoUpdate= new JButtonMe();
		this.jButtonid_material_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_material_productoProductoUpdate.setText("U");
		this.jButtonid_material_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_material_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_material_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_material_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_material_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_material_productoProductoUpdate"));



					
		this.jLabelid_segmento_productoProducto = new JLabelMe();
		this.jLabelid_segmento_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDSEGMENTOPRODUCTO+" : *");
		this.jLabelid_segmento_productoProducto.setToolTipText("Segmento Producto");
		this.jLabelid_segmento_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_segmento_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_segmento_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_segmento_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_segmento_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_segmento_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDSEGMENTOPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_segmento_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_segmento_productoProducto= new JComboBoxMe();
		jComboBoxid_segmento_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_segmento_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_segmento_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_segmento_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_segmento_productoProducto= new JButtonMe();
		this.jButtonid_segmento_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_segmento_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_segmento_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_segmento_productoProducto.setText("Buscar");
		this.jButtonid_segmento_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_segmento_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_segmento_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_segmento_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_segmento_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_segmento_productoProducto"));

		this.jButtonid_segmento_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_segmento_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_segmento_productoProductoBusqueda.setText("U");
		this.jButtonid_segmento_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_segmento_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_segmento_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_segmento_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_segmento_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_segmento_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_segmento_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_segmento_productoProductoUpdate= new JButtonMe();
		this.jButtonid_segmento_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_segmento_productoProductoUpdate.setText("U");
		this.jButtonid_segmento_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_segmento_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_segmento_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_segmento_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_segmento_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_segmento_productoProductoUpdate"));



					
		this.jLabelid_talla_productoProducto = new JLabelMe();
		this.jLabelid_talla_productoProducto.setText(""+ProductoConstantesFunciones.LABEL_IDTALLAPRODUCTO+" : *");
		this.jLabelid_talla_productoProducto.setToolTipText("Talla Producto");
		this.jLabelid_talla_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_talla_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_talla_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_talla_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_talla_productoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_talla_productoProducto.setToolTipText(ProductoConstantesFunciones.LABEL_IDTALLAPRODUCTO);
		this.gridaBagLayoutProducto = new GridBagLayout();
		this.jPanelid_talla_productoProducto.setLayout(this.gridaBagLayoutProducto);


		jComboBoxid_talla_productoProducto= new JComboBoxMe();
		jComboBoxid_talla_productoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_talla_productoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_talla_productoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_talla_productoProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_talla_productoProducto= new JButtonMe();
		this.jButtonid_talla_productoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_talla_productoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_talla_productoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_talla_productoProducto.setText("Buscar");
		this.jButtonid_talla_productoProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_talla_productoProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_talla_productoProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_talla_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_talla_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_talla_productoProducto"));

		this.jButtonid_talla_productoProductoBusqueda= new JButtonMe();
		this.jButtonid_talla_productoProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_talla_productoProductoBusqueda.setText("U");
		this.jButtonid_talla_productoProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_talla_productoProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_talla_productoProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_talla_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_talla_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_talla_productoProductoBusqueda"));

		if(this.productoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_talla_productoProductoBusqueda.setVisible(false);		}

		this.jButtonid_talla_productoProductoUpdate= new JButtonMe();
		this.jButtonid_talla_productoProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_talla_productoProductoUpdate.setText("U");
		this.jButtonid_talla_productoProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_talla_productoProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_talla_productoProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_talla_productoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_talla_productoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_talla_productoProductoUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
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
		//this.jInternalFrameDetalleProducto = new ProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProducto= new GridBagLayout();
		

		
		String sToolTipProducto="";
		sToolTipProducto=ProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProducto+="(Inventario.Producto)";
		}
		
		if(!this.productoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProducto = new JButtonMe();
		this.jButtonModificarProducto = new JButtonMe();
        this.jButtonActualizarProducto = new JButtonMe();
        this.jButtonEliminarProducto = new JButtonMe();
        this.jButtonCancelarProducto = new JButtonMe();
        this.jButtonGuardarCambiosProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaProducto = new JButtonMe();
		this.jButtonCerrarProducto = new JButtonMe();
		
		this.jScrollPanelDatosProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralProducto = new JScrollPane();
				
		
		
		this.jPanelCamposProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposProducto=new JTabbedPane();
		
		
		this.jTabbedPaneCamposProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocaracteristicaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto";
		
		if(!this.productoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProducto.setName("jPanelCamposProducto"); 

		this.jPanelCamposOcultosProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProducto.setName("jPanelCamposOcultosProducto"); 

        this.jPanelAccionesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProducto.setToolTipText("Acciones");
        this.jPanelAccionesProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
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
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProducto.setText("Nuevo");
		this.jButtonModificarProducto.setText("Editar");
        this.jButtonActualizarProducto.setText("Actualizar");
        this.jButtonEliminarProducto.setText("Eliminar");
        this.jButtonCancelarProducto.setText("Cancelar");
        this.jButtonGuardarCambiosProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaProducto.setText("Guardar");
		this.jButtonCerrarProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProducto,"nuevo_button","Nuevo",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProducto,"modificar_button","Editar",this.productoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProducto,"actualizar_button","Actualizar",this.productoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProducto,"eliminar_button","Eliminar",this.productoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProducto,"cancelar_button","Cancelar",this.productoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProducto,"guardarcambios_button","Guardar",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProducto,"guardarcambiostabla_button","Guardar",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProducto,"cerrar_button","Salir",this.productoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProducto.setToolTipText("Nuevo"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProducto.setToolTipText("Editar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProducto.setToolTipText("Actualizar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProducto.setToolTipText("Eliminar)"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProducto.setToolTipText("Cancelar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProducto.setToolTipText("Guardar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
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
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoProducto";
		inputMap = this.jButtonNuevoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProducto";
		inputMap = this.jButtonActualizarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarProducto";
		inputMap = this.jButtonEliminarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarProducto";
		inputMap = this.jButtonCancelarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProducto"));
		
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
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProducto.setToolTipText("Nuevo Producto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProducto.setToolTipText("Sin Cerrar Ventana Producto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProducto.setText("Accion");
		this.jComboBoxTiposAccionesProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProducto = new JLabelMe();
		
		this.jLabelAccionesProducto.setText("Acciones");		
		this.jLabelAccionesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProducto = new GridBagLayout();
		
		this.jPanelCamposProducto.setLayout(gridaBagLayoutCamposProducto);
		this.jPanelCamposOcultosProducto.setLayout(gridaBagLayoutCamposOcultosProducto);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralProducto= new GridBagLayout();
		this.jPanelCamposIniciogeneralProducto.setLayout(gridaBagLayoutCamposIniciogeneralProducto);

		GridBagLayout gridaBagLayoutCamposIniciodatoProducto= new GridBagLayout();
		this.jPanelCamposIniciodatoProducto.setLayout(gridaBagLayoutCamposIniciodatoProducto);

		GridBagLayout gridaBagLayoutCamposIniciocaracteristicaProducto= new GridBagLayout();
		this.jPanelCamposIniciocaracteristicaProducto.setLayout(gridaBagLayoutCamposIniciocaracteristicaProducto);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProducto.add(jLabelIdProducto, this.gridBagConstraintsProducto);



	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProducto.add(jLabelidProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProducto.add(jLabelid_empresaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProducto.add(jButtonid_empresaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProducto.add(jButtonid_empresaProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProducto.add(jComboBoxid_empresaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProducto.add(jLabelid_sucursalProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProducto.add(jButtonid_sucursalProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProducto.add(jButtonid_sucursalProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProducto.add(jComboBoxid_sucursalProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProducto.add(jLabelcodigoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProducto.add(jButtoncodigoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProducto.add(jTextFieldcodigoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProducto.add(jLabelnombreProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProducto.add(jButtonnombreProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProducto.add(jscrollPanenombreProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_extranjeroProducto.add(jLabelnombre_extranjeroProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_extranjeroProducto.add(jButtonnombre_extranjeroProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_extranjeroProducto.add(jscrollPanenombre_extranjeroProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresumen_detalleProducto.add(jLabelresumen_detalleProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelresumen_detalleProducto.add(jButtonresumen_detalleProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresumen_detalleProducto.add(jscrollPaneresumen_detalleProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_barraProducto.add(jLabelcodigo_barraProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_barraProducto.add(jButtoncodigo_barraProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_barraProducto.add(jTextFieldcodigo_barraProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaProducto.add(jLabelid_lineaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProducto.add(jButtonid_lineaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaProducto.add(jButtonid_lineaProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaProducto.add(jComboBoxid_lineaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoProducto.add(jLabelid_linea_grupoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProducto.add(jButtonid_linea_grupoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoProducto.add(jButtonid_linea_grupoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoProducto.add(jComboBoxid_linea_grupoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaProducto.add(jLabelid_linea_categoriaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProducto.add(jButtonid_linea_categoriaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaProducto.add(jButtonid_linea_categoriaProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaProducto.add(jComboBoxid_linea_categoriaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaProducto.add(jLabelid_linea_marcaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProducto.add(jButtonid_linea_marcaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaProducto.add(jButtonid_linea_marcaProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaProducto.add(jComboBoxid_linea_marcaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioProducto.add(jLabelid_tipo_producto_servicioProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProducto.add(jButtonid_tipo_producto_servicioProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioProducto.add(jButtonid_tipo_producto_servicioProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioProducto.add(jComboBoxid_tipo_producto_servicioProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicio_invenProducto.add(jLabelid_tipo_producto_servicio_invenProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicio_invenProducto.add(jButtonid_tipo_producto_servicio_invenProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicio_invenProducto.add(jButtonid_tipo_producto_servicio_invenProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicio_invenProducto.add(jComboBoxid_tipo_producto_servicio_invenProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_costeoProducto.add(jLabelid_tipo_costeoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costeoProducto.add(jButtonid_tipo_costeoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costeoProducto.add(jButtonid_tipo_costeoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_costeoProducto.add(jComboBoxid_tipo_costeoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProducto.add(jLabelid_unidadProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProducto.add(jButtonid_unidadProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProducto.add(jButtonid_unidadProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProducto.add(jComboBoxid_unidadProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidad_pesoProducto.add(jLabelid_unidad_pesoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_pesoProducto.add(jButtonid_unidad_pesoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_pesoProducto.add(jButtonid_unidad_pesoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidad_pesoProducto.add(jComboBoxid_unidad_pesoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_arancelProducto.add(jLabelid_arancelProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_arancelProducto.add(jButtonid_arancelProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_arancelProducto.add(jButtonid_arancelProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_arancelProducto.add(jComboBoxid_arancelProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteProducto.add(jLabelid_clienteProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProducto = new GridBagConstraints();
	//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 2;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteProducto.add(jButtonid_clienteProducto, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProducto.add(jButtonid_clienteProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 4;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProducto.add(jButtonid_clienteProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteProducto.add(jComboBoxid_clienteProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_proveedor_defectoProducto.add(jLabelid_cliente_proveedor_defectoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProducto = new GridBagConstraints();
	//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 2;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_proveedor_defectoProducto.add(jButtonid_cliente_proveedor_defectoProducto, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedor_defectoProducto.add(jButtonid_cliente_proveedor_defectoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 4;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedor_defectoProducto.add(jButtonid_cliente_proveedor_defectoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_proveedor_defectoProducto.add(jComboBoxid_cliente_proveedor_defectoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoProducto.add(jLabelesta_activoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoProducto.add(jButtonesta_activoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoProducto.add(jCheckBoxesta_activoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProducto.add(jLabeldescripcionProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProducto.add(jButtondescripcionProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProducto.add(jscrollPanedescripcionProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioProducto.add(jLabelprecioProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioProducto.add(jButtonprecioProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioProducto.add(jTextFieldprecioProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaProducto.add(jLabelivaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaProducto.add(jButtonivaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaProducto.add(jTextFieldivaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorProducto.add(jLabeliva_valorProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorProducto.add(jButtoniva_valorProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorProducto.add(jTextFieldiva_valorProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceProducto.add(jLabeliceProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceProducto.add(jButtoniceProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceProducto.add(jTextFieldiceProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorProducto.add(jLabelice_valorProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorProducto.add(jButtonice_valorProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorProducto.add(jTextFieldice_valorProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoProducto.add(jLabeldescuentoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoProducto.add(jButtondescuentoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoProducto.add(jTextFielddescuentoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorProducto.add(jLabeldescuento_valorProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorProducto.add(jButtondescuento_valorProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorProducto.add(jTextFielddescuento_valorProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarancel_porcentajeProducto.add(jLabelarancel_porcentajeProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelarancel_porcentajeProducto.add(jButtonarancel_porcentajeProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarancel_porcentajeProducto.add(jTextFieldarancel_porcentajeProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarancel_valorProducto.add(jLabelarancel_valorProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelarancel_valorProducto.add(jButtonarancel_valorProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarancel_valorProducto.add(jTextFieldarancel_valorProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcomisionProducto.add(jLabelcomisionProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcomisionProducto.add(jButtoncomisionProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcomisionProducto.add(jTextFieldcomisionProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcomision_valorProducto.add(jLabelcomision_valorProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcomision_valorProducto.add(jButtoncomision_valorProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcomision_valorProducto.add(jTextFieldcomision_valorProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_produccionProducto.add(jLabeldias_produccionProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_produccionProducto.add(jButtondias_produccionProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_produccionProducto.add(jTextFielddias_produccionProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_stock_negativoProducto.add(jLabelcon_stock_negativoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_stock_negativoProducto.add(jButtoncon_stock_negativoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_stock_negativoProducto.add(jCheckBoxcon_stock_negativoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_precio_minimoProducto.add(jLabelcon_precio_minimoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precio_minimoProducto.add(jButtoncon_precio_minimoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_precio_minimoProducto.add(jCheckBoxcon_precio_minimoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_loteProducto.add(jLabelcon_loteProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_loteProducto.add(jButtoncon_loteProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_loteProducto.add(jCheckBoxcon_loteProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_confirmacionProducto.add(jLabelcon_confirmacionProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_confirmacionProducto.add(jButtoncon_confirmacionProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_confirmacionProducto.add(jCheckBoxcon_confirmacionProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_presupuestoProducto.add(jLabelcon_presupuestoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_presupuestoProducto.add(jButtoncon_presupuestoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_presupuestoProducto.add(jCheckBoxcon_presupuestoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_importacionProducto.add(jLabelcon_importacionProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_importacionProducto.add(jButtoncon_importacionProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_importacionProducto.add(jCheckBoxcon_importacionProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_finalProducto.add(jLabelcon_finalProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_finalProducto.add(jButtoncon_finalProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_finalProducto.add(jCheckBoxcon_finalProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_consepProducto.add(jLabelcon_consepProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_consepProducto.add(jButtoncon_consepProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_consepProducto.add(jCheckBoxcon_consepProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_serieProducto.add(jLabelcon_serieProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_serieProducto.add(jButtoncon_serieProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_serieProducto.add(jCheckBoxcon_serieProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_balanzaProducto.add(jLabelcon_balanzaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_balanzaProducto.add(jButtoncon_balanzaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_balanzaProducto.add(jCheckBoxcon_balanzaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaltoProducto.add(jLabelaltoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelaltoProducto.add(jButtonaltoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaltoProducto.add(jTextFieldaltoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanchoProducto.add(jLabelanchoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelanchoProducto.add(jButtonanchoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanchoProducto.add(jTextFieldanchoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellargoProducto.add(jLabellargoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanellargoProducto.add(jButtonlargoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellargoProducto.add(jTextFieldlargoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvolumenProducto.add(jLabelvolumenProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvolumenProducto.add(jButtonvolumenProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvolumenProducto.add(jTextFieldvolumenProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpesoProducto.add(jLabelpesoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelpesoProducto.add(jButtonpesoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpesoProducto.add(jTextFieldpesoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgramosProducto.add(jLabelgramosProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelgramosProducto.add(jButtongramosProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgramosProducto.add(jTextFieldgramosProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelunidades_cajaProducto.add(jLabelunidades_cajaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelunidades_cajaProducto.add(jButtonunidades_cajaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelunidades_cajaProducto.add(jTextFieldunidades_cajaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmargenProducto.add(jLabelmargenProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelmargenProducto.add(jButtonmargenProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmargenProducto.add(jTextFieldmargenProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfactorProducto.add(jLabelfactorProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfactorProducto.add(jButtonfactorProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfactorProducto.add(jTextFieldfactorProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfobProducto.add(jLabelfobProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfobProducto.add(jButtonfobProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfobProducto.add(jTextFieldfobProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfob2Producto.add(jLabelfob2Producto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfob2Producto.add(jButtonfob2ProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfob2Producto.add(jTextFieldfob2Producto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoProducto.add(jLabelid_tipo_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoProducto.add(jButtonid_tipo_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoProducto.add(jButtonid_tipo_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoProducto.add(jComboBoxid_tipo_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_color_productoProducto.add(jLabelid_color_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_productoProducto.add(jButtonid_color_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_productoProducto.add(jButtonid_color_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_color_productoProducto.add(jComboBoxid_color_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clase_productoProducto.add(jLabelid_clase_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clase_productoProducto.add(jButtonid_clase_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clase_productoProducto.add(jButtonid_clase_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clase_productoProducto.add(jComboBoxid_clase_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_efecto_productoProducto.add(jLabelid_efecto_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_efecto_productoProducto.add(jButtonid_efecto_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_efecto_productoProducto.add(jButtonid_efecto_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_efecto_productoProducto.add(jComboBoxid_efecto_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_marca_productoProducto.add(jLabelid_marca_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_marca_productoProducto.add(jButtonid_marca_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_marca_productoProducto.add(jButtonid_marca_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_marca_productoProducto.add(jComboBoxid_marca_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_modelo_productoProducto.add(jLabelid_modelo_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_modelo_productoProducto.add(jButtonid_modelo_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_modelo_productoProducto.add(jButtonid_modelo_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_modelo_productoProducto.add(jComboBoxid_modelo_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_material_productoProducto.add(jLabelid_material_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_material_productoProducto.add(jButtonid_material_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_material_productoProducto.add(jButtonid_material_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_material_productoProducto.add(jComboBoxid_material_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_segmento_productoProducto.add(jLabelid_segmento_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_segmento_productoProducto.add(jButtonid_segmento_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_segmento_productoProducto.add(jButtonid_segmento_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_segmento_productoProducto.add(jComboBoxid_segmento_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_talla_productoProducto.add(jLabelid_talla_productoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_talla_productoProducto.add(jButtonid_talla_productoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 3;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_talla_productoProducto.add(jButtonid_talla_productoProductoUpdate, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_talla_productoProducto.add(jComboBoxid_talla_productoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgrupoProducto.add(jLabelgrupoProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelgrupoProducto.add(jButtongrupoProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgrupoProducto.add(jscrollPanegrupoProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreferenciaProducto.add(jLabelreferenciaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelreferenciaProducto.add(jButtonreferenciaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreferenciaProducto.add(jscrollPanereferenciaProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaplicacionProducto.add(jLabelaplicacionProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelaplicacionProducto.add(jButtonaplicacionProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaplicacionProducto.add(jscrollPaneaplicacionProducto, this.gridBagConstraintsProducto);


	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 0;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprocedenciaProducto.add(jLabelprocedenciaProducto, this.gridBagConstraintsProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 2;
		this.gridBagConstraintsProducto.ipadx = 0;
		this.gridBagConstraintsProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprocedenciaProducto.add(jButtonprocedenciaProductoBusqueda, this.gridBagConstraintsProducto);
	}

	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProducto.gridy = 0;
	this.gridBagConstraintsProducto.gridx = 1;
	this.gridBagConstraintsProducto.ipadx = 0;
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprocedenciaProducto.add(jscrollPaneprocedenciaProducto, this.gridBagConstraintsProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProducto.add(this.jPanelid_unidadProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposProducto % 2==0) {
		iXPanelCamposProducto=0;
		iYPanelCamposProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProducto.add(this.jPanelid_unidad_pesoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposProducto % 2==0) {
		iXPanelCamposProducto=0;
		iYPanelCamposProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposOcultosProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposOcultosProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProducto.add(this.jPanelid_empresaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposOcultosProducto % 2==0) {
		iXPanelCamposOcultosProducto=0;
		iYPanelCamposOcultosProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposOcultosProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposOcultosProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProducto.add(this.jPanelid_sucursalProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposOcultosProducto % 2==0) {
		iXPanelCamposOcultosProducto=0;
		iYPanelCamposOcultosProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelidProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelcodigoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelnombreProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelnombre_extranjeroProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelresumen_detalleProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelcodigo_barraProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_lineaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_linea_grupoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_linea_categoriaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_linea_marcaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_tipo_producto_servicioProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_tipo_producto_servicio_invenProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_tipo_costeoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_arancelProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_clienteProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelid_cliente_proveedor_defectoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPanelesta_activoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciogeneralProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciogeneralProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralProducto.add(this.jPaneldescripcionProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciogeneralProducto % 2==0) {
		iXPanelCamposIniciogeneralProducto=0;
		iYPanelCamposIniciogeneralProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelprecioProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelivaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPaneliva_valorProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPaneliceProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelice_valorProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPaneldescuentoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPaneldescuento_valorProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelarancel_porcentajeProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelarancel_valorProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcomisionProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcomision_valorProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPaneldias_produccionProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_stock_negativoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_precio_minimoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_loteProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_confirmacionProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_presupuestoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_importacionProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_finalProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_consepProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_serieProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciodatoProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciodatoProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoProducto.add(this.jPanelcon_balanzaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciodatoProducto % 2==0) {
		iXPanelCamposIniciodatoProducto=0;
		iYPanelCamposIniciodatoProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelaltoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelanchoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanellargoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelvolumenProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelpesoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelgramosProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelunidades_cajaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelmargenProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelfactorProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelfobProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelfob2Producto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_tipo_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_color_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_clase_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_efecto_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_marca_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_modelo_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_material_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_segmento_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelid_talla_productoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelgrupoProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelreferenciaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelaplicacionProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
	this.gridBagConstraintsProducto = new GridBagConstraints();
	this.gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProducto.gridy = iYPanelCamposIniciocaracteristicaProducto;
	this.gridBagConstraintsProducto.gridx = iXPanelCamposIniciocaracteristicaProducto++;
	this.gridBagConstraintsProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaProducto.add(this.jPanelprocedenciaProducto, this.gridBagConstraintsProducto);



	if(iXPanelCamposIniciocaracteristicaProducto % 2==0) {
		iXPanelCamposIniciocaracteristicaProducto=0;
		iYPanelCamposIniciocaracteristicaProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProducto= new GridBagLayout();
		this.jPanelAccionesProducto.setLayout(gridaBagLayoutAccionesProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProducto= new GridBagLayout();
		this.jPanelAccionesFormularioProducto.setLayout(gridaBagLayoutAccionesFormularioProducto);
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProducto.add(this.jComboBoxTiposAccionesFormularioProducto, this.gridBagConstraintsProducto);

		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProducto.add(this.jCheckBoxPostAccionNuevoProducto, this.gridBagConstraintsProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProducto.add(this.jCheckBoxPostAccionSinCerrarProducto, this.gridBagConstraintsProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProducto.add(this.jCheckBoxPostAccionSinMensajeProducto, this.gridBagConstraintsProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesProducto.add(this.jButtonModificarProducto, this.gridBagConstraintsProducto);							

		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesProducto.add(this.jButtonEliminarProducto, this.gridBagConstraintsProducto);
		
			
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = 0;		
		this.gridBagConstraintsProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProducto.add(this.jButtonActualizarProducto, this.gridBagConstraintsProducto);


		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = 0;		
		this.gridBagConstraintsProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesProducto.add(this.jButtonGuardarCambiosProducto, this.gridBagConstraintsProducto);	
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = 0;		
		this.gridBagConstraintsProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesProducto.add(this.jButtonCancelarProducto, this.gridBagConstraintsProducto);
		
			
			
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
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProducto.gridx =0;
		this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProducto, this.gridBagConstraintsProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProducto = new ProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoModel productoModel=new ProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoModel.ProductoFocusTraversalPolicy productoFocusTraversalPolicy = productoModel.new ProductoFocusTraversalPolicy(this);
			
			//productoFocusTraversalPolicy.setproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoModel);
			
			
			this.jContentPaneDetalleProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProducto = new GridBagLayout();	
			this.jContentPaneDetalleProducto.setLayout(gridaBagLayoutDetalleProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProducto = new GridBagConstraints();
				this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProducto.gridx = 0;
					
				
				this.jContentPaneDetalleProducto.add(jTtoolBarDetalleProducto, gridBagConstraintsProducto);								
				
}
			
			this.jScrollPanelDatosEdicionProducto=   new JScrollPane(jContentPaneDetalleProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposProducto.add("General",this.jPanelCamposIniciogeneralProducto);
		this.jTabbedPaneCamposProducto.add("Dato",this.jPanelCamposIniciodatoProducto);
		this.jTabbedPaneCamposProducto.add("Caracteristica",this.jPanelCamposIniciocaracteristicaProducto);
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
						
			this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProducto.gridx = 0;
	        
			this.jContentPaneDetalleProducto.add(jTabbedPaneCamposProducto, gridBagConstraintsProducto);
			
			
			//if(!this.conCargarMinimo) {
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& productoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBodegaProducto(this.puedeCargarPorParteBodegaProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(this.puedeCargarPorParteDetalleImpuestoInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameIngrediente(this.puedeCargarPorParteIngrediente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroProducto(this.puedeCargarPorParteParametroProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticaFactu(this.puedeCargarPorPartePoliticaFactu,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticaProducto(this.puedeCargarPorPartePoliticaProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(this.puedeCargarPorPartePrecio,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoProducto(this.puedeCargarPorPartePresupuestoProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(this.puedeCargarPorPartePresupuestoVentas,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoCarac(this.puedeCargarPorParteProductoCarac,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoCuentaContable(this.puedeCargarPorParteProductoCuentaContable,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoEspeci(this.puedeCargarPorParteProductoEspeci,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoEstadistica(this.puedeCargarPorParteProductoEstadistica,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoPromocion(this.puedeCargarPorParteProductoPromocion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoReempla(this.puedeCargarPorParteProductoReempla,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoUnidad(this.puedeCargarPorParteProductoUnidad,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProveedorProducto(this.puedeCargarPorParteProveedorProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSaldoMesProducto(this.puedeCargarPorParteSaldoMesProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSerieProducto(this.puedeCargarPorParteSerieProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioCliente(this.puedeCargarPorParteServicioCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUbicacionProdu(this.puedeCargarPorParteUbicacionProdu,false,-1);
					
					if(this.productoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProducto= new GridBagConstraints();
						this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProducto.gridx = 0;
						this.jContentPaneDetalleProducto.add(this.jTabbedPaneRelacionesProducto, this.gridBagConstraintsProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBodegaProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameIngrediente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticaFactu(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticaProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoCarac(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoCuentaContable(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoEspeci(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoEstadistica(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoPromocion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoReempla(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoUnidad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProveedorProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSaldoMesProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSerieProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUbicacionProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProducto = new GridBagConstraints();
					this.gridBagConstraintsProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProducto.gridx = 0;
					
				
					this.jContentPaneDetalleProducto.add(jPanelCamposOcultosProducto, gridBagConstraintsProducto);
				
					this.jPanelCamposOcultosProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;//64;		
	        this.gridBagConstraintsProducto.gridx = 0;
	        this.gridBagConstraintsProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProducto.add(this.jPanelAccionesFormularioProducto, this.gridBagConstraintsProducto);							
			
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
	        this.gridBagConstraintsProducto.gridy = iGridyRelaciones;//64;		
	        this.gridBagConstraintsProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleProducto.add(this.jPanelAccionesProducto, this.gridBagConstraintsProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProducto=   new JScrollPane(this.jPanelCamposProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProducto.gridx = 0;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProducto, this.gridBagConstraintsProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProducto, this.gridBagConstraintsProducto);			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProducto, this.gridBagConstraintsProducto);									
			*/
		//}								
			
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
		
		
		//return this.jScrollPanelDatosGeneralProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionProducto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBodegaProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bodegaproductoSessionBean=new BodegaProductoSessionBean();
		this.bodegaproductoSessionBean.setConGuardarRelaciones(false);
		this.bodegaproductoSessionBean.setEsGuardarRelacionado(true);

		this.bodegaproductoBeanSwingJInternalFrame=null;//new BodegaProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bodegaproductoBeanSwingJInternalFramePopup=new BodegaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bodegaproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {

				BodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				BodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bodegaproductoSessionBean.setEsGuardarRelacionado(true);

				this.bodegaproductoBeanSwingJInternalFrame=new BodegaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bodegaproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bodegaproductoBeanSwingJInternalFrame.setbodegaproductoSessionBean(this.bodegaproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.bodegaproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Bodega Productos",this.bodegaproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.bodegaproductoBeanSwingJInternalFrame.getContentPane());
				}

				//BodegaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bodegaproductoSessionBean.setEsGuardarRelacionado(false);
				this.bodegaproductoBeanSwingJInternalFrame=null;//new BodegaProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBodegaProducto) {
					this.jTabbedPaneRelacionesProducto.add("Bodega Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(false);
		this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(true);

		this.detalleimpuestoinvenBeanSwingJInternalFrame=null;//new DetalleImpuestoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleimpuestoinvenBeanSwingJInternalFramePopup=new DetalleImpuestoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleimpuestoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {

				DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(true);

				this.detalleimpuestoinvenBeanSwingJInternalFrame=new DetalleImpuestoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleimpuestoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleimpuestoinvenBeanSwingJInternalFrame.setdetalleimpuestoinvenSessionBean(this.detalleimpuestoinvenSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Detalle Impuesto Invenes",this.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(false);
				this.detalleimpuestoinvenBeanSwingJInternalFrame=null;//new DetalleImpuestoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleImpuestoInven) {
					this.jTabbedPaneRelacionesProducto.add("Detalle Impuesto Invenes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameIngrediente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ingredienteSessionBean=new IngredienteSessionBean();
		this.ingredienteSessionBean.setConGuardarRelaciones(false);
		this.ingredienteSessionBean.setEsGuardarRelacionado(true);

		this.ingredienteBeanSwingJInternalFrame=null;//new IngredienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ingredienteBeanSwingJInternalFramePopup=new IngredienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ingredienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {

				IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ingredienteSessionBean.setEsGuardarRelacionado(true);

				this.ingredienteBeanSwingJInternalFrame=new IngredienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ingredienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ingredienteBeanSwingJInternalFrame.setingredienteSessionBean(this.ingredienteSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.ingredienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Ingredientes",this.ingredienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.ingredienteBeanSwingJInternalFrame.getContentPane());
				}

				//IngredienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ingredienteSessionBean.setEsGuardarRelacionado(false);
				this.ingredienteBeanSwingJInternalFrame=null;//new IngredienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteIngrediente) {
					this.jTabbedPaneRelacionesProducto.add("Ingredientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroproductoSessionBean=new ParametroProductoSessionBean();
		this.parametroproductoSessionBean.setConGuardarRelaciones(false);
		this.parametroproductoSessionBean.setEsGuardarRelacionado(true);

		this.parametroproductoBeanSwingJInternalFrame=null;//new ParametroProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroproductoBeanSwingJInternalFramePopup=new ParametroProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {

				ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroproductoSessionBean.setEsGuardarRelacionado(true);

				this.parametroproductoBeanSwingJInternalFrame=new ParametroProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroproductoBeanSwingJInternalFrame.setparametroproductoSessionBean(this.parametroproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.parametroproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Parametro Productos",this.parametroproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.parametroproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroproductoSessionBean.setEsGuardarRelacionado(false);
				this.parametroproductoBeanSwingJInternalFrame=null;//new ParametroProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroProducto) {
					this.jTabbedPaneRelacionesProducto.add("Parametro Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePoliticaFactu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicafactuSessionBean=new PoliticaFactuSessionBean();
		this.politicafactuSessionBean.setConGuardarRelaciones(false);
		this.politicafactuSessionBean.setEsGuardarRelacionado(true);

		this.politicafactuBeanSwingJInternalFrame=null;//new PoliticaFactuBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicafactuBeanSwingJInternalFramePopup=new PoliticaFactuBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicafactuBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {

				PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicafactuSessionBean.setEsGuardarRelacionado(true);

				this.politicafactuBeanSwingJInternalFrame=new PoliticaFactuBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicafactuBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicafactuBeanSwingJInternalFrame.setpoliticafactuSessionBean(this.politicafactuSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.politicafactuBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Politica Factus",this.politicafactuBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.politicafactuBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticaFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicafactuSessionBean.setEsGuardarRelacionado(false);
				this.politicafactuBeanSwingJInternalFrame=null;//new PoliticaFactuBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicafactuSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticaFactu) {
					this.jTabbedPaneRelacionesProducto.add("Politica Factus",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePoliticaProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicaproductoSessionBean=new PoliticaProductoSessionBean();
		this.politicaproductoSessionBean.setConGuardarRelaciones(false);
		this.politicaproductoSessionBean.setEsGuardarRelacionado(true);

		this.politicaproductoBeanSwingJInternalFrame=null;//new PoliticaProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicaproductoBeanSwingJInternalFramePopup=new PoliticaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicaproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {

				PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicaproductoSessionBean.setEsGuardarRelacionado(true);

				this.politicaproductoBeanSwingJInternalFrame=new PoliticaProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicaproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicaproductoBeanSwingJInternalFrame.setpoliticaproductoSessionBean(this.politicaproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.politicaproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Politica Productos",this.politicaproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.politicaproductoBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicaproductoSessionBean.setEsGuardarRelacionado(false);
				this.politicaproductoBeanSwingJInternalFrame=null;//new PoliticaProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicaproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticaProducto) {
					this.jTabbedPaneRelacionesProducto.add("Politica Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.precioSessionBean=new PrecioSessionBean();
		this.precioSessionBean.setConGuardarRelaciones(false);
		this.precioSessionBean.setEsGuardarRelacionado(true);

		this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.precioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.precioSessionBean.getEsGuardarRelacionado()) {

				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.precioSessionBean.setEsGuardarRelacionado(true);

				this.precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.precioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.precioBeanSwingJInternalFrame.setprecioSessionBean(this.precioSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.precioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Precios",this.precioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.precioBeanSwingJInternalFrame.getContentPane());
				}

				//PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.precioSessionBean.setEsGuardarRelacionado(false);
				this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrecio) {
					this.jTabbedPaneRelacionesProducto.add("Precios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoproductoSessionBean=new PresupuestoProductoSessionBean();
		this.presupuestoproductoSessionBean.setConGuardarRelaciones(false);
		this.presupuestoproductoSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoproductoBeanSwingJInternalFrame=null;//new PresupuestoProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoproductoBeanSwingJInternalFramePopup=new PresupuestoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {

				PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoproductoSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoproductoBeanSwingJInternalFrame=new PresupuestoProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoproductoBeanSwingJInternalFrame.setpresupuestoproductoSessionBean(this.presupuestoproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.presupuestoproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Presupuesto Productos",this.presupuestoproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.presupuestoproductoBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoproductoSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoproductoBeanSwingJInternalFrame=null;//new PresupuestoProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoProducto) {
					this.jTabbedPaneRelacionesProducto.add("Presupuesto Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentas(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		this.presupuestoventasSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventasSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventasBeanSwingJInternalFrame=null;//new PresupuestoVentasBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventasBeanSwingJInternalFramePopup=new PresupuestoVentasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventasBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventasSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventasBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventasBeanSwingJInternalFrame.setpresupuestoventasSessionBean(this.presupuestoventasSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.presupuestoventasBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Presupuesto Ventases",this.presupuestoventasBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.presupuestoventasBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventasSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventasBeanSwingJInternalFrame=null;//new PresupuestoVentasBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentas) {
					this.jTabbedPaneRelacionesProducto.add("Presupuesto Ventases",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoCarac(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productocaracSessionBean=new ProductoCaracSessionBean();
		this.productocaracSessionBean.setConGuardarRelaciones(false);
		this.productocaracSessionBean.setEsGuardarRelacionado(true);

		this.productocaracBeanSwingJInternalFrame=null;//new ProductoCaracBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productocaracBeanSwingJInternalFramePopup=new ProductoCaracBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productocaracBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productocaracSessionBean.getEsGuardarRelacionado()) {

				ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoCaracJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productocaracSessionBean.setEsGuardarRelacionado(true);

				this.productocaracBeanSwingJInternalFrame=new ProductoCaracBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productocaracBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productocaracBeanSwingJInternalFrame.setproductocaracSessionBean(this.productocaracSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productocaracBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Caracteristicas",this.productocaracBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productocaracBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoCaracJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productocaracSessionBean.setEsGuardarRelacionado(false);
				this.productocaracBeanSwingJInternalFrame=null;//new ProductoCaracBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoCarac) {
					this.jTabbedPaneRelacionesProducto.add("Caracteristicas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoCuentaContable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productocuentacontableSessionBean=new ProductoCuentaContableSessionBean();
		this.productocuentacontableSessionBean.setConGuardarRelaciones(false);
		this.productocuentacontableSessionBean.setEsGuardarRelacionado(true);

		this.productocuentacontableBeanSwingJInternalFrame=null;//new ProductoCuentaContableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productocuentacontableBeanSwingJInternalFramePopup=new ProductoCuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productocuentacontableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {

				ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productocuentacontableSessionBean.setEsGuardarRelacionado(true);

				this.productocuentacontableBeanSwingJInternalFrame=new ProductoCuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productocuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productocuentacontableBeanSwingJInternalFrame.setproductocuentacontableSessionBean(this.productocuentacontableSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productocuentacontableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Producto Cuenta Contables",this.productocuentacontableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productocuentacontableBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productocuentacontableSessionBean.setEsGuardarRelacionado(false);
				this.productocuentacontableBeanSwingJInternalFrame=null;//new ProductoCuentaContableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoCuentaContable) {
					this.jTabbedPaneRelacionesProducto.add("Producto Cuenta Contables",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoEspeci(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoespeciSessionBean=new ProductoEspeciSessionBean();
		this.productoespeciSessionBean.setConGuardarRelaciones(false);
		this.productoespeciSessionBean.setEsGuardarRelacionado(true);

		this.productoespeciBeanSwingJInternalFrame=null;//new ProductoEspeciBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoespeciBeanSwingJInternalFramePopup=new ProductoEspeciBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoespeciBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {

				ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoEspeciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoespeciSessionBean.setEsGuardarRelacionado(true);

				this.productoespeciBeanSwingJInternalFrame=new ProductoEspeciBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoespeciBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoespeciBeanSwingJInternalFrame.setproductoespeciSessionBean(this.productoespeciSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productoespeciBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Especificacions",this.productoespeciBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productoespeciBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoEspeciJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoespeciSessionBean.setEsGuardarRelacionado(false);
				this.productoespeciBeanSwingJInternalFrame=null;//new ProductoEspeciBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoEspeci) {
					this.jTabbedPaneRelacionesProducto.add("Especificacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoEstadistica(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoestadisticaSessionBean=new ProductoEstadisticaSessionBean();
		this.productoestadisticaSessionBean.setConGuardarRelaciones(false);
		this.productoestadisticaSessionBean.setEsGuardarRelacionado(true);

		this.productoestadisticaBeanSwingJInternalFrame=null;//new ProductoEstadisticaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoestadisticaBeanSwingJInternalFramePopup=new ProductoEstadisticaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoestadisticaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {

				ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoEstadisticaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoestadisticaSessionBean.setEsGuardarRelacionado(true);

				this.productoestadisticaBeanSwingJInternalFrame=new ProductoEstadisticaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoestadisticaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoestadisticaBeanSwingJInternalFrame.setproductoestadisticaSessionBean(this.productoestadisticaSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productoestadisticaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Estadisticas",this.productoestadisticaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productoestadisticaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoEstadisticaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoestadisticaSessionBean.setEsGuardarRelacionado(false);
				this.productoestadisticaBeanSwingJInternalFrame=null;//new ProductoEstadisticaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoestadisticaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoEstadistica) {
					this.jTabbedPaneRelacionesProducto.add("Estadisticas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoPromocion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productopromocionSessionBean=new ProductoPromocionSessionBean();
		this.productopromocionSessionBean.setConGuardarRelaciones(false);
		this.productopromocionSessionBean.setEsGuardarRelacionado(true);

		this.productopromocionBeanSwingJInternalFrame=null;//new ProductoPromocionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productopromocionBeanSwingJInternalFramePopup=new ProductoPromocionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productopromocionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {

				ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoPromocionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productopromocionSessionBean.setEsGuardarRelacionado(true);

				this.productopromocionBeanSwingJInternalFrame=new ProductoPromocionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productopromocionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productopromocionBeanSwingJInternalFrame.setproductopromocionSessionBean(this.productopromocionSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productopromocionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Promocions",this.productopromocionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productopromocionBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoPromocionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productopromocionSessionBean.setEsGuardarRelacionado(false);
				this.productopromocionBeanSwingJInternalFrame=null;//new ProductoPromocionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoPromocion) {
					this.jTabbedPaneRelacionesProducto.add("Promocions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoReempla(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		this.productoreemplaSessionBean.setConGuardarRelaciones(false);
		this.productoreemplaSessionBean.setEsGuardarRelacionado(true);

		this.productoreemplaBeanSwingJInternalFrame=null;//new ProductoReemplaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoreemplaBeanSwingJInternalFramePopup=new ProductoReemplaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoreemplaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {

				ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoReemplaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoreemplaSessionBean.setEsGuardarRelacionado(true);

				this.productoreemplaBeanSwingJInternalFrame=new ProductoReemplaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoreemplaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoreemplaBeanSwingJInternalFrame.setproductoreemplaSessionBean(this.productoreemplaSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productoreemplaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Reemplazos",this.productoreemplaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productoreemplaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoreemplaSessionBean.setEsGuardarRelacionado(false);
				this.productoreemplaBeanSwingJInternalFrame=null;//new ProductoReemplaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoReempla) {
					this.jTabbedPaneRelacionesProducto.add("Reemplazos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoUnidad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productounidadSessionBean=new ProductoUnidadSessionBean();
		this.productounidadSessionBean.setConGuardarRelaciones(false);
		this.productounidadSessionBean.setEsGuardarRelacionado(true);

		this.productounidadBeanSwingJInternalFrame=null;//new ProductoUnidadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productounidadBeanSwingJInternalFramePopup=new ProductoUnidadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productounidadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productounidadSessionBean.getEsGuardarRelacionado()) {

				ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productounidadSessionBean.setEsGuardarRelacionado(true);

				this.productounidadBeanSwingJInternalFrame=new ProductoUnidadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productounidadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productounidadBeanSwingJInternalFrame.setproductounidadSessionBean(this.productounidadSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.productounidadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Producto Unidads",this.productounidadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.productounidadBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productounidadSessionBean.setEsGuardarRelacionado(false);
				this.productounidadBeanSwingJInternalFrame=null;//new ProductoUnidadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoUnidad) {
					this.jTabbedPaneRelacionesProducto.add("Producto Unidads",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProveedorProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		this.proveedorproductoSessionBean.setConGuardarRelaciones(false);
		this.proveedorproductoSessionBean.setEsGuardarRelacionado(true);

		this.proveedorproductoBeanSwingJInternalFrame=null;//new ProveedorProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proveedorproductoBeanSwingJInternalFramePopup=new ProveedorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proveedorproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {

				ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proveedorproductoSessionBean.setEsGuardarRelacionado(true);

				this.proveedorproductoBeanSwingJInternalFrame=new ProveedorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.proveedorproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proveedorproductoBeanSwingJInternalFrame.setproveedorproductoSessionBean(this.proveedorproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.proveedorproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Producto Proveedors",this.proveedorproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.proveedorproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ProveedorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proveedorproductoSessionBean.setEsGuardarRelacionado(false);
				this.proveedorproductoBeanSwingJInternalFrame=null;//new ProveedorProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProveedorProducto) {
					this.jTabbedPaneRelacionesProducto.add("Producto Proveedors",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSaldoMesProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.saldomesproductoSessionBean=new SaldoMesProductoSessionBean();
		this.saldomesproductoSessionBean.setConGuardarRelaciones(false);
		this.saldomesproductoSessionBean.setEsGuardarRelacionado(true);

		this.saldomesproductoBeanSwingJInternalFrame=null;//new SaldoMesProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.saldomesproductoBeanSwingJInternalFramePopup=new SaldoMesProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.saldomesproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {

				SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				SaldoMesProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.saldomesproductoSessionBean.setEsGuardarRelacionado(true);

				this.saldomesproductoBeanSwingJInternalFrame=new SaldoMesProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.saldomesproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.saldomesproductoBeanSwingJInternalFrame.setsaldomesproductoSessionBean(this.saldomesproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.saldomesproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Saldo Mes Productos",this.saldomesproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.saldomesproductoBeanSwingJInternalFrame.getContentPane());
				}

				//SaldoMesProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.saldomesproductoSessionBean.setEsGuardarRelacionado(false);
				this.saldomesproductoBeanSwingJInternalFrame=null;//new SaldoMesProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.saldomesproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSaldoMesProducto) {
					this.jTabbedPaneRelacionesProducto.add("Saldo Mes Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSerieProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.serieproductoSessionBean=new SerieProductoSessionBean();
		this.serieproductoSessionBean.setConGuardarRelaciones(false);
		this.serieproductoSessionBean.setEsGuardarRelacionado(true);

		this.serieproductoBeanSwingJInternalFrame=null;//new SerieProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.serieproductoBeanSwingJInternalFramePopup=new SerieProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.serieproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {

				SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				SerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.serieproductoSessionBean.setEsGuardarRelacionado(true);

				this.serieproductoBeanSwingJInternalFrame=new SerieProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.serieproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.serieproductoBeanSwingJInternalFrame.setserieproductoSessionBean(this.serieproductoSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.serieproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Serie Productos",this.serieproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.serieproductoBeanSwingJInternalFrame.getContentPane());
				}

				//SerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.serieproductoSessionBean.setEsGuardarRelacionado(false);
				this.serieproductoBeanSwingJInternalFrame=null;//new SerieProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSerieProducto) {
					this.jTabbedPaneRelacionesProducto.add("Serie Productos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameServicioCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		this.servicioclienteSessionBean.setConGuardarRelaciones(false);
		this.servicioclienteSessionBean.setEsGuardarRelacionado(true);

		this.servicioclienteBeanSwingJInternalFrame=null;//new ServicioClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.servicioclienteBeanSwingJInternalFramePopup=new ServicioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.servicioclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {

				ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.servicioclienteSessionBean.setEsGuardarRelacionado(true);

				this.servicioclienteBeanSwingJInternalFrame=new ServicioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.servicioclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.servicioclienteBeanSwingJInternalFrame.setservicioclienteSessionBean(this.servicioclienteSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.servicioclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Servicio Clientes",this.servicioclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.servicioclienteBeanSwingJInternalFrame.getContentPane());
				}

				//ServicioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.servicioclienteSessionBean.setEsGuardarRelacionado(false);
				this.servicioclienteBeanSwingJInternalFrame=null;//new ServicioClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteServicioCliente) {
					this.jTabbedPaneRelacionesProducto.add("Servicio Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUbicacionProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ubicacionproduSessionBean=new UbicacionProduSessionBean();
		this.ubicacionproduSessionBean.setConGuardarRelaciones(false);
		this.ubicacionproduSessionBean.setEsGuardarRelacionado(true);

		this.ubicacionproduBeanSwingJInternalFrame=null;//new UbicacionProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ubicacionproduBeanSwingJInternalFramePopup=new UbicacionProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ubicacionproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {

				UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				UbicacionProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ubicacionproduSessionBean.setEsGuardarRelacionado(true);

				this.ubicacionproduBeanSwingJInternalFrame=new UbicacionProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ubicacionproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ubicacionproduBeanSwingJInternalFrame.setubicacionproduSessionBean(this.ubicacionproduSessionBean);

				//this.gridBagConstraintsProducto = new GridBagConstraints();
				//this.gridBagConstraintsProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProducto.gridx = 0;
				//this.jContentPaneDetalleProducto.add(this.ubicacionproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProducto.add("Ubicacion Productos",this.ubicacionproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProducto.setComponentAt(iIndexTab,this.ubicacionproduBeanSwingJInternalFrame.getContentPane());
				}

				//UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ubicacionproduSessionBean.setEsGuardarRelacionado(false);
				this.ubicacionproduBeanSwingJInternalFrame=null;//new UbicacionProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ubicacionproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUbicacionProdu) {
					this.jTabbedPaneRelacionesProducto.add("Ubicacion Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProveedorProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProveedorProductoBeanSwingJInternalFrame proveedorproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proveedorproductoBeanSwingJInternalFrame=new ProveedorProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proveedorproductoBeanSwingJInternalFrame.getProveedorProductoLogic().setConnexion(this.productoLogic.getConnexion());

					proveedorproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					proveedorproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					proveedorproductoBeanSwingJInternalFrame.proveedorproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					proveedorproductoBeanSwingJInternalFrame.proveedorproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proveedorproductoBeanSwingJInternalFrame.cargarCombosForeignKeyProveedorProducto(proveedorproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					proveedorproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					proveedorproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						proveedorproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proveedorproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					proveedorproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proveedorproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					proveedorproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					proveedorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProveedorProducto(true);
					proveedorproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProveedorProducto("n",proveedorproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, proveedorproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proveedorproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					proveedorproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proveedorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsProveedorProducto("relacionado");
					} else {
						proveedorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsProveedorProducto("no_relacionado");
					}

					proveedorproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionProveedorProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPrecioBeanSwingJInternalFrame(List<Producto> productos,Producto producto,PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					precioBeanSwingJInternalFrame.getPrecioLogic().setConnexion(this.productoLogic.getConnexion());

					precioBeanSwingJInternalFrame.setproductosForeignKey(productos);
					precioBeanSwingJInternalFrame.setproductoForeignKey(producto);
					precioBeanSwingJInternalFrame.precioSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					precioBeanSwingJInternalFrame.precioSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					precioBeanSwingJInternalFrame.cargarCombosForeignKeyPrecio(precioBeanSwingJInternalFrame.isCargarCombosDependencia);
					precioBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					precioBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						precioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					precioBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					precioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					precioBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					precioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(true);
					precioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrecio("n",precioBeanSwingJInternalFrame.isGuardarCambiosEnLote, precioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					precioBeanSwingJInternalFrame.setAutoscrolls(true);
					precioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("relacionado");
					} else {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");
					}

					precioBeanSwingJInternalFrame.getjButtonRecargarInformacionPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleImpuestoInvenBeanSwingJInternalFrame(List<Producto> productos,Producto producto,DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleimpuestoinvenBeanSwingJInternalFrame=new DetalleImpuestoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleimpuestoinvenBeanSwingJInternalFrame.getDetalleImpuestoInvenLogic().setConnexion(this.productoLogic.getConnexion());

					detalleimpuestoinvenBeanSwingJInternalFrame.setproductosForeignKey(productos);
					detalleimpuestoinvenBeanSwingJInternalFrame.setproductoForeignKey(producto);
					detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleimpuestoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleImpuestoInven(detalleimpuestoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleimpuestoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						detalleimpuestoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleimpuestoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					detalleimpuestoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleimpuestoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					detalleimpuestoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					detalleimpuestoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleImpuestoInven(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n",detalleimpuestoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleimpuestoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleimpuestoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleimpuestoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleImpuestoInven("relacionado");
					} else {
						detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleImpuestoInven("no_relacionado");
					}

					detalleimpuestoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleImpuestoInven().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoVentasBeanSwingJInternalFrame(List<Producto> productos,Producto producto,PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventasBeanSwingJInternalFrame.getPresupuestoVentasLogic().setConnexion(this.productoLogic.getConnexion());

					presupuestoventasBeanSwingJInternalFrame.setproductosForeignKey(productos);
					presupuestoventasBeanSwingJInternalFrame.setproductoForeignKey(producto);
					presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventasBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentas(presupuestoventasBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventasBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					presupuestoventasBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventasBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventasBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					presupuestoventasBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventasBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					presupuestoventasBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					presupuestoventasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentas(true);
					presupuestoventasBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentas("n",presupuestoventasBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventasBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventasBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventasBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("relacionado");
					} else {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("no_relacionado");
					}

					presupuestoventasBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentas().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticaProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,PoliticaProductoBeanSwingJInternalFrame politicaproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicaproductoBeanSwingJInternalFrame=new PoliticaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicaproductoBeanSwingJInternalFrame.getPoliticaProductoLogic().setConnexion(this.productoLogic.getConnexion());

					politicaproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					politicaproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					politicaproductoBeanSwingJInternalFrame.politicaproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					politicaproductoBeanSwingJInternalFrame.politicaproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicaproductoBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticaProducto(politicaproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicaproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					politicaproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						politicaproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicaproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					politicaproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicaproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					politicaproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					politicaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticaProducto(true);
					politicaproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticaProducto("n",politicaproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicaproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicaproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					politicaproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticaProducto("relacionado");
					} else {
						politicaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticaProducto("no_relacionado");
					}

					politicaproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticaProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSerieProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//serieproductoBeanSwingJInternalFrame=new SerieProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					serieproductoBeanSwingJInternalFrame.getSerieProductoLogic().setConnexion(this.productoLogic.getConnexion());

					serieproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					serieproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					serieproductoBeanSwingJInternalFrame.serieproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					serieproductoBeanSwingJInternalFrame.serieproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					serieproductoBeanSwingJInternalFrame.cargarCombosForeignKeySerieProducto(serieproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					serieproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					serieproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						serieproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					serieproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					serieproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					serieproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					serieproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					serieproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSerieProducto(true);
					serieproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSerieProducto("n",serieproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, serieproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					serieproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					serieproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						serieproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSerieProducto("relacionado");
					} else {
						serieproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSerieProducto("no_relacionado");
					}

					serieproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionSerieProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarUbicacionProduBeanSwingJInternalFrame(List<Producto> productos,Producto producto,UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ubicacionproduBeanSwingJInternalFrame=new UbicacionProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ubicacionproduBeanSwingJInternalFrame.getUbicacionProduLogic().setConnexion(this.productoLogic.getConnexion());

					ubicacionproduBeanSwingJInternalFrame.setproductosForeignKey(productos);
					ubicacionproduBeanSwingJInternalFrame.setproductoForeignKey(producto);
					ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ubicacionproduBeanSwingJInternalFrame.cargarCombosForeignKeyUbicacionProdu(ubicacionproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					ubicacionproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					ubicacionproduBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						ubicacionproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ubicacionproduBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					ubicacionproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ubicacionproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					ubicacionproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					ubicacionproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionProdu(true);
					ubicacionproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUbicacionProdu("n",ubicacionproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, ubicacionproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ubicacionproduBeanSwingJInternalFrame.setAutoscrolls(true);
					ubicacionproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ubicacionproduBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionProdu("relacionado");
					} else {
						ubicacionproduBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionProdu("no_relacionado");
					}

					ubicacionproduBeanSwingJInternalFrame.getjButtonRecargarInformacionUbicacionProdu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ParametroProductoBeanSwingJInternalFrame parametroproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroproductoBeanSwingJInternalFrame=new ParametroProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroproductoBeanSwingJInternalFrame.getParametroProductoLogic().setConnexion(this.productoLogic.getConnexion());

					parametroproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					parametroproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					parametroproductoBeanSwingJInternalFrame.parametroproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					parametroproductoBeanSwingJInternalFrame.parametroproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroproductoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroProducto(parametroproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					parametroproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						parametroproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					parametroproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					parametroproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					parametroproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroProducto(true);
					parametroproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroProducto("n",parametroproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroproductoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroProducto("relacionado");
					} else {
						parametroproductoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroProducto("no_relacionado");
					}

					parametroproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoUnidadBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoUnidadBeanSwingJInternalFrame productounidadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productounidadBeanSwingJInternalFrame=new ProductoUnidadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productounidadBeanSwingJInternalFrame.getProductoUnidadLogic().setConnexion(this.productoLogic.getConnexion());

					productounidadBeanSwingJInternalFrame.setproductosForeignKey(productos);
					productounidadBeanSwingJInternalFrame.setproductoForeignKey(producto);
					productounidadBeanSwingJInternalFrame.productounidadSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					productounidadBeanSwingJInternalFrame.productounidadSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productounidadBeanSwingJInternalFrame.cargarCombosForeignKeyProductoUnidad(productounidadBeanSwingJInternalFrame.isCargarCombosDependencia);
					productounidadBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					productounidadBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						productounidadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productounidadBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					productounidadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productounidadBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productounidadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productounidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoUnidad(true);
					productounidadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoUnidad("n",productounidadBeanSwingJInternalFrame.isGuardarCambiosEnLote, productounidadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productounidadBeanSwingJInternalFrame.setAutoscrolls(true);
					productounidadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productounidadBeanSwingJInternalFrame.actualizarEstadoPanelsProductoUnidad("relacionado");
					} else {
						productounidadBeanSwingJInternalFrame.actualizarEstadoPanelsProductoUnidad("no_relacionado");
					}

					productounidadBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoUnidad().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarIngredienteBeanSwingJInternalFrame(List<Producto> productos,Producto producto,IngredienteBeanSwingJInternalFrame ingredienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ingredienteBeanSwingJInternalFrame=new IngredienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ingredienteBeanSwingJInternalFrame.getIngredienteLogic().setConnexion(this.productoLogic.getConnexion());

					ingredienteBeanSwingJInternalFrame.setproductorelacionsForeignKey(productos);
					ingredienteBeanSwingJInternalFrame.setproductorelacionForeignKey(producto);
					ingredienteBeanSwingJInternalFrame.ingredienteSessionBean.setisBusquedaDesdeForeignKeySesionProductoRelacion(true);
					ingredienteBeanSwingJInternalFrame.ingredienteSessionBean.setlidProductoRelacionActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ingredienteBeanSwingJInternalFrame.cargarCombosForeignKeyIngrediente(ingredienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					ingredienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoRelacion(true);
					ingredienteBeanSwingJInternalFrame.setid_producto_relacionFK_IdProductoRelacion(producto.getId());

					if(!this.conCargarFormDetalle) {
						ingredienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ingredienteBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoRelacionForeignKey(producto,1,false,true,true);
					ingredienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ingredienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					ingredienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					ingredienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaIngrediente(true);
					ingredienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesIngrediente("n",ingredienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, ingredienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ingredienteBeanSwingJInternalFrame.setAutoscrolls(true);
					ingredienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ingredienteBeanSwingJInternalFrame.actualizarEstadoPanelsIngrediente("relacionado");
					} else {
						ingredienteBeanSwingJInternalFrame.actualizarEstadoPanelsIngrediente("no_relacionado");
					}

					ingredienteBeanSwingJInternalFrame.getjButtonRecargarInformacionIngrediente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoCaracBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoCaracBeanSwingJInternalFrame productocaracBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productocaracBeanSwingJInternalFrame=new ProductoCaracBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productocaracBeanSwingJInternalFrame.getProductoCaracLogic().setConnexion(this.productoLogic.getConnexion());

					productocaracBeanSwingJInternalFrame.setproductosForeignKey(productos);
					productocaracBeanSwingJInternalFrame.setproductoForeignKey(producto);
					productocaracBeanSwingJInternalFrame.productocaracSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					productocaracBeanSwingJInternalFrame.productocaracSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productocaracBeanSwingJInternalFrame.cargarCombosForeignKeyProductoCarac(productocaracBeanSwingJInternalFrame.isCargarCombosDependencia);
					productocaracBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					productocaracBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						productocaracBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productocaracBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					productocaracBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productocaracBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productocaracBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productocaracBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoCarac(true);
					productocaracBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoCarac("n",productocaracBeanSwingJInternalFrame.isGuardarCambiosEnLote, productocaracBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productocaracBeanSwingJInternalFrame.setAutoscrolls(true);
					productocaracBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productocaracBeanSwingJInternalFrame.actualizarEstadoPanelsProductoCarac("relacionado");
					} else {
						productocaracBeanSwingJInternalFrame.actualizarEstadoPanelsProductoCarac("no_relacionado");
					}

					productocaracBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoCarac().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarServicioClienteBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//servicioclienteBeanSwingJInternalFrame=new ServicioClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					servicioclienteBeanSwingJInternalFrame.getServicioClienteLogic().setConnexion(this.productoLogic.getConnexion());

					servicioclienteBeanSwingJInternalFrame.setproductosForeignKey(productos);
					servicioclienteBeanSwingJInternalFrame.setproductoForeignKey(producto);
					servicioclienteBeanSwingJInternalFrame.servicioclienteSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					servicioclienteBeanSwingJInternalFrame.servicioclienteSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					servicioclienteBeanSwingJInternalFrame.cargarCombosForeignKeyServicioCliente(servicioclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					servicioclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					servicioclienteBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						servicioclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					servicioclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					servicioclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					servicioclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					servicioclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					servicioclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioCliente(true);
					servicioclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesServicioCliente("n",servicioclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, servicioclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					servicioclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					servicioclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						servicioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioCliente("relacionado");
					} else {
						servicioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioCliente("no_relacionado");
					}

					servicioclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionServicioCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoPromocionBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoPromocionBeanSwingJInternalFrame productopromocionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productopromocionBeanSwingJInternalFrame=new ProductoPromocionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productopromocionBeanSwingJInternalFrame.getProductoPromocionLogic().setConnexion(this.productoLogic.getConnexion());

					productopromocionBeanSwingJInternalFrame.setproductorelacionsForeignKey(productos);
					productopromocionBeanSwingJInternalFrame.setproductorelacionForeignKey(producto);
					productopromocionBeanSwingJInternalFrame.productopromocionSessionBean.setisBusquedaDesdeForeignKeySesionProductoRelacion(true);
					productopromocionBeanSwingJInternalFrame.productopromocionSessionBean.setlidProductoRelacionActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productopromocionBeanSwingJInternalFrame.cargarCombosForeignKeyProductoPromocion(productopromocionBeanSwingJInternalFrame.isCargarCombosDependencia);
					productopromocionBeanSwingJInternalFrame.setVisibilidadBusquedasParaProductoRelacion(true);
					productopromocionBeanSwingJInternalFrame.setid_producto_relacionFK_IdProductoRelacion(producto.getId());

					if(!this.conCargarFormDetalle) {
						productopromocionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productopromocionBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoRelacionForeignKey(producto,1,false,true,true);
					productopromocionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productopromocionBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productopromocionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productopromocionBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoPromocion(true);
					productopromocionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoPromocion("n",productopromocionBeanSwingJInternalFrame.isGuardarCambiosEnLote, productopromocionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productopromocionBeanSwingJInternalFrame.setAutoscrolls(true);
					productopromocionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productopromocionBeanSwingJInternalFrame.actualizarEstadoPanelsProductoPromocion("relacionado");
					} else {
						productopromocionBeanSwingJInternalFrame.actualizarEstadoPanelsProductoPromocion("no_relacionado");
					}

					productopromocionBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoPromocion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoEspeciBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoEspeciBeanSwingJInternalFrame productoespeciBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoespeciBeanSwingJInternalFrame=new ProductoEspeciBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoespeciBeanSwingJInternalFrame.getProductoEspeciLogic().setConnexion(this.productoLogic.getConnexion());

					productoespeciBeanSwingJInternalFrame.setproductosForeignKey(productos);
					productoespeciBeanSwingJInternalFrame.setproductoForeignKey(producto);
					productoespeciBeanSwingJInternalFrame.productoespeciSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					productoespeciBeanSwingJInternalFrame.productoespeciSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoespeciBeanSwingJInternalFrame.cargarCombosForeignKeyProductoEspeci(productoespeciBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoespeciBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					productoespeciBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						productoespeciBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoespeciBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					productoespeciBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoespeciBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productoespeciBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productoespeciBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoEspeci(true);
					productoespeciBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoEspeci("n",productoespeciBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoespeciBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoespeciBeanSwingJInternalFrame.setAutoscrolls(true);
					productoespeciBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoespeciBeanSwingJInternalFrame.actualizarEstadoPanelsProductoEspeci("relacionado");
					} else {
						productoespeciBeanSwingJInternalFrame.actualizarEstadoPanelsProductoEspeci("no_relacionado");
					}

					productoespeciBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoEspeci().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoReemplaBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoreemplaBeanSwingJInternalFrame=new ProductoReemplaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoreemplaBeanSwingJInternalFrame.getProductoReemplaLogic().setConnexion(this.productoLogic.getConnexion());

					productoreemplaBeanSwingJInternalFrame.setproductosForeignKey(productos);
					productoreemplaBeanSwingJInternalFrame.setproductoForeignKey(producto);
					productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoreemplaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoReempla(productoreemplaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoreemplaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					productoreemplaBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						productoreemplaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoreemplaBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					productoreemplaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoreemplaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productoreemplaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productoreemplaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoReempla(true);
					productoreemplaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoReempla("n",productoreemplaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoreemplaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoreemplaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoreemplaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoreemplaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoReempla("relacionado");
					} else {
						productoreemplaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoReempla("no_relacionado");
					}

					productoreemplaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoReempla().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoEstadisticaBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoEstadisticaBeanSwingJInternalFrame productoestadisticaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoestadisticaBeanSwingJInternalFrame=new ProductoEstadisticaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoestadisticaBeanSwingJInternalFrame.getProductoEstadisticaLogic().setConnexion(this.productoLogic.getConnexion());

					productoestadisticaBeanSwingJInternalFrame.setproductosForeignKey(productos);
					productoestadisticaBeanSwingJInternalFrame.setproductoForeignKey(producto);
					productoestadisticaBeanSwingJInternalFrame.productoestadisticaSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					productoestadisticaBeanSwingJInternalFrame.productoestadisticaSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoestadisticaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoEstadistica(productoestadisticaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoestadisticaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					productoestadisticaBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						productoestadisticaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoestadisticaBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					productoestadisticaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoestadisticaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productoestadisticaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productoestadisticaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoEstadistica(true);
					productoestadisticaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoEstadistica("n",productoestadisticaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoestadisticaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoestadisticaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoestadisticaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoestadisticaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoEstadistica("relacionado");
					} else {
						productoestadisticaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoEstadistica("no_relacionado");
					}

					productoestadisticaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoEstadistica().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticaFactuBeanSwingJInternalFrame(List<Producto> productos,Producto producto,PoliticaFactuBeanSwingJInternalFrame politicafactuBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicafactuBeanSwingJInternalFrame=new PoliticaFactuBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicafactuBeanSwingJInternalFrame.getPoliticaFactuLogic().setConnexion(this.productoLogic.getConnexion());

					politicafactuBeanSwingJInternalFrame.setproductosForeignKey(productos);
					politicafactuBeanSwingJInternalFrame.setproductoForeignKey(producto);
					politicafactuBeanSwingJInternalFrame.politicafactuSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					politicafactuBeanSwingJInternalFrame.politicafactuSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicafactuBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticaFactu(politicafactuBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicafactuBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					politicafactuBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						politicafactuBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicafactuBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					politicafactuBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicafactuBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					politicafactuBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					politicafactuBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticaFactu(true);
					politicafactuBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticaFactu("n",politicafactuBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicafactuBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicafactuBeanSwingJInternalFrame.setAutoscrolls(true);
					politicafactuBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicafactuBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticaFactu("relacionado");
					} else {
						politicafactuBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticaFactu("no_relacionado");
					}

					politicafactuBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticaFactu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoCuentaContableBeanSwingJInternalFrame(List<Producto> productos,Producto producto,ProductoCuentaContableBeanSwingJInternalFrame productocuentacontableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productocuentacontableBeanSwingJInternalFrame=new ProductoCuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productocuentacontableBeanSwingJInternalFrame.getProductoCuentaContableLogic().setConnexion(this.productoLogic.getConnexion());

					productocuentacontableBeanSwingJInternalFrame.setproductosForeignKey(productos);
					productocuentacontableBeanSwingJInternalFrame.setproductoForeignKey(producto);
					productocuentacontableBeanSwingJInternalFrame.productocuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					productocuentacontableBeanSwingJInternalFrame.productocuentacontableSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productocuentacontableBeanSwingJInternalFrame.cargarCombosForeignKeyProductoCuentaContable(productocuentacontableBeanSwingJInternalFrame.isCargarCombosDependencia);
					productocuentacontableBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					productocuentacontableBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						productocuentacontableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productocuentacontableBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					productocuentacontableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productocuentacontableBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					productocuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					productocuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoCuentaContable(true);
					productocuentacontableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoCuentaContable("n",productocuentacontableBeanSwingJInternalFrame.isGuardarCambiosEnLote, productocuentacontableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productocuentacontableBeanSwingJInternalFrame.setAutoscrolls(true);
					productocuentacontableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productocuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsProductoCuentaContable("relacionado");
					} else {
						productocuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsProductoCuentaContable("no_relacionado");
					}

					productocuentacontableBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoCuentaContable().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarBodegaProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,BodegaProductoBeanSwingJInternalFrame bodegaproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bodegaproductoBeanSwingJInternalFrame=new BodegaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bodegaproductoBeanSwingJInternalFrame.getBodegaProductoLogic().setConnexion(this.productoLogic.getConnexion());

					bodegaproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					bodegaproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					bodegaproductoBeanSwingJInternalFrame.bodegaproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					bodegaproductoBeanSwingJInternalFrame.bodegaproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bodegaproductoBeanSwingJInternalFrame.cargarCombosForeignKeyBodegaProducto(bodegaproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					bodegaproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					bodegaproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						bodegaproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bodegaproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					bodegaproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bodegaproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					bodegaproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					bodegaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodegaProducto(true);
					bodegaproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBodegaProducto("n",bodegaproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, bodegaproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bodegaproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					bodegaproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bodegaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsBodegaProducto("relacionado");
					} else {
						bodegaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsBodegaProducto("no_relacionado");
					}

					bodegaproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionBodegaProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,PresupuestoProductoBeanSwingJInternalFrame presupuestoproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoproductoBeanSwingJInternalFrame=new PresupuestoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoproductoBeanSwingJInternalFrame.getPresupuestoProductoLogic().setConnexion(this.productoLogic.getConnexion());

					presupuestoproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					presupuestoproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					presupuestoproductoBeanSwingJInternalFrame.presupuestoproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					presupuestoproductoBeanSwingJInternalFrame.presupuestoproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoproductoBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoProducto(presupuestoproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					presupuestoproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					presupuestoproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					presupuestoproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					presupuestoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoProducto(true);
					presupuestoproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoProducto("n",presupuestoproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoProducto("relacionado");
					} else {
						presupuestoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoProducto("no_relacionado");
					}

					presupuestoproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSaldoMesProductoBeanSwingJInternalFrame(List<Producto> productos,Producto producto,SaldoMesProductoBeanSwingJInternalFrame saldomesproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//saldomesproductoBeanSwingJInternalFrame=new SaldoMesProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					saldomesproductoBeanSwingJInternalFrame.getSaldoMesProductoLogic().setConnexion(this.productoLogic.getConnexion());

					saldomesproductoBeanSwingJInternalFrame.setproductosForeignKey(productos);
					saldomesproductoBeanSwingJInternalFrame.setproductoForeignKey(producto);
					saldomesproductoBeanSwingJInternalFrame.saldomesproductoSessionBean.setisBusquedaDesdeForeignKeySesionProducto(true);
					saldomesproductoBeanSwingJInternalFrame.saldomesproductoSessionBean.setlidProductoActual(producto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					saldomesproductoBeanSwingJInternalFrame.cargarCombosForeignKeySaldoMesProducto(saldomesproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					saldomesproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaProducto(true);
					saldomesproductoBeanSwingJInternalFrame.setid_productoFK_IdProducto(producto.getId());

					if(!this.conCargarFormDetalle) {
						saldomesproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					saldomesproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameProductoForeignKey(producto,1,false,true,true);
					saldomesproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					saldomesproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdProducto");
					saldomesproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProducto");
					saldomesproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSaldoMesProducto(true);
					saldomesproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSaldoMesProducto("n",saldomesproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, saldomesproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					saldomesproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					saldomesproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						saldomesproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSaldoMesProducto("relacionado");
					} else {
						saldomesproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSaldoMesProducto("no_relacionado");
					}

					saldomesproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionSaldoMesProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
