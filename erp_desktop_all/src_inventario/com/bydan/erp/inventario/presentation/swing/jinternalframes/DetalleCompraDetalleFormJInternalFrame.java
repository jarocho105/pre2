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
import com.bydan.erp.inventario.util.DetalleCompraConstantesFunciones;

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
public class DetalleCompraDetalleFormJInternalFrame extends DetalleCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleDetalleCompra;
	
	protected JMenuBar jmenuBarDetalleDetalleCompra;
	
	protected JMenu jmenuDetalleDetalleCompra;
	protected JMenu jmenuDetalleArchivoDetalleCompra;
	protected JMenu jmenuDetalleAccionesDetalleCompra;
	protected JMenu jmenuDetalleDatosDetalleCompra;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCompra;	
	protected GridBagConstraints gridBagConstraintsDetalleCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

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

	protected EstadoDetalleInventarioBeanSwingJInternalFrame estadodetalleinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleinventario="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";
	
	public DetalleCompraSessionBean detallecompraSessionBean;
	
	
	
	
	public CompraSessionBean compraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;	
	
	public DetalleCompraLogic detallecompraLogic;
	
	public JScrollPane jScrollPanelDatosDetalleCompra;
	public JScrollPane jScrollPanelDatosEdicionDetalleCompra;
	public JScrollPane jScrollPanelDatosGeneralDetalleCompra;
	
	protected JPanel jPanelCamposDetalleCompra;    
	protected JPanel jPanelCamposOcultosDetalleCompra;    	
	protected JPanel jPanelAccionesDetalleCompra;
	protected JPanel jPanelAccionesFormularioDetalleCompra;
    
	
	
	protected Integer iXPanelCamposDetalleCompra=0;
	protected Integer iYPanelCamposDetalleCompra=0;
	
	protected Integer iXPanelCamposOcultosDetalleCompra=0;
	protected Integer iYPanelCamposOcultosDetalleCompra=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleCompra;
	protected Integer iXPanelCamposIniciogeneralDetalleCompra=0;
	protected Integer iYPanelCamposIniciogeneralDetalleCompra=0;

	protected JPanel jPanelCamposIniciovaloresDetalleCompra;
	protected Integer iXPanelCamposIniciovaloresDetalleCompra=0;
	protected Integer iYPanelCamposIniciovaloresDetalleCompra=0;

	protected JPanel jPanelCamposIniciogeneral2DetalleCompra;
	protected Integer iXPanelCamposIniciogeneral2DetalleCompra=0;
	protected Integer iYPanelCamposIniciogeneral2DetalleCompra=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleCompra;
	public JButton jButtonModificarDetalleCompra;
	public JButton jButtonActualizarDetalleCompra;
    public JButton jButtonEliminarDetalleCompra;
	public JButton jButtonCancelarDetalleCompra;
    public JButton jButtonGuardarCambiosDetalleCompra;
	public JButton jButtonGuardarCambiosTablaDetalleCompra;
	protected JButton jButtonCerrarDetalleCompra;
	
	/*
	protected JButton jButtonProcesarInformacionDetalleCompra;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleCompra;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleCompra;
	protected JButton jButtonModificarToolBarDetalleCompra;
	protected JButton jButtonActualizarToolBarDetalleCompra;
    protected JButton jButtonEliminarToolBarDetalleCompra;
	protected JButton jButtonCancelarToolBarDetalleCompra;
    protected JButton jButtonGuardarCambiosToolBarDetalleCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCompra;
	protected JButton jButtonCerrarToolBarDetalleCompra;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleCompra;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleCompra;
	protected JMenuItem jMenuItemModificarDetalleCompra;
	protected JMenuItem jMenuItemActualizarDetalleCompra;
    protected JMenuItem jMenuItemEliminarDetalleCompra;
	protected JMenuItem jMenuItemCancelarDetalleCompra;
    protected JMenuItem jMenuItemGuardarCambiosDetalleCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCompra;
	protected JMenuItem jMenuItemCerrarDetalleCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCompra;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCompra;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCompra;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleCompra;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleCompra;
	public JLabel jLabelIdDetalleCompra;
	public JLabel jLabelidDetalleCompra;
	public JButton jButtonidDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleCompra;
	public JLabel jLabeldescripcionDetalleCompra;
	public JTextArea jTextAreadescripcionDetalleCompra;
	public JScrollPane jscrollPanedescripcionDetalleCompra;
	public JButton jButtondescripcionDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleCompra;
	public JLabel jLabelcantidadDetalleCompra;
	public JTextField jTextFieldcantidadDetalleCompra;
	public JButton jButtoncantidadDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleCompra;
	public JLabel jLabeldescuentoDetalleCompra;
	public JTextField jTextFielddescuentoDetalleCompra;
	public JButton jButtondescuentoDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetalleCompra;
	public JLabel jLabelcosto_unitarioDetalleCompra;
	public JTextField jTextFieldcosto_unitarioDetalleCompra;
	public JButton jButtoncosto_unitarioDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleCompra;
	public JLabel jLabelivaDetalleCompra;
	public JTextField jTextFieldivaDetalleCompra;
	public JButton jButtonivaDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetalleCompra;
	public JLabel jLabeliva_valorDetalleCompra;
	public JTextField jTextFieldiva_valorDetalleCompra;
	public JButton jButtoniva_valorDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetalleCompra;
	public JLabel jLabelcosto_totalDetalleCompra;
	public JTextField jTextFieldcosto_totalDetalleCompra;
	public JButton jButtoncosto_totalDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleDetalleCompra;
	public JLabel jLabeldisponibleDetalleCompra;
	public JTextField jTextFielddisponibleDetalleCompra;
	public JButton jButtondisponibleDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_ivaDetalleCompra;
	public JLabel jLabelcosto_ivaDetalleCompra;
	public JCheckBox jCheckBoxcosto_ivaDetalleCompra;
	public JButton jButtoncosto_ivaDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleCompra;
	public JLabel jLabeliceDetalleCompra;
	public JTextField jTextFieldiceDetalleCompra;
	public JButton jButtoniceDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetalleCompra;
	public JLabel jLabelice_valorDetalleCompra;
	public JTextField jTextFieldice_valorDetalleCompra;
	public JButton jButtonice_valorDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescuento1DetalleCompra;
	public JLabel jLabeldescuento1DetalleCompra;
	public JTextField jTextFielddescuento1DetalleCompra;
	public JButton jButtondescuento1DetalleCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetalleCompra;
	public JLabel jLabeldescuento2DetalleCompra;
	public JTextField jTextFielddescuento2DetalleCompra;
	public JButton jButtondescuento2DetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelserieDetalleCompra;
	public JLabel jLabelserieDetalleCompra;
	public JTextField jTextFieldserieDetalleCompra;
	public JButton jButtonserieDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelloteDetalleCompra;
	public JLabel jLabelloteDetalleCompra;
	public JTextField jTextFieldloteDetalleCompra;
	public JButton jButtonloteDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_elaboracion_loteDetalleCompra;
	public JLabel jLabelfecha_elaboracion_loteDetalleCompra;
	//public JFormattedTextField jDateChooserfecha_elaboracion_loteDetalleCompra;

	public JDateChooser jDateChooserfecha_elaboracion_loteDetalleCompra;
	public JButton jButtonfecha_elaboracion_loteDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidad_loteDetalleCompra;
	public JLabel jLabelfecha_caducidad_loteDetalleCompra;
	//public JFormattedTextField jDateChooserfecha_caducidad_loteDetalleCompra;

	public JDateChooser jDateChooserfecha_caducidad_loteDetalleCompra;
	public JButton jButtonfecha_caducidad_loteDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleCompra;
	public JLabel jLabelnumero_comprobanteDetalleCompra;
	public JTextField jTextFieldnumero_comprobanteDetalleCompra;
	public JButton jButtonnumero_comprobanteDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanellote_clienteDetalleCompra;
	public JLabel jLabellote_clienteDetalleCompra;
	public JTextField jTextFieldlote_clienteDetalleCompra;
	public JButton jButtonlote_clienteDetalleCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_compraDetalleCompra;
	public JLabel jLabelid_compraDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraDetalleCompra;
	public JButton jButtonid_compraDetalleCompra= new JButtonMe();
	public JButton jButtonid_compraDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_compraDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleCompra;
	public JLabel jLabelid_empresaDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleCompra;
	public JButton jButtonid_empresaDetalleCompra= new JButtonMe();
	public JButton jButtonid_empresaDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleCompra;
	public JLabel jLabelid_sucursalDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleCompra;
	public JButton jButtonid_sucursalDetalleCompra= new JButtonMe();
	public JButton jButtonid_sucursalDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleCompra;
	public JLabel jLabelid_ejercicioDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleCompra;
	public JButton jButtonid_ejercicioDetalleCompra= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleCompra;
	public JLabel jLabelid_periodoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleCompra;
	public JButton jButtonid_periodoDetalleCompra= new JButtonMe();
	public JButton jButtonid_periodoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleCompra;
	public JLabel jLabelid_anioDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleCompra;
	public JButton jButtonid_anioDetalleCompra= new JButtonMe();
	public JButton jButtonid_anioDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleCompra;
	public JLabel jLabelid_mesDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleCompra;
	public JButton jButtonid_mesDetalleCompra= new JButtonMe();
	public JButton jButtonid_mesDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_inventarioDetalleCompra;
	public JLabel jLabelid_estado_detalle_inventarioDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_inventarioDetalleCompra;
	public JButton jButtonid_estado_detalle_inventarioDetalleCompra= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleCompra;
	public JLabel jLabelid_bodegaDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleCompra;
	public JButton jButtonid_bodegaDetalleCompra= new JButtonMe();
	public JButton jButtonid_bodegaDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleCompra;
	public JLabel jLabelid_productoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleCompra;
	public JButton jButtonid_productoDetalleCompra= new JButtonMe();
	public JButton jButtonid_productoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleCompra;
	public JLabel jLabelid_unidadDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleCompra;
	public JButton jButtonid_unidadDetalleCompra= new JButtonMe();
	public JButton jButtonid_unidadDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_novedad_productoDetalleCompra;
	public JLabel jLabelid_novedad_productoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoDetalleCompra;
	public JButton jButtonid_novedad_productoDetalleCompra= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleCompra;
	public JLabel jLabelid_centro_costoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleCompra;
	public JButton jButtonid_centro_costoDetalleCompra= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleCompraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleCompraArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoDetalleCompra;
	public JLabel jLabelid_cuenta_contable_costoDetalleCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoDetalleCompra;
	public JButton jButtonid_cuenta_contable_costoDetalleCompra= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleCompraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleCompraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleCompra;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleCompra=new JPanel();
				this.jPanelAccionesFormularioDetalleCompra=new JPanel();
				this.jmenuBarDetalleDetalleCompra=new JMenuBar();
				this.jTtoolBarDetalleDetalleCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	public JButton getjButtonActualizarToolBarDetalleCompra() {
		return this.jButtonActualizarToolBarDetalleCompra;
	}
	
	public JButton getjButtonEliminarToolBarDetalleCompra() {
		return this.jButtonEliminarToolBarDetalleCompra;
	}
	
	public JButton getjButtonCancelarToolBarDetalleCompra() {
		return this.jButtonCancelarToolBarDetalleCompra;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleCompra() {
		return this.jButtonProcesarInformacionDetalleCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCompra)	{
		this.jButtonProcesarInformacionDetalleCompra = jButtonProcesarInformacionDetalleCompra;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCompra() {
		return this.jComboBoxTiposAccionesDetalleCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCompra(
			JComboBox jComboBoxTiposRelacionesDetalleCompra) {
		this.jComboBoxTiposRelacionesDetalleCompra = jComboBoxTiposRelacionesDetalleCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCompra(
			JComboBox jComboBoxTiposAccionesDetalleCompra) {
		this.jComboBoxTiposAccionesDetalleCompra = jComboBoxTiposAccionesDetalleCompra;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleCompra() {
		return this.jComboBoxTiposAccionesFormularioDetalleCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleCompra(
			JComboBox jComboBoxTiposAccionesFormularioDetalleCompra) {
		this.jComboBoxTiposAccionesFormularioDetalleCompra = jComboBoxTiposAccionesFormularioDetalleCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallecompraSessionBean=new DetalleCompraSessionBean();
		
		this.detallecompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleCompra=new JButtonMe();
				this.jButtonModificarToolBarDetalleCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleCompra,this.jTtoolBarDetalleDetalleCompra,
							"actualizar","actualizar","Actualizar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleCompra,this.jTtoolBarDetalleDetalleCompra,
							"eliminar","eliminar","Eliminar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleCompra,this.jTtoolBarDetalleDetalleCompra,
							"cancelar","cancelar","Cancelar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleCompra,this.jTtoolBarDetalleDetalleCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleCompra.add(this.jMenuItemDetalleCerrarDetalleCompra);
		
		this.jmenuDetalleAccionesDetalleCompra.add(this.jMenuItemActualizarDetalleCompra);
		this.jmenuDetalleAccionesDetalleCompra.add(this.jMenuItemEliminarDetalleCompra);
		this.jmenuDetalleAccionesDetalleCompra.add(this.jMenuItemCancelarDetalleCompra);		
		
		//this.jmenuDetalleDatosDetalleCompra.add(this.jMenuItemDetalleAbrirOrderByDetalleCompra);				
		this.jmenuDetalleDatosDetalleCompra.add(this.jMenuItemDetalleMostarOcultarDetalleCompra);				
				
		//this.jmenuDetalleAccionesDetalleCompra.add(this.jMenuItemGuardarCambiosDetalleCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleCompra.add(this.jmenuDetalleArchivoDetalleCompra);		
		this.jmenuBarDetalleDetalleCompra.add(this.jmenuDetalleAccionesDetalleCompra);		
		this.jmenuBarDetalleDetalleCompra.add(this.jmenuDetalleDatosDetalleCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleCompra);				
	}
	*/
	
	public void inicializarElementosCamposDetalleCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleCompra = new JLabelMe();
		jLabelIdDetalleCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleCompra= new GridBagLayout();

		this.jPanelidDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);

		jLabelidDetalleCompra = new JLabel();
		jLabelidDetalleCompra.setText("Id");

		jLabelidDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleCompra = new JLabelMe();
		this.jLabeldescripcionDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneldescripcionDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextAreadescripcionDetalleCompra= new JTextAreaMe();
		jTextAreadescripcionDetalleCompra.setEnabled(false);
		jTextAreadescripcionDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCompra.setLineWrap(true);
		jTextAreadescripcionDetalleCompra.setWrapStyleWord(true);
		jTextAreadescripcionDetalleCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleCompra = new JScrollPane(jTextAreadescripcionDetalleCompra);
		jscrollPanedescripcionDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleCompraBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleCompraBusqueda.setText("U");
		this.jButtondescripcionDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleCompra = new JLabelMe();
		this.jLabelcantidadDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleCompra.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelcantidadDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldcantidadDetalleCompra= new JTextFieldMe();
		jTextFieldcantidadDetalleCompra.setEnabled(false);
		jTextFieldcantidadDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleCompra.setText("0");

		this.jButtoncantidadDetalleCompraBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleCompraBusqueda.setText("U");
		this.jButtoncantidadDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleCompra = new JLabelMe();
		this.jLabeldescuentoDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleCompra.setToolTipText("Descuento");
		this.jLabeldescuentoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneldescuentoDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFielddescuentoDetalleCompra= new JTextFieldMe();
		jTextFielddescuentoDetalleCompra.setEnabled(false);
		jTextFielddescuentoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleCompra.setText("0.0");

		this.jButtondescuentoDetalleCompraBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleCompraBusqueda.setText("U");
		this.jButtondescuentoDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetalleCompra = new JLabelMe();
		this.jLabelcosto_unitarioDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetalleCompra.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelcosto_unitarioDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldcosto_unitarioDetalleCompra= new JTextFieldMe();
		jTextFieldcosto_unitarioDetalleCompra.setEnabled(false);
		jTextFieldcosto_unitarioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetalleCompra.setText("0.0");

		this.jButtoncosto_unitarioDetalleCompraBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetalleCompraBusqueda.setText("U");
		this.jButtoncosto_unitarioDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleCompra = new JLabelMe();
		this.jLabelivaDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleCompra.setToolTipText("Iva");
		this.jLabelivaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelivaDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldivaDetalleCompra= new JTextFieldMe();
		jTextFieldivaDetalleCompra.setEnabled(false);
		jTextFieldivaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleCompra.setText("0.0");

		this.jButtonivaDetalleCompraBusqueda= new JButtonMe();
		this.jButtonivaDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleCompraBusqueda.setText("U");
		this.jButtonivaDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetalleCompra = new JLabelMe();
		this.jLabeliva_valorDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetalleCompra.setToolTipText("Iva Valor");
		this.jLabeliva_valorDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneliva_valorDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldiva_valorDetalleCompra= new JTextFieldMe();
		jTextFieldiva_valorDetalleCompra.setEnabled(false);
		jTextFieldiva_valorDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetalleCompra.setText("0.0");

		this.jButtoniva_valorDetalleCompraBusqueda= new JButtonMe();
		this.jButtoniva_valorDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetalleCompraBusqueda.setText("U");
		this.jButtoniva_valorDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetalleCompra = new JLabelMe();
		this.jLabelcosto_totalDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetalleCompra.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelcosto_totalDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldcosto_totalDetalleCompra= new JTextFieldMe();
		jTextFieldcosto_totalDetalleCompra.setEnabled(false);
		jTextFieldcosto_totalDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetalleCompra.setText("0.0");

		this.jButtoncosto_totalDetalleCompraBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetalleCompraBusqueda.setText("U");
		this.jButtoncosto_totalDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleDetalleCompra = new JLabelMe();
		this.jLabeldisponibleDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_DISPONIBLE+" :");
		this.jLabeldisponibleDetalleCompra.setToolTipText("Disponible");
		this.jLabeldisponibleDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneldisponibleDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFielddisponibleDetalleCompra= new JTextFieldMe();
		jTextFielddisponibleDetalleCompra.setEnabled(false);
		jTextFielddisponibleDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleDetalleCompra.setText("0");

		this.jButtondisponibleDetalleCompraBusqueda= new JButtonMe();
		this.jButtondisponibleDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleDetalleCompraBusqueda.setText("U");
		this.jButtondisponibleDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_ivaDetalleCompra = new JLabelMe();
		this.jLabelcosto_ivaDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_COSTOIVA+" : *");
		this.jLabelcosto_ivaDetalleCompra.setToolTipText("Costo Iva");
		this.jLabelcosto_ivaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ivaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ivaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_ivaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_ivaDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_ivaDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_COSTOIVA);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelcosto_ivaDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jCheckBoxcosto_ivaDetalleCompra= new JCheckBoxMe();
		jCheckBoxcosto_ivaDetalleCompra.setEnabled(false);

		jCheckBoxcosto_ivaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcosto_ivaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcosto_ivaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcosto_ivaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncosto_ivaDetalleCompraBusqueda= new JButtonMe();
		this.jButtoncosto_ivaDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ivaDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ivaDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_ivaDetalleCompraBusqueda.setText("U");
		this.jButtoncosto_ivaDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_ivaDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_ivaDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcosto_ivaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcosto_ivaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_ivaDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_ivaDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleCompra = new JLabelMe();
		this.jLabeliceDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleCompra.setToolTipText("Ice");
		this.jLabeliceDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneliceDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldiceDetalleCompra= new JTextFieldMe();
		jTextFieldiceDetalleCompra.setEnabled(false);
		jTextFieldiceDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleCompra.setText("0.0");

		this.jButtoniceDetalleCompraBusqueda= new JButtonMe();
		this.jButtoniceDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleCompraBusqueda.setText("U");
		this.jButtoniceDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetalleCompra = new JLabelMe();
		this.jLabelice_valorDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetalleCompra.setToolTipText("Ice Valor");
		this.jLabelice_valorDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelice_valorDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldice_valorDetalleCompra= new JTextFieldMe();
		jTextFieldice_valorDetalleCompra.setEnabled(false);
		jTextFieldice_valorDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetalleCompra.setText("0.0");

		this.jButtonice_valorDetalleCompraBusqueda= new JButtonMe();
		this.jButtonice_valorDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetalleCompraBusqueda.setText("U");
		this.jButtonice_valorDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescuento1DetalleCompra = new JLabelMe();
		this.jLabeldescuento1DetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_DESCUENTO1+" : *");
		this.jLabeldescuento1DetalleCompra.setToolTipText("Descuento 1");
		this.jLabeldescuento1DetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1DetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1DetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento1DetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento1DetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento1DetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_DESCUENTO1);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneldescuento1DetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFielddescuento1DetalleCompra= new JTextFieldMe();
		jTextFielddescuento1DetalleCompra.setEnabled(false);
		jTextFielddescuento1DetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1DetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1DetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento1DetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento1DetalleCompra.setText("0.0");

		this.jButtondescuento1DetalleCompraBusqueda= new JButtonMe();
		this.jButtondescuento1DetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1DetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1DetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento1DetalleCompraBusqueda.setText("U");
		this.jButtondescuento1DetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento1DetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento1DetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento1DetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento1DetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento1DetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento1DetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetalleCompra = new JLabelMe();
		this.jLabeldescuento2DetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetalleCompra.setToolTipText("Descuento 2");
		this.jLabeldescuento2DetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPaneldescuento2DetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFielddescuento2DetalleCompra= new JTextFieldMe();
		jTextFielddescuento2DetalleCompra.setEnabled(false);
		jTextFielddescuento2DetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetalleCompra.setText("0.0");

		this.jButtondescuento2DetalleCompraBusqueda= new JButtonMe();
		this.jButtondescuento2DetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetalleCompraBusqueda.setText("U");
		this.jButtondescuento2DetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelserieDetalleCompra = new JLabelMe();
		this.jLabelserieDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieDetalleCompra.setToolTipText("Serie");
		this.jLabelserieDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelserieDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldserieDetalleCompra= new JTextFieldMe();

		jTextFieldserieDetalleCompra.setEnabled(false);
		jTextFieldserieDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetalleCompraBusqueda= new JButtonMe();
		this.jButtonserieDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetalleCompraBusqueda.setText("U");
		this.jButtonserieDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelloteDetalleCompra = new JLabelMe();
		this.jLabelloteDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_LOTE+" :");
		this.jLabelloteDetalleCompra.setToolTipText("Lote");
		this.jLabelloteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelloteDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldloteDetalleCompra= new JTextFieldMe();

		jTextFieldloteDetalleCompra.setEnabled(false);
		jTextFieldloteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetalleCompraBusqueda= new JButtonMe();
		this.jButtonloteDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetalleCompraBusqueda.setText("U");
		this.jButtonloteDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_elaboracion_loteDetalleCompra = new JLabelMe();
		this.jLabelfecha_elaboracion_loteDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_FECHAELABORACIONLOTE+" : *");
		this.jLabelfecha_elaboracion_loteDetalleCompra.setToolTipText("F Elaboracion Lote");
		this.jLabelfecha_elaboracion_loteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_elaboracion_loteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_elaboracion_loteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_elaboracion_loteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_elaboracion_loteDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_elaboracion_loteDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_FECHAELABORACIONLOTE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelfecha_elaboracion_loteDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		//jFormattedTextFieldfecha_elaboracion_loteDetalleCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_elaboracion_loteDetalleCompra= new JDateChooser();
		jDateChooserfecha_elaboracion_loteDetalleCompra.setEnabled(false);
		jDateChooserfecha_elaboracion_loteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_elaboracion_loteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_elaboracion_loteDetalleCompra.setDate(new Date());
		jDateChooserfecha_elaboracion_loteDetalleCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_elaboracion_loteDetalleCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda= new JButtonMe();
		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setText("U");
		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_elaboracion_loteDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_elaboracion_loteDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_elaboracion_loteDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_elaboracion_loteDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidad_loteDetalleCompra = new JLabelMe();
		this.jLabelfecha_caducidad_loteDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_FECHACADUCIDADLOTE+" : *");
		this.jLabelfecha_caducidad_loteDetalleCompra.setToolTipText("F Caducidad Lote");
		this.jLabelfecha_caducidad_loteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidad_loteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidad_loteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidad_loteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidad_loteDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidad_loteDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_FECHACADUCIDADLOTE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelfecha_caducidad_loteDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		//jFormattedTextFieldfecha_caducidad_loteDetalleCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidad_loteDetalleCompra= new JDateChooser();
		jDateChooserfecha_caducidad_loteDetalleCompra.setEnabled(false);
		jDateChooserfecha_caducidad_loteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidad_loteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidad_loteDetalleCompra.setDate(new Date());
		jDateChooserfecha_caducidad_loteDetalleCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidad_loteDetalleCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda= new JButtonMe();
		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setText("U");
		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidad_loteDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidad_loteDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidad_loteDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidad_loteDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidad_loteDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleCompra = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteDetalleCompra.setToolTipText("Nro Comprobante");
		this.jLabelnumero_comprobanteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldnumero_comprobanteDetalleCompra= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleCompra.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleCompraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleCompraBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleCompraBusqueda.setVisible(false);		}


					
		this.jLabellote_clienteDetalleCompra = new JLabelMe();
		this.jLabellote_clienteDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_LOTECLIENTE+" :");
		this.jLabellote_clienteDetalleCompra.setToolTipText("Lote Cliente");
		this.jLabellote_clienteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellote_clienteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellote_clienteDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellote_clienteDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_LOTECLIENTE);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanellote_clienteDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jTextFieldlote_clienteDetalleCompra= new JTextFieldMe();

		jTextFieldlote_clienteDetalleCompra.setEnabled(false);
		jTextFieldlote_clienteDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlote_clienteDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlote_clienteDetalleCompraBusqueda= new JButtonMe();
		this.jButtonlote_clienteDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlote_clienteDetalleCompraBusqueda.setText("U");
		this.jButtonlote_clienteDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlote_clienteDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlote_clienteDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlote_clienteDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlote_clienteDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lote_clienteDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlote_clienteDetalleCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_compraDetalleCompra = new JLabelMe();
		this.jLabelid_compraDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDCOMPRA+" : *");
		this.jLabelid_compraDetalleCompra.setToolTipText("Compra");
		this.jLabelid_compraDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_compraDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_compraDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_compraDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDCOMPRA);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_compraDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_compraDetalleCompra= new JComboBoxMe();
		jComboBoxid_compraDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_compraDetalleCompra= new JButtonMe();
		this.jButtonid_compraDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraDetalleCompra.setText("Buscar");
		this.jButtonid_compraDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_compraDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_compraDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraDetalleCompra"));

		this.jButtonid_compraDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_compraDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraDetalleCompraBusqueda.setText("U");
		this.jButtonid_compraDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_compraDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_compraDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_compraDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_compraDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_compraDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraDetalleCompraUpdate.setText("U");
		this.jButtonid_compraDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_compraDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_compraDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraDetalleCompraUpdate"));



					
		this.jLabelid_empresaDetalleCompra = new JLabelMe();
		this.jLabelid_empresaDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleCompra.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_empresaDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_empresaDetalleCompra= new JComboBoxMe();
		jComboBoxid_empresaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleCompra.setEnabled(false);

		this.jButtonid_empresaDetalleCompra= new JButtonMe();
		this.jButtonid_empresaDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCompra.setText("Buscar");
		this.jButtonid_empresaDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCompra"));

		this.jButtonid_empresaDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleCompraBusqueda.setText("U");
		this.jButtonid_empresaDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleCompraUpdate.setText("U");
		this.jButtonid_empresaDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCompraUpdate"));



					
		this.jLabelid_sucursalDetalleCompra = new JLabelMe();
		this.jLabelid_sucursalDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_sucursalDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_sucursalDetalleCompra= new JComboBoxMe();
		jComboBoxid_sucursalDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleCompra.setEnabled(false);

		this.jButtonid_sucursalDetalleCompra= new JButtonMe();
		this.jButtonid_sucursalDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCompra.setText("Buscar");
		this.jButtonid_sucursalDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCompra"));

		this.jButtonid_sucursalDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleCompraBusqueda.setText("U");
		this.jButtonid_sucursalDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleCompraUpdate.setText("U");
		this.jButtonid_sucursalDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCompraUpdate"));



					
		this.jLabelid_ejercicioDetalleCompra = new JLabelMe();
		this.jLabelid_ejercicioDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_ejercicioDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_ejercicioDetalleCompra= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleCompra.setEnabled(false);

		this.jButtonid_ejercicioDetalleCompra= new JButtonMe();
		this.jButtonid_ejercicioDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleCompra.setText("Buscar");
		this.jButtonid_ejercicioDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleCompra"));

		this.jButtonid_ejercicioDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleCompraBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleCompraUpdate.setText("U");
		this.jButtonid_ejercicioDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleCompraUpdate"));



					
		this.jLabelid_periodoDetalleCompra = new JLabelMe();
		this.jLabelid_periodoDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleCompra.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_periodoDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_periodoDetalleCompra= new JComboBoxMe();
		jComboBoxid_periodoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleCompra.setEnabled(false);

		this.jButtonid_periodoDetalleCompra= new JButtonMe();
		this.jButtonid_periodoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleCompra.setText("Buscar");
		this.jButtonid_periodoDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleCompra"));

		this.jButtonid_periodoDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleCompraBusqueda.setText("U");
		this.jButtonid_periodoDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleCompraUpdate.setText("U");
		this.jButtonid_periodoDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleCompraUpdate"));



					
		this.jLabelid_anioDetalleCompra = new JLabelMe();
		this.jLabelid_anioDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleCompra.setToolTipText("Anio");
		this.jLabelid_anioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_anioDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_anioDetalleCompra= new JComboBoxMe();
		jComboBoxid_anioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleCompra.setEnabled(false);

		this.jButtonid_anioDetalleCompra= new JButtonMe();
		this.jButtonid_anioDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleCompra.setText("Buscar");
		this.jButtonid_anioDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleCompra"));

		this.jButtonid_anioDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleCompraBusqueda.setText("U");
		this.jButtonid_anioDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_anioDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleCompraUpdate.setText("U");
		this.jButtonid_anioDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleCompraUpdate"));



					
		this.jLabelid_mesDetalleCompra = new JLabelMe();
		this.jLabelid_mesDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleCompra.setToolTipText("Mes");
		this.jLabelid_mesDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_mesDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_mesDetalleCompra= new JComboBoxMe();
		jComboBoxid_mesDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleCompra.setEnabled(false);

		this.jButtonid_mesDetalleCompra= new JButtonMe();
		this.jButtonid_mesDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleCompra.setText("Buscar");
		this.jButtonid_mesDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleCompra"));

		this.jButtonid_mesDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleCompraBusqueda.setText("U");
		this.jButtonid_mesDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_mesDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleCompraUpdate.setText("U");
		this.jButtonid_mesDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleCompraUpdate"));



					
		this.jLabelid_estado_detalle_inventarioDetalleCompra = new JLabelMe();
		this.jLabelid_estado_detalle_inventarioDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDESTADODETALLEINVENTARIO+" : *");
		this.jLabelid_estado_detalle_inventarioDetalleCompra.setToolTipText("Estado");
		this.jLabelid_estado_detalle_inventarioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_inventarioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_inventarioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_inventarioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_inventarioDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_inventarioDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDESTADODETALLEINVENTARIO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_estado_detalle_inventarioDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_estado_detalle_inventarioDetalleCompra= new JComboBoxMe();
		jComboBoxid_estado_detalle_inventarioDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_inventarioDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_detalle_inventarioDetalleCompra.setEnabled(false);

		this.jButtonid_estado_detalle_inventarioDetalleCompra= new JButtonMe();
		this.jButtonid_estado_detalle_inventarioDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_inventarioDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_inventarioDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_inventarioDetalleCompra.setText("Buscar");
		this.jButtonid_estado_detalle_inventarioDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_inventarioDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_inventarioDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_inventarioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_inventarioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_inventarioDetalleCompra"));

		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setText("U");
		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_inventarioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_inventarioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_inventarioDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_inventarioDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate.setText("U");
		this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_inventarioDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_inventarioDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_inventarioDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_inventarioDetalleCompraUpdate"));



					
		this.jLabelid_bodegaDetalleCompra = new JLabelMe();
		this.jLabelid_bodegaDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleCompra.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_bodegaDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_bodegaDetalleCompra= new JComboBoxMe();
		jComboBoxid_bodegaDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleCompra= new JButtonMe();
		this.jButtonid_bodegaDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleCompra.setText("Buscar");
		this.jButtonid_bodegaDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleCompra"));

		this.jButtonid_bodegaDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleCompraBusqueda.setText("U");
		this.jButtonid_bodegaDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleCompraUpdate.setText("U");
		this.jButtonid_bodegaDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleCompraUpdate"));



					
		this.jLabelid_productoDetalleCompra = new JLabelMe();
		this.jLabelid_productoDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleCompra.setToolTipText("Producto");
		this.jLabelid_productoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_productoDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_productoDetalleCompra= new JComboBoxMe();
		jComboBoxid_productoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleCompra= new JButtonMe();
		this.jButtonid_productoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleCompra.setText("Buscar");
		this.jButtonid_productoDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleCompra"));

		this.jButtonid_productoDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleCompraBusqueda.setText("U");
		this.jButtonid_productoDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_productoDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleCompraUpdate.setText("U");
		this.jButtonid_productoDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleCompraUpdate"));



					
		this.jLabelid_unidadDetalleCompra = new JLabelMe();
		this.jLabelid_unidadDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleCompra.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_unidadDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_unidadDetalleCompra= new JComboBoxMe();
		jComboBoxid_unidadDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleCompra= new JButtonMe();
		this.jButtonid_unidadDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleCompra.setText("Buscar");
		this.jButtonid_unidadDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleCompra"));

		this.jButtonid_unidadDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleCompraBusqueda.setText("U");
		this.jButtonid_unidadDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleCompraUpdate.setText("U");
		this.jButtonid_unidadDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleCompraUpdate"));



					
		this.jLabelid_novedad_productoDetalleCompra = new JLabelMe();
		this.jLabelid_novedad_productoDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDNOVEDADPRODUCTO+" :");
		this.jLabelid_novedad_productoDetalleCompra.setToolTipText("Novedad");
		this.jLabelid_novedad_productoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_novedad_productoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_novedad_productoDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_novedad_productoDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_novedad_productoDetalleCompra= new JComboBoxMe();
		jComboBoxid_novedad_productoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_novedad_productoDetalleCompra= new JButtonMe();
		this.jButtonid_novedad_productoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleCompra.setText("Buscar");
		this.jButtonid_novedad_productoDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_novedad_productoDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_novedad_productoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleCompra"));

		this.jButtonid_novedad_productoDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_novedad_productoDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleCompraBusqueda.setText("U");
		this.jButtonid_novedad_productoDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_novedad_productoDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_novedad_productoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_novedad_productoDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_novedad_productoDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_novedad_productoDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleCompraUpdate.setText("U");
		this.jButtonid_novedad_productoDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_novedad_productoDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_novedad_productoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleCompraUpdate"));



					
		this.jLabelid_centro_costoDetalleCompra = new JLabelMe();
		this.jLabelid_centro_costoDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleCompra.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_centro_costoDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_centro_costoDetalleCompra= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoDetalleCompra.setEnabled(false);

		this.jButtonid_centro_costoDetalleCompra= new JButtonMe();
		this.jButtonid_centro_costoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleCompra.setText("Buscar");
		this.jButtonid_centro_costoDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleCompra"));

		this.jButtonid_centro_costoDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleCompraBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleCompraUpdate.setText("U");
		this.jButtonid_centro_costoDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleCompraUpdate"));


		jButtonid_centro_costoDetalleCompraArbol= new JButtonMe();
		jButtonid_centro_costoDetalleCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleCompraArbol.setText("Arbol");
		jButtonid_centro_costoDetalleCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleCompraArbol"));



					
		this.jLabelid_cuenta_contable_costoDetalleCompra = new JLabelMe();
		this.jLabelid_cuenta_contable_costoDetalleCompra.setText(""+DetalleCompraConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" :");
		this.jLabelid_cuenta_contable_costoDetalleCompra.setToolTipText("Cta Contable Costo");
		this.jLabelid_cuenta_contable_costoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoDetalleCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoDetalleCompra.setToolTipText(DetalleCompraConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutDetalleCompra = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoDetalleCompra.setLayout(this.gridaBagLayoutDetalleCompra);


		jComboBoxid_cuenta_contable_costoDetalleCompra= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_costoDetalleCompra.setEnabled(false);

		this.jButtonid_cuenta_contable_costoDetalleCompra= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleCompra.setText("Buscar");
		this.jButtonid_cuenta_contable_costoDetalleCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoDetalleCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleCompra"));

		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleCompraBusqueda"));

		if(this.detallecompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoDetalleCompraBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoDetalleCompraUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoDetalleCompraUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoDetalleCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoDetalleCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleCompraUpdate"));


		jButtonid_cuenta_contable_costoDetalleCompraArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoDetalleCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleCompraArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoDetalleCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoDetalleCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoDetalleCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleCompraArbol"));



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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleDetalleCompra = new DetalleCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Compra DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleCompra= new GridBagLayout();
		

		
		String sToolTipDetalleCompra="";
		sToolTipDetalleCompra=DetalleCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCompra+="(Inventario.DetalleCompra)";
		}
		
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleCompra = new JButtonMe();
		this.jButtonModificarDetalleCompra = new JButtonMe();
        this.jButtonActualizarDetalleCompra = new JButtonMe();
        this.jButtonEliminarDetalleCompra = new JButtonMe();
        this.jButtonCancelarDetalleCompra = new JButtonMe();
        this.jButtonGuardarCambiosDetalleCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleCompra = new JButtonMe();
		this.jButtonCerrarDetalleCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleCompra = new JScrollPane();
		//this.jScrollPanelDatosDetalleCompraTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneral2DetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Compra";
		
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleCompra.setName("jPanelCamposDetalleCompra"); 

		this.jPanelCamposOcultosDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleCompra.setName("jPanelCamposOcultosDetalleCompra"); 

        this.jPanelAccionesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleCompra.setName("jPanelCamposFingeneralDetalleCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleCompra.setName("jPanelCamposFinvaloresDetalleCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneral2DetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General2"));
		this.jPanelCamposIniciogeneral2DetalleCompra.setName("jPanelCamposFingeneral2DetalleCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneral2DetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleCompra.setText("Nuevo");
		this.jButtonModificarDetalleCompra.setText("Editar");
        this.jButtonActualizarDetalleCompra.setText("Actualizar");
        this.jButtonEliminarDetalleCompra.setText("Eliminar");
        this.jButtonCancelarDetalleCompra.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleCompra.setText("Guardar");
		this.jButtonCerrarDetalleCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCompra,"nuevo_button","Nuevo",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleCompra,"modificar_button","Editar",this.detallecompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleCompra,"actualizar_button","Actualizar",this.detallecompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleCompra,"eliminar_button","Eliminar",this.detallecompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleCompra,"cancelar_button","Cancelar",this.detallecompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleCompra,"guardarcambios_button","Guardar",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCompra,"guardarcambiostabla_button","Guardar",this.detallecompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCompra,"cerrar_button","Salir",this.detallecompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleCompra.setToolTipText("Nuevo"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleCompra.setToolTipText("Editar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleCompra.setToolTipText("Actualizar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleCompra.setToolTipText("Eliminar)"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleCompra.setToolTipText("Cancelar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleCompra.setToolTipText("Guardar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleCompra.setToolTipText("Guardar"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCompra.setToolTipText("Salir"+" "+DetalleCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCompra";
		inputMap = this.jButtonNuevoDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleCompra";
		inputMap = this.jButtonActualizarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleCompra";
		inputMap = this.jButtonEliminarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleCompra";
		inputMap = this.jButtonCancelarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleCompra"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleCompra";
		inputMap = this.jButtonCerrarDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleCompra.setToolTipText("Nuevo DetalleCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleCompra.setToolTipText("Sin Cerrar Ventana DetalleCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCompra.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioDetalleCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleCompra = new JLabelMe();
		
		this.jLabelAccionesDetalleCompra.setText("Acciones");		
		this.jLabelAccionesDetalleCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesDetalleCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioDetalleCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleCompra = new GridBagLayout();
		
		this.jPanelCamposDetalleCompra.setLayout(gridaBagLayoutCamposDetalleCompra);
		this.jPanelCamposOcultosDetalleCompra.setLayout(gridaBagLayoutCamposOcultosDetalleCompra);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleCompra.setLayout(gridaBagLayoutCamposIniciogeneralDetalleCompra);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleCompra= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleCompra.setLayout(gridaBagLayoutCamposIniciovaloresDetalleCompra);

		GridBagLayout gridaBagLayoutCamposIniciogeneral2DetalleCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneral2DetalleCompra.setLayout(gridaBagLayoutCamposIniciogeneral2DetalleCompra);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleCompra.add(jLabelIdDetalleCompra, this.gridBagConstraintsDetalleCompra);



	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleCompra.add(jLabelidDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_compraDetalleCompra.add(jLabelid_compraDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraDetalleCompra.add(jButtonid_compraDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraDetalleCompra.add(jButtonid_compraDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_compraDetalleCompra.add(jComboBoxid_compraDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleCompra.add(jLabelid_empresaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleCompra.add(jButtonid_empresaDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleCompra.add(jButtonid_empresaDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleCompra.add(jComboBoxid_empresaDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleCompra.add(jLabelid_sucursalDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleCompra.add(jButtonid_sucursalDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleCompra.add(jButtonid_sucursalDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleCompra.add(jComboBoxid_sucursalDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleCompra.add(jLabelid_ejercicioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleCompra.add(jButtonid_ejercicioDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleCompra.add(jButtonid_ejercicioDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleCompra.add(jComboBoxid_ejercicioDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleCompra.add(jLabelid_periodoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleCompra.add(jButtonid_periodoDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleCompra.add(jButtonid_periodoDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleCompra.add(jComboBoxid_periodoDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleCompra.add(jLabelid_anioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleCompra.add(jButtonid_anioDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleCompra.add(jButtonid_anioDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleCompra.add(jComboBoxid_anioDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleCompra.add(jLabelid_mesDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleCompra.add(jButtonid_mesDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleCompra.add(jButtonid_mesDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleCompra.add(jComboBoxid_mesDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_inventarioDetalleCompra.add(jLabelid_estado_detalle_inventarioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_inventarioDetalleCompra.add(jButtonid_estado_detalle_inventarioDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_inventarioDetalleCompra.add(jButtonid_estado_detalle_inventarioDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_inventarioDetalleCompra.add(jComboBoxid_estado_detalle_inventarioDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleCompra.add(jLabelid_bodegaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleCompra.add(jButtonid_bodegaDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleCompra.add(jButtonid_bodegaDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleCompra.add(jComboBoxid_bodegaDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleCompra.add(jLabelid_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 2;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleCompra.add(jButtonid_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleCompra.add(jButtonid_productoDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 4;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleCompra.add(jButtonid_productoDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleCompra.add(jComboBoxid_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleCompra.add(jLabelid_unidadDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleCompra.add(jButtonid_unidadDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleCompra.add(jButtonid_unidadDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleCompra.add(jComboBoxid_unidadDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleCompra.add(jLabeldescripcionDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleCompra.add(jButtondescripcionDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleCompra.add(jscrollPanedescripcionDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_novedad_productoDetalleCompra.add(jLabelid_novedad_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleCompra.add(jButtonid_novedad_productoDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 3;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleCompra.add(jButtonid_novedad_productoDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_novedad_productoDetalleCompra.add(jComboBoxid_novedad_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleCompra.add(jLabelcantidadDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleCompra.add(jButtoncantidadDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleCompra.add(jTextFieldcantidadDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleCompra.add(jLabeldescuentoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleCompra.add(jButtondescuentoDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleCompra.add(jTextFielddescuentoDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetalleCompra.add(jLabelcosto_unitarioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetalleCompra.add(jButtoncosto_unitarioDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetalleCompra.add(jTextFieldcosto_unitarioDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleCompra.add(jLabelivaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleCompra.add(jButtonivaDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleCompra.add(jTextFieldivaDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetalleCompra.add(jLabeliva_valorDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetalleCompra.add(jButtoniva_valorDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetalleCompra.add(jTextFieldiva_valorDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetalleCompra.add(jLabelcosto_totalDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetalleCompra.add(jButtoncosto_totalDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetalleCompra.add(jTextFieldcosto_totalDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleDetalleCompra.add(jLabeldisponibleDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleDetalleCompra.add(jButtondisponibleDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleDetalleCompra.add(jTextFielddisponibleDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_ivaDetalleCompra.add(jLabelcosto_ivaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_ivaDetalleCompra.add(jButtoncosto_ivaDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_ivaDetalleCompra.add(jCheckBoxcosto_ivaDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleCompra.add(jLabeliceDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleCompra.add(jButtoniceDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleCompra.add(jTextFieldiceDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetalleCompra.add(jLabelice_valorDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetalleCompra.add(jButtonice_valorDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetalleCompra.add(jTextFieldice_valorDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento1DetalleCompra.add(jLabeldescuento1DetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento1DetalleCompra.add(jButtondescuento1DetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento1DetalleCompra.add(jTextFielddescuento1DetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetalleCompra.add(jLabeldescuento2DetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetalleCompra.add(jButtondescuento2DetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetalleCompra.add(jTextFielddescuento2DetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetalleCompra.add(jLabelserieDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetalleCompra.add(jButtonserieDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetalleCompra.add(jTextFieldserieDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteDetalleCompra.add(jLabelloteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetalleCompra.add(jButtonloteDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteDetalleCompra.add(jTextFieldloteDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_elaboracion_loteDetalleCompra.add(jLabelfecha_elaboracion_loteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_elaboracion_loteDetalleCompra.add(jButtonfecha_elaboracion_loteDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_elaboracion_loteDetalleCompra.add(jDateChooserfecha_elaboracion_loteDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidad_loteDetalleCompra.add(jLabelfecha_caducidad_loteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidad_loteDetalleCompra.add(jButtonfecha_caducidad_loteDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidad_loteDetalleCompra.add(jDateChooserfecha_caducidad_loteDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleCompra.add(jLabelid_centro_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 2;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleCompra.add(jButtonid_centro_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 3;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleCompra.add(jButtonid_centro_costoDetalleCompraArbol, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 4;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleCompra.add(jButtonid_centro_costoDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 5;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleCompra.add(jButtonid_centro_costoDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleCompra.add(jComboBoxid_centro_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoDetalleCompra.add(jLabelid_cuenta_contable_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 2;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoDetalleCompra.add(jButtonid_cuenta_contable_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 3;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoDetalleCompra.add(jButtonid_cuenta_contable_costoDetalleCompraArbol, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 4;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoDetalleCompra.add(jButtonid_cuenta_contable_costoDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 5;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoDetalleCompra.add(jButtonid_cuenta_contable_costoDetalleCompraUpdate, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoDetalleCompra.add(jComboBoxid_cuenta_contable_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleCompra.add(jLabelnumero_comprobanteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleCompra.add(jButtonnumero_comprobanteDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleCompra.add(jTextFieldnumero_comprobanteDetalleCompra, this.gridBagConstraintsDetalleCompra);


	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 0;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellote_clienteDetalleCompra.add(jLabellote_clienteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = 2;
		this.gridBagConstraintsDetalleCompra.ipadx = 0;
		this.gridBagConstraintsDetalleCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanellote_clienteDetalleCompra.add(jButtonlote_clienteDetalleCompraBusqueda, this.gridBagConstraintsDetalleCompra);
	}

	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCompra.gridy = 0;
	this.gridBagConstraintsDetalleCompra.gridx = 1;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellote_clienteDetalleCompra.add(jTextFieldlote_clienteDetalleCompra, this.gridBagConstraintsDetalleCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_empresaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 1==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_sucursalDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 1==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_ejercicioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 1==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_periodoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 1==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_anioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 1==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_mesDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 1==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_estado_detalle_inventarioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPaneldescuentoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelcosto_ivaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPaneliceDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelice_valorDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPaneldescuento1DetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPaneldescuento2DetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_centro_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelid_cuenta_contable_costoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanelnumero_comprobanteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposOcultosDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposOcultosDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleCompra.add(this.jPanellote_clienteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposOcultosDetalleCompra % 2==0) {
		iXPanelCamposOcultosDetalleCompra=0;
		iYPanelCamposOcultosDetalleCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPanelidDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPanelid_compraDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPanelid_bodegaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPanelid_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPanelid_unidadDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPaneldescripcionDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneralDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneralDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleCompra.add(this.jPanelid_novedad_productoDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneralDetalleCompra % 1==0) {
		iXPanelCamposIniciogeneralDetalleCompra=0;
		iYPanelCamposIniciogeneralDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciovaloresDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciovaloresDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleCompra.add(this.jPanelcantidadDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciovaloresDetalleCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleCompra=0;
		iYPanelCamposIniciovaloresDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciovaloresDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciovaloresDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleCompra.add(this.jPanelcosto_unitarioDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciovaloresDetalleCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleCompra=0;
		iYPanelCamposIniciovaloresDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciovaloresDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciovaloresDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleCompra.add(this.jPanelivaDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciovaloresDetalleCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleCompra=0;
		iYPanelCamposIniciovaloresDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciovaloresDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciovaloresDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleCompra.add(this.jPaneliva_valorDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciovaloresDetalleCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleCompra=0;
		iYPanelCamposIniciovaloresDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciovaloresDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciovaloresDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleCompra.add(this.jPanelcosto_totalDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciovaloresDetalleCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleCompra=0;
		iYPanelCamposIniciovaloresDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciovaloresDetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciovaloresDetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleCompra.add(this.jPaneldisponibleDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciovaloresDetalleCompra % 1==0) {
		iXPanelCamposIniciovaloresDetalleCompra=0;
		iYPanelCamposIniciovaloresDetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneral2DetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneral2DetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleCompra.add(this.jPanelserieDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneral2DetalleCompra % 1==0) {
		iXPanelCamposIniciogeneral2DetalleCompra=0;
		iYPanelCamposIniciogeneral2DetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneral2DetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneral2DetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleCompra.add(this.jPanelloteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneral2DetalleCompra % 1==0) {
		iXPanelCamposIniciogeneral2DetalleCompra=0;
		iYPanelCamposIniciogeneral2DetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneral2DetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneral2DetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleCompra.add(this.jPanelfecha_elaboracion_loteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneral2DetalleCompra % 1==0) {
		iXPanelCamposIniciogeneral2DetalleCompra=0;
		iYPanelCamposIniciogeneral2DetalleCompra++;
	}
	this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCompra.gridy = iYPanelCamposIniciogeneral2DetalleCompra;
	this.gridBagConstraintsDetalleCompra.gridx = iXPanelCamposIniciogeneral2DetalleCompra++;
	this.gridBagConstraintsDetalleCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleCompra.add(this.jPanelfecha_caducidad_loteDetalleCompra, this.gridBagConstraintsDetalleCompra);



	if(iXPanelCamposIniciogeneral2DetalleCompra % 1==0) {
		iXPanelCamposIniciogeneral2DetalleCompra=0;
		iYPanelCamposIniciogeneral2DetalleCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleCompra= new GridBagLayout();
		this.jPanelAccionesDetalleCompra.setLayout(gridaBagLayoutAccionesDetalleCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleCompra= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleCompra.setLayout(gridaBagLayoutAccionesFormularioDetalleCompra);
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCompra.add(this.jComboBoxTiposAccionesFormularioDetalleCompra, this.gridBagConstraintsDetalleCompra);

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCompra.add(this.jCheckBoxPostAccionNuevoDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallecompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCompra.add(this.jCheckBoxPostAccionSinCerrarDetalleCompra, this.gridBagConstraintsDetalleCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallecompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallecompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCompra.add(this.jCheckBoxPostAccionSinMensajeDetalleCompra, this.gridBagConstraintsDetalleCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleCompra.add(this.jButtonModificarDetalleCompra, this.gridBagConstraintsDetalleCompra);							

		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCompra.gridy = 0;
		this.gridBagConstraintsDetalleCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleCompra.add(this.jButtonEliminarDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = 0;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCompra.add(this.jButtonActualizarDetalleCompra, this.gridBagConstraintsDetalleCompra);


		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = 0;		
		this.gridBagConstraintsDetalleCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCompra.add(this.jButtonGuardarCambiosDetalleCompra, this.gridBagConstraintsDetalleCompra);	
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = 0;		
		this.gridBagConstraintsDetalleCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleCompra.add(this.jButtonCancelarDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecompraSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCompra.gridx = 0;		
			//this.gridBagConstraintsDetalleCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCompra.ipadx = 100;
				
			*/
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCompra.gridx =0;
		this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCompra, this.gridBagConstraintsDetalleCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleCompra = new DetalleCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleCompraModel detallecompraModel=new DetalleCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleCompraModel.DetalleCompraFocusTraversalPolicy detallecompraFocusTraversalPolicy = detallecompraModel.new DetalleCompraFocusTraversalPolicy(this);
			
			//detallecompraFocusTraversalPolicy.setdetallecompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallecompraModel);
			
			
			this.jContentPaneDetalleDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleCompra = new GridBagLayout();	
			this.jContentPaneDetalleDetalleCompra.setLayout(gridaBagLayoutDetalleDetalleCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleCompra.gridx = 0;
					
				this.gridBagConstraintsDetalleCompra.gridwidth=1;
				
				this.jContentPaneDetalleDetalleCompra.add(jTtoolBarDetalleDetalleCompra, gridBagConstraintsDetalleCompra);								
				*/
}
			
			this.jScrollPanelDatosEdicionDetalleCompra=   new JScrollPane(jContentPaneDetalleDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsDetalleCompra.gridx = 0;
		this.gridBagConstraintsDetalleCompra.gridwidth = 2;
		this.gridBagConstraintsDetalleCompra.gridheight = 1;
		iGridyRelaciones = iGridyRelaciones++;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleCompra.add(jPanelCamposIniciogeneralDetalleCompra, gridBagConstraintsDetalleCompra);


		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleCompra.gridy = 1;
		this.gridBagConstraintsDetalleCompra.gridx = 0;
		this.gridBagConstraintsDetalleCompra.gridwidth = 2;
		this.gridBagConstraintsDetalleCompra.gridheight = 1;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleCompra.add(jPanelCamposIniciovaloresDetalleCompra, gridBagConstraintsDetalleCompra);


		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleCompra.gridy = 3;
		this.gridBagConstraintsDetalleCompra.gridx = 0;
		this.gridBagConstraintsDetalleCompra.gridwidth = 2;
		this.gridBagConstraintsDetalleCompra.gridheight = 1;
		iGridyRelaciones = 3;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleCompra.add(jPanelCamposIniciogeneral2DetalleCompra, gridBagConstraintsDetalleCompra);
			
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
						&& detallecompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallecompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleCompra= new GridBagConstraints();
						this.gridBagConstraintsDetalleCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleCompra.gridx = 0;
						this.jContentPaneDetalleDetalleCompra.add(this.jTabbedPaneRelacionesDetalleCompra, this.gridBagConstraintsDetalleCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
					this.gridBagConstraintsDetalleCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleCompra.gridx = 0;
					
					this.gridBagConstraintsDetalleCompra.gridwidth=1;
				
					this.jContentPaneDetalleDetalleCompra.add(jPanelCamposOcultosDetalleCompra, gridBagConstraintsDetalleCompra);
				
					this.jPanelCamposOcultosDetalleCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleCompra.gridx = 0;
	        this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDetalleCompra.gridwidth=1;
			
			
			this.jContentPaneDetalleDetalleCompra.add(this.jPanelAccionesFormularioDetalleCompra, this.gridBagConstraintsDetalleCompra);							
			
			
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
	        this.gridBagConstraintsDetalleCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleCompra.gridx = 0;
	        
			this.gridBagConstraintsDetalleCompra.gridwidth=1;
			
			this.jContentPaneDetalleDetalleCompra.add(this.jPanelAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleCompra=   new JScrollPane(this.jPanelCamposDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCompra.gridx = 0;
			this.gridBagConstraintsDetalleCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleCompra, this.gridBagConstraintsDetalleCompra);			
			
			this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCompra, this.gridBagConstraintsDetalleCompra);
			
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCompra, this.gridBagConstraintsDetalleCompra);
		
			
		this.gridBagConstraintsDetalleCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCompra, this.gridBagConstraintsDetalleCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleCompra;
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
