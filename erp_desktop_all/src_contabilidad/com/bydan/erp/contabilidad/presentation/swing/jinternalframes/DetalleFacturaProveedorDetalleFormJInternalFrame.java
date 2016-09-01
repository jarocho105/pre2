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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.DetalleFacturaProveedorConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class DetalleFacturaProveedorDetalleFormJInternalFrame extends DetalleFacturaProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleFacturaProveedor;
	
	protected JMenuBar jmenuBarDetalleDetalleFacturaProveedor;
	
	protected JMenu jmenuDetalleDetalleFacturaProveedor;
	protected JMenu jmenuDetalleArchivoDetalleFacturaProveedor;
	protected JMenu jmenuDetalleAccionesDetalleFacturaProveedor;
	protected JMenu jmenuDetalleDatosDetalleFacturaProveedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFacturaProveedor;	
	protected GridBagConstraints gridBagConstraintsDetalleFacturaProveedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleFacturaProveedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleFacturaProveedor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturaproveedor="";

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

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";

	protected BodegaBeanSwingJInternalFrame bodegaenviarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegaenviar="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleFacturaProveedorSessionBean detallefacturaproveedorSessionBean;
	
	
	
	
	public FacturaProveedorSessionBean facturaproveedorSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public BodegaSessionBean bodegaenviarSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetalleFacturaProveedorLogic detallefacturaproveedorLogic;
	
	public JScrollPane jScrollPanelDatosDetalleFacturaProveedor;
	public JScrollPane jScrollPanelDatosEdicionDetalleFacturaProveedor;
	public JScrollPane jScrollPanelDatosGeneralDetalleFacturaProveedor;
	
	protected JPanel jPanelCamposDetalleFacturaProveedor;    
	protected JPanel jPanelCamposOcultosDetalleFacturaProveedor;    	
	protected JPanel jPanelAccionesDetalleFacturaProveedor;
	protected JPanel jPanelAccionesFormularioDetalleFacturaProveedor;
    
	
	
	protected Integer iXPanelCamposDetalleFacturaProveedor=0;
	protected Integer iYPanelCamposDetalleFacturaProveedor=0;
	
	protected Integer iXPanelCamposOcultosDetalleFacturaProveedor=0;
	protected Integer iYPanelCamposOcultosDetalleFacturaProveedor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleFacturaProveedor;
	public JButton jButtonModificarDetalleFacturaProveedor;
	public JButton jButtonActualizarDetalleFacturaProveedor;
    public JButton jButtonEliminarDetalleFacturaProveedor;
	public JButton jButtonCancelarDetalleFacturaProveedor;
    public JButton jButtonGuardarCambiosDetalleFacturaProveedor;
	public JButton jButtonGuardarCambiosTablaDetalleFacturaProveedor;
	protected JButton jButtonCerrarDetalleFacturaProveedor;
	
	
	protected JButton jButtonProcesarInformacionDetalleFacturaProveedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleFacturaProveedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleFacturaProveedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleFacturaProveedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFacturaProveedor;
	protected JButton jButtonModificarToolBarDetalleFacturaProveedor;
	protected JButton jButtonActualizarToolBarDetalleFacturaProveedor;
    protected JButton jButtonEliminarToolBarDetalleFacturaProveedor;
	protected JButton jButtonCancelarToolBarDetalleFacturaProveedor;
    protected JButton jButtonGuardarCambiosToolBarDetalleFacturaProveedor;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleFacturaProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFacturaProveedor;
	protected JButton jButtonCerrarToolBarDetalleFacturaProveedor;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleFacturaProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFacturaProveedor;
	protected JMenuItem jMenuItemModificarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemActualizarDetalleFacturaProveedor;
    protected JMenuItem jMenuItemEliminarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemCancelarDetalleFacturaProveedor;
    protected JMenuItem jMenuItemGuardarCambiosDetalleFacturaProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFacturaProveedor;
	protected JMenuItem jMenuItemCerrarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFacturaProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFacturaProveedor;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleFacturaProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFacturaProveedor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFacturaProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFacturaProveedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFacturaProveedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleFacturaProveedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleFacturaProveedor;
	public JLabel jLabelIdDetalleFacturaProveedor;
	public JLabel jLabelidDetalleFacturaProveedor;
	public JButton jButtonidDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleFacturaProveedor;
	public JLabel jLabelnumero_comprobanteDetalleFacturaProveedor;
	public JTextField jTextFieldnumero_comprobanteDetalleFacturaProveedor;
	public JButton jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleFacturaProveedor;
	public JLabel jLabelcantidadDetalleFacturaProveedor;
	public JTextField jTextFieldcantidadDetalleFacturaProveedor;
	public JButton jButtoncantidadDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_auxiliarDetalleFacturaProveedor;
	public JLabel jLabelcantidad_auxiliarDetalleFacturaProveedor;
	public JTextField jTextFieldcantidad_auxiliarDetalleFacturaProveedor;
	public JButton jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleFacturaProveedor;
	public JLabel jLabeldescuentoDetalleFacturaProveedor;
	public JTextField jTextFielddescuentoDetalleFacturaProveedor;
	public JButton jButtondescuentoDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleFacturaProveedor;
	public JLabel jLabelivaDetalleFacturaProveedor;
	public JTextField jTextFieldivaDetalleFacturaProveedor;
	public JButton jButtonivaDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelloteDetalleFacturaProveedor;
	public JLabel jLabelloteDetalleFacturaProveedor;
	public JTextField jTextFieldloteDetalleFacturaProveedor;
	public JButton jButtonloteDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_elaboracion_loteDetalleFacturaProveedor;
	public JLabel jLabelfecha_elaboracion_loteDetalleFacturaProveedor;
	//public JFormattedTextField jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor;

	public JDateChooser jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor;
	public JButton jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidad_loteDetalleFacturaProveedor;
	public JLabel jLabelfecha_caducidad_loteDetalleFacturaProveedor;
	//public JFormattedTextField jDateChooserfecha_caducidad_loteDetalleFacturaProveedor;

	public JDateChooser jDateChooserfecha_caducidad_loteDetalleFacturaProveedor;
	public JButton jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcosto_ivaDetalleFacturaProveedor;
	public JLabel jLabelcosto_ivaDetalleFacturaProveedor;
	public JCheckBox jCheckBoxcosto_ivaDetalleFacturaProveedor;
	public JButton jButtoncosto_ivaDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetalleFacturaProveedor;
	public JLabel jLabelcosto_unitarioDetalleFacturaProveedor;
	public JTextField jTextFieldcosto_unitarioDetalleFacturaProveedor;
	public JButton jButtoncosto_unitarioDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetalleFacturaProveedor;
	public JLabel jLabelcosto_totalDetalleFacturaProveedor;
	public JTextField jTextFieldcosto_totalDetalleFacturaProveedor;
	public JButton jButtoncosto_totalDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleFacturaProveedor;
	public JLabel jLabeliceDetalleFacturaProveedor;
	public JTextField jTextFieldiceDetalleFacturaProveedor;
	public JButton jButtoniceDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldescuento1DetalleFacturaProveedor;
	public JLabel jLabeldescuento1DetalleFacturaProveedor;
	public JTextField jTextFielddescuento1DetalleFacturaProveedor;
	public JButton jButtondescuento1DetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetalleFacturaProveedor;
	public JLabel jLabeldescuento2DetalleFacturaProveedor;
	public JTextField jTextFielddescuento2DetalleFacturaProveedor;
	public JButton jButtondescuento2DetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleFacturaProveedor;
	public JLabel jLabeldescripcionDetalleFacturaProveedor;
	public JTextArea jTextAreadescripcionDetalleFacturaProveedor;
	public JScrollPane jscrollPanedescripcionDetalleFacturaProveedor;
	public JButton jButtondescripcionDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelprecio_ventaDetalleFacturaProveedor;
	public JLabel jLabelprecio_ventaDetalleFacturaProveedor;
	public JTextField jTextFieldprecio_ventaDetalleFacturaProveedor;
	public JButton jButtonprecio_ventaDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanellote_clienteDetalleFacturaProveedor;
	public JLabel jLabellote_clienteDetalleFacturaProveedor;
	public JTextField jTextFieldlote_clienteDetalleFacturaProveedor;
	public JButton jButtonlote_clienteDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleDetalleFacturaProveedor;
	public JLabel jLabeldisponibleDetalleFacturaProveedor;
	public JTextField jTextFielddisponibleDetalleFacturaProveedor;
	public JButton jButtondisponibleDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelserieDetalleFacturaProveedor;
	public JLabel jLabelserieDetalleFacturaProveedor;
	public JTextField jTextFieldserieDetalleFacturaProveedor;
	public JButton jButtonserieDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetalleFacturaProveedor;
	public JLabel jLabelice_valorDetalleFacturaProveedor;
	public JTextField jTextFieldice_valorDetalleFacturaProveedor;
	public JButton jButtonice_valorDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_factura_proveedorDetalleFacturaProveedor;
	public JLabel jLabelid_factura_proveedorDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_proveedorDetalleFacturaProveedor;
	public JButton jButtonid_factura_proveedorDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_factura_proveedorDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleFacturaProveedor;
	public JLabel jLabelid_empresaDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleFacturaProveedor;
	public JButton jButtonid_empresaDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleFacturaProveedor;
	public JLabel jLabelid_sucursalDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleFacturaProveedor;
	public JButton jButtonid_sucursalDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_sucursalDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleFacturaProveedor;
	public JLabel jLabelid_bodegaDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleFacturaProveedor;
	public JButton jButtonid_bodegaDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_bodegaDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleFacturaProveedor;
	public JLabel jLabelid_productoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleFacturaProveedor;
	public JButton jButtonid_productoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_productoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleFacturaProveedor;
	public JLabel jLabelid_unidadDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleFacturaProveedor;
	public JButton jButtonid_unidadDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_unidadDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleFacturaProveedor;
	public JLabel jLabelid_ejercicioDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleFacturaProveedor;
	public JButton jButtonid_ejercicioDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleFacturaProveedor;
	public JLabel jLabelid_periodoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleFacturaProveedor;
	public JButton jButtonid_periodoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_periodoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_novedad_productoDetalleFacturaProveedor;
	public JLabel jLabelid_novedad_productoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoDetalleFacturaProveedor;
	public JButton jButtonid_novedad_productoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleFacturaProveedor;
	public JLabel jLabelid_centro_costoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleFacturaProveedor;
	public JButton jButtonid_centro_costoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoDetalleFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_costoDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor;
	public JButton jButtonid_cuenta_contable_costoDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_bodega_enviarDetalleFacturaProveedor;
	public JLabel jLabelid_bodega_enviarDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_enviarDetalleFacturaProveedor;
	public JButton jButtonid_bodega_enviarDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_bodega_enviarDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleFacturaProveedor;
	public JLabel jLabelid_anioDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleFacturaProveedor;
	public JButton jButtonid_anioDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_anioDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleFacturaProveedor;
	public JLabel jLabelid_mesDetalleFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleFacturaProveedor;
	public JButton jButtonid_mesDetalleFacturaProveedor= new JButtonMe();
	public JButton jButtonid_mesDetalleFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleFacturaProveedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleFacturaProveedor;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1480;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=561;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleFacturaProveedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleFacturaProveedor=new JPanel();
				this.jPanelAccionesFormularioDetalleFacturaProveedor=new JPanel();
				this.jmenuBarDetalleDetalleFacturaProveedor=new JMenuBar();
				this.jTtoolBarDetalleDetalleFacturaProveedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleFacturaProveedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFacturaProveedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleFacturaProveedor() {
		return this.jButtonActualizarToolBarDetalleFacturaProveedor;
	}
	
	public JButton getjButtonEliminarToolBarDetalleFacturaProveedor() {
		return this.jButtonEliminarToolBarDetalleFacturaProveedor;
	}
	
	public JButton getjButtonCancelarToolBarDetalleFacturaProveedor() {
		return this.jButtonCancelarToolBarDetalleFacturaProveedor;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleFacturaProveedor() {
		return this.jButtonProcesarInformacionDetalleFacturaProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFacturaProveedor)	{
		this.jButtonProcesarInformacionDetalleFacturaProveedor = jButtonProcesarInformacionDetalleFacturaProveedor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFacturaProveedor() {
		return this.jComboBoxTiposAccionesDetalleFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposRelacionesDetalleFacturaProveedor) {
		this.jComboBoxTiposRelacionesDetalleFacturaProveedor = jComboBoxTiposRelacionesDetalleFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFacturaProveedor(
			JComboBox jComboBoxTiposAccionesDetalleFacturaProveedor) {
		this.jComboBoxTiposAccionesDetalleFacturaProveedor = jComboBoxTiposAccionesDetalleFacturaProveedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleFacturaProveedor() {
		return this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleFacturaProveedor(
			JComboBox jComboBoxTiposAccionesFormularioDetalleFacturaProveedor) {
		this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor = jComboBoxTiposAccionesFormularioDetalleFacturaProveedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
		
		this.detallefacturaproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFacturaProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Factura Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 3250) {
			iWidth=3250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleFacturaProveedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleFacturaProveedor=new JButtonMe();
				this.jButtonModificarToolBarDetalleFacturaProveedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleDetalleFacturaProveedor,
							"actualizar","actualizar","Actualizar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleDetalleFacturaProveedor,
							"eliminar","eliminar","Eliminar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleDetalleFacturaProveedor,
							"cancelar","cancelar","Cancelar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleFacturaProveedor,this.jTtoolBarDetalleDetalleFacturaProveedor,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleFacturaProveedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleFacturaProveedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleFacturaProveedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleFacturaProveedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleFacturaProveedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFacturaProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFacturaProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFacturaProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleFacturaProveedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleFacturaProveedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleFacturaProveedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleFacturaProveedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleFacturaProveedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleFacturaProveedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleFacturaProveedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleFacturaProveedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleFacturaProveedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleFacturaProveedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleFacturaProveedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleFacturaProveedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleFacturaProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFacturaProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFacturaProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFacturaProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFacturaProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFacturaProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleFacturaProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleFacturaProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleFacturaProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleFacturaProveedor.add(this.jMenuItemDetalleCerrarDetalleFacturaProveedor);
		
		this.jmenuDetalleAccionesDetalleFacturaProveedor.add(this.jMenuItemActualizarDetalleFacturaProveedor);
		this.jmenuDetalleAccionesDetalleFacturaProveedor.add(this.jMenuItemEliminarDetalleFacturaProveedor);
		this.jmenuDetalleAccionesDetalleFacturaProveedor.add(this.jMenuItemCancelarDetalleFacturaProveedor);		
		
		//this.jmenuDetalleDatosDetalleFacturaProveedor.add(this.jMenuItemDetalleAbrirOrderByDetalleFacturaProveedor);				
		this.jmenuDetalleDatosDetalleFacturaProveedor.add(this.jMenuItemDetalleMostarOcultarDetalleFacturaProveedor);				
				
		//this.jmenuDetalleAccionesDetalleFacturaProveedor.add(this.jMenuItemGuardarCambiosDetalleFacturaProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleFacturaProveedor.add(this.jmenuDetalleArchivoDetalleFacturaProveedor);		
		this.jmenuBarDetalleDetalleFacturaProveedor.add(this.jmenuDetalleAccionesDetalleFacturaProveedor);		
		this.jmenuBarDetalleDetalleFacturaProveedor.add(this.jmenuDetalleDatosDetalleFacturaProveedor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleFacturaProveedor);				
	}
	
	
	public void inicializarElementosCamposDetalleFacturaProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleFacturaProveedor = new JLabelMe();
		jLabelIdDetalleFacturaProveedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleFacturaProveedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleFacturaProveedor= new GridBagLayout();

		this.jPanelidDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);

		jLabelidDetalleFacturaProveedor = new JLabel();
		jLabelidDetalleFacturaProveedor.setText("Id");

		jLabelidDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_comprobanteDetalleFacturaProveedor = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteDetalleFacturaProveedor.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldnumero_comprobanteDetalleFacturaProveedor= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleFacturaProveedor.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleFacturaProveedor = new JLabelMe();
		this.jLabelcantidadDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleFacturaProveedor.setToolTipText("Cantad");
		this.jLabelcantidadDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelcantidadDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldcantidadDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldcantidadDetalleFacturaProveedor.setEnabled(false);
		jTextFieldcantidadDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleFacturaProveedor.setText("0");

		this.jButtoncantidadDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtoncantidadDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_auxiliarDetalleFacturaProveedor = new JLabelMe();
		this.jLabelcantidad_auxiliarDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_CANTIDADAUXILIAR+" : *");
		this.jLabelcantidad_auxiliarDetalleFacturaProveedor.setToolTipText("Cantad Auxiliar");
		this.jLabelcantidad_auxiliarDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_auxiliarDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_auxiliarDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_auxiliarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_auxiliarDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_auxiliarDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_CANTIDADAUXILIAR);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelcantidad_auxiliarDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldcantidad_auxiliarDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.setEnabled(false);
		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_auxiliarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.setText("0");

		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_auxiliarDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_auxiliarDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleFacturaProveedor = new JLabelMe();
		this.jLabeldescuentoDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleFacturaProveedor.setToolTipText("Descuento");
		this.jLabeldescuentoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPaneldescuentoDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFielddescuentoDetalleFacturaProveedor= new JTextFieldMe();
		jTextFielddescuentoDetalleFacturaProveedor.setEnabled(false);
		jTextFielddescuentoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleFacturaProveedor.setText("0.0");

		this.jButtondescuentoDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtondescuentoDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleFacturaProveedor = new JLabelMe();
		this.jLabelivaDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleFacturaProveedor.setToolTipText("Iva");
		this.jLabelivaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelivaDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldivaDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldivaDetalleFacturaProveedor.setEnabled(false);
		jTextFieldivaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleFacturaProveedor.setText("0.0");

		this.jButtonivaDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonivaDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonivaDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelloteDetalleFacturaProveedor = new JLabelMe();
		this.jLabelloteDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteDetalleFacturaProveedor.setToolTipText("Lote");
		this.jLabelloteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelloteDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldloteDetalleFacturaProveedor= new JTextFieldMe();

		jTextFieldloteDetalleFacturaProveedor.setEnabled(false);
		jTextFieldloteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonloteDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonloteDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_elaboracion_loteDetalleFacturaProveedor = new JLabelMe();
		this.jLabelfecha_elaboracion_loteDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_FECHAELABORACIONLOTE+" : *");
		this.jLabelfecha_elaboracion_loteDetalleFacturaProveedor.setToolTipText("Fecha Elaboracion Lote");
		this.jLabelfecha_elaboracion_loteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_elaboracion_loteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_elaboracion_loteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_elaboracion_loteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_FECHAELABORACIONLOTE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		//jFormattedTextFieldfecha_elaboracion_loteDetalleFacturaProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor= new JDateChooser();
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.setEnabled(false);
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.setDate(new Date());
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_elaboracion_loteDetalleFacturaProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_elaboracion_loteDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidad_loteDetalleFacturaProveedor = new JLabelMe();
		this.jLabelfecha_caducidad_loteDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_FECHACADUCIDADLOTE+" : *");
		this.jLabelfecha_caducidad_loteDetalleFacturaProveedor.setToolTipText("Fecha Caducad Lote");
		this.jLabelfecha_caducidad_loteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidad_loteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidad_loteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidad_loteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidad_loteDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidad_loteDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_FECHACADUCIDADLOTE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelfecha_caducidad_loteDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		//jFormattedTextFieldfecha_caducidad_loteDetalleFacturaProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor= new JDateChooser();
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.setEnabled(false);
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidad_loteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.setDate(new Date());
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidad_loteDetalleFacturaProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidad_loteDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidad_loteDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcosto_ivaDetalleFacturaProveedor = new JLabelMe();
		this.jLabelcosto_ivaDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOIVA+" : *");
		this.jLabelcosto_ivaDetalleFacturaProveedor.setToolTipText("Costo Iva");
		this.jLabelcosto_ivaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ivaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ivaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_ivaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_ivaDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_ivaDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOIVA);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelcosto_ivaDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jCheckBoxcosto_ivaDetalleFacturaProveedor= new JCheckBoxMe();
		jCheckBoxcosto_ivaDetalleFacturaProveedor.setEnabled(false);

		jCheckBoxcosto_ivaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcosto_ivaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcosto_ivaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcosto_ivaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcosto_ivaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcosto_ivaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_ivaDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_ivaDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetalleFacturaProveedor = new JLabelMe();
		this.jLabelcosto_unitarioDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetalleFacturaProveedor.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelcosto_unitarioDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldcosto_unitarioDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldcosto_unitarioDetalleFacturaProveedor.setEnabled(false);
		jTextFieldcosto_unitarioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetalleFacturaProveedor.setText("0.0");

		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetalleFacturaProveedor = new JLabelMe();
		this.jLabelcosto_totalDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetalleFacturaProveedor.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelcosto_totalDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldcosto_totalDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldcosto_totalDetalleFacturaProveedor.setEnabled(false);
		jTextFieldcosto_totalDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetalleFacturaProveedor.setText("0.0");

		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleFacturaProveedor = new JLabelMe();
		this.jLabeliceDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleFacturaProveedor.setToolTipText("Ice");
		this.jLabeliceDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPaneliceDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldiceDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldiceDetalleFacturaProveedor.setEnabled(false);
		jTextFieldiceDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleFacturaProveedor.setText("0.0");

		this.jButtoniceDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoniceDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtoniceDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldescuento1DetalleFacturaProveedor = new JLabelMe();
		this.jLabeldescuento1DetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO1+" : *");
		this.jLabeldescuento1DetalleFacturaProveedor.setToolTipText("Descuento1");
		this.jLabeldescuento1DetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1DetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1DetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento1DetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento1DetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento1DetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO1);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPaneldescuento1DetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFielddescuento1DetalleFacturaProveedor= new JTextFieldMe();
		jTextFielddescuento1DetalleFacturaProveedor.setEnabled(false);
		jTextFielddescuento1DetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1DetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1DetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento1DetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento1DetalleFacturaProveedor.setText("0.0");

		this.jButtondescuento1DetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondescuento1DetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1DetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1DetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento1DetalleFacturaProveedorBusqueda.setText("U");
		this.jButtondescuento1DetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento1DetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento1DetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento1DetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento1DetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento1DetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento1DetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetalleFacturaProveedor = new JLabelMe();
		this.jLabeldescuento2DetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetalleFacturaProveedor.setToolTipText("Descuento2");
		this.jLabeldescuento2DetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPaneldescuento2DetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFielddescuento2DetalleFacturaProveedor= new JTextFieldMe();
		jTextFielddescuento2DetalleFacturaProveedor.setEnabled(false);
		jTextFielddescuento2DetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetalleFacturaProveedor.setText("0.0");

		this.jButtondescuento2DetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondescuento2DetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetalleFacturaProveedorBusqueda.setText("U");
		this.jButtondescuento2DetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleFacturaProveedor = new JLabelMe();
		this.jLabeldescripcionDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleFacturaProveedor.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPaneldescripcionDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextAreadescripcionDetalleFacturaProveedor= new JTextAreaMe();
		jTextAreadescripcionDetalleFacturaProveedor.setEnabled(false);
		jTextAreadescripcionDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleFacturaProveedor.setLineWrap(true);
		jTextAreadescripcionDetalleFacturaProveedor.setWrapStyleWord(true);
		jTextAreadescripcionDetalleFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleFacturaProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleFacturaProveedor = new JScrollPane(jTextAreadescripcionDetalleFacturaProveedor);
		jscrollPanedescripcionDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtondescripcionDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelprecio_ventaDetalleFacturaProveedor = new JLabelMe();
		this.jLabelprecio_ventaDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_PRECIOVENTA+" : *");
		this.jLabelprecio_ventaDetalleFacturaProveedor.setToolTipText("Precio Venta");
		this.jLabelprecio_ventaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_ventaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_ventaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_ventaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_ventaDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_ventaDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_PRECIOVENTA);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelprecio_ventaDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldprecio_ventaDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldprecio_ventaDetalleFacturaProveedor.setEnabled(false);
		jTextFieldprecio_ventaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ventaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_ventaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_ventaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_ventaDetalleFacturaProveedor.setText("0.0");

		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_ventaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_ventaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_ventaDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_ventaDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabellote_clienteDetalleFacturaProveedor = new JLabelMe();
		this.jLabellote_clienteDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_LOTECLIENTE+" : *");
		this.jLabellote_clienteDetalleFacturaProveedor.setToolTipText("Lote Cliente");
		this.jLabellote_clienteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellote_clienteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellote_clienteDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellote_clienteDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_LOTECLIENTE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanellote_clienteDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldlote_clienteDetalleFacturaProveedor= new JTextFieldMe();

		jTextFieldlote_clienteDetalleFacturaProveedor.setEnabled(false);
		jTextFieldlote_clienteDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlote_clienteDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlote_clienteDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlote_clienteDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlote_clienteDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lote_clienteDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlote_clienteDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleDetalleFacturaProveedor = new JLabelMe();
		this.jLabeldisponibleDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_DISPONIBLE+" : *");
		this.jLabeldisponibleDetalleFacturaProveedor.setToolTipText("Disponible");
		this.jLabeldisponibleDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPaneldisponibleDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFielddisponibleDetalleFacturaProveedor= new JTextFieldMe();
		jTextFielddisponibleDetalleFacturaProveedor.setEnabled(false);
		jTextFielddisponibleDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleDetalleFacturaProveedor.setText("0.0");

		this.jButtondisponibleDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondisponibleDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtondisponibleDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelserieDetalleFacturaProveedor = new JLabelMe();
		this.jLabelserieDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieDetalleFacturaProveedor.setToolTipText("Serie");
		this.jLabelserieDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelserieDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldserieDetalleFacturaProveedor= new JTextFieldMe();

		jTextFieldserieDetalleFacturaProveedor.setEnabled(false);
		jTextFieldserieDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonserieDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonserieDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetalleFacturaProveedor = new JLabelMe();
		this.jLabelice_valorDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetalleFacturaProveedor.setToolTipText("Ice Valor");
		this.jLabelice_valorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelice_valorDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jTextFieldice_valorDetalleFacturaProveedor= new JTextFieldMe();
		jTextFieldice_valorDetalleFacturaProveedor.setEnabled(false);
		jTextFieldice_valorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetalleFacturaProveedor.setText("0.0");

		this.jButtonice_valorDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonice_valorDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonice_valorDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetalleFacturaProveedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleFacturaProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_factura_proveedorDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_factura_proveedorDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDFACTURAPROVEEDOR+" : *");
		this.jLabelid_factura_proveedorDetalleFacturaProveedor.setToolTipText("Factura Proveedor");
		this.jLabelid_factura_proveedorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_factura_proveedorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_factura_proveedorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factura_proveedorDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factura_proveedorDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factura_proveedorDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDFACTURAPROVEEDOR);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_factura_proveedorDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_factura_proveedorDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_proveedorDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factura_proveedorDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_factura_proveedorDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_proveedorDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_proveedorDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_proveedorDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_factura_proveedorDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factura_proveedorDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_proveedorDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_proveedorDetalleFacturaProveedor"));

		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_proveedorDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_proveedorDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_proveedorDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_proveedorDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_empresaDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_empresaDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleFacturaProveedor.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_empresaDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_empresaDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_empresaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleFacturaProveedor.setEnabled(false);

		this.jButtonid_empresaDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_empresaDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaProveedor"));

		this.jButtonid_empresaDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_empresaDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_sucursalDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_sucursalDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleFacturaProveedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_sucursalDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_sucursalDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_sucursalDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleFacturaProveedor.setEnabled(false);

		this.jButtonid_sucursalDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_sucursalDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaProveedor"));

		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_sucursalDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_bodegaDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_bodegaDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleFacturaProveedor.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_bodegaDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_bodegaDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_bodegaDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_bodegaDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaProveedor"));

		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_bodegaDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_productoDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_productoDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleFacturaProveedor.setToolTipText("Producto");
		this.jLabelid_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_productoDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_productoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_productoDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaProveedor"));

		this.jButtonid_productoDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_productoDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_productoDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_productoDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_unidadDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_unidadDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleFacturaProveedor.setToolTipText("Unad");
		this.jLabelid_unidadDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_unidadDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_unidadDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_unidadDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_unidadDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaProveedor"));

		this.jButtonid_unidadDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_unidadDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_ejercicioDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_ejercicioDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleFacturaProveedor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_ejercicioDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_ejercicioDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleFacturaProveedor.setEnabled(false);

		this.jButtonid_ejercicioDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_ejercicioDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_ejercicioDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFacturaProveedor"));

		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_ejercicioDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_periodoDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_periodoDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleFacturaProveedor.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_periodoDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_periodoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_periodoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleFacturaProveedor.setEnabled(false);

		this.jButtonid_periodoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_periodoDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_periodoDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleFacturaProveedor"));

		this.jButtonid_periodoDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_periodoDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_novedad_productoDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_novedad_productoDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDNOVEDADPRODUCTO+" : *");
		this.jLabelid_novedad_productoDetalleFacturaProveedor.setToolTipText("Novedad Producto");
		this.jLabelid_novedad_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_novedad_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_novedad_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_novedad_productoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_novedad_productoDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_novedad_productoDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_novedad_productoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_novedad_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_novedad_productoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_novedad_productoDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_novedad_productoDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_novedad_productoDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_novedad_productoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleFacturaProveedor"));

		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_novedad_productoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_novedad_productoDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_novedad_productoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_centro_costoDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_centro_costoDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoDetalleFacturaProveedor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_centro_costoDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_centro_costoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_centro_costoDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_centro_costoDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaProveedor"));

		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_centro_costoDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaProveedorUpdate"));


		jButtonid_centro_costoDetalleFacturaProveedorArbol= new JButtonMe();
		jButtonid_centro_costoDetalleFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleFacturaProveedorArbol.setText("Arbol");
		jButtonid_centro_costoDetalleFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleFacturaProveedorArbol"));



					
		this.jLabelid_cuenta_contable_costoDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_costoDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" : *");
		this.jLabelid_cuenta_contable_costoDetalleFacturaProveedor.setToolTipText("Cuenta Contable Costo");
		this.jLabelid_cuenta_contable_costoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleFacturaProveedor"));

		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleFacturaProveedorUpdate"));


		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleFacturaProveedorArbol"));



					
		this.jLabelid_bodega_enviarDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_bodega_enviarDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDBODEGAENVIAR+" : *");
		this.jLabelid_bodega_enviarDetalleFacturaProveedor.setToolTipText("Bodega Enviar");
		this.jLabelid_bodega_enviarDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_enviarDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_enviarDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_enviarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_enviarDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_enviarDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDBODEGAENVIAR);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_bodega_enviarDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_bodega_enviarDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_enviarDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_enviarDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_bodega_enviarDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_enviarDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_enviarDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_enviarDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_bodega_enviarDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_enviarDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_enviarDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_enviarDetalleFacturaProveedor"));

		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_enviarDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_enviarDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_enviarDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_enviarDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_anioDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_anioDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleFacturaProveedor.setToolTipText("Anio");
		this.jLabelid_anioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_anioDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_anioDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_anioDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_anioDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_anioDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleFacturaProveedor"));

		this.jButtonid_anioDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_anioDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_anioDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_anioDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleFacturaProveedorUpdate"));



					
		this.jLabelid_mesDetalleFacturaProveedor = new JLabelMe();
		this.jLabelid_mesDetalleFacturaProveedor.setText(""+DetalleFacturaProveedorConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleFacturaProveedor.setToolTipText("Mes");
		this.jLabelid_mesDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleFacturaProveedor.setToolTipText(DetalleFacturaProveedorConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		this.jPanelid_mesDetalleFacturaProveedor.setLayout(this.gridaBagLayoutDetalleFacturaProveedor);


		jComboBoxid_mesDetalleFacturaProveedor= new JComboBoxMe();
		jComboBoxid_mesDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesDetalleFacturaProveedor= new JButtonMe();
		this.jButtonid_mesDetalleFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleFacturaProveedor.setText("Buscar");
		this.jButtonid_mesDetalleFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleFacturaProveedor"));

		this.jButtonid_mesDetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleFacturaProveedorBusqueda.setText("U");
		this.jButtonid_mesDetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleFacturaProveedorBusqueda"));

		if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_mesDetalleFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleFacturaProveedorUpdate.setText("U");
		this.jButtonid_mesDetalleFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleFacturaProveedorUpdate"));



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
		//this.jInternalFrameDetalleDetalleFacturaProveedor = new DetalleFacturaProveedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Factura Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFacturaProveedor= new GridBagLayout();
		

		
		String sToolTipDetalleFacturaProveedor="";
		sToolTipDetalleFacturaProveedor=DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFacturaProveedor+="(Contabilidad.DetalleFacturaProveedor)";
		}
		
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFacturaProveedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleFacturaProveedor = new JButtonMe();
		this.jButtonModificarDetalleFacturaProveedor = new JButtonMe();
        this.jButtonActualizarDetalleFacturaProveedor = new JButtonMe();
        this.jButtonEliminarDetalleFacturaProveedor = new JButtonMe();
        this.jButtonCancelarDetalleFacturaProveedor = new JButtonMe();
        this.jButtonGuardarCambiosDetalleFacturaProveedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor = new JButtonMe();
		this.jButtonCerrarDetalleFacturaProveedor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFacturaProveedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleFacturaProveedor = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleFacturaProveedor = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Factura Proveedor";
		
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Factura Proveedores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleFacturaProveedor.setName("jPanelCamposDetalleFacturaProveedor"); 

		this.jPanelCamposOcultosDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleFacturaProveedor.setName("jPanelCamposOcultosDetalleFacturaProveedor"); 

        this.jPanelAccionesDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFacturaProveedor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFacturaProveedor.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleFacturaProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleFacturaProveedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleFacturaProveedor.setText("Nuevo");
		this.jButtonModificarDetalleFacturaProveedor.setText("Editar");
        this.jButtonActualizarDetalleFacturaProveedor.setText("Actualizar");
        this.jButtonEliminarDetalleFacturaProveedor.setText("Eliminar");
        this.jButtonCancelarDetalleFacturaProveedor.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleFacturaProveedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.setText("Guardar");
		this.jButtonCerrarDetalleFacturaProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFacturaProveedor,"nuevo_button","Nuevo",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleFacturaProveedor,"modificar_button","Editar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleFacturaProveedor,"actualizar_button","Actualizar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleFacturaProveedor,"eliminar_button","Eliminar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleFacturaProveedor,"cancelar_button","Cancelar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleFacturaProveedor,"guardarcambios_button","Guardar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFacturaProveedor,"guardarcambiostabla_button","Guardar",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFacturaProveedor,"cerrar_button","Salir",this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleFacturaProveedor.setToolTipText("Nuevo"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleFacturaProveedor.setToolTipText("Editar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleFacturaProveedor.setToolTipText("Actualizar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleFacturaProveedor.setToolTipText("Eliminar)"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleFacturaProveedor.setToolTipText("Cancelar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleFacturaProveedor.setToolTipText("Guardar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.setToolTipText("Guardar"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFacturaProveedor.setToolTipText("Salir"+" "+DetalleFacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFacturaProveedor";
		inputMap = this.jButtonNuevoDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFacturaProveedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleFacturaProveedor";
		inputMap = this.jButtonActualizarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleFacturaProveedor"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleFacturaProveedor";
		inputMap = this.jButtonEliminarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleFacturaProveedor"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleFacturaProveedor";
		inputMap = this.jButtonCancelarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleFacturaProveedor"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleFacturaProveedor";
		inputMap = this.jButtonCerrarDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFacturaProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFacturaProveedor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFacturaProveedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleFacturaProveedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleFacturaProveedor.setToolTipText("Nuevo DetalleFacturaProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleFacturaProveedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleFacturaProveedor.setToolTipText("Sin Cerrar Ventana DetalleFacturaProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleFacturaProveedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleFacturaProveedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFacturaProveedor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleFacturaProveedor = new JLabelMe();
		
		this.jLabelAccionesDetalleFacturaProveedor.setText("Acciones");		
		this.jLabelAccionesDetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleFacturaProveedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleFacturaProveedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleFacturaProveedor=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleFacturaProveedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleFacturaProveedor = new GridBagLayout();
		
		this.jPanelCamposDetalleFacturaProveedor.setLayout(gridaBagLayoutCamposDetalleFacturaProveedor);
		this.jPanelCamposOcultosDetalleFacturaProveedor.setLayout(gridaBagLayoutCamposOcultosDetalleFacturaProveedor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleFacturaProveedor.add(jLabelIdDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleFacturaProveedor.add(jLabelidDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factura_proveedorDetalleFacturaProveedor.add(jLabelid_factura_proveedorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_proveedorDetalleFacturaProveedor.add(jButtonid_factura_proveedorDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_proveedorDetalleFacturaProveedor.add(jButtonid_factura_proveedorDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factura_proveedorDetalleFacturaProveedor.add(jComboBoxid_factura_proveedorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleFacturaProveedor.add(jLabelid_empresaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFacturaProveedor.add(jButtonid_empresaDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleFacturaProveedor.add(jButtonid_empresaDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleFacturaProveedor.add(jComboBoxid_empresaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleFacturaProveedor.add(jLabelid_sucursalDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleFacturaProveedor.add(jButtonid_sucursalDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleFacturaProveedor.add(jButtonid_sucursalDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleFacturaProveedor.add(jComboBoxid_sucursalDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleFacturaProveedor.add(jLabelid_bodegaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleFacturaProveedor.add(jButtonid_bodegaDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleFacturaProveedor.add(jButtonid_bodegaDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleFacturaProveedor.add(jComboBoxid_bodegaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleFacturaProveedor.add(jLabelid_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleFacturaProveedor.add(jButtonid_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleFacturaProveedor.add(jButtonid_productoDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 4;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleFacturaProveedor.add(jButtonid_productoDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleFacturaProveedor.add(jComboBoxid_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleFacturaProveedor.add(jLabelid_unidadDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleFacturaProveedor.add(jButtonid_unidadDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleFacturaProveedor.add(jButtonid_unidadDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleFacturaProveedor.add(jComboBoxid_unidadDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleFacturaProveedor.add(jLabelid_ejercicioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleFacturaProveedor.add(jButtonid_ejercicioDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleFacturaProveedor.add(jButtonid_ejercicioDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleFacturaProveedor.add(jComboBoxid_ejercicioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleFacturaProveedor.add(jLabelid_periodoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleFacturaProveedor.add(jButtonid_periodoDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleFacturaProveedor.add(jButtonid_periodoDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleFacturaProveedor.add(jComboBoxid_periodoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleFacturaProveedor.add(jLabelnumero_comprobanteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleFacturaProveedor.add(jButtonnumero_comprobanteDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleFacturaProveedor.add(jTextFieldnumero_comprobanteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleFacturaProveedor.add(jLabelcantidadDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleFacturaProveedor.add(jButtoncantidadDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleFacturaProveedor.add(jTextFieldcantidadDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_auxiliarDetalleFacturaProveedor.add(jLabelcantidad_auxiliarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_auxiliarDetalleFacturaProveedor.add(jButtoncantidad_auxiliarDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_auxiliarDetalleFacturaProveedor.add(jTextFieldcantidad_auxiliarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleFacturaProveedor.add(jLabeldescuentoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleFacturaProveedor.add(jButtondescuentoDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleFacturaProveedor.add(jTextFielddescuentoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleFacturaProveedor.add(jLabelivaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleFacturaProveedor.add(jButtonivaDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleFacturaProveedor.add(jTextFieldivaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteDetalleFacturaProveedor.add(jLabelloteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetalleFacturaProveedor.add(jButtonloteDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteDetalleFacturaProveedor.add(jTextFieldloteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor.add(jLabelfecha_elaboracion_loteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor.add(jButtonfecha_elaboracion_loteDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor.add(jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidad_loteDetalleFacturaProveedor.add(jLabelfecha_caducidad_loteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidad_loteDetalleFacturaProveedor.add(jButtonfecha_caducidad_loteDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidad_loteDetalleFacturaProveedor.add(jDateChooserfecha_caducidad_loteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_ivaDetalleFacturaProveedor.add(jLabelcosto_ivaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_ivaDetalleFacturaProveedor.add(jButtoncosto_ivaDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_ivaDetalleFacturaProveedor.add(jCheckBoxcosto_ivaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetalleFacturaProveedor.add(jLabelcosto_unitarioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetalleFacturaProveedor.add(jButtoncosto_unitarioDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetalleFacturaProveedor.add(jTextFieldcosto_unitarioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetalleFacturaProveedor.add(jLabelcosto_totalDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetalleFacturaProveedor.add(jButtoncosto_totalDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetalleFacturaProveedor.add(jTextFieldcosto_totalDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleFacturaProveedor.add(jLabeliceDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleFacturaProveedor.add(jButtoniceDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleFacturaProveedor.add(jTextFieldiceDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento1DetalleFacturaProveedor.add(jLabeldescuento1DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento1DetalleFacturaProveedor.add(jButtondescuento1DetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento1DetalleFacturaProveedor.add(jTextFielddescuento1DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetalleFacturaProveedor.add(jLabeldescuento2DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetalleFacturaProveedor.add(jButtondescuento2DetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetalleFacturaProveedor.add(jTextFielddescuento2DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleFacturaProveedor.add(jLabeldescripcionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleFacturaProveedor.add(jButtondescripcionDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleFacturaProveedor.add(jscrollPanedescripcionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_ventaDetalleFacturaProveedor.add(jLabelprecio_ventaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_ventaDetalleFacturaProveedor.add(jButtonprecio_ventaDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_ventaDetalleFacturaProveedor.add(jTextFieldprecio_ventaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_novedad_productoDetalleFacturaProveedor.add(jLabelid_novedad_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleFacturaProveedor.add(jButtonid_novedad_productoDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleFacturaProveedor.add(jButtonid_novedad_productoDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_novedad_productoDetalleFacturaProveedor.add(jComboBoxid_novedad_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleFacturaProveedor.add(jLabelid_centro_costoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleFacturaProveedor.add(jButtonid_centro_costoDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleFacturaProveedor.add(jButtonid_centro_costoDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleFacturaProveedor.add(jComboBoxid_centro_costoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor.add(jLabelid_cuenta_contable_costoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor.add(jButtonid_cuenta_contable_costoDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor.add(jButtonid_cuenta_contable_costoDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor.add(jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_enviarDetalleFacturaProveedor.add(jLabelid_bodega_enviarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_enviarDetalleFacturaProveedor.add(jButtonid_bodega_enviarDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_enviarDetalleFacturaProveedor.add(jButtonid_bodega_enviarDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_enviarDetalleFacturaProveedor.add(jComboBoxid_bodega_enviarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellote_clienteDetalleFacturaProveedor.add(jLabellote_clienteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanellote_clienteDetalleFacturaProveedor.add(jButtonlote_clienteDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellote_clienteDetalleFacturaProveedor.add(jTextFieldlote_clienteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleDetalleFacturaProveedor.add(jLabeldisponibleDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleDetalleFacturaProveedor.add(jButtondisponibleDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleDetalleFacturaProveedor.add(jTextFielddisponibleDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetalleFacturaProveedor.add(jLabelserieDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetalleFacturaProveedor.add(jButtonserieDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetalleFacturaProveedor.add(jTextFieldserieDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetalleFacturaProveedor.add(jLabelice_valorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetalleFacturaProveedor.add(jButtonice_valorDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetalleFacturaProveedor.add(jTextFieldice_valorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleFacturaProveedor.add(jLabelid_anioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleFacturaProveedor.add(jButtonid_anioDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleFacturaProveedor.add(jButtonid_anioDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleFacturaProveedor.add(jComboBoxid_anioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleFacturaProveedor.add(jLabelid_mesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 2;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleFacturaProveedor.add(jButtonid_mesDetalleFacturaProveedorBusqueda, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 3;
		this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleFacturaProveedor.add(jButtonid_mesDetalleFacturaProveedorUpdate, this.gridBagConstraintsDetalleFacturaProveedor);
	}

	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = 1;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleFacturaProveedor.add(jComboBoxid_mesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelidDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_factura_proveedorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_bodegaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_unidadDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelnumero_comprobanteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelcantidadDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelcantidad_auxiliarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPaneldescuentoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelivaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelloteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelfecha_elaboracion_loteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelfecha_caducidad_loteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelcosto_ivaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelcosto_unitarioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelcosto_totalDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPaneliceDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPaneldescuento1DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPaneldescuento2DetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPaneldescripcionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelprecio_ventaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_novedad_productoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_centro_costoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_cuenta_contable_costoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_bodega_enviarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanellote_clienteDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPaneldisponibleDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelserieDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelice_valorDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_anioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleFacturaProveedor.add(this.jPanelid_mesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposDetalleFacturaProveedor % 4==0) {
		iXPanelCamposDetalleFacturaProveedor=0;
		iYPanelCamposDetalleFacturaProveedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposOcultosDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposOcultosDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturaProveedor.add(this.jPanelid_empresaDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposOcultosDetalleFacturaProveedor % 4==0) {
		iXPanelCamposOcultosDetalleFacturaProveedor=0;
		iYPanelCamposOcultosDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposOcultosDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposOcultosDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturaProveedor.add(this.jPanelid_sucursalDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposOcultosDetalleFacturaProveedor % 4==0) {
		iXPanelCamposOcultosDetalleFacturaProveedor=0;
		iYPanelCamposOcultosDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposOcultosDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposOcultosDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturaProveedor.add(this.jPanelid_ejercicioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposOcultosDetalleFacturaProveedor % 4==0) {
		iXPanelCamposOcultosDetalleFacturaProveedor=0;
		iYPanelCamposOcultosDetalleFacturaProveedor++;
	}
	this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleFacturaProveedor.gridy = iYPanelCamposOcultosDetalleFacturaProveedor;
	this.gridBagConstraintsDetalleFacturaProveedor.gridx = iXPanelCamposOcultosDetalleFacturaProveedor++;
	this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleFacturaProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleFacturaProveedor.add(this.jPanelid_periodoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);



	if(iXPanelCamposOcultosDetalleFacturaProveedor % 4==0) {
		iXPanelCamposOcultosDetalleFacturaProveedor=0;
		iYPanelCamposOcultosDetalleFacturaProveedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleFacturaProveedor= new GridBagLayout();
		this.jPanelAccionesDetalleFacturaProveedor.setLayout(gridaBagLayoutAccionesDetalleFacturaProveedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleFacturaProveedor= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleFacturaProveedor.setLayout(gridaBagLayoutAccionesFormularioDetalleFacturaProveedor);
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFacturaProveedor.add(this.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleFacturaProveedor.add(this.jCheckBoxPostAccionNuevoDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallefacturaproveedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFacturaProveedor.add(this.jCheckBoxPostAccionSinCerrarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallefacturaproveedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleFacturaProveedor.add(this.jCheckBoxPostAccionSinMensajeDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleFacturaProveedor.add(this.jButtonModificarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);							

		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleFacturaProveedor.add(this.jButtonEliminarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturaProveedor.add(this.jButtonActualizarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);


		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturaProveedor.add(this.jButtonGuardarCambiosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);	
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = 0;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleFacturaProveedor.add(this.jButtonCancelarDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFacturaProveedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;		
			//this.gridBagConstraintsDetalleFacturaProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFacturaProveedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =0;
		this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFacturaProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleFacturaProveedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleFacturaProveedor = new DetalleFacturaProveedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Factura Proveedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Factura Proveedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Factura Proveedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleFacturaProveedorModel detallefacturaproveedorModel=new DetalleFacturaProveedorModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleFacturaProveedorModel.DetalleFacturaProveedorFocusTraversalPolicy detallefacturaproveedorFocusTraversalPolicy = detallefacturaproveedorModel.new DetalleFacturaProveedorFocusTraversalPolicy(this);
			
			//detallefacturaproveedorFocusTraversalPolicy.setdetallefacturaproveedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallefacturaproveedorModel);
			
			
			this.jContentPaneDetalleDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleFacturaProveedor = new GridBagLayout();	
			this.jContentPaneDetalleDetalleFacturaProveedor.setLayout(gridaBagLayoutDetalleDetalleFacturaProveedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFacturaProveedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
				this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleFacturaProveedor.add(jTtoolBarDetalleDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor=   new JScrollPane(jContentPaneDetalleDetalleFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	        
			this.jContentPaneDetalleDetalleFacturaProveedor.add(jPanelCamposDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);
			
			
			
			
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
						&& detallefacturaproveedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallefacturaproveedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleFacturaProveedor= new GridBagConstraints();
						this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
						this.jContentPaneDetalleDetalleFacturaProveedor.add(this.jTabbedPaneRelacionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleFacturaProveedor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleFacturaProveedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
					this.gridBagConstraintsDetalleFacturaProveedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleFacturaProveedor.add(jPanelCamposOcultosDetalleFacturaProveedor, gridBagConstraintsDetalleFacturaProveedor);
				
					this.jPanelCamposOcultosDetalleFacturaProveedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	        this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleFacturaProveedor.add(this.jPanelAccionesFormularioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);							
			
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
	        this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleFacturaProveedor.add(this.jPanelAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleFacturaProveedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor=   new JScrollPane(this.jPanelCamposDetalleFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
			this.gridBagConstraintsDetalleFacturaProveedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleFacturaProveedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleFacturaProveedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);			
			
			this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
			
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		
			
		this.gridBagConstraintsDetalleFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleFacturaProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFacturaProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFacturaProveedor, this.gridBagConstraintsDetalleFacturaProveedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleFacturaProveedor;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleFacturaProveedor;
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
