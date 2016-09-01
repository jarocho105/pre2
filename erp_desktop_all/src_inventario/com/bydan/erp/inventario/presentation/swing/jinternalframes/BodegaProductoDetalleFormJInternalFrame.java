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
import com.bydan.erp.inventario.util.BodegaProductoConstantesFunciones;

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
public class BodegaProductoDetalleFormJInternalFrame extends BodegaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBodegaProducto;
	
	protected JMenuBar jmenuBarDetalleBodegaProducto;
	
	protected JMenu jmenuDetalleBodegaProducto;
	protected JMenu jmenuDetalleArchivoBodegaProducto;
	protected JMenu jmenuDetalleAccionesBodegaProducto;
	protected JMenu jmenuDetalleDatosBodegaProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBodegaProducto;	
	protected GridBagConstraints gridBagConstraintsBodegaProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BodegaProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleBodegaProducto;		
	
	
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
	
	public BodegaProductoLogic bodegaproductoLogic;
	
	public JScrollPane jScrollPanelDatosBodegaProducto;
	public JScrollPane jScrollPanelDatosEdicionBodegaProducto;
	public JScrollPane jScrollPanelDatosGeneralBodegaProducto;
	
	protected JPanel jPanelCamposBodegaProducto;    
	protected JPanel jPanelCamposOcultosBodegaProducto;    	
	protected JPanel jPanelAccionesBodegaProducto;
	protected JPanel jPanelAccionesFormularioBodegaProducto;
    
	
	
	protected JTabbedPane jTabbedPaneCamposBodegaProducto;	
	protected Integer iXPanelCamposBodegaProducto=0;
	protected Integer iYPanelCamposBodegaProducto=0;
	
	protected Integer iXPanelCamposOcultosBodegaProducto=0;
	protected Integer iYPanelCamposOcultosBodegaProducto=0;
	
	

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
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBodegaProducto;
	public JButton jButtonModificarBodegaProducto;
	public JButton jButtonActualizarBodegaProducto;
    public JButton jButtonEliminarBodegaProducto;
	public JButton jButtonCancelarBodegaProducto;
    public JButton jButtonGuardarCambiosBodegaProducto;
	public JButton jButtonGuardarCambiosTablaBodegaProducto;
	protected JButton jButtonCerrarBodegaProducto;
	
	
	protected JButton jButtonProcesarInformacionBodegaProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBodegaProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBodegaProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBodegaProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBodegaProducto;
	protected JButton jButtonModificarToolBarBodegaProducto;
	protected JButton jButtonActualizarToolBarBodegaProducto;
    protected JButton jButtonEliminarToolBarBodegaProducto;
	protected JButton jButtonCancelarToolBarBodegaProducto;
    protected JButton jButtonGuardarCambiosToolBarBodegaProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarBodegaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarBodegaProducto;
	protected JButton jButtonCerrarToolBarBodegaProducto;
	
	protected JButton jButtonProcesarInformacionToolBarBodegaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBodegaProducto;
	protected JMenuItem jMenuItemModificarBodegaProducto;
	protected JMenuItem jMenuItemActualizarBodegaProducto;
    protected JMenuItem jMenuItemEliminarBodegaProducto;
	protected JMenuItem jMenuItemCancelarBodegaProducto;
    protected JMenuItem jMenuItemGuardarCambiosBodegaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaBodegaProducto;
	protected JMenuItem jMenuItemCerrarBodegaProducto;
	protected JMenuItem jMenuItemDetalleCerrarBodegaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarBodegaProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionBodegaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBodegaProducto;
	protected JMenuItem jMenuItemMostrarOcultarBodegaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBodegaProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBodegaProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBodegaProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBodegaProducto;
	public JLabel jLabelIdBodegaProducto;
	public JLabel jLabelidBodegaProducto;
	public JButton jButtonidBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionBodegaProducto;
	public JLabel jLabeldescripcionBodegaProducto;
	public JTextArea jTextAreadescripcionBodegaProducto;
	public JScrollPane jscrollPanedescripcionBodegaProducto;
	public JButton jButtondescripcionBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_disponibleBodegaProducto;
	public JLabel jLabelcantidad_disponibleBodegaProducto;
	public JTextField jTextFieldcantidad_disponibleBodegaProducto;
	public JButton jButtoncantidad_disponibleBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelstock_maximoBodegaProducto;
	public JLabel jLabelstock_maximoBodegaProducto;
	public JTextField jTextFieldstock_maximoBodegaProducto;
	public JButton jButtonstock_maximoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelstock_minimoBodegaProducto;
	public JLabel jLabelstock_minimoBodegaProducto;
	public JTextField jTextFieldstock_minimoBodegaProducto;
	public JButton jButtonstock_minimoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelivaBodegaProducto;
	public JLabel jLabelivaBodegaProducto;
	public JTextField jTextFieldivaBodegaProducto;
	public JButton jButtonivaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorBodegaProducto;
	public JLabel jLabeliva_valorBodegaProducto;
	public JTextField jTextFieldiva_valorBodegaProducto;
	public JButton jButtoniva_valorBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoBodegaProducto;
	public JLabel jLabeldescuentoBodegaProducto;
	public JTextField jTextFielddescuentoBodegaProducto;
	public JButton jButtondescuentoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorBodegaProducto;
	public JLabel jLabeldescuento_valorBodegaProducto;
	public JTextField jTextFielddescuento_valorBodegaProducto;
	public JButton jButtondescuento_valorBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneliceBodegaProducto;
	public JLabel jLabeliceBodegaProducto;
	public JTextField jTextFieldiceBodegaProducto;
	public JButton jButtoniceBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelice_valorBodegaProducto;
	public JLabel jLabelice_valorBodegaProducto;
	public JTextField jTextFieldice_valorBodegaProducto;
	public JButton jButtonice_valorBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_promedioBodegaProducto;
	public JLabel jLabelcosto_promedioBodegaProducto;
	public JTextField jTextFieldcosto_promedioBodegaProducto;
	public JButton jButtoncosto_promedioBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_comisionBodegaProducto;
	public JLabel jLabelporcentaje_comisionBodegaProducto;
	public JTextField jTextFieldporcentaje_comisionBodegaProducto;
	public JButton jButtonporcentaje_comisionBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelprecioBodegaProducto;
	public JLabel jLabelprecioBodegaProducto;
	public JTextField jTextFieldprecioBodegaProducto;
	public JButton jButtonprecioBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoBodegaProducto;
	public JLabel jLabelultimo_costoBodegaProducto;
	public JTextField jTextFieldultimo_costoBodegaProducto;
	public JButton jButtonultimo_costoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcostoBodegaProducto;
	public JLabel jLabelcostoBodegaProducto;
	public JTextField jTextFieldcostoBodegaProducto;
	public JButton jButtoncostoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelarancel_porcentajeBodegaProducto;
	public JLabel jLabelarancel_porcentajeBodegaProducto;
	public JTextField jTextFieldarancel_porcentajeBodegaProducto;
	public JButton jButtonarancel_porcentajeBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelice_porcentajeBodegaProducto;
	public JLabel jLabelice_porcentajeBodegaProducto;
	public JTextField jTextFieldice_porcentajeBodegaProducto;
	public JButton jButtonice_porcentajeBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelpesoBodegaProducto;
	public JLabel jLabelpesoBodegaProducto;
	public JTextField jTextFieldpesoBodegaProducto;
	public JButton jButtonpesoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_ivaBodegaProducto;
	public JLabel jLabelcon_ivaBodegaProducto;
	public JCheckBox jCheckBoxcon_ivaBodegaProducto;
	public JButton jButtoncon_ivaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_impuestoBodegaProducto;
	public JLabel jLabelcon_impuestoBodegaProducto;
	public JCheckBox jCheckBoxcon_impuestoBodegaProducto;
	public JButton jButtoncon_impuestoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_iceBodegaProducto;
	public JLabel jLabelcon_iceBodegaProducto;
	public JCheckBox jCheckBoxcon_iceBodegaProducto;
	public JButton jButtoncon_iceBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoBodegaProducto;
	public JLabel jLabelesta_activoBodegaProducto;
	public JCheckBox jCheckBoxesta_activoBodegaProducto;
	public JButton jButtonesta_activoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcon_balanzaBodegaProducto;
	public JLabel jLabelcon_balanzaBodegaProducto;
	public JCheckBox jCheckBoxcon_balanzaBodegaProducto;
	public JButton jButtoncon_balanzaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pedidaBodegaProducto;
	public JLabel jLabelcantidad_pedidaBodegaProducto;
	public JTextField jTextFieldcantidad_pedidaBodegaProducto;
	public JButton jButtoncantidad_pedidaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_fisicaBodegaProducto;
	public JLabel jLabelcantidad_fisicaBodegaProducto;
	public JTextField jTextFieldcantidad_fisicaBodegaProducto;
	public JButton jButtoncantidad_fisicaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_requeridoBodegaProducto;
	public JLabel jLabelcantidad_requeridoBodegaProducto;
	public JTextField jTextFieldcantidad_requeridoBodegaProducto;
	public JButton jButtoncantidad_requeridoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelprecio_costoBodegaProducto;
	public JLabel jLabelprecio_costoBodegaProducto;
	public JTextField jTextFieldprecio_costoBodegaProducto;
	public JButton jButtonprecio_costoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelprecio_promedioBodegaProducto;
	public JLabel jLabelprecio_promedioBodegaProducto;
	public JTextField jTextFieldprecio_promedioBodegaProducto;
	public JButton jButtonprecio_promedioBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ingresosBodegaProducto;
	public JLabel jLabeltotal_ingresosBodegaProducto;
	public JTextField jTextFieldtotal_ingresosBodegaProducto;
	public JButton jButtontotal_ingresosBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_egresosBodegaProducto;
	public JLabel jLabeltotal_egresosBodegaProducto;
	public JTextField jTextFieldtotal_egresosBodegaProducto;
	public JButton jButtontotal_egresosBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_provisionBodegaProducto;
	public JLabel jLabeltotal_provisionBodegaProducto;
	public JTextField jTextFieldtotal_provisionBodegaProducto;
	public JButton jButtontotal_provisionBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_procesoBodegaProducto;
	public JLabel jLabeltotal_procesoBodegaProducto;
	public JTextField jTextFieldtotal_procesoBodegaProducto;
	public JButton jButtontotal_procesoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_calculadoBodegaProducto;
	public JLabel jLabelcosto_calculadoBodegaProducto;
	public JTextField jTextFieldcosto_calculadoBodegaProducto;
	public JButton jButtoncosto_calculadoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPaneldias_produccionBodegaProducto;
	public JLabel jLabeldias_produccionBodegaProducto;
	public JTextField jTextFielddias_produccionBodegaProducto;
	public JButton jButtondias_produccionBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelprecio_reposicionBodegaProducto;
	public JLabel jLabelprecio_reposicionBodegaProducto;
	public JTextField jTextFieldprecio_reposicionBodegaProducto;
	public JButton jButtonprecio_reposicionBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimo_pedidoBodegaProducto;
	public JLabel jLabelfecha_ultimo_pedidoBodegaProducto;
	//public JFormattedTextField jDateChooserfecha_ultimo_pedidoBodegaProducto;

	public JDateChooser jDateChooserfecha_ultimo_pedidoBodegaProducto;
	public JButton jButtonfecha_ultimo_pedidoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ingresoBodegaProducto;
	public JLabel jLabelfecha_ingresoBodegaProducto;
	//public JFormattedTextField jDateChooserfecha_ingresoBodegaProducto;

	public JDateChooser jDateChooserfecha_ingresoBodegaProducto;
	public JButton jButtonfecha_ingresoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_egresoBodegaProducto;
	public JLabel jLabelfecha_egresoBodegaProducto;
	//public JFormattedTextField jDateChooserfecha_egresoBodegaProducto;

	public JDateChooser jDateChooserfecha_egresoBodegaProducto;
	public JButton jButtonfecha_egresoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_compraBodegaProducto;
	public JLabel jLabelfecha_ultima_compraBodegaProducto;
	//public JFormattedTextField jDateChooserfecha_ultima_compraBodegaProducto;

	public JDateChooser jDateChooserfecha_ultima_compraBodegaProducto;
	public JButton jButtonfecha_ultima_compraBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_ventaBodegaProducto;
	public JLabel jLabelfecha_ultima_ventaBodegaProducto;
	//public JFormattedTextField jDateChooserfecha_ultima_ventaBodegaProducto;

	public JDateChooser jDateChooserfecha_ultima_ventaBodegaProducto;
	public JButton jButtonfecha_ultima_ventaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_devolucionBodegaProducto;
	public JLabel jLabelfecha_ultima_devolucionBodegaProducto;
	//public JFormattedTextField jDateChooserfecha_ultima_devolucionBodegaProducto;

	public JDateChooser jDateChooserfecha_ultima_devolucionBodegaProducto;
	public JButton jButtonfecha_ultima_devolucionBodegaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBodegaProducto;
	public JLabel jLabelid_empresaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBodegaProducto;
	public JButton jButtonid_empresaBodegaProducto= new JButtonMe();
	public JButton jButtonid_empresaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalBodegaProducto;
	public JLabel jLabelid_sucursalBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalBodegaProducto;
	public JButton jButtonid_sucursalBodegaProducto= new JButtonMe();
	public JButton jButtonid_sucursalBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaBodegaProducto;
	public JLabel jLabelid_bodegaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBodegaProducto;
	public JButton jButtonid_bodegaBodegaProducto= new JButtonMe();
	public JButton jButtonid_bodegaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoBodegaProducto;
	public JLabel jLabelid_productoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBodegaProducto;
	public JButton jButtonid_productoBodegaProducto= new JButtonMe();
	public JButton jButtonid_productoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadBodegaProducto;
	public JLabel jLabelid_unidadBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadBodegaProducto;
	public JButton jButtonid_unidadBodegaProducto= new JButtonMe();
	public JButton jButtonid_unidadBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_unidadBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoBodegaProducto;
	public JLabel jLabelid_centro_costoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoBodegaProducto;
	public JButton jButtonid_centro_costoBodegaProducto= new JButtonMe();
	public JButton jButtonid_centro_costoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_estado_bodega_productoBodegaProducto;
	public JLabel jLabelid_estado_bodega_productoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_bodega_productoBodegaProducto;
	public JButton jButtonid_estado_bodega_productoBodegaProducto= new JButtonMe();
	public JButton jButtonid_estado_bodega_productoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_estado_bodega_productoBodegaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventarioBodegaProducto;
	public JLabel jLabelid_cuenta_contable_inventarioBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioBodegaProducto;
	public JButton jButtonid_cuenta_contable_inventarioBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_ventaBodegaProducto;
	public JLabel jLabelid_cuenta_contable_costo_ventaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_ventaBodegaProducto;
	public JButton jButtonid_cuenta_contable_costo_ventaBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaBodegaProducto;
	public JLabel jLabelid_cuenta_contable_ventaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaBodegaProducto;
	public JButton jButtonid_cuenta_contable_ventaBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_descuentoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_descuentoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoBodegaProducto;
	public JButton jButtonid_cuenta_contable_descuentoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_produccionBodegaProducto;
	public JLabel jLabelid_cuenta_contable_produccionBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_produccionBodegaProducto;
	public JButton jButtonid_cuenta_contable_produccionBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_devolucionBodegaProducto;
	public JLabel jLabelid_cuenta_contable_devolucionBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionBodegaProducto;
	public JButton jButtonid_cuenta_contable_devolucionBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ingreso_debitoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_ingreso_debitoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto;
	public JButton jButtonid_cuenta_contable_ingreso_debitoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ingreso_creditoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_ingreso_creditoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto;
	public JButton jButtonid_cuenta_contable_ingreso_creditoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_resultado_debitoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_resultado_debitoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto;
	public JButton jButtonid_cuenta_contable_resultado_debitoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_resultado_creditoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_resultado_creditoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto;
	public JButton jButtonid_cuenta_contable_resultado_creditoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBodegaProducto;
	
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
	public int iHeightFormulario=1408;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BodegaProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBodegaProducto=new JPanel();
				this.jPanelAccionesFormularioBodegaProducto=new JPanel();
				this.jmenuBarDetalleBodegaProducto=new JMenuBar();
				this.jTtoolBarDetalleBodegaProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BodegaProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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
	
	
	public JButton getjButtonActualizarToolBarBodegaProducto() {
		return this.jButtonActualizarToolBarBodegaProducto;
	}
	
	public JButton getjButtonEliminarToolBarBodegaProducto() {
		return this.jButtonEliminarToolBarBodegaProducto;
	}
	
	public JButton getjButtonCancelarToolBarBodegaProducto() {
		return this.jButtonCancelarToolBarBodegaProducto;
	}		
	
	public JButton getjButtonProcesarInformacionBodegaProducto() {
		return this.jButtonProcesarInformacionBodegaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBodegaProducto)	{
		this.jButtonProcesarInformacionBodegaProducto = jButtonProcesarInformacionBodegaProducto;
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
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBodegaProducto() {
		return this.jComboBoxTiposAccionesFormularioBodegaProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBodegaProducto(
			JComboBox jComboBoxTiposAccionesFormularioBodegaProducto) {
		this.jComboBoxTiposAccionesFormularioBodegaProducto = jComboBoxTiposAccionesFormularioBodegaProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bodegaproductoSessionBean=new BodegaProductoSessionBean();
		
		this.bodegaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bodegaproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
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
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBodegaProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBodegaProducto=new JButtonMe();
				this.jButtonModificarToolBarBodegaProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBodegaProducto,this.jTtoolBarDetalleBodegaProducto,
							"actualizar","actualizar","Actualizar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBodegaProducto,this.jTtoolBarDetalleBodegaProducto,
							"eliminar","eliminar","Eliminar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBodegaProducto,this.jTtoolBarDetalleBodegaProducto,
							"cancelar","cancelar","Cancelar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBodegaProducto,this.jTtoolBarDetalleBodegaProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBodegaProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBodegaProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBodegaProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBodegaProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBodegaProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBodegaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBodegaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBodegaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBodegaProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBodegaProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBodegaProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBodegaProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBodegaProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBodegaProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBodegaProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBodegaProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBodegaProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBodegaProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBodegaProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBodegaProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBodegaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBodegaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBodegaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBodegaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBodegaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBodegaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBodegaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBodegaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBodegaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBodegaProducto.add(this.jMenuItemDetalleCerrarBodegaProducto);
		
		this.jmenuDetalleAccionesBodegaProducto.add(this.jMenuItemActualizarBodegaProducto);
		this.jmenuDetalleAccionesBodegaProducto.add(this.jMenuItemEliminarBodegaProducto);
		this.jmenuDetalleAccionesBodegaProducto.add(this.jMenuItemCancelarBodegaProducto);		
		
		//this.jmenuDetalleDatosBodegaProducto.add(this.jMenuItemDetalleAbrirOrderByBodegaProducto);				
		this.jmenuDetalleDatosBodegaProducto.add(this.jMenuItemDetalleMostarOcultarBodegaProducto);				
				
		//this.jmenuDetalleAccionesBodegaProducto.add(this.jMenuItemGuardarCambiosBodegaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBodegaProducto.add(this.jmenuDetalleArchivoBodegaProducto);		
		this.jmenuBarDetalleBodegaProducto.add(this.jmenuDetalleAccionesBodegaProducto);		
		this.jmenuBarDetalleBodegaProducto.add(this.jmenuDetalleDatosBodegaProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBodegaProducto);				
	}
	
	
	public void inicializarElementosCamposBodegaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBodegaProducto = new JLabelMe();
		jLabelIdBodegaProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBodegaProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBodegaProducto= new GridBagLayout();

		this.jPanelidBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);

		jLabelidBodegaProducto = new JLabel();
		jLabelidBodegaProducto.setText("Id");

		jLabelidBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionBodegaProducto = new JLabelMe();
		this.jLabeldescripcionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionBodegaProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneldescripcionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextAreadescripcionBodegaProducto= new JTextAreaMe();
		jTextAreadescripcionBodegaProducto.setEnabled(false);
		jTextAreadescripcionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodegaProducto.setLineWrap(true);
		jTextAreadescripcionBodegaProducto.setWrapStyleWord(true);
		jTextAreadescripcionBodegaProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionBodegaProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionBodegaProducto = new JScrollPane(jTextAreadescripcionBodegaProducto);
		jscrollPanedescripcionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionBodegaProductoBusqueda= new JButtonMe();
		this.jButtondescripcionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionBodegaProductoBusqueda.setText("U");
		this.jButtondescripcionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_disponibleBodegaProducto = new JLabelMe();
		this.jLabelcantidad_disponibleBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CANTIDADDISPONIBLE+" : *");
		this.jLabelcantidad_disponibleBodegaProducto.setToolTipText("Cantidad Disponible");
		this.jLabelcantidad_disponibleBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_disponibleBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_disponibleBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_disponibleBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_disponibleBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcantidad_disponibleBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcantidad_disponibleBodegaProducto= new JTextFieldMe();
		jTextFieldcantidad_disponibleBodegaProducto.setEnabled(false);
		jTextFieldcantidad_disponibleBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_disponibleBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_disponibleBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_disponibleBodegaProducto.setText("0");

		jTextFieldcantidad_disponibleBodegaProducto.setEnabled(false);
		this.jButtoncantidad_disponibleBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncantidad_disponibleBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_disponibleBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_disponibleBodegaProductoBusqueda.setText("U");
		this.jButtoncantidad_disponibleBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_disponibleBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_disponibleBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_disponibleBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_disponibleBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_disponibleBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_disponibleBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelstock_maximoBodegaProducto = new JLabelMe();
		this.jLabelstock_maximoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_STOCKMAXIMO+" : *");
		this.jLabelstock_maximoBodegaProducto.setToolTipText("Stock Maximo");
		this.jLabelstock_maximoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_maximoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_maximoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstock_maximoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstock_maximoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstock_maximoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_STOCKMAXIMO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelstock_maximoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldstock_maximoBodegaProducto= new JTextFieldMe();
		jTextFieldstock_maximoBodegaProducto.setEnabled(false);
		jTextFieldstock_maximoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_maximoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_maximoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstock_maximoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstock_maximoBodegaProducto.setText("0");

		this.jButtonstock_maximoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonstock_maximoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_maximoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_maximoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstock_maximoBodegaProductoBusqueda.setText("U");
		this.jButtonstock_maximoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstock_maximoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstock_maximoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstock_maximoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstock_maximoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stock_maximoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstock_maximoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelstock_minimoBodegaProducto = new JLabelMe();
		this.jLabelstock_minimoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_STOCKMINIMO+" : *");
		this.jLabelstock_minimoBodegaProducto.setToolTipText("Stock Minimo");
		this.jLabelstock_minimoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_minimoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstock_minimoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstock_minimoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstock_minimoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstock_minimoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_STOCKMINIMO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelstock_minimoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldstock_minimoBodegaProducto= new JTextFieldMe();
		jTextFieldstock_minimoBodegaProducto.setEnabled(false);
		jTextFieldstock_minimoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_minimoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstock_minimoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstock_minimoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstock_minimoBodegaProducto.setText("0");

		this.jButtonstock_minimoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonstock_minimoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_minimoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstock_minimoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstock_minimoBodegaProductoBusqueda.setText("U");
		this.jButtonstock_minimoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstock_minimoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstock_minimoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstock_minimoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstock_minimoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stock_minimoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstock_minimoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelivaBodegaProducto = new JLabelMe();
		this.jLabelivaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaBodegaProducto.setToolTipText("Iva");
		this.jLabelivaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelivaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldivaBodegaProducto= new JTextFieldMe();
		jTextFieldivaBodegaProducto.setEnabled(false);
		jTextFieldivaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaBodegaProducto.setText("0.0");

		this.jButtonivaBodegaProductoBusqueda= new JButtonMe();
		this.jButtonivaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaBodegaProductoBusqueda.setText("U");
		this.jButtonivaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorBodegaProducto = new JLabelMe();
		this.jLabeliva_valorBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorBodegaProducto.setToolTipText("Iva Valor");
		this.jLabeliva_valorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneliva_valorBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldiva_valorBodegaProducto= new JTextFieldMe();
		jTextFieldiva_valorBodegaProducto.setEnabled(false);
		jTextFieldiva_valorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorBodegaProducto.setText("0.0");

		this.jButtoniva_valorBodegaProductoBusqueda= new JButtonMe();
		this.jButtoniva_valorBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorBodegaProductoBusqueda.setText("U");
		this.jButtoniva_valorBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoBodegaProducto = new JLabelMe();
		this.jLabeldescuentoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoBodegaProducto.setToolTipText("Descuento");
		this.jLabeldescuentoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneldescuentoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFielddescuentoBodegaProducto= new JTextFieldMe();
		jTextFielddescuentoBodegaProducto.setEnabled(false);
		jTextFielddescuentoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoBodegaProducto.setText("0.0");

		this.jButtondescuentoBodegaProductoBusqueda= new JButtonMe();
		this.jButtondescuentoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoBodegaProductoBusqueda.setText("U");
		this.jButtondescuentoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorBodegaProducto = new JLabelMe();
		this.jLabeldescuento_valorBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorBodegaProducto.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneldescuento_valorBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFielddescuento_valorBodegaProducto= new JTextFieldMe();
		jTextFielddescuento_valorBodegaProducto.setEnabled(false);
		jTextFielddescuento_valorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorBodegaProducto.setText("0.0");

		this.jButtondescuento_valorBodegaProductoBusqueda= new JButtonMe();
		this.jButtondescuento_valorBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorBodegaProductoBusqueda.setText("U");
		this.jButtondescuento_valorBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeliceBodegaProducto = new JLabelMe();
		this.jLabeliceBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceBodegaProducto.setToolTipText("Ice");
		this.jLabeliceBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneliceBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldiceBodegaProducto= new JTextFieldMe();
		jTextFieldiceBodegaProducto.setEnabled(false);
		jTextFieldiceBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceBodegaProducto.setText("0.0");

		this.jButtoniceBodegaProductoBusqueda= new JButtonMe();
		this.jButtoniceBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceBodegaProductoBusqueda.setText("U");
		this.jButtoniceBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelice_valorBodegaProducto = new JLabelMe();
		this.jLabelice_valorBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorBodegaProducto.setToolTipText("Ice Valor");
		this.jLabelice_valorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelice_valorBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldice_valorBodegaProducto= new JTextFieldMe();
		jTextFieldice_valorBodegaProducto.setEnabled(false);
		jTextFieldice_valorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorBodegaProducto.setText("0.0");

		this.jButtonice_valorBodegaProductoBusqueda= new JButtonMe();
		this.jButtonice_valorBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorBodegaProductoBusqueda.setText("U");
		this.jButtonice_valorBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_promedioBodegaProducto = new JLabelMe();
		this.jLabelcosto_promedioBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_COSTOPROMEDIO+" : *");
		this.jLabelcosto_promedioBodegaProducto.setToolTipText("Costo Promedio");
		this.jLabelcosto_promedioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_promedioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_promedioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_promedioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_promedioBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_promedioBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_COSTOPROMEDIO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcosto_promedioBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcosto_promedioBodegaProducto= new JTextFieldMe();
		jTextFieldcosto_promedioBodegaProducto.setEnabled(false);
		jTextFieldcosto_promedioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_promedioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_promedioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_promedioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_promedioBodegaProducto.setText("0.0");

		jTextFieldcosto_promedioBodegaProducto.setEnabled(false);
		this.jButtoncosto_promedioBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncosto_promedioBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_promedioBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_promedioBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_promedioBodegaProductoBusqueda.setText("U");
		this.jButtoncosto_promedioBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_promedioBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_promedioBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_promedioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_promedioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_promedioBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_promedioBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_comisionBodegaProducto = new JLabelMe();
		this.jLabelporcentaje_comisionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_PORCENTAJECOMISION+" : *");
		this.jLabelporcentaje_comisionBodegaProducto.setToolTipText("Porcentaje Comision");
		this.jLabelporcentaje_comisionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_comisionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_comisionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_comisionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_comisionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_comisionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_PORCENTAJECOMISION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelporcentaje_comisionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldporcentaje_comisionBodegaProducto= new JTextFieldMe();
		jTextFieldporcentaje_comisionBodegaProducto.setEnabled(false);
		jTextFieldporcentaje_comisionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_comisionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_comisionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_comisionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_comisionBodegaProducto.setText("0.0");

		this.jButtonporcentaje_comisionBodegaProductoBusqueda= new JButtonMe();
		this.jButtonporcentaje_comisionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_comisionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_comisionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_comisionBodegaProductoBusqueda.setText("U");
		this.jButtonporcentaje_comisionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_comisionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_comisionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_comisionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_comisionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_comisionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_comisionBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelprecioBodegaProducto = new JLabelMe();
		this.jLabelprecioBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioBodegaProducto.setToolTipText("Precio");
		this.jLabelprecioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelprecioBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldprecioBodegaProducto= new JTextFieldMe();
		jTextFieldprecioBodegaProducto.setEnabled(false);
		jTextFieldprecioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioBodegaProducto.setText("0.0");

		this.jButtonprecioBodegaProductoBusqueda= new JButtonMe();
		this.jButtonprecioBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioBodegaProductoBusqueda.setText("U");
		this.jButtonprecioBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoBodegaProducto = new JLabelMe();
		this.jLabelultimo_costoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoBodegaProducto.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelultimo_costoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldultimo_costoBodegaProducto= new JTextFieldMe();
		jTextFieldultimo_costoBodegaProducto.setEnabled(false);
		jTextFieldultimo_costoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoBodegaProducto.setText("0.0");

		jTextFieldultimo_costoBodegaProducto.setEnabled(false);
		this.jButtonultimo_costoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonultimo_costoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoBodegaProductoBusqueda.setText("U");
		this.jButtonultimo_costoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcostoBodegaProducto = new JLabelMe();
		this.jLabelcostoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoBodegaProducto.setToolTipText("Costo");
		this.jLabelcostoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcostoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcostoBodegaProducto= new JTextFieldMe();
		jTextFieldcostoBodegaProducto.setEnabled(false);
		jTextFieldcostoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoBodegaProducto.setText("0.0");

		this.jButtoncostoBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncostoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoBodegaProductoBusqueda.setText("U");
		this.jButtoncostoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelarancel_porcentajeBodegaProducto = new JLabelMe();
		this.jLabelarancel_porcentajeBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_ARANCELPORCENTAJE+" : *");
		this.jLabelarancel_porcentajeBodegaProducto.setToolTipText("Arancel Porcentaje");
		this.jLabelarancel_porcentajeBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelarancel_porcentajeBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelarancel_porcentajeBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelarancel_porcentajeBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarancel_porcentajeBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarancel_porcentajeBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ARANCELPORCENTAJE);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelarancel_porcentajeBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldarancel_porcentajeBodegaProducto= new JTextFieldMe();
		jTextFieldarancel_porcentajeBodegaProducto.setEnabled(false);
		jTextFieldarancel_porcentajeBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarancel_porcentajeBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldarancel_porcentajeBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldarancel_porcentajeBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldarancel_porcentajeBodegaProducto.setText("0.0");

		this.jButtonarancel_porcentajeBodegaProductoBusqueda= new JButtonMe();
		this.jButtonarancel_porcentajeBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarancel_porcentajeBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarancel_porcentajeBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarancel_porcentajeBodegaProductoBusqueda.setText("U");
		this.jButtonarancel_porcentajeBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarancel_porcentajeBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarancel_porcentajeBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldarancel_porcentajeBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldarancel_porcentajeBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"arancel_porcentajeBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarancel_porcentajeBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelice_porcentajeBodegaProducto = new JLabelMe();
		this.jLabelice_porcentajeBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_ICEPORCENTAJE+" : *");
		this.jLabelice_porcentajeBodegaProducto.setToolTipText("Ice Porcentaje");
		this.jLabelice_porcentajeBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_porcentajeBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_porcentajeBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_porcentajeBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_porcentajeBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_porcentajeBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ICEPORCENTAJE);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelice_porcentajeBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldice_porcentajeBodegaProducto= new JTextFieldMe();
		jTextFieldice_porcentajeBodegaProducto.setEnabled(false);
		jTextFieldice_porcentajeBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_porcentajeBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_porcentajeBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_porcentajeBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_porcentajeBodegaProducto.setText("0.0");

		this.jButtonice_porcentajeBodegaProductoBusqueda= new JButtonMe();
		this.jButtonice_porcentajeBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_porcentajeBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_porcentajeBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_porcentajeBodegaProductoBusqueda.setText("U");
		this.jButtonice_porcentajeBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_porcentajeBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_porcentajeBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_porcentajeBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_porcentajeBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_porcentajeBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_porcentajeBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelpesoBodegaProducto = new JLabelMe();
		this.jLabelpesoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_PESO+" : *");
		this.jLabelpesoBodegaProducto.setToolTipText("Peso");
		this.jLabelpesoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpesoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpesoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpesoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpesoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpesoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_PESO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelpesoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldpesoBodegaProducto= new JTextFieldMe();
		jTextFieldpesoBodegaProducto.setEnabled(false);
		jTextFieldpesoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpesoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpesoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpesoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpesoBodegaProducto.setText("0.0");

		this.jButtonpesoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonpesoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpesoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpesoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpesoBodegaProductoBusqueda.setText("U");
		this.jButtonpesoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpesoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpesoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpesoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpesoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pesoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpesoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_ivaBodegaProducto = new JLabelMe();
		this.jLabelcon_ivaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CONIVA+" : *");
		this.jLabelcon_ivaBodegaProducto.setToolTipText("Con Iva");
		this.jLabelcon_ivaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_ivaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_ivaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_ivaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_ivaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_ivaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CONIVA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcon_ivaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jCheckBoxcon_ivaBodegaProducto= new JCheckBoxMe();
		jCheckBoxcon_ivaBodegaProducto.setEnabled(false);

		jCheckBoxcon_ivaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_ivaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_ivaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_ivaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_ivaBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncon_ivaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_ivaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_ivaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_ivaBodegaProductoBusqueda.setText("U");
		this.jButtoncon_ivaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_ivaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_ivaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_ivaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_ivaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_ivaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_ivaBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_impuestoBodegaProducto = new JLabelMe();
		this.jLabelcon_impuestoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CONIMPUESTO+" : *");
		this.jLabelcon_impuestoBodegaProducto.setToolTipText("Con Impuesto");
		this.jLabelcon_impuestoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impuestoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impuestoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_impuestoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_impuestoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_impuestoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CONIMPUESTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcon_impuestoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jCheckBoxcon_impuestoBodegaProducto= new JCheckBoxMe();
		jCheckBoxcon_impuestoBodegaProducto.setEnabled(false);

		jCheckBoxcon_impuestoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impuestoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impuestoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_impuestoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_impuestoBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncon_impuestoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impuestoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impuestoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_impuestoBodegaProductoBusqueda.setText("U");
		this.jButtoncon_impuestoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_impuestoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_impuestoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_impuestoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_impuestoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_impuestoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_impuestoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_iceBodegaProducto = new JLabelMe();
		this.jLabelcon_iceBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CONICE+" : *");
		this.jLabelcon_iceBodegaProducto.setToolTipText("Con Ice");
		this.jLabelcon_iceBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_iceBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_iceBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_iceBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_iceBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_iceBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CONICE);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcon_iceBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jCheckBoxcon_iceBodegaProducto= new JCheckBoxMe();
		jCheckBoxcon_iceBodegaProducto.setEnabled(false);

		jCheckBoxcon_iceBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iceBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iceBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_iceBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_iceBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncon_iceBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iceBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iceBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_iceBodegaProductoBusqueda.setText("U");
		this.jButtoncon_iceBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_iceBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_iceBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_iceBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_iceBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_iceBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_iceBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoBodegaProducto = new JLabelMe();
		this.jLabelesta_activoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoBodegaProducto.setToolTipText("Esta Activo");
		this.jLabelesta_activoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelesta_activoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jCheckBoxesta_activoBodegaProducto= new JCheckBoxMe();
		jCheckBoxesta_activoBodegaProducto.setEnabled(false);

		jCheckBoxesta_activoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonesta_activoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoBodegaProductoBusqueda.setText("U");
		this.jButtonesta_activoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcon_balanzaBodegaProducto = new JLabelMe();
		this.jLabelcon_balanzaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CONBALANZA+" : *");
		this.jLabelcon_balanzaBodegaProducto.setToolTipText("Con Balanza");
		this.jLabelcon_balanzaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_balanzaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_balanzaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_balanzaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_balanzaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_balanzaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CONBALANZA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcon_balanzaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jCheckBoxcon_balanzaBodegaProducto= new JCheckBoxMe();
		jCheckBoxcon_balanzaBodegaProducto.setEnabled(false);

		jCheckBoxcon_balanzaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_balanzaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_balanzaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_balanzaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_balanzaBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncon_balanzaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_balanzaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_balanzaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_balanzaBodegaProductoBusqueda.setText("U");
		this.jButtoncon_balanzaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_balanzaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_balanzaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_balanzaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_balanzaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_balanzaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_balanzaBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pedidaBodegaProducto = new JLabelMe();
		this.jLabelcantidad_pedidaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CANTIDADPEDIDA+" : *");
		this.jLabelcantidad_pedidaBodegaProducto.setToolTipText("Cantidad Pedida");
		this.jLabelcantidad_pedidaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pedidaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pedidaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pedidaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pedidaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pedidaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CANTIDADPEDIDA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcantidad_pedidaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcantidad_pedidaBodegaProducto= new JTextFieldMe();
		jTextFieldcantidad_pedidaBodegaProducto.setEnabled(false);
		jTextFieldcantidad_pedidaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pedidaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pedidaBodegaProducto.setText("0");

		jTextFieldcantidad_pedidaBodegaProducto.setEnabled(false);
		this.jButtoncantidad_pedidaBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncantidad_pedidaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pedidaBodegaProductoBusqueda.setText("U");
		this.jButtoncantidad_pedidaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pedidaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pedidaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pedidaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pedidaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pedidaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pedidaBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_fisicaBodegaProducto = new JLabelMe();
		this.jLabelcantidad_fisicaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CANTIDADFISICA+" : *");
		this.jLabelcantidad_fisicaBodegaProducto.setToolTipText("Cantidad Fisica");
		this.jLabelcantidad_fisicaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_fisicaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_fisicaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_fisicaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_fisicaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CANTIDADFISICA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcantidad_fisicaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcantidad_fisicaBodegaProducto= new JTextFieldMe();
		jTextFieldcantidad_fisicaBodegaProducto.setEnabled(false);
		jTextFieldcantidad_fisicaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_fisicaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_fisicaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_fisicaBodegaProducto.setText("0");

		this.jButtoncantidad_fisicaBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncantidad_fisicaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_fisicaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_fisicaBodegaProductoBusqueda.setText("U");
		this.jButtoncantidad_fisicaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_fisicaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_fisicaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_fisicaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_fisicaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_fisicaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_fisicaBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_requeridoBodegaProducto = new JLabelMe();
		this.jLabelcantidad_requeridoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_CANTIDADREQUERIDO+" : *");
		this.jLabelcantidad_requeridoBodegaProducto.setToolTipText("Cantidad Requerido");
		this.jLabelcantidad_requeridoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_requeridoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_requeridoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_requeridoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_requeridoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_requeridoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_CANTIDADREQUERIDO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcantidad_requeridoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcantidad_requeridoBodegaProducto= new JTextFieldMe();
		jTextFieldcantidad_requeridoBodegaProducto.setEnabled(false);
		jTextFieldcantidad_requeridoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_requeridoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_requeridoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_requeridoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_requeridoBodegaProducto.setText("0");

		jTextFieldcantidad_requeridoBodegaProducto.setEnabled(false);
		this.jButtoncantidad_requeridoBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncantidad_requeridoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_requeridoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_requeridoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_requeridoBodegaProductoBusqueda.setText("U");
		this.jButtoncantidad_requeridoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_requeridoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_requeridoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_requeridoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_requeridoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_requeridoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_requeridoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelprecio_costoBodegaProducto = new JLabelMe();
		this.jLabelprecio_costoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_PRECIOCOSTO+" : *");
		this.jLabelprecio_costoBodegaProducto.setToolTipText("Precio Costo");
		this.jLabelprecio_costoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_costoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecio_costoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_costoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_costoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_costoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_PRECIOCOSTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelprecio_costoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldprecio_costoBodegaProducto= new JTextFieldMe();
		jTextFieldprecio_costoBodegaProducto.setEnabled(false);
		jTextFieldprecio_costoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_costoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_costoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_costoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_costoBodegaProducto.setText("0.0");

		this.jButtonprecio_costoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonprecio_costoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_costoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_costoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_costoBodegaProductoBusqueda.setText("U");
		this.jButtonprecio_costoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_costoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_costoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_costoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_costoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_costoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_costoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelprecio_promedioBodegaProducto = new JLabelMe();
		this.jLabelprecio_promedioBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_PRECIOPROMEDIO+" : *");
		this.jLabelprecio_promedioBodegaProducto.setToolTipText("Precio Promedio");
		this.jLabelprecio_promedioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelprecio_promedioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelprecio_promedioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_promedioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_promedioBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_promedioBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_PRECIOPROMEDIO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelprecio_promedioBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldprecio_promedioBodegaProducto= new JTextFieldMe();
		jTextFieldprecio_promedioBodegaProducto.setEnabled(false);
		jTextFieldprecio_promedioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_promedioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_promedioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_promedioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_promedioBodegaProducto.setText("0.0");

		jTextFieldprecio_promedioBodegaProducto.setEnabled(false);
		this.jButtonprecio_promedioBodegaProductoBusqueda= new JButtonMe();
		this.jButtonprecio_promedioBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_promedioBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_promedioBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_promedioBodegaProductoBusqueda.setText("U");
		this.jButtonprecio_promedioBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_promedioBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_promedioBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_promedioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_promedioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_promedioBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_promedioBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ingresosBodegaProducto = new JLabelMe();
		this.jLabeltotal_ingresosBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_TOTALINGRESOS+" : *");
		this.jLabeltotal_ingresosBodegaProducto.setToolTipText("Total Ingresos");
		this.jLabeltotal_ingresosBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ingresosBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ingresosBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ingresosBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ingresosBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ingresosBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_TOTALINGRESOS);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneltotal_ingresosBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldtotal_ingresosBodegaProducto= new JTextFieldMe();
		jTextFieldtotal_ingresosBodegaProducto.setEnabled(false);
		jTextFieldtotal_ingresosBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingresosBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingresosBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ingresosBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ingresosBodegaProducto.setText("0");

		jTextFieldtotal_ingresosBodegaProducto.setEnabled(false);
		this.jButtontotal_ingresosBodegaProductoBusqueda= new JButtonMe();
		this.jButtontotal_ingresosBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingresosBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingresosBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ingresosBodegaProductoBusqueda.setText("U");
		this.jButtontotal_ingresosBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ingresosBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ingresosBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ingresosBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ingresosBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ingresosBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ingresosBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_egresosBodegaProducto = new JLabelMe();
		this.jLabeltotal_egresosBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_TOTALEGRESOS+" : *");
		this.jLabeltotal_egresosBodegaProducto.setToolTipText("Total Egresos");
		this.jLabeltotal_egresosBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_egresosBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_egresosBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_egresosBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_egresosBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_egresosBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_TOTALEGRESOS);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneltotal_egresosBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldtotal_egresosBodegaProducto= new JTextFieldMe();
		jTextFieldtotal_egresosBodegaProducto.setEnabled(false);
		jTextFieldtotal_egresosBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_egresosBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_egresosBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_egresosBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_egresosBodegaProducto.setText("0");

		jTextFieldtotal_egresosBodegaProducto.setEnabled(false);
		this.jButtontotal_egresosBodegaProductoBusqueda= new JButtonMe();
		this.jButtontotal_egresosBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_egresosBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_egresosBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_egresosBodegaProductoBusqueda.setText("U");
		this.jButtontotal_egresosBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_egresosBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_egresosBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_egresosBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_egresosBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_egresosBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_egresosBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_provisionBodegaProducto = new JLabelMe();
		this.jLabeltotal_provisionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_TOTALPROVISION+" : *");
		this.jLabeltotal_provisionBodegaProducto.setToolTipText("Total Provision");
		this.jLabeltotal_provisionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_provisionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_provisionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_provisionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_provisionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_provisionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_TOTALPROVISION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneltotal_provisionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldtotal_provisionBodegaProducto= new JTextFieldMe();
		jTextFieldtotal_provisionBodegaProducto.setEnabled(false);
		jTextFieldtotal_provisionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_provisionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_provisionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_provisionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_provisionBodegaProducto.setText("0.0");

		jTextFieldtotal_provisionBodegaProducto.setEnabled(false);
		this.jButtontotal_provisionBodegaProductoBusqueda= new JButtonMe();
		this.jButtontotal_provisionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_provisionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_provisionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_provisionBodegaProductoBusqueda.setText("U");
		this.jButtontotal_provisionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_provisionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_provisionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_provisionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_provisionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_provisionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_provisionBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_procesoBodegaProducto = new JLabelMe();
		this.jLabeltotal_procesoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_TOTALPROCESO+" : *");
		this.jLabeltotal_procesoBodegaProducto.setToolTipText("Total Proceso");
		this.jLabeltotal_procesoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_procesoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_procesoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_procesoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_procesoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_procesoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_TOTALPROCESO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneltotal_procesoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldtotal_procesoBodegaProducto= new JTextFieldMe();
		jTextFieldtotal_procesoBodegaProducto.setEnabled(false);
		jTextFieldtotal_procesoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_procesoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_procesoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_procesoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_procesoBodegaProducto.setText("0.0");

		this.jButtontotal_procesoBodegaProductoBusqueda= new JButtonMe();
		this.jButtontotal_procesoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_procesoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_procesoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_procesoBodegaProductoBusqueda.setText("U");
		this.jButtontotal_procesoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_procesoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_procesoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_procesoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_procesoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_procesoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_procesoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_calculadoBodegaProducto = new JLabelMe();
		this.jLabelcosto_calculadoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_COSTOCALCULADO+" : *");
		this.jLabelcosto_calculadoBodegaProducto.setToolTipText("Costo Calculado");
		this.jLabelcosto_calculadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_calculadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_calculadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_calculadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_calculadoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_calculadoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_COSTOCALCULADO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelcosto_calculadoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldcosto_calculadoBodegaProducto= new JTextFieldMe();
		jTextFieldcosto_calculadoBodegaProducto.setEnabled(false);
		jTextFieldcosto_calculadoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_calculadoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_calculadoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_calculadoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_calculadoBodegaProducto.setText("0.0");

		jTextFieldcosto_calculadoBodegaProducto.setEnabled(false);
		this.jButtoncosto_calculadoBodegaProductoBusqueda= new JButtonMe();
		this.jButtoncosto_calculadoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_calculadoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_calculadoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_calculadoBodegaProductoBusqueda.setText("U");
		this.jButtoncosto_calculadoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_calculadoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_calculadoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_calculadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_calculadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_calculadoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_calculadoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabeldias_produccionBodegaProducto = new JLabelMe();
		this.jLabeldias_produccionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_DIASPRODUCCION+" : *");
		this.jLabeldias_produccionBodegaProducto.setToolTipText("Dias Produccion");
		this.jLabeldias_produccionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_produccionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_produccionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_produccionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_produccionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_produccionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_DIASPRODUCCION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPaneldias_produccionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFielddias_produccionBodegaProducto= new JTextFieldMe();
		jTextFielddias_produccionBodegaProducto.setEnabled(false);
		jTextFielddias_produccionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_produccionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_produccionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_produccionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_produccionBodegaProducto.setText("0.0");

		this.jButtondias_produccionBodegaProductoBusqueda= new JButtonMe();
		this.jButtondias_produccionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_produccionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_produccionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_produccionBodegaProductoBusqueda.setText("U");
		this.jButtondias_produccionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_produccionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_produccionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_produccionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_produccionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_produccionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_produccionBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelprecio_reposicionBodegaProducto = new JLabelMe();
		this.jLabelprecio_reposicionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_PRECIOREPOSICION+" : *");
		this.jLabelprecio_reposicionBodegaProducto.setToolTipText("Precio Reposicion");
		this.jLabelprecio_reposicionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelprecio_reposicionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelprecio_reposicionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_reposicionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_reposicionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_reposicionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_PRECIOREPOSICION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelprecio_reposicionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jTextFieldprecio_reposicionBodegaProducto= new JTextFieldMe();
		jTextFieldprecio_reposicionBodegaProducto.setEnabled(false);
		jTextFieldprecio_reposicionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_reposicionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_reposicionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_reposicionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_reposicionBodegaProducto.setText("0.0");

		this.jButtonprecio_reposicionBodegaProductoBusqueda= new JButtonMe();
		this.jButtonprecio_reposicionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_reposicionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_reposicionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_reposicionBodegaProductoBusqueda.setText("U");
		this.jButtonprecio_reposicionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_reposicionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_reposicionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_reposicionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_reposicionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_reposicionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_reposicionBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimo_pedidoBodegaProducto = new JLabelMe();
		this.jLabelfecha_ultimo_pedidoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_FECHAULTIMOPEDIDO+" : *");
		this.jLabelfecha_ultimo_pedidoBodegaProducto.setToolTipText("Fecha Ultimo Pedido");
		this.jLabelfecha_ultimo_pedidoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultimo_pedidoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultimo_pedidoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimo_pedidoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimo_pedidoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimo_pedidoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_FECHAULTIMOPEDIDO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelfecha_ultimo_pedidoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		//jFormattedTextFieldfecha_ultimo_pedidoBodegaProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimo_pedidoBodegaProducto= new JDateChooser();
		jDateChooserfecha_ultimo_pedidoBodegaProducto.setEnabled(false);
		jDateChooserfecha_ultimo_pedidoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_pedidoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_pedidoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimo_pedidoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimo_pedidoBodegaProducto.setDate(new Date());
		jDateChooserfecha_ultimo_pedidoBodegaProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_pedidoBodegaProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setText("U");
		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimo_pedidoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimo_pedidoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_pedidoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimo_pedidoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ingresoBodegaProducto = new JLabelMe();
		this.jLabelfecha_ingresoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_FECHAINGRESO+" : *");
		this.jLabelfecha_ingresoBodegaProducto.setToolTipText("Fecha Ingreso");
		this.jLabelfecha_ingresoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ingresoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ingresoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ingresoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ingresoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_FECHAINGRESO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelfecha_ingresoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		//jFormattedTextFieldfecha_ingresoBodegaProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_ingresoBodegaProducto= new JDateChooser();
		jDateChooserfecha_ingresoBodegaProducto.setEnabled(false);
		jDateChooserfecha_ingresoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ingresoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ingresoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ingresoBodegaProducto.setDate(new Date());
		jDateChooserfecha_ingresoBodegaProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ingresoBodegaProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ingresoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonfecha_ingresoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ingresoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ingresoBodegaProductoBusqueda.setText("U");
		this.jButtonfecha_ingresoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ingresoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ingresoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ingresoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ingresoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ingresoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ingresoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_egresoBodegaProducto = new JLabelMe();
		this.jLabelfecha_egresoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_FECHAEGRESO+" : *");
		this.jLabelfecha_egresoBodegaProducto.setToolTipText("Fecha Egreso");
		this.jLabelfecha_egresoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_egresoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_egresoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_egresoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_egresoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_egresoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_FECHAEGRESO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelfecha_egresoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		//jFormattedTextFieldfecha_egresoBodegaProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_egresoBodegaProducto= new JDateChooser();
		jDateChooserfecha_egresoBodegaProducto.setEnabled(false);
		jDateChooserfecha_egresoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_egresoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_egresoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_egresoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_egresoBodegaProducto.setDate(new Date());
		jDateChooserfecha_egresoBodegaProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_egresoBodegaProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_egresoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonfecha_egresoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_egresoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_egresoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_egresoBodegaProductoBusqueda.setText("U");
		this.jButtonfecha_egresoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_egresoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_egresoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_egresoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_egresoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_egresoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_egresoBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_compraBodegaProducto = new JLabelMe();
		this.jLabelfecha_ultima_compraBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_FECHAULTIMACOMPRA+" : *");
		this.jLabelfecha_ultima_compraBodegaProducto.setToolTipText("Fecha Ultima Compra");
		this.jLabelfecha_ultima_compraBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_compraBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_compraBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_compraBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_compraBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_compraBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_FECHAULTIMACOMPRA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelfecha_ultima_compraBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		//jFormattedTextFieldfecha_ultima_compraBodegaProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_compraBodegaProducto= new JDateChooser();
		jDateChooserfecha_ultima_compraBodegaProducto.setEnabled(false);
		jDateChooserfecha_ultima_compraBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_compraBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_compraBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_compraBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_compraBodegaProducto.setDate(new Date());
		jDateChooserfecha_ultima_compraBodegaProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_compraBodegaProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_compraBodegaProductoBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setText("U");
		this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_compraBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_compraBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_compraBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_compraBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_compraBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_ventaBodegaProducto = new JLabelMe();
		this.jLabelfecha_ultima_ventaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_FECHAULTIMAVENTA+" : *");
		this.jLabelfecha_ultima_ventaBodegaProducto.setToolTipText("Fecha Ultima Venta");
		this.jLabelfecha_ultima_ventaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_ventaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_ventaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_ventaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_FECHAULTIMAVENTA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelfecha_ultima_ventaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		//jFormattedTextFieldfecha_ultima_ventaBodegaProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_ventaBodegaProducto= new JDateChooser();
		jDateChooserfecha_ultima_ventaBodegaProducto.setEnabled(false);
		jDateChooserfecha_ultima_ventaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_ventaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_ventaBodegaProducto.setDate(new Date());
		jDateChooserfecha_ultima_ventaBodegaProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_ventaBodegaProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setText("U");
		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_ventaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_ventaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_ventaBodegaProductoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_devolucionBodegaProducto = new JLabelMe();
		this.jLabelfecha_ultima_devolucionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_FECHAULTIMADEVOLUCION+" : *");
		this.jLabelfecha_ultima_devolucionBodegaProducto.setToolTipText("Fecha Ultima Devolucion");
		this.jLabelfecha_ultima_devolucionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_devolucionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_devolucionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_devolucionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_devolucionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_devolucionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_FECHAULTIMADEVOLUCION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelfecha_ultima_devolucionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		//jFormattedTextFieldfecha_ultima_devolucionBodegaProducto= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_devolucionBodegaProducto= new JDateChooser();
		jDateChooserfecha_ultima_devolucionBodegaProducto.setEnabled(false);
		jDateChooserfecha_ultima_devolucionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_devolucionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_devolucionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_devolucionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_devolucionBodegaProducto.setDate(new Date());
		jDateChooserfecha_ultima_devolucionBodegaProducto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_devolucionBodegaProducto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setText("U");
		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_devolucionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_devolucionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_devolucionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_devolucionBodegaProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBodegaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBodegaProducto = new JLabelMe();
		this.jLabelid_empresaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBodegaProducto.setToolTipText("Empresa");
		this.jLabelid_empresaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_empresaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_empresaBodegaProducto= new JComboBoxMe();
		jComboBoxid_empresaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBodegaProducto.setEnabled(false);

		this.jButtonid_empresaBodegaProducto= new JButtonMe();
		this.jButtonid_empresaBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodegaProducto.setText("Buscar");
		this.jButtonid_empresaBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaProducto"));

		this.jButtonid_empresaBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBodegaProductoBusqueda.setText("U");
		this.jButtonid_empresaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_empresaBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBodegaProductoUpdate.setText("U");
		this.jButtonid_empresaBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaProductoUpdate"));



					
		this.jLabelid_sucursalBodegaProducto = new JLabelMe();
		this.jLabelid_sucursalBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalBodegaProducto.setToolTipText("Sucursal");
		this.jLabelid_sucursalBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_sucursalBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_sucursalBodegaProducto= new JComboBoxMe();
		jComboBoxid_sucursalBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalBodegaProducto.setEnabled(false);

		this.jButtonid_sucursalBodegaProducto= new JButtonMe();
		this.jButtonid_sucursalBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalBodegaProducto.setText("Buscar");
		this.jButtonid_sucursalBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBodegaProducto"));

		this.jButtonid_sucursalBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_sucursalBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBodegaProductoBusqueda.setText("U");
		this.jButtonid_sucursalBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_sucursalBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalBodegaProductoUpdate.setText("U");
		this.jButtonid_sucursalBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalBodegaProductoUpdate"));



					
		this.jLabelid_bodegaBodegaProducto = new JLabelMe();
		this.jLabelid_bodegaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaBodegaProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_bodegaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_bodegaBodegaProducto= new JComboBoxMe();
		jComboBoxid_bodegaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaBodegaProducto= new JButtonMe();
		this.jButtonid_bodegaBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaBodegaProducto.setText("Buscar");
		this.jButtonid_bodegaBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaBodegaProducto"));

		this.jButtonid_bodegaBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaBodegaProductoBusqueda.setText("U");
		this.jButtonid_bodegaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaBodegaProductoUpdate.setText("U");
		this.jButtonid_bodegaBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaBodegaProductoUpdate"));



					
		this.jLabelid_productoBodegaProducto = new JLabelMe();
		this.jLabelid_productoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoBodegaProducto.setToolTipText("Producto");
		this.jLabelid_productoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_productoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_productoBodegaProducto= new JComboBoxMe();
		jComboBoxid_productoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoBodegaProducto= new JButtonMe();
		this.jButtonid_productoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoBodegaProducto.setText("Buscar");
		this.jButtonid_productoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoBodegaProducto"));

		this.jButtonid_productoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_productoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoBodegaProductoBusqueda.setText("U");
		this.jButtonid_productoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_productoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_productoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoBodegaProductoUpdate.setText("U");
		this.jButtonid_productoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoBodegaProductoUpdate"));



					
		this.jLabelid_unidadBodegaProducto = new JLabelMe();
		this.jLabelid_unidadBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadBodegaProducto.setToolTipText("Unidad");
		this.jLabelid_unidadBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_unidadBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_unidadBodegaProducto= new JComboBoxMe();
		jComboBoxid_unidadBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadBodegaProducto= new JButtonMe();
		this.jButtonid_unidadBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadBodegaProducto.setText("Buscar");
		this.jButtonid_unidadBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadBodegaProducto"));

		this.jButtonid_unidadBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_unidadBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadBodegaProductoBusqueda.setText("U");
		this.jButtonid_unidadBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_unidadBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_unidadBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadBodegaProductoUpdate.setText("U");
		this.jButtonid_unidadBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadBodegaProductoUpdate"));



					
		this.jLabelid_centro_costoBodegaProducto = new JLabelMe();
		this.jLabelid_centro_costoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoBodegaProducto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_centro_costoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_centro_costoBodegaProducto= new JComboBoxMe();
		jComboBoxid_centro_costoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoBodegaProducto= new JButtonMe();
		this.jButtonid_centro_costoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoBodegaProducto.setText("Buscar");
		this.jButtonid_centro_costoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaProducto"));

		this.jButtonid_centro_costoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoBodegaProductoBusqueda.setText("U");
		this.jButtonid_centro_costoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_centro_costoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoBodegaProductoUpdate.setText("U");
		this.jButtonid_centro_costoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaProductoUpdate"));


		jButtonid_centro_costoBodegaProductoArbol= new JButtonMe();
		jButtonid_centro_costoBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoBodegaProductoArbol.setText("Arbol");
		jButtonid_centro_costoBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaProductoArbol"));



					
		this.jLabelid_estado_bodega_productoBodegaProducto = new JLabelMe();
		this.jLabelid_estado_bodega_productoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDESTADOBODEGAPRODUCTO+" : *");
		this.jLabelid_estado_bodega_productoBodegaProducto.setToolTipText("Estado Bodega Producto");
		this.jLabelid_estado_bodega_productoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_bodega_productoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_bodega_productoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_bodega_productoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_bodega_productoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_bodega_productoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDESTADOBODEGAPRODUCTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_estado_bodega_productoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_estado_bodega_productoBodegaProducto= new JComboBoxMe();
		jComboBoxid_estado_bodega_productoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_bodega_productoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_bodega_productoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_bodega_productoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_bodega_productoBodegaProducto= new JButtonMe();
		this.jButtonid_estado_bodega_productoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_bodega_productoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_bodega_productoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_bodega_productoBodegaProducto.setText("Buscar");
		this.jButtonid_estado_bodega_productoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_bodega_productoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_bodega_productoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_bodega_productoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_bodega_productoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_bodega_productoBodegaProducto"));

		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setText("U");
		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_bodega_productoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_bodega_productoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_bodega_productoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_bodega_productoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_bodega_productoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_estado_bodega_productoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_estado_bodega_productoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_bodega_productoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_bodega_productoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_bodega_productoBodegaProductoUpdate.setText("U");
		this.jButtonid_estado_bodega_productoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_bodega_productoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_bodega_productoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_bodega_productoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_bodega_productoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_bodega_productoBodegaProductoUpdate"));



					
		this.jLabelid_cuenta_contable_inventarioBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_inventarioBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO+" : *");
		this.jLabelid_cuenta_contable_inventarioBodegaProducto.setToolTipText("Cuenta C. Inventario");
		this.jLabelid_cuenta_contable_inventarioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventarioBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventarioBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventarioBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_inventarioBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventarioBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_inventarioBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventarioBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaProducto"));

		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaProductoUpdate"));


		jButtonid_cuenta_contable_inventarioBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventarioBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventarioBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventarioBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_costo_ventaBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_ventaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA+" : *");
		this.jLabelid_cuenta_contable_costo_ventaBodegaProducto.setToolTipText("Cuenta C. Costo Venta");
		this.jLabelid_cuenta_contable_costo_ventaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_ventaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_ventaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_ventaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_ventaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_ventaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_ventaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_ventaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_ventaBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaBodegaProducto"));

		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaBodegaProductoUpdate"));


		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_ventaBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaBodegaProducto.setToolTipText("Cuenta C. Venta");
		this.jLabelid_cuenta_contable_ventaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_ventaBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaProducto"));

		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaProductoUpdate"));


		jButtonid_cuenta_contable_ventaBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_descuentoBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_descuentoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO+" : *");
		this.jLabelid_cuenta_contable_descuentoBodegaProducto.setToolTipText("Cuenta C. Descuento");
		this.jLabelid_cuenta_contable_descuentoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_descuentoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_descuentoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_descuentoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_descuentoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_descuentoBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_descuentoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_descuentoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaProducto"));

		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaProductoUpdate"));


		jButtonid_cuenta_contable_descuentoBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_descuentoBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_descuentoBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_descuentoBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_produccionBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_produccionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION+" : *");
		this.jLabelid_cuenta_contable_produccionBodegaProducto.setToolTipText("Cuenta C. Produccion");
		this.jLabelid_cuenta_contable_produccionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_produccionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_produccionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_produccionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_produccionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_produccionBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_produccionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_produccionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_produccionBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_produccionBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_produccionBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaProducto"));

		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_produccionBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaProductoUpdate"));


		jButtonid_cuenta_contable_produccionBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_produccionBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_produccionBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_produccionBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_devolucionBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_devolucionBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION+" : *");
		this.jLabelid_cuenta_contable_devolucionBodegaProducto.setToolTipText("Cuenta C. Devolucion");
		this.jLabelid_cuenta_contable_devolucionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_devolucionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_devolucionBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_devolucionBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_devolucionBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_devolucionBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_devolucionBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_devolucionBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaProducto"));

		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaProductoUpdate"));


		jButtonid_cuenta_contable_devolucionBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_devolucionBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_devolucionBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_devolucionBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_ingreso_debitoBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_ingreso_debitoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESODEBITO+" : *");
		this.jLabelid_cuenta_contable_ingreso_debitoBodegaProducto.setToolTipText("Cuenta C. Ingreso Debito");
		this.jLabelid_cuenta_contable_ingreso_debitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_ingreso_debitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_ingreso_debitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso_debitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESODEBITO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_debitoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_debitoBodegaProducto"));

		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_debitoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_debitoBodegaProductoUpdate"));


		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_debitoBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_debitoBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_ingreso_creditoBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_ingreso_creditoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESOCREDITO+" : *");
		this.jLabelid_cuenta_contable_ingreso_creditoBodegaProducto.setToolTipText("Cuenta C. Ingreso Credito");
		this.jLabelid_cuenta_contable_ingreso_creditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_ingreso_creditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_ingreso_creditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso_creditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESOCREDITO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_creditoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_creditoBodegaProducto"));

		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_creditoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_creditoBodegaProductoUpdate"));


		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ingreso_creditoBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ingreso_creditoBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_resultado_debitoBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_resultado_debitoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLERESULTADODEBITO+" : *");
		this.jLabelid_cuenta_contable_resultado_debitoBodegaProducto.setToolTipText("Cuenta C. Resultado Debito");
		this.jLabelid_cuenta_contable_resultado_debitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_resultado_debitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_resultado_debitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_resultado_debitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLERESULTADODEBITO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_debitoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_debitoBodegaProducto"));

		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_debitoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_debitoBodegaProductoUpdate"));


		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_debitoBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_debitoBodegaProductoArbol"));



					
		this.jLabelid_cuenta_contable_resultado_creditoBodegaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_resultado_creditoBodegaProducto.setText(""+BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLERESULTADOCREDITO+" : *");
		this.jLabelid_cuenta_contable_resultado_creditoBodegaProducto.setToolTipText("Cuenta C. Resultado Credito");
		this.jLabelid_cuenta_contable_resultado_creditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_resultado_creditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_resultado_creditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_resultado_creditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto.setToolTipText(BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLERESULTADOCREDITO);
		this.gridaBagLayoutBodegaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto.setLayout(this.gridaBagLayoutBodegaProducto);


		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_creditoBodegaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_creditoBodegaProducto"));

		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_creditoBodegaProductoBusqueda"));

		if(this.bodegaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_creditoBodegaProductoUpdate"));


		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_resultado_creditoBodegaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_resultado_creditoBodegaProductoArbol"));



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
		//this.jInternalFrameDetalleBodegaProducto = new BodegaProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bodega Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBodegaProducto= new GridBagLayout();
		

		
		String sToolTipBodegaProducto="";
		sToolTipBodegaProducto=BodegaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBodegaProducto+="(Inventario.BodegaProducto)";
		}
		
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipBodegaProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBodegaProducto = new JButtonMe();
		this.jButtonModificarBodegaProducto = new JButtonMe();
        this.jButtonActualizarBodegaProducto = new JButtonMe();
        this.jButtonEliminarBodegaProducto = new JButtonMe();
        this.jButtonCancelarBodegaProducto = new JButtonMe();
        this.jButtonGuardarCambiosBodegaProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaBodegaProducto = new JButtonMe();
		this.jButtonCerrarBodegaProducto = new JButtonMe();
		
		this.jScrollPanelDatosBodegaProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionBodegaProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralBodegaProducto = new JScrollPane();
				
		
		
		this.jPanelCamposBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposBodegaProducto=new JTabbedPane();
		
		
		this.jTabbedPaneCamposBodegaProducto.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioestadisticaBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Bodega Producto";
		
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosBodegaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBodegaProducto.setName("jPanelCamposBodegaProducto"); 

		this.jPanelCamposOcultosBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBodegaProducto.setName("jPanelCamposOcultosBodegaProducto"); 

        this.jPanelAccionesBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBodegaProducto.setToolTipText("Acciones");
        this.jPanelAccionesBodegaProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBodegaProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBodegaProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
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
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBodegaProducto.setText("Nuevo");
		this.jButtonModificarBodegaProducto.setText("Editar");
        this.jButtonActualizarBodegaProducto.setText("Actualizar");
        this.jButtonEliminarBodegaProducto.setText("Eliminar");
        this.jButtonCancelarBodegaProducto.setText("Cancelar");
        this.jButtonGuardarCambiosBodegaProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaBodegaProducto.setText("Guardar");
		this.jButtonCerrarBodegaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBodegaProducto,"nuevo_button","Nuevo",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBodegaProducto,"modificar_button","Editar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBodegaProducto,"actualizar_button","Actualizar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBodegaProducto,"eliminar_button","Eliminar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBodegaProducto,"cancelar_button","Cancelar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBodegaProducto,"guardarcambios_button","Guardar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBodegaProducto,"guardarcambiostabla_button","Guardar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBodegaProducto,"cerrar_button","Salir",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBodegaProducto.setToolTipText("Nuevo"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBodegaProducto.setToolTipText("Editar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBodegaProducto.setToolTipText("Actualizar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBodegaProducto.setToolTipText("Eliminar)"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBodegaProducto.setToolTipText("Cancelar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBodegaProducto.setToolTipText("Guardar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
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
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoBodegaProducto";
		inputMap = this.jButtonNuevoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBodegaProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBodegaProducto";
		inputMap = this.jButtonActualizarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBodegaProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarBodegaProducto";
		inputMap = this.jButtonEliminarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBodegaProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarBodegaProducto";
		inputMap = this.jButtonCancelarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBodegaProducto"));
		
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
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBodegaProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBodegaProducto.setToolTipText("Nuevo BodegaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBodegaProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBodegaProducto.setToolTipText("Sin Cerrar Ventana BodegaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBodegaProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBodegaProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBodegaProducto.setText("Accion");
		this.jComboBoxTiposAccionesBodegaProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBodegaProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBodegaProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBodegaProducto = new JLabelMe();
		
		this.jLabelAccionesBodegaProducto.setText("Acciones");		
		this.jLabelAccionesBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBodegaProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBodegaProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBodegaProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBodegaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBodegaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBodegaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBodegaProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBodegaProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBodegaProducto = new GridBagLayout();
		
		this.jPanelCamposBodegaProducto.setLayout(gridaBagLayoutCamposBodegaProducto);
		this.jPanelCamposOcultosBodegaProducto.setLayout(gridaBagLayoutCamposOcultosBodegaProducto);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralBodegaProducto= new GridBagLayout();
		this.jPanelCamposIniciogeneralBodegaProducto.setLayout(gridaBagLayoutCamposIniciogeneralBodegaProducto);

		GridBagLayout gridaBagLayoutCamposIniciodatoBodegaProducto= new GridBagLayout();
		this.jPanelCamposIniciodatoBodegaProducto.setLayout(gridaBagLayoutCamposIniciodatoBodegaProducto);

		GridBagLayout gridaBagLayoutCamposInicioestadisticaBodegaProducto= new GridBagLayout();
		this.jPanelCamposInicioestadisticaBodegaProducto.setLayout(gridaBagLayoutCamposInicioestadisticaBodegaProducto);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableBodegaProducto= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableBodegaProducto.setLayout(gridaBagLayoutCamposIniciocuenta_contableBodegaProducto);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBodegaProducto.add(jLabelIdBodegaProducto, this.gridBagConstraintsBodegaProducto);



	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBodegaProducto.add(jLabelidBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBodegaProducto.add(jLabelid_empresaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBodegaProducto.add(jButtonid_empresaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBodegaProducto.add(jButtonid_empresaBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBodegaProducto.add(jComboBoxid_empresaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalBodegaProducto.add(jLabelid_sucursalBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBodegaProducto.add(jButtonid_sucursalBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalBodegaProducto.add(jButtonid_sucursalBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalBodegaProducto.add(jComboBoxid_sucursalBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaBodegaProducto.add(jLabelid_bodegaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaBodegaProducto.add(jButtonid_bodegaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaBodegaProducto.add(jButtonid_bodegaBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaBodegaProducto.add(jComboBoxid_bodegaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoBodegaProducto.add(jLabelid_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 2;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoBodegaProducto.add(jButtonid_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoBodegaProducto.add(jButtonid_productoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 4;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoBodegaProducto.add(jButtonid_productoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoBodegaProducto.add(jComboBoxid_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadBodegaProducto.add(jLabelid_unidadBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadBodegaProducto.add(jButtonid_unidadBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadBodegaProducto.add(jButtonid_unidadBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadBodegaProducto.add(jComboBoxid_unidadBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoBodegaProducto.add(jLabelid_centro_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoBodegaProducto.add(jButtonid_centro_costoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoBodegaProducto.add(jButtonid_centro_costoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoBodegaProducto.add(jComboBoxid_centro_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_bodega_productoBodegaProducto.add(jLabelid_estado_bodega_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_bodega_productoBodegaProducto.add(jButtonid_estado_bodega_productoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_bodega_productoBodegaProducto.add(jButtonid_estado_bodega_productoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_bodega_productoBodegaProducto.add(jComboBoxid_estado_bodega_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionBodegaProducto.add(jLabeldescripcionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionBodegaProducto.add(jButtondescripcionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionBodegaProducto.add(jscrollPanedescripcionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_disponibleBodegaProducto.add(jLabelcantidad_disponibleBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_disponibleBodegaProducto.add(jButtoncantidad_disponibleBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_disponibleBodegaProducto.add(jTextFieldcantidad_disponibleBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstock_maximoBodegaProducto.add(jLabelstock_maximoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelstock_maximoBodegaProducto.add(jButtonstock_maximoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstock_maximoBodegaProducto.add(jTextFieldstock_maximoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelstock_minimoBodegaProducto.add(jLabelstock_minimoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelstock_minimoBodegaProducto.add(jButtonstock_minimoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelstock_minimoBodegaProducto.add(jTextFieldstock_minimoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaBodegaProducto.add(jLabelivaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaBodegaProducto.add(jButtonivaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaBodegaProducto.add(jTextFieldivaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorBodegaProducto.add(jLabeliva_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorBodegaProducto.add(jButtoniva_valorBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorBodegaProducto.add(jTextFieldiva_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoBodegaProducto.add(jLabeldescuentoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoBodegaProducto.add(jButtondescuentoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoBodegaProducto.add(jTextFielddescuentoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorBodegaProducto.add(jLabeldescuento_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorBodegaProducto.add(jButtondescuento_valorBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorBodegaProducto.add(jTextFielddescuento_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceBodegaProducto.add(jLabeliceBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceBodegaProducto.add(jButtoniceBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceBodegaProducto.add(jTextFieldiceBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorBodegaProducto.add(jLabelice_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorBodegaProducto.add(jButtonice_valorBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorBodegaProducto.add(jTextFieldice_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_promedioBodegaProducto.add(jLabelcosto_promedioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_promedioBodegaProducto.add(jButtoncosto_promedioBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_promedioBodegaProducto.add(jTextFieldcosto_promedioBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_comisionBodegaProducto.add(jLabelporcentaje_comisionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_comisionBodegaProducto.add(jButtonporcentaje_comisionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_comisionBodegaProducto.add(jTextFieldporcentaje_comisionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioBodegaProducto.add(jLabelprecioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioBodegaProducto.add(jButtonprecioBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioBodegaProducto.add(jTextFieldprecioBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelultimo_costoBodegaProducto.add(jLabelultimo_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoBodegaProducto.add(jButtonultimo_costoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelultimo_costoBodegaProducto.add(jTextFieldultimo_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoBodegaProducto.add(jLabelcostoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoBodegaProducto.add(jButtoncostoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoBodegaProducto.add(jTextFieldcostoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarancel_porcentajeBodegaProducto.add(jLabelarancel_porcentajeBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelarancel_porcentajeBodegaProducto.add(jButtonarancel_porcentajeBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarancel_porcentajeBodegaProducto.add(jTextFieldarancel_porcentajeBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_porcentajeBodegaProducto.add(jLabelice_porcentajeBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_porcentajeBodegaProducto.add(jButtonice_porcentajeBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_porcentajeBodegaProducto.add(jTextFieldice_porcentajeBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpesoBodegaProducto.add(jLabelpesoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelpesoBodegaProducto.add(jButtonpesoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpesoBodegaProducto.add(jTextFieldpesoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_ivaBodegaProducto.add(jLabelcon_ivaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_ivaBodegaProducto.add(jButtoncon_ivaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_ivaBodegaProducto.add(jCheckBoxcon_ivaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_impuestoBodegaProducto.add(jLabelcon_impuestoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_impuestoBodegaProducto.add(jButtoncon_impuestoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_impuestoBodegaProducto.add(jCheckBoxcon_impuestoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_iceBodegaProducto.add(jLabelcon_iceBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_iceBodegaProducto.add(jButtoncon_iceBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_iceBodegaProducto.add(jCheckBoxcon_iceBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoBodegaProducto.add(jLabelesta_activoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoBodegaProducto.add(jButtonesta_activoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoBodegaProducto.add(jCheckBoxesta_activoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_balanzaBodegaProducto.add(jLabelcon_balanzaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_balanzaBodegaProducto.add(jButtoncon_balanzaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_balanzaBodegaProducto.add(jCheckBoxcon_balanzaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pedidaBodegaProducto.add(jLabelcantidad_pedidaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pedidaBodegaProducto.add(jButtoncantidad_pedidaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pedidaBodegaProducto.add(jTextFieldcantidad_pedidaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_fisicaBodegaProducto.add(jLabelcantidad_fisicaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_fisicaBodegaProducto.add(jButtoncantidad_fisicaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_fisicaBodegaProducto.add(jTextFieldcantidad_fisicaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_requeridoBodegaProducto.add(jLabelcantidad_requeridoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_requeridoBodegaProducto.add(jButtoncantidad_requeridoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_requeridoBodegaProducto.add(jTextFieldcantidad_requeridoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_costoBodegaProducto.add(jLabelprecio_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_costoBodegaProducto.add(jButtonprecio_costoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_costoBodegaProducto.add(jTextFieldprecio_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_promedioBodegaProducto.add(jLabelprecio_promedioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_promedioBodegaProducto.add(jButtonprecio_promedioBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_promedioBodegaProducto.add(jTextFieldprecio_promedioBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ingresosBodegaProducto.add(jLabeltotal_ingresosBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ingresosBodegaProducto.add(jButtontotal_ingresosBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ingresosBodegaProducto.add(jTextFieldtotal_ingresosBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_egresosBodegaProducto.add(jLabeltotal_egresosBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_egresosBodegaProducto.add(jButtontotal_egresosBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_egresosBodegaProducto.add(jTextFieldtotal_egresosBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_provisionBodegaProducto.add(jLabeltotal_provisionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_provisionBodegaProducto.add(jButtontotal_provisionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_provisionBodegaProducto.add(jTextFieldtotal_provisionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_procesoBodegaProducto.add(jLabeltotal_procesoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_procesoBodegaProducto.add(jButtontotal_procesoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_procesoBodegaProducto.add(jTextFieldtotal_procesoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_calculadoBodegaProducto.add(jLabelcosto_calculadoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_calculadoBodegaProducto.add(jButtoncosto_calculadoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_calculadoBodegaProducto.add(jTextFieldcosto_calculadoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_produccionBodegaProducto.add(jLabeldias_produccionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_produccionBodegaProducto.add(jButtondias_produccionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_produccionBodegaProducto.add(jTextFielddias_produccionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_reposicionBodegaProducto.add(jLabelprecio_reposicionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_reposicionBodegaProducto.add(jButtonprecio_reposicionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_reposicionBodegaProducto.add(jTextFieldprecio_reposicionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultimo_pedidoBodegaProducto.add(jLabelfecha_ultimo_pedidoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimo_pedidoBodegaProducto.add(jButtonfecha_ultimo_pedidoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultimo_pedidoBodegaProducto.add(jDateChooserfecha_ultimo_pedidoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ingresoBodegaProducto.add(jLabelfecha_ingresoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ingresoBodegaProducto.add(jButtonfecha_ingresoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ingresoBodegaProducto.add(jDateChooserfecha_ingresoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_egresoBodegaProducto.add(jLabelfecha_egresoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_egresoBodegaProducto.add(jButtonfecha_egresoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_egresoBodegaProducto.add(jDateChooserfecha_egresoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_compraBodegaProducto.add(jLabelfecha_ultima_compraBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_compraBodegaProducto.add(jButtonfecha_ultima_compraBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_compraBodegaProducto.add(jDateChooserfecha_ultima_compraBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_ventaBodegaProducto.add(jLabelfecha_ultima_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_ventaBodegaProducto.add(jButtonfecha_ultima_ventaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_ventaBodegaProducto.add(jDateChooserfecha_ultima_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_devolucionBodegaProducto.add(jLabelfecha_ultima_devolucionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_devolucionBodegaProducto.add(jButtonfecha_ultima_devolucionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_devolucionBodegaProducto.add(jDateChooserfecha_ultima_devolucionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventarioBodegaProducto.add(jLabelid_cuenta_contable_inventarioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioBodegaProducto.add(jButtonid_cuenta_contable_inventarioBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioBodegaProducto.add(jButtonid_cuenta_contable_inventarioBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventarioBodegaProducto.add(jComboBoxid_cuenta_contable_inventarioBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_ventaBodegaProducto.add(jLabelid_cuenta_contable_costo_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_ventaBodegaProducto.add(jButtonid_cuenta_contable_costo_ventaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_ventaBodegaProducto.add(jButtonid_cuenta_contable_costo_ventaBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_ventaBodegaProducto.add(jComboBoxid_cuenta_contable_costo_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaBodegaProducto.add(jLabelid_cuenta_contable_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaBodegaProducto.add(jButtonid_cuenta_contable_ventaBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaBodegaProducto.add(jButtonid_cuenta_contable_ventaBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaBodegaProducto.add(jComboBoxid_cuenta_contable_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_descuentoBodegaProducto.add(jLabelid_cuenta_contable_descuentoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoBodegaProducto.add(jButtonid_cuenta_contable_descuentoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoBodegaProducto.add(jButtonid_cuenta_contable_descuentoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_descuentoBodegaProducto.add(jComboBoxid_cuenta_contable_descuentoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_produccionBodegaProducto.add(jLabelid_cuenta_contable_produccionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionBodegaProducto.add(jButtonid_cuenta_contable_produccionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionBodegaProducto.add(jButtonid_cuenta_contable_produccionBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_produccionBodegaProducto.add(jComboBoxid_cuenta_contable_produccionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_devolucionBodegaProducto.add(jLabelid_cuenta_contable_devolucionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionBodegaProducto.add(jButtonid_cuenta_contable_devolucionBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionBodegaProducto.add(jButtonid_cuenta_contable_devolucionBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_devolucionBodegaProducto.add(jComboBoxid_cuenta_contable_devolucionBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto.add(jLabelid_cuenta_contable_ingreso_debitoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto.add(jButtonid_cuenta_contable_ingreso_debitoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto.add(jButtonid_cuenta_contable_ingreso_debitoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto.add(jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto.add(jLabelid_cuenta_contable_ingreso_creditoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto.add(jButtonid_cuenta_contable_ingreso_creditoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto.add(jButtonid_cuenta_contable_ingreso_creditoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto.add(jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto.add(jLabelid_cuenta_contable_resultado_debitoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto.add(jButtonid_cuenta_contable_resultado_debitoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto.add(jButtonid_cuenta_contable_resultado_debitoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto.add(jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto, this.gridBagConstraintsBodegaProducto);


	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 0;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto.add(jLabelid_cuenta_contable_resultado_creditoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 2;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto.add(jButtonid_cuenta_contable_resultado_creditoBodegaProductoBusqueda, this.gridBagConstraintsBodegaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 3;
		this.gridBagConstraintsBodegaProducto.ipadx = 0;
		this.gridBagConstraintsBodegaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto.add(jButtonid_cuenta_contable_resultado_creditoBodegaProductoUpdate, this.gridBagConstraintsBodegaProducto);
	}

	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodegaProducto.gridy = 0;
	this.gridBagConstraintsBodegaProducto.gridx = 1;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto.add(jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto, this.gridBagConstraintsBodegaProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposOcultosBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposOcultosBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBodegaProducto.add(this.jPanelid_empresaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposOcultosBodegaProducto % 1==0) {
		iXPanelCamposOcultosBodegaProducto=0;
		iYPanelCamposOcultosBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposOcultosBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposOcultosBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBodegaProducto.add(this.jPanelid_sucursalBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposOcultosBodegaProducto % 1==0) {
		iXPanelCamposOcultosBodegaProducto=0;
		iYPanelCamposOcultosBodegaProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPanelidBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPanelid_bodegaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPanelid_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPanelid_unidadBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPanelid_centro_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPanelid_estado_bodega_productoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciogeneralBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciogeneralBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodegaProducto.add(this.jPaneldescripcionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciogeneralBodegaProducto % 1==0) {
		iXPanelCamposIniciogeneralBodegaProducto=0;
		iYPanelCamposIniciogeneralBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcantidad_disponibleBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelstock_maximoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelstock_minimoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelivaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPaneliva_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPaneldescuentoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPaneldescuento_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPaneliceBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelice_valorBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcosto_promedioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelporcentaje_comisionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelprecioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelultimo_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcostoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelarancel_porcentajeBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelice_porcentajeBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelpesoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcon_ivaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcon_impuestoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcon_iceBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelesta_activoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciodatoBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciodatoBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodegaProducto.add(this.jPanelcon_balanzaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciodatoBodegaProducto % 2==0) {
		iXPanelCamposIniciodatoBodegaProducto=0;
		iYPanelCamposIniciodatoBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelcantidad_pedidaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelcantidad_fisicaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelcantidad_requeridoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelprecio_costoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelprecio_promedioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPaneltotal_ingresosBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPaneltotal_egresosBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPaneltotal_provisionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPaneltotal_procesoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelcosto_calculadoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPaneldias_produccionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelprecio_reposicionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelfecha_ultimo_pedidoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelfecha_ingresoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelfecha_egresoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelfecha_ultima_compraBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelfecha_ultima_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposInicioestadisticaBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposInicioestadisticaBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioestadisticaBodegaProducto.add(this.jPanelfecha_ultima_devolucionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposInicioestadisticaBodegaProducto % 2==0) {
		iXPanelCamposInicioestadisticaBodegaProducto=0;
		iYPanelCamposInicioestadisticaBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_inventarioBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_costo_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_ventaBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_descuentoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_produccionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_devolucionBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_ingreso_debitoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_ingreso_creditoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_resultado_debitoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
	}
	this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodegaProducto.gridy = iYPanelCamposIniciocuenta_contableBodegaProducto;
	this.gridBagConstraintsBodegaProducto.gridx = iXPanelCamposIniciocuenta_contableBodegaProducto++;
	this.gridBagConstraintsBodegaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodegaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodegaProducto.add(this.jPanelid_cuenta_contable_resultado_creditoBodegaProducto, this.gridBagConstraintsBodegaProducto);



	if(iXPanelCamposIniciocuenta_contableBodegaProducto % 2==0) {
		iXPanelCamposIniciocuenta_contableBodegaProducto=0;
		iYPanelCamposIniciocuenta_contableBodegaProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesBodegaProducto= new GridBagLayout();
		this.jPanelAccionesBodegaProducto.setLayout(gridaBagLayoutAccionesBodegaProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBodegaProducto= new GridBagLayout();
		this.jPanelAccionesFormularioBodegaProducto.setLayout(gridaBagLayoutAccionesFormularioBodegaProducto);
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBodegaProducto.add(this.jComboBoxTiposAccionesFormularioBodegaProducto, this.gridBagConstraintsBodegaProducto);

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBodegaProducto.add(this.jCheckBoxPostAccionNuevoBodegaProducto, this.gridBagConstraintsBodegaProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBodegaProducto.add(this.jCheckBoxPostAccionSinCerrarBodegaProducto, this.gridBagConstraintsBodegaProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBodegaProducto.add(this.jCheckBoxPostAccionSinMensajeBodegaProducto, this.gridBagConstraintsBodegaProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesBodegaProducto.add(this.jButtonModificarBodegaProducto, this.gridBagConstraintsBodegaProducto);							

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesBodegaProducto.add(this.jButtonEliminarBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
			
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = 0;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesBodegaProducto.add(this.jButtonActualizarBodegaProducto, this.gridBagConstraintsBodegaProducto);


		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = 0;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesBodegaProducto.add(this.jButtonGuardarCambiosBodegaProducto, this.gridBagConstraintsBodegaProducto);	
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = 0;		
		this.gridBagConstraintsBodegaProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesBodegaProducto.add(this.jButtonCancelarBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
			
			
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
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBodegaProducto.gridx =0;
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBodegaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBodegaProducto, this.gridBagConstraintsBodegaProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BodegaProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBodegaProducto = new BodegaProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bodega Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Bodega Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bodega Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BodegaProductoModel bodegaproductoModel=new BodegaProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//BodegaProductoModel.BodegaProductoFocusTraversalPolicy bodegaproductoFocusTraversalPolicy = bodegaproductoModel.new BodegaProductoFocusTraversalPolicy(this);
			
			//bodegaproductoFocusTraversalPolicy.setbodegaproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bodegaproductoModel);
			
			
			this.jContentPaneDetalleBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBodegaProducto = new GridBagLayout();	
			this.jContentPaneDetalleBodegaProducto.setLayout(gridaBagLayoutDetalleBodegaProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBodegaProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
				this.gridBagConstraintsBodegaProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBodegaProducto.gridx = 0;
					
				
				this.jContentPaneDetalleBodegaProducto.add(jTtoolBarDetalleBodegaProducto, gridBagConstraintsBodegaProducto);								
				
}
			
			this.jScrollPanelDatosEdicionBodegaProducto=   new JScrollPane(jContentPaneDetalleBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBodegaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposBodegaProducto.add("General",this.jPanelCamposIniciogeneralBodegaProducto);
		this.jTabbedPaneCamposBodegaProducto.add("Dato",this.jPanelCamposIniciodatoBodegaProducto);
		this.jTabbedPaneCamposBodegaProducto.add("Estadistica",this.jPanelCamposInicioestadisticaBodegaProducto);
		this.jTabbedPaneCamposBodegaProducto.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableBodegaProducto);
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
						
			this.gridBagConstraintsBodegaProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBodegaProducto.gridx = 0;
	        
			this.jContentPaneDetalleBodegaProducto.add(jTabbedPaneCamposBodegaProducto, gridBagConstraintsBodegaProducto);
			
			
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
						&& bodegaproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bodegaproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBodegaProducto= new GridBagConstraints();
						this.gridBagConstraintsBodegaProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBodegaProducto.gridx = 0;
						this.jContentPaneDetalleBodegaProducto.add(this.jTabbedPaneRelacionesBodegaProducto, this.gridBagConstraintsBodegaProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBodegaProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBodegaProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
					this.gridBagConstraintsBodegaProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBodegaProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBodegaProducto.gridx = 0;
					
				
					this.jContentPaneDetalleBodegaProducto.add(jPanelCamposOcultosBodegaProducto, gridBagConstraintsBodegaProducto);
				
					this.jPanelCamposOcultosBodegaProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBodegaProducto.gridx = 0;
	        this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBodegaProducto.add(this.jPanelAccionesFormularioBodegaProducto, this.gridBagConstraintsBodegaProducto);							
			
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
	        this.gridBagConstraintsBodegaProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBodegaProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleBodegaProducto.add(this.jPanelAccionesBodegaProducto, this.gridBagConstraintsBodegaProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBodegaProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBodegaProducto=   new JScrollPane(this.jPanelCamposBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBodegaProducto.gridx = 0;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBodegaProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBodegaProducto, this.gridBagConstraintsBodegaProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBodegaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBodegaProducto, this.gridBagConstraintsBodegaProducto);			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBodegaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBodegaProducto, this.gridBagConstraintsBodegaProducto);									
			*/
		//}								
			
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
		
		
		//return this.jScrollPanelDatosGeneralBodegaProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionBodegaProducto;
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
