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
import com.bydan.erp.inventario.util.DetalleMovimientoInventarioConstantesFunciones;

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
public class DetalleMovimientoInventarioDetalleFormJInternalFrame extends DetalleMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarDetalleDetalleMovimientoInventario;
	
	protected JMenu jmenuDetalleDetalleMovimientoInventario;
	protected JMenu jmenuDetalleArchivoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleAccionesDetalleMovimientoInventario;
	protected JMenu jmenuDetalleDatosDetalleMovimientoInventario;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsDetalleMovimientoInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleMovimientoInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleMovimientoInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_movimientoinventario="";

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

	protected EstadoDetalleMovimientoInventarioBeanSwingJInternalFrame estadodetallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallemovimientoinventario="";

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

	protected TipoDetalleMovimientoInventarioBeanSwingJInternalFrame tipodetallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetallemovimientoinventario="";
	
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	
	

	public NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFrame=null;
	public NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedadSeguimiento=false;
	public NovedadSeguimientoSessionBean novedadseguimientoSessionBean;
	
	
	public MovimientoInventarioSessionBean movimientoinventarioSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public EstadoDetalleMovimientoInventarioSessionBean estadodetallemovimientoinventarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean;	
	
	public DetalleMovimientoInventarioLogic detallemovimientoinventarioLogic;
	
	public JScrollPane jScrollPanelDatosDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralDetalleMovimientoInventario;
	
	protected JPanel jPanelCamposDetalleMovimientoInventario;    
	protected JPanel jPanelCamposOcultosDetalleMovimientoInventario;    	
	protected JPanel jPanelAccionesDetalleMovimientoInventario;
	protected JPanel jPanelAccionesFormularioDetalleMovimientoInventario;
    
	
	
	protected Integer iXPanelCamposDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposDetalleMovimientoInventario=0;
	
	protected Integer iXPanelCamposOcultosDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposOcultosDetalleMovimientoInventario=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleMovimientoInventario;
	protected Integer iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposIniciogeneralDetalleMovimientoInventario=0;

	protected JPanel jPanelCamposIniciovaloresDetalleMovimientoInventario;
	protected Integer iXPanelCamposIniciovaloresDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposIniciovaloresDetalleMovimientoInventario=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleMovimientoInventario;
	public JButton jButtonModificarDetalleMovimientoInventario;
	public JButton jButtonActualizarDetalleMovimientoInventario;
    public JButton jButtonEliminarDetalleMovimientoInventario;
	public JButton jButtonCancelarDetalleMovimientoInventario;
    public JButton jButtonGuardarCambiosDetalleMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaDetalleMovimientoInventario;
	protected JButton jButtonCerrarDetalleMovimientoInventario;
	
	/*
	protected JButton jButtonProcesarInformacionDetalleMovimientoInventario;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleMovimientoInventario;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleMovimientoInventario;
	protected JButton jButtonModificarToolBarDetalleMovimientoInventario;
	protected JButton jButtonActualizarToolBarDetalleMovimientoInventario;
    protected JButton jButtonEliminarToolBarDetalleMovimientoInventario;
	protected JButton jButtonCancelarToolBarDetalleMovimientoInventario;
    protected JButton jButtonGuardarCambiosToolBarDetalleMovimientoInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleMovimientoInventario;
	protected JButton jButtonCerrarToolBarDetalleMovimientoInventario;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleMovimientoInventario;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemModificarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemActualizarDetalleMovimientoInventario;
    protected JMenuItem jMenuItemEliminarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCancelarDetalleMovimientoInventario;
    protected JMenuItem jMenuItemGuardarCambiosDetalleMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCerrarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleMovimientoInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarDetalleMovimientoInventario;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleMovimientoInventario;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleMovimientoInventario;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleMovimientoInventario;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleMovimientoInventario;
	public JLabel jLabelIdDetalleMovimientoInventario;
	public JLabel jLabelidDetalleMovimientoInventario;
	public JButton jButtonidDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleMovimientoInventario;
	public JLabel jLabeldescripcionDetalleMovimientoInventario;
	public JTextArea jTextAreadescripcionDetalleMovimientoInventario;
	public JScrollPane jscrollPanedescripcionDetalleMovimientoInventario;
	public JButton jButtondescripcionDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleMovimientoInventario;
	public JLabel jLabelcantidadDetalleMovimientoInventario;
	public JTextField jTextFieldcantidadDetalleMovimientoInventario;
	public JButton jButtoncantidadDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleMovimientoInventario;
	public JLabel jLabeldescuentoDetalleMovimientoInventario;
	public JTextField jTextFielddescuentoDetalleMovimientoInventario;
	public JButton jButtondescuentoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetalleMovimientoInventario;
	public JLabel jLabelcosto_unitarioDetalleMovimientoInventario;
	public JTextField jTextFieldcosto_unitarioDetalleMovimientoInventario;
	public JButton jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetalleMovimientoInventario;
	public JLabel jLabelcosto_totalDetalleMovimientoInventario;
	public JTextField jTextFieldcosto_totalDetalleMovimientoInventario;
	public JButton jButtoncosto_totalDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleDetalleMovimientoInventario;
	public JLabel jLabeldisponibleDetalleMovimientoInventario;
	public JTextField jTextFielddisponibleDetalleMovimientoInventario;
	public JButton jButtondisponibleDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleMovimientoInventario;
	public JLabel jLabelivaDetalleMovimientoInventario;
	public JTextField jTextFieldivaDetalleMovimientoInventario;
	public JButton jButtonivaDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneliva_valorDetalleMovimientoInventario;
	public JLabel jLabeliva_valorDetalleMovimientoInventario;
	public JTextField jTextFieldiva_valorDetalleMovimientoInventario;
	public JButton jButtoniva_valorDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcosto_ivaDetalleMovimientoInventario;
	public JLabel jLabelcosto_ivaDetalleMovimientoInventario;
	public JCheckBox jCheckBoxcosto_ivaDetalleMovimientoInventario;
	public JButton jButtoncosto_ivaDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneliceDetalleMovimientoInventario;
	public JLabel jLabeliceDetalleMovimientoInventario;
	public JTextField jTextFieldiceDetalleMovimientoInventario;
	public JButton jButtoniceDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelice_valorDetalleMovimientoInventario;
	public JLabel jLabelice_valorDetalleMovimientoInventario;
	public JTextField jTextFieldice_valorDetalleMovimientoInventario;
	public JButton jButtonice_valorDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneldescuento1DetalleMovimientoInventario;
	public JLabel jLabeldescuento1DetalleMovimientoInventario;
	public JTextField jTextFielddescuento1DetalleMovimientoInventario;
	public JButton jButtondescuento1DetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetalleMovimientoInventario;
	public JLabel jLabeldescuento2DetalleMovimientoInventario;
	public JTextField jTextFielddescuento2DetalleMovimientoInventario;
	public JButton jButtondescuento2DetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelserieDetalleMovimientoInventario;
	public JLabel jLabelserieDetalleMovimientoInventario;
	public JTextField jTextFieldserieDetalleMovimientoInventario;
	public JButton jButtonserieDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelloteDetalleMovimientoInventario;
	public JLabel jLabelloteDetalleMovimientoInventario;
	public JTextField jTextFieldloteDetalleMovimientoInventario;
	public JButton jButtonloteDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_elaboracion_loteDetalleMovimientoInventario;
	public JLabel jLabelfecha_elaboracion_loteDetalleMovimientoInventario;
	//public JFormattedTextField jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario;

	public JDateChooser jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario;
	public JButton jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidad_loteDetalleMovimientoInventario;
	public JLabel jLabelfecha_caducidad_loteDetalleMovimientoInventario;
	//public JFormattedTextField jDateChooserfecha_caducidad_loteDetalleMovimientoInventario;

	public JDateChooser jDateChooserfecha_caducidad_loteDetalleMovimientoInventario;
	public JButton jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleMovimientoInventario;
	public JLabel jLabelnumero_comprobanteDetalleMovimientoInventario;
	public JTextField jTextFieldnumero_comprobanteDetalleMovimientoInventario;
	public JButton jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanellote_clienteDetalleMovimientoInventario;
	public JLabel jLabellote_clienteDetalleMovimientoInventario;
	public JTextField jTextFieldlote_clienteDetalleMovimientoInventario;
	public JButton jButtonlote_clienteDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_movimiento_inventarioDetalleMovimientoInventario;
	public JLabel jLabelid_movimiento_inventarioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_movimiento_inventarioDetalleMovimientoInventario;
	public JButton jButtonid_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleMovimientoInventario;
	public JLabel jLabelid_empresaDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleMovimientoInventario;
	public JButton jButtonid_empresaDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_empresaDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleMovimientoInventario;
	public JLabel jLabelid_sucursalDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleMovimientoInventario;
	public JButton jButtonid_sucursalDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_sucursalDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleMovimientoInventario;
	public JLabel jLabelid_ejercicioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleMovimientoInventario;
	public JButton jButtonid_ejercicioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleMovimientoInventario;
	public JLabel jLabelid_periodoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleMovimientoInventario;
	public JButton jButtonid_periodoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_periodoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleMovimientoInventario;
	public JLabel jLabelid_anioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleMovimientoInventario;
	public JButton jButtonid_anioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_anioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleMovimientoInventario;
	public JLabel jLabelid_mesDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleMovimientoInventario;
	public JButton jButtonid_mesDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_mesDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario;
	public JLabel jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario;
	public JButton jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleMovimientoInventario;
	public JLabel jLabelid_bodegaDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleMovimientoInventario;
	public JButton jButtonid_bodegaDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_bodegaDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleMovimientoInventario;
	public JLabel jLabelid_productoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleMovimientoInventario;
	public JButton jButtonid_productoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_productoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleMovimientoInventario;
	public JLabel jLabelid_unidadDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleMovimientoInventario;
	public JButton jButtonid_unidadDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_unidadDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_novedad_productoDetalleMovimientoInventario;
	public JLabel jLabelid_novedad_productoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoDetalleMovimientoInventario;
	public JButton jButtonid_novedad_productoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleMovimientoInventario;
	public JLabel jLabelid_centro_costoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleMovimientoInventario;
	public JButton jButtonid_centro_costoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleMovimientoInventarioBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleMovimientoInventarioArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoDetalleMovimientoInventario;
	public JLabel jLabelid_cuenta_contable_costoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario;
	public JButton jButtonid_cuenta_contable_costoDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol= new JButtonMe();

	public JPanel jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario;
	public JLabel jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario;
	public JButton jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
	public JButton jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleMovimientoInventario;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleMovimientoInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleMovimientoInventario=new JPanel();
				this.jPanelAccionesFormularioDetalleMovimientoInventario=new JPanel();
				this.jmenuBarDetalleDetalleMovimientoInventario=new JMenuBar();
				this.jTtoolBarDetalleDetalleMovimientoInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleMovimientoInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMovimientoInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	public JButton getjButtonActualizarToolBarDetalleMovimientoInventario() {
		return this.jButtonActualizarToolBarDetalleMovimientoInventario;
	}
	
	public JButton getjButtonEliminarToolBarDetalleMovimientoInventario() {
		return this.jButtonEliminarToolBarDetalleMovimientoInventario;
	}
	
	public JButton getjButtonCancelarToolBarDetalleMovimientoInventario() {
		return this.jButtonCancelarToolBarDetalleMovimientoInventario;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleMovimientoInventario() {
		return this.jButtonProcesarInformacionDetalleMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleMovimientoInventario)	{
		this.jButtonProcesarInformacionDetalleMovimientoInventario = jButtonProcesarInformacionDetalleMovimientoInventario;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesDetalleMovimientoInventario) {
		this.jComboBoxTiposRelacionesDetalleMovimientoInventario = jComboBoxTiposRelacionesDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesDetalleMovimientoInventario = jComboBoxTiposAccionesDetalleMovimientoInventario;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesFormularioDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario = jComboBoxTiposAccionesFormularioDetalleMovimientoInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		
		this.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleMovimientoInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleMovimientoInventario=new JButtonMe();
				this.jButtonModificarToolBarDetalleMovimientoInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleDetalleMovimientoInventario,
							"actualizar","actualizar","Actualizar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleDetalleMovimientoInventario,
							"eliminar","eliminar","Eliminar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleDetalleMovimientoInventario,
							"cancelar","cancelar","Cancelar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleMovimientoInventario,this.jTtoolBarDetalleDetalleMovimientoInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleMovimientoInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleMovimientoInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleMovimientoInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleMovimientoInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleMovimientoInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleMovimientoInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleMovimientoInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleMovimientoInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleMovimientoInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleMovimientoInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleMovimientoInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleMovimientoInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleMovimientoInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleMovimientoInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleMovimientoInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleMovimientoInventario.add(this.jMenuItemDetalleCerrarDetalleMovimientoInventario);
		
		this.jmenuDetalleAccionesDetalleMovimientoInventario.add(this.jMenuItemActualizarDetalleMovimientoInventario);
		this.jmenuDetalleAccionesDetalleMovimientoInventario.add(this.jMenuItemEliminarDetalleMovimientoInventario);
		this.jmenuDetalleAccionesDetalleMovimientoInventario.add(this.jMenuItemCancelarDetalleMovimientoInventario);		
		
		//this.jmenuDetalleDatosDetalleMovimientoInventario.add(this.jMenuItemDetalleAbrirOrderByDetalleMovimientoInventario);				
		this.jmenuDetalleDatosDetalleMovimientoInventario.add(this.jMenuItemDetalleMostarOcultarDetalleMovimientoInventario);				
				
		//this.jmenuDetalleAccionesDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosDetalleMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleMovimientoInventario.add(this.jmenuDetalleArchivoDetalleMovimientoInventario);		
		this.jmenuBarDetalleDetalleMovimientoInventario.add(this.jmenuDetalleAccionesDetalleMovimientoInventario);		
		this.jmenuBarDetalleDetalleMovimientoInventario.add(this.jmenuDetalleDatosDetalleMovimientoInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetalleMovimientoInventario.add(this.jmenuDetalleDetalleMovimientoInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleMovimientoInventario);				
	}
	*/
	
	public void inicializarElementosCamposDetalleMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleMovimientoInventario = new JLabelMe();
		jLabelIdDetalleMovimientoInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleMovimientoInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleMovimientoInventario= new GridBagLayout();

		this.jPanelidDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);

		jLabelidDetalleMovimientoInventario = new JLabel();
		jLabelidDetalleMovimientoInventario.setText("Id");

		jLabelidDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleMovimientoInventario = new JLabelMe();
		this.jLabeldescripcionDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleMovimientoInventario.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneldescripcionDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextAreadescripcionDetalleMovimientoInventario= new JTextAreaMe();
		jTextAreadescripcionDetalleMovimientoInventario.setEnabled(false);
		jTextAreadescripcionDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleMovimientoInventario.setLineWrap(true);
		jTextAreadescripcionDetalleMovimientoInventario.setWrapStyleWord(true);
		jTextAreadescripcionDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleMovimientoInventario.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleMovimientoInventario = new JScrollPane(jTextAreadescripcionDetalleMovimientoInventario);
		jscrollPanedescripcionDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleMovimientoInventario = new JLabelMe();
		this.jLabelcantidadDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleMovimientoInventario.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelcantidadDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldcantidadDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldcantidadDetalleMovimientoInventario.setEnabled(false);
		jTextFieldcantidadDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleMovimientoInventario.setText("0");

		this.jButtoncantidadDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleMovimientoInventario = new JLabelMe();
		this.jLabeldescuentoDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleMovimientoInventario.setToolTipText("Descuento");
		this.jLabeldescuentoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneldescuentoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFielddescuentoDetalleMovimientoInventario= new JTextFieldMe();
		jTextFielddescuentoDetalleMovimientoInventario.setEnabled(false);
		jTextFielddescuentoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleMovimientoInventario.setText("0.0");

		this.jButtondescuentoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetalleMovimientoInventario = new JLabelMe();
		this.jLabelcosto_unitarioDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetalleMovimientoInventario.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelcosto_unitarioDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldcosto_unitarioDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldcosto_unitarioDetalleMovimientoInventario.setEnabled(false);
		jTextFieldcosto_unitarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetalleMovimientoInventario.setText("0.0");

		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetalleMovimientoInventario = new JLabelMe();
		this.jLabelcosto_totalDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetalleMovimientoInventario.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelcosto_totalDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldcosto_totalDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldcosto_totalDetalleMovimientoInventario.setEnabled(false);
		jTextFieldcosto_totalDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetalleMovimientoInventario.setText("0.0");

		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleDetalleMovimientoInventario = new JLabelMe();
		this.jLabeldisponibleDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_DISPONIBLE+" :");
		this.jLabeldisponibleDetalleMovimientoInventario.setToolTipText("Disponible");
		this.jLabeldisponibleDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneldisponibleDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFielddisponibleDetalleMovimientoInventario= new JTextFieldMe();
		jTextFielddisponibleDetalleMovimientoInventario.setEnabled(false);
		jTextFielddisponibleDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleDetalleMovimientoInventario.setText("0");

		this.jButtondisponibleDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleMovimientoInventario = new JLabelMe();
		this.jLabelivaDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleMovimientoInventario.setToolTipText("Iva");
		this.jLabelivaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelivaDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldivaDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldivaDetalleMovimientoInventario.setEnabled(false);
		jTextFieldivaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleMovimientoInventario.setText("0.0");

		this.jButtonivaDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonivaDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonivaDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeliva_valorDetalleMovimientoInventario = new JLabelMe();
		this.jLabeliva_valorDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IVAVALOR+" : *");
		this.jLabeliva_valorDetalleMovimientoInventario.setToolTipText("Iva Valor");
		this.jLabeliva_valorDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_valorDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_valorDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_valorDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_valorDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IVAVALOR);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneliva_valorDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldiva_valorDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldiva_valorDetalleMovimientoInventario.setEnabled(false);
		jTextFieldiva_valorDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_valorDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_valorDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_valorDetalleMovimientoInventario.setText("0.0");

		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_valorDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_valorDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_valorDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_valorDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_valorDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelcosto_ivaDetalleMovimientoInventario = new JLabelMe();
		this.jLabelcosto_ivaDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOIVA+" : *");
		this.jLabelcosto_ivaDetalleMovimientoInventario.setToolTipText("Costo Iva");
		this.jLabelcosto_ivaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ivaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_ivaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_ivaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_ivaDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_ivaDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_COSTOIVA);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelcosto_ivaDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jCheckBoxcosto_ivaDetalleMovimientoInventario= new JCheckBoxMe();
		jCheckBoxcosto_ivaDetalleMovimientoInventario.setEnabled(false);

		jCheckBoxcosto_ivaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcosto_ivaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcosto_ivaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcosto_ivaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcosto_ivaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcosto_ivaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_ivaDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_ivaDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeliceDetalleMovimientoInventario = new JLabelMe();
		this.jLabeliceDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceDetalleMovimientoInventario.setToolTipText("Ice");
		this.jLabeliceDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneliceDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldiceDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldiceDetalleMovimientoInventario.setEnabled(false);
		jTextFieldiceDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceDetalleMovimientoInventario.setText("0.0");

		this.jButtoniceDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoniceDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoniceDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelice_valorDetalleMovimientoInventario = new JLabelMe();
		this.jLabelice_valorDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_ICEVALOR+" : *");
		this.jLabelice_valorDetalleMovimientoInventario.setToolTipText("Ice Valor");
		this.jLabelice_valorDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelice_valorDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelice_valorDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelice_valorDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelice_valorDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_ICEVALOR);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelice_valorDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldice_valorDetalleMovimientoInventario= new JTextFieldMe();
		jTextFieldice_valorDetalleMovimientoInventario.setEnabled(false);
		jTextFieldice_valorDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldice_valorDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldice_valorDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldice_valorDetalleMovimientoInventario.setText("0.0");

		this.jButtonice_valorDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonice_valorDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldice_valorDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldice_valorDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ice_valorDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonice_valorDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeldescuento1DetalleMovimientoInventario = new JLabelMe();
		this.jLabeldescuento1DetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCUENTO1+" : *");
		this.jLabeldescuento1DetalleMovimientoInventario.setToolTipText("Descuento 1");
		this.jLabeldescuento1DetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1DetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento1DetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento1DetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento1DetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento1DetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCUENTO1);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneldescuento1DetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFielddescuento1DetalleMovimientoInventario= new JTextFieldMe();
		jTextFielddescuento1DetalleMovimientoInventario.setEnabled(false);
		jTextFielddescuento1DetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1DetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento1DetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento1DetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento1DetalleMovimientoInventario.setText("0.0");

		this.jButtondescuento1DetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento1DetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento1DetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento1DetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento1DetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento1DetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetalleMovimientoInventario = new JLabelMe();
		this.jLabeldescuento2DetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetalleMovimientoInventario.setToolTipText("Descuento 2");
		this.jLabeldescuento2DetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPaneldescuento2DetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFielddescuento2DetalleMovimientoInventario= new JTextFieldMe();
		jTextFielddescuento2DetalleMovimientoInventario.setEnabled(false);
		jTextFielddescuento2DetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetalleMovimientoInventario.setText("0.0");

		this.jButtondescuento2DetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelserieDetalleMovimientoInventario = new JLabelMe();
		this.jLabelserieDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_SERIE+" :");
		this.jLabelserieDetalleMovimientoInventario.setToolTipText("Serie");
		this.jLabelserieDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelserieDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldserieDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldserieDetalleMovimientoInventario.setEnabled(false);
		jTextFieldserieDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonserieDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonserieDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelloteDetalleMovimientoInventario = new JLabelMe();
		this.jLabelloteDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_LOTE+" :");
		this.jLabelloteDetalleMovimientoInventario.setToolTipText("Lote");
		this.jLabelloteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelloteDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldloteDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldloteDetalleMovimientoInventario.setEnabled(false);
		jTextFieldloteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonloteDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonloteDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_elaboracion_loteDetalleMovimientoInventario = new JLabelMe();
		this.jLabelfecha_elaboracion_loteDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_FECHAELABORACIONLOTE+" : *");
		this.jLabelfecha_elaboracion_loteDetalleMovimientoInventario.setToolTipText("F Elaboracion Lote");
		this.jLabelfecha_elaboracion_loteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_elaboracion_loteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_elaboracion_loteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_elaboracion_loteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_FECHAELABORACIONLOTE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		//jFormattedTextFieldfecha_elaboracion_loteDetalleMovimientoInventario= new JFormattedTextFieldMe();

		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario= new JDateChooser();
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.setEnabled(false);
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.setDate(new Date());
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_elaboracion_loteDetalleMovimientoInventario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_elaboracion_loteDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidad_loteDetalleMovimientoInventario = new JLabelMe();
		this.jLabelfecha_caducidad_loteDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_FECHACADUCIDADLOTE+" : *");
		this.jLabelfecha_caducidad_loteDetalleMovimientoInventario.setToolTipText("F Caducidad Lote");
		this.jLabelfecha_caducidad_loteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidad_loteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidad_loteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidad_loteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidad_loteDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidad_loteDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_FECHACADUCIDADLOTE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelfecha_caducidad_loteDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		//jFormattedTextFieldfecha_caducidad_loteDetalleMovimientoInventario= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario= new JDateChooser();
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.setEnabled(false);
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidad_loteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.setDate(new Date());
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidad_loteDetalleMovimientoInventario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidad_loteDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidad_loteDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleMovimientoInventario = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteDetalleMovimientoInventario.setToolTipText("Nro Comprobante");
		this.jLabelnumero_comprobanteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldnumero_comprobanteDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleMovimientoInventario.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabellote_clienteDetalleMovimientoInventario = new JLabelMe();
		this.jLabellote_clienteDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_LOTECLIENTE+" :");
		this.jLabellote_clienteDetalleMovimientoInventario.setToolTipText("Lote Cliente");
		this.jLabellote_clienteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellote_clienteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellote_clienteDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellote_clienteDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_LOTECLIENTE);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanellote_clienteDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jTextFieldlote_clienteDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldlote_clienteDetalleMovimientoInventario.setEnabled(false);
		jTextFieldlote_clienteDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlote_clienteDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlote_clienteDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlote_clienteDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lote_clienteDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlote_clienteDetalleMovimientoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_movimiento_inventarioDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_movimiento_inventarioDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDMOVIMIENTOINVENTARIO+" : *");
		this.jLabelid_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Movimiento");
		this.jLabelid_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_movimiento_inventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_movimiento_inventarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_movimiento_inventarioDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDMOVIMIENTOINVENTARIO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_movimiento_inventarioDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_movimiento_inventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_movimiento_inventarioDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_movimiento_inventarioDetalleMovimientoInventario"));

		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_movimiento_inventarioDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_movimiento_inventarioDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_empresaDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_empresaDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleMovimientoInventario.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_empresaDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_empresaDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_empresaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_empresaDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_empresaDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_empresaDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMovimientoInventario"));

		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_empresaDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_sucursalDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_sucursalDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleMovimientoInventario.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_sucursalDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_sucursalDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_sucursalDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_sucursalDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_sucursalDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_sucursalDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMovimientoInventario"));

		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_sucursalDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_ejercicioDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_ejercicioDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleMovimientoInventario.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_ejercicioDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_ejercicioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_ejercicioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_ejercicioDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_ejercicioDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleMovimientoInventario"));

		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_periodoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_periodoDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleMovimientoInventario.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_periodoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_periodoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_periodoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_periodoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_periodoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_periodoDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleMovimientoInventario"));

		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_periodoDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_anioDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_anioDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleMovimientoInventario.setToolTipText("Anio");
		this.jLabelid_anioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_anioDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_anioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_anioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_anioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_anioDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_anioDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleMovimientoInventario"));

		this.jButtonid_anioDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_anioDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_anioDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_mesDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_mesDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleMovimientoInventario.setToolTipText("Mes");
		this.jLabelid_mesDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_mesDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_mesDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_mesDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_mesDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_mesDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_mesDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleMovimientoInventario"));

		this.jButtonid_mesDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_mesDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_mesDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDESTADODETALLEMOVIMIENTOINVENTARIO+" : *");
		this.jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Estado");
		this.jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDESTADODETALLEMOVIMIENTOINVENTARIO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_movimiento_inventarioDetalleMovimientoInventario"));

		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_bodegaDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_bodegaDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleMovimientoInventario.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_bodegaDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_bodegaDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_bodegaDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_bodegaDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_bodegaDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleMovimientoInventario"));

		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_bodegaDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_productoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_productoDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleMovimientoInventario.setToolTipText("Producto");
		this.jLabelid_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_productoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_productoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_productoDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleMovimientoInventario"));

		this.jButtonid_productoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_productoDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_productoDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_unidadDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_unidadDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleMovimientoInventario.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_unidadDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_unidadDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_unidadDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_unidadDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_unidadDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleMovimientoInventario"));

		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_unidadDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_novedad_productoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_novedad_productoDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDNOVEDADPRODUCTO+" :");
		this.jLabelid_novedad_productoDetalleMovimientoInventario.setToolTipText("Novedad");
		this.jLabelid_novedad_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_novedad_productoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_novedad_productoDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_novedad_productoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_novedad_productoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_novedad_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_novedad_productoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_novedad_productoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_novedad_productoDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_novedad_productoDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_novedad_productoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleMovimientoInventario"));

		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_novedad_productoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_novedad_productoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleMovimientoInventarioUpdate"));



					
		this.jLabelid_centro_costoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_centro_costoDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleMovimientoInventario.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_centro_costoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_centro_costoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_centro_costoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_centro_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_centro_costoDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleMovimientoInventario"));

		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleMovimientoInventarioUpdate"));


		jButtonid_centro_costoDetalleMovimientoInventarioArbol= new JButtonMe();
		jButtonid_centro_costoDetalleMovimientoInventarioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleMovimientoInventarioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleMovimientoInventarioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleMovimientoInventarioArbol.setText("Arbol");
		jButtonid_centro_costoDetalleMovimientoInventarioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleMovimientoInventarioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleMovimientoInventarioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleMovimientoInventarioArbol"));



					
		this.jLabelid_cuenta_contable_costoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_cuenta_contable_costoDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" :");
		this.jLabelid_cuenta_contable_costoDetalleMovimientoInventario.setToolTipText("Cta Contable Costo");
		this.jLabelid_cuenta_contable_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleMovimientoInventario"));

		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleMovimientoInventarioUpdate"));


		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoDetalleMovimientoInventarioArbol"));



					
		this.jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario = new JLabelMe();
		this.jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setText(""+DetalleMovimientoInventarioConstantesFunciones.LABEL_IDTIPODETALLEMOVIMIENTOINVENTARIO+" :");
		this.jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Tipo Detalle Movimiento Inventario");
		this.jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText(DetalleMovimientoInventarioConstantesFunciones.LABEL_IDTIPODETALLEMOVIMIENTOINVENTARIO);
		this.gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setLayout(this.gridaBagLayoutDetalleMovimientoInventario);


		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario= new JComboBoxMe();
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setEnabled(false);

		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario= new JButtonMe();
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setText("Buscar");
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario"));

		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda"));

		if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setText("U");
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate"));



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
		//this.jInternalFrameDetalleDetalleMovimientoInventario = new DetalleMovimientoInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Movimiento Inventario DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleMovimientoInventario= new GridBagLayout();
		

		
		String sToolTipDetalleMovimientoInventario="";
		sToolTipDetalleMovimientoInventario=DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleMovimientoInventario+="(Inventario.DetalleMovimientoInventario)";
		}
		
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleMovimientoInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonModificarDetalleMovimientoInventario = new JButtonMe();
        this.jButtonActualizarDetalleMovimientoInventario = new JButtonMe();
        this.jButtonEliminarDetalleMovimientoInventario = new JButtonMe();
        this.jButtonCancelarDetalleMovimientoInventario = new JButtonMe();
        this.jButtonGuardarCambiosDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarDetalleMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosDetalleMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleMovimientoInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleMovimientoInventario = new JScrollPane();
		//this.jScrollPanelDatosDetalleMovimientoInventarioTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Movimiento Inventario";
		
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleMovimientoInventarioTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleMovimientoInventario.setName("jPanelCamposDetalleMovimientoInventario"); 

		this.jPanelCamposOcultosDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleMovimientoInventario.setName("jPanelCamposOcultosDetalleMovimientoInventario"); 

        this.jPanelAccionesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesDetalleMovimientoInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleMovimientoInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleMovimientoInventario.setName("jPanelCamposFingeneralDetalleMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleMovimientoInventario.setName("jPanelCamposFinvaloresDetalleMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleMovimientoInventario.setText("Nuevo");
		this.jButtonModificarDetalleMovimientoInventario.setText("Editar");
        this.jButtonActualizarDetalleMovimientoInventario.setText("Actualizar");
        this.jButtonEliminarDetalleMovimientoInventario.setText("Eliminar");
        this.jButtonCancelarDetalleMovimientoInventario.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleMovimientoInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.setText("Guardar");
		this.jButtonCerrarDetalleMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleMovimientoInventario,"nuevo_button","Nuevo",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleMovimientoInventario,"modificar_button","Editar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleMovimientoInventario,"actualizar_button","Actualizar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleMovimientoInventario,"eliminar_button","Eliminar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleMovimientoInventario,"cancelar_button","Cancelar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleMovimientoInventario,"guardarcambios_button","Guardar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleMovimientoInventario,"cerrar_button","Salir",this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleMovimientoInventario.setToolTipText("Nuevo"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleMovimientoInventario.setToolTipText("Editar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleMovimientoInventario.setToolTipText("Actualizar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleMovimientoInventario.setToolTipText("Eliminar)"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleMovimientoInventario.setToolTipText("Guardar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.setToolTipText("Guardar"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleMovimientoInventario.setToolTipText("Salir"+" "+DetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleMovimientoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleMovimientoInventario";
		inputMap = this.jButtonActualizarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleMovimientoInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleMovimientoInventario";
		inputMap = this.jButtonEliminarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleMovimientoInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleMovimientoInventario";
		inputMap = this.jButtonCancelarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleMovimientoInventario"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleMovimientoInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleMovimientoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleMovimientoInventario.setToolTipText("Nuevo DetalleMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleMovimientoInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleMovimientoInventario.setToolTipText("Sin Cerrar Ventana DetalleMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleMovimientoInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleMovimientoInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesDetalleMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleMovimientoInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleMovimientoInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleMovimientoInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleMovimientoInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleMovimientoInventario = new GridBagLayout();
		
		this.jPanelCamposDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposDetalleMovimientoInventario);
		this.jPanelCamposOcultosDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposOcultosDetalleMovimientoInventario);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposIniciogeneralDetalleMovimientoInventario);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposIniciovaloresDetalleMovimientoInventario);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleMovimientoInventario.add(jLabelIdDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleMovimientoInventario.add(jLabelidDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_movimiento_inventarioDetalleMovimientoInventario.add(jLabelid_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_movimiento_inventarioDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_movimiento_inventarioDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_movimiento_inventarioDetalleMovimientoInventario.add(jComboBoxid_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleMovimientoInventario.add(jLabelid_empresaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleMovimientoInventario.add(jButtonid_empresaDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleMovimientoInventario.add(jButtonid_empresaDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleMovimientoInventario.add(jComboBoxid_empresaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleMovimientoInventario.add(jLabelid_sucursalDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleMovimientoInventario.add(jButtonid_sucursalDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleMovimientoInventario.add(jButtonid_sucursalDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleMovimientoInventario.add(jComboBoxid_sucursalDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleMovimientoInventario.add(jLabelid_ejercicioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleMovimientoInventario.add(jButtonid_ejercicioDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleMovimientoInventario.add(jButtonid_ejercicioDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleMovimientoInventario.add(jComboBoxid_ejercicioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleMovimientoInventario.add(jLabelid_periodoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleMovimientoInventario.add(jButtonid_periodoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleMovimientoInventario.add(jButtonid_periodoDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleMovimientoInventario.add(jComboBoxid_periodoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleMovimientoInventario.add(jLabelid_anioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleMovimientoInventario.add(jButtonid_anioDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleMovimientoInventario.add(jButtonid_anioDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleMovimientoInventario.add(jComboBoxid_anioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleMovimientoInventario.add(jLabelid_mesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleMovimientoInventario.add(jButtonid_mesDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleMovimientoInventario.add(jButtonid_mesDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleMovimientoInventario.add(jComboBoxid_mesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jLabelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_estado_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jComboBoxid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleMovimientoInventario.add(jLabelid_bodegaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleMovimientoInventario.add(jButtonid_bodegaDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleMovimientoInventario.add(jButtonid_bodegaDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleMovimientoInventario.add(jComboBoxid_bodegaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleMovimientoInventario.add(jLabelid_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleMovimientoInventario.add(jButtonid_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleMovimientoInventario.add(jButtonid_productoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 4;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleMovimientoInventario.add(jButtonid_productoDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleMovimientoInventario.add(jComboBoxid_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleMovimientoInventario.add(jLabelid_unidadDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleMovimientoInventario.add(jButtonid_unidadDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleMovimientoInventario.add(jButtonid_unidadDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleMovimientoInventario.add(jComboBoxid_unidadDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleMovimientoInventario.add(jLabeldescripcionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleMovimientoInventario.add(jButtondescripcionDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleMovimientoInventario.add(jscrollPanedescripcionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleMovimientoInventario.add(jLabelcantidadDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleMovimientoInventario.add(jButtoncantidadDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleMovimientoInventario.add(jTextFieldcantidadDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleMovimientoInventario.add(jLabeldescuentoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleMovimientoInventario.add(jButtondescuentoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleMovimientoInventario.add(jTextFielddescuentoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetalleMovimientoInventario.add(jLabelcosto_unitarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetalleMovimientoInventario.add(jButtoncosto_unitarioDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetalleMovimientoInventario.add(jTextFieldcosto_unitarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetalleMovimientoInventario.add(jLabelcosto_totalDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetalleMovimientoInventario.add(jButtoncosto_totalDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetalleMovimientoInventario.add(jTextFieldcosto_totalDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleDetalleMovimientoInventario.add(jLabeldisponibleDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleDetalleMovimientoInventario.add(jButtondisponibleDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleDetalleMovimientoInventario.add(jTextFielddisponibleDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleMovimientoInventario.add(jLabelivaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleMovimientoInventario.add(jButtonivaDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleMovimientoInventario.add(jTextFieldivaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliva_valorDetalleMovimientoInventario.add(jLabeliva_valorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_valorDetalleMovimientoInventario.add(jButtoniva_valorDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliva_valorDetalleMovimientoInventario.add(jTextFieldiva_valorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_ivaDetalleMovimientoInventario.add(jLabelcosto_ivaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_ivaDetalleMovimientoInventario.add(jButtoncosto_ivaDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_ivaDetalleMovimientoInventario.add(jCheckBoxcosto_ivaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceDetalleMovimientoInventario.add(jLabeliceDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceDetalleMovimientoInventario.add(jButtoniceDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceDetalleMovimientoInventario.add(jTextFieldiceDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelice_valorDetalleMovimientoInventario.add(jLabelice_valorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelice_valorDetalleMovimientoInventario.add(jButtonice_valorDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelice_valorDetalleMovimientoInventario.add(jTextFieldice_valorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento1DetalleMovimientoInventario.add(jLabeldescuento1DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento1DetalleMovimientoInventario.add(jButtondescuento1DetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento1DetalleMovimientoInventario.add(jTextFielddescuento1DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetalleMovimientoInventario.add(jLabeldescuento2DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetalleMovimientoInventario.add(jButtondescuento2DetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetalleMovimientoInventario.add(jTextFielddescuento2DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetalleMovimientoInventario.add(jLabelserieDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetalleMovimientoInventario.add(jButtonserieDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetalleMovimientoInventario.add(jTextFieldserieDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteDetalleMovimientoInventario.add(jLabelloteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetalleMovimientoInventario.add(jButtonloteDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteDetalleMovimientoInventario.add(jTextFieldloteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario.add(jLabelfecha_elaboracion_loteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario.add(jButtonfecha_elaboracion_loteDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario.add(jDateChooserfecha_elaboracion_loteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidad_loteDetalleMovimientoInventario.add(jLabelfecha_caducidad_loteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidad_loteDetalleMovimientoInventario.add(jButtonfecha_caducidad_loteDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidad_loteDetalleMovimientoInventario.add(jDateChooserfecha_caducidad_loteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_novedad_productoDetalleMovimientoInventario.add(jLabelid_novedad_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleMovimientoInventario.add(jButtonid_novedad_productoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleMovimientoInventario.add(jButtonid_novedad_productoDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_novedad_productoDetalleMovimientoInventario.add(jComboBoxid_novedad_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleMovimientoInventario.add(jLabelid_centro_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleMovimientoInventario.add(jButtonid_centro_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleMovimientoInventario.add(jButtonid_centro_costoDetalleMovimientoInventarioArbol, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 4;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleMovimientoInventario.add(jButtonid_centro_costoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 5;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleMovimientoInventario.add(jButtonid_centro_costoDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleMovimientoInventario.add(jComboBoxid_centro_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.add(jLabelid_cuenta_contable_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.add(jButtonid_cuenta_contable_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.add(jButtonid_cuenta_contable_costoDetalleMovimientoInventarioArbol, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 4;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.add(jButtonid_cuenta_contable_costoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 5;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.add(jButtonid_cuenta_contable_costoDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario.add(jComboBoxid_cuenta_contable_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jLabelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 3;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 4;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jButtonid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventarioUpdate, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario.add(jComboBoxid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleMovimientoInventario.add(jLabelnumero_comprobanteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleMovimientoInventario.add(jButtonnumero_comprobanteDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleMovimientoInventario.add(jTextFieldnumero_comprobanteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellote_clienteDetalleMovimientoInventario.add(jLabellote_clienteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanellote_clienteDetalleMovimientoInventario.add(jButtonlote_clienteDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsDetalleMovimientoInventario);
	}

	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellote_clienteDetalleMovimientoInventario.add(jTextFieldlote_clienteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_empresaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_sucursalDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_ejercicioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_periodoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_anioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_mesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_estado_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPaneldescuentoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelivaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPaneliva_valorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelcosto_ivaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPaneliceDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelice_valorDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPaneldescuento1DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPaneldescuento2DetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelserieDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelloteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelfecha_elaboracion_loteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelfecha_caducidad_loteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_centro_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_cuenta_contable_costoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelid_tipo_detalle_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanelnumero_comprobanteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposOcultosDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposOcultosDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleMovimientoInventario.add(this.jPanellote_clienteDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposOcultosDetalleMovimientoInventario % 1==0) {
		iXPanelCamposOcultosDetalleMovimientoInventario=0;
		iYPanelCamposOcultosDetalleMovimientoInventario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPanelidDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPanelid_movimiento_inventarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPanelid_bodegaDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPanelid_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPanelid_unidadDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPaneldescripcionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciovaloresDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciovaloresDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleMovimientoInventario.add(this.jPanelcantidadDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciovaloresDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciovaloresDetalleMovimientoInventario=0;
		iYPanelCamposIniciovaloresDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciovaloresDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciovaloresDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleMovimientoInventario.add(this.jPanelcosto_unitarioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciovaloresDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciovaloresDetalleMovimientoInventario=0;
		iYPanelCamposIniciovaloresDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciovaloresDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciovaloresDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleMovimientoInventario.add(this.jPanelcosto_totalDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciovaloresDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciovaloresDetalleMovimientoInventario=0;
		iYPanelCamposIniciovaloresDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciovaloresDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciovaloresDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleMovimientoInventario.add(this.jPaneldisponibleDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciovaloresDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciovaloresDetalleMovimientoInventario=0;
		iYPanelCamposIniciovaloresDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMovimientoInventario.gridy = iYPanelCamposIniciogeneralDetalleMovimientoInventario;
	this.gridBagConstraintsDetalleMovimientoInventario.gridx = iXPanelCamposIniciogeneralDetalleMovimientoInventario++;
	this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleMovimientoInventario.add(this.jPanelid_novedad_productoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);



	if(iXPanelCamposIniciogeneralDetalleMovimientoInventario % 1==0) {
		iXPanelCamposIniciogeneralDetalleMovimientoInventario=0;
		iYPanelCamposIniciogeneralDetalleMovimientoInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesDetalleMovimientoInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesFormularioDetalleMovimientoInventario);
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleMovimientoInventario.add(this.jComboBoxTiposAccionesFormularioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleMovimientoInventario.add(this.jCheckBoxPostAccionNuevoDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleMovimientoInventario.add(this.jCheckBoxPostAccionSinCerrarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleMovimientoInventario.add(this.jCheckBoxPostAccionSinMensajeDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleMovimientoInventario.add(this.jButtonModificarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);							

		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleMovimientoInventario.add(this.jButtonEliminarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleMovimientoInventario.add(this.jButtonActualizarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);


		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleMovimientoInventario.add(this.jButtonGuardarCambiosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);	
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleMovimientoInventario.add(this.jButtonCancelarDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleMovimientoInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleMovimientoInventario.ipadx = 100;
				
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
		
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =0;
		this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleMovimientoInventario = new DetalleMovimientoInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Movimiento Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Movimiento Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Movimiento Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleMovimientoInventarioModel detallemovimientoinventarioModel=new DetalleMovimientoInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleMovimientoInventarioModel.DetalleMovimientoInventarioFocusTraversalPolicy detallemovimientoinventarioFocusTraversalPolicy = detallemovimientoinventarioModel.new DetalleMovimientoInventarioFocusTraversalPolicy(this);
			
			//detallemovimientoinventarioFocusTraversalPolicy.setdetallemovimientoinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallemovimientoinventarioModel);
			
			
			this.jContentPaneDetalleDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleMovimientoInventario = new GridBagLayout();	
			this.jContentPaneDetalleDetalleMovimientoInventario.setLayout(gridaBagLayoutDetalleDetalleMovimientoInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleMovimientoInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
					
				this.gridBagConstraintsDetalleMovimientoInventario.gridwidth=1;
				
				this.jContentPaneDetalleDetalleMovimientoInventario.add(jTtoolBarDetalleDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);								
				*/
}
			
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario=   new JScrollPane(jContentPaneDetalleDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridwidth = 2;
		this.gridBagConstraintsDetalleMovimientoInventario.gridheight = 1;
		iGridyRelaciones = iGridyRelaciones++;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleMovimientoInventario.add(jPanelCamposIniciogeneralDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);


		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleMovimientoInventario.gridy = 1;
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
		this.gridBagConstraintsDetalleMovimientoInventario.gridwidth = 1;
		this.gridBagConstraintsDetalleMovimientoInventario.gridheight = 1;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleMovimientoInventario.add(jPanelCamposIniciovaloresDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);
			
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
						&& detallemovimientoinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(this.puedeCargarPorParteNovedadSeguimiento,false,-1);
					
					if(this.detallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleMovimientoInventario= new GridBagConstraints();
						this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
						this.jContentPaneDetalleDetalleMovimientoInventario.add(this.jTabbedPaneRelacionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleMovimientoInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleMovimientoInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
					this.gridBagConstraintsDetalleMovimientoInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
					
					this.gridBagConstraintsDetalleMovimientoInventario.gridwidth=1;
				
					this.jContentPaneDetalleDetalleMovimientoInventario.add(jPanelCamposOcultosDetalleMovimientoInventario, gridBagConstraintsDetalleMovimientoInventario);
				
					this.jPanelCamposOcultosDetalleMovimientoInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	        this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDetalleMovimientoInventario.gridwidth=1;
			
			
			this.jContentPaneDetalleDetalleMovimientoInventario.add(this.jPanelAccionesFormularioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);							
			
			
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
	        this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
	        
			this.gridBagConstraintsDetalleMovimientoInventario.gridwidth=1;
			
			this.jContentPaneDetalleDetalleMovimientoInventario.add(this.jPanelAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleMovimientoInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario=   new JScrollPane(this.jPanelCamposDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
			this.gridBagConstraintsDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleMovimientoInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);			
			
			this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
			
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleMovimientoInventario, this.gridBagConstraintsDetalleMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleMovimientoInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleMovimientoInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		this.novedadseguimientoSessionBean.setConGuardarRelaciones(false);
		this.novedadseguimientoSessionBean.setEsGuardarRelacionado(true);

		this.novedadseguimientoBeanSwingJInternalFrame=null;//new NovedadSeguimientoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadseguimientoBeanSwingJInternalFramePopup=new NovedadSeguimientoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadseguimientoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {

				NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadseguimientoSessionBean.setEsGuardarRelacionado(true);

				this.novedadseguimientoBeanSwingJInternalFrame=new NovedadSeguimientoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadseguimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadseguimientoBeanSwingJInternalFrame.setnovedadseguimientoSessionBean(this.novedadseguimientoSessionBean);

				//this.gridBagConstraintsDetalleMovimientoInventario = new GridBagConstraints();
				//this.gridBagConstraintsDetalleMovimientoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleMovimientoInventario.gridx = 0;
				//this.jContentPaneDetalleDetalleMovimientoInventario.add(this.novedadseguimientoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleMovimientoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleMovimientoInventario.add("Novedad Seguimientoes",this.novedadseguimientoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleMovimientoInventario.setComponentAt(iIndexTab,this.novedadseguimientoBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadseguimientoSessionBean.setEsGuardarRelacionado(false);
				this.novedadseguimientoBeanSwingJInternalFrame=null;//new NovedadSeguimientoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedadSeguimiento) {
					this.jTabbedPaneRelacionesDetalleMovimientoInventario.add("Novedad Seguimientoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNovedadSeguimientoBeanSwingJInternalFrame(List<DetalleMovimientoInventario> detallemovimientoinventarios,DetalleMovimientoInventario detallemovimientoinventario,NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadseguimientoBeanSwingJInternalFrame=new NovedadSeguimientoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadseguimientoBeanSwingJInternalFrame.getNovedadSeguimientoLogic().setConnexion(this.detallemovimientoinventarioLogic.getConnexion());

					novedadseguimientoBeanSwingJInternalFrame.setdetallemovimientoinventariosForeignKey(detallemovimientoinventarios);
					novedadseguimientoBeanSwingJInternalFrame.setdetallemovimientoinventarioForeignKey(detallemovimientoinventario);
					novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleMovimientoInventario(true);
					novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setlidDetalleMovimientoInventarioActual(detallemovimientoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadseguimientoBeanSwingJInternalFrame.cargarCombosForeignKeyNovedadSeguimiento(novedadseguimientoBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadseguimientoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleMovimientoInventario(true);
					novedadseguimientoBeanSwingJInternalFrame.setid_detalle_movimiento_inventarioFK_IdDetalleMovimientoInventario(detallemovimientoinventario.getId());

					if(!this.conCargarFormDetalle) {
						novedadseguimientoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadseguimientoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleMovimientoInventarioForeignKey(detallemovimientoinventario,1,false,true,true);
					novedadseguimientoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadseguimientoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleMovimientoInventario");
					novedadseguimientoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleMovimientoInventario");
					novedadseguimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadSeguimiento(true);
					novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedadSeguimiento("n",novedadseguimientoBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadseguimientoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadseguimientoBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadseguimientoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadSeguimiento("relacionado");
					} else {
						novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadSeguimiento("no_relacionado");
					}

					novedadseguimientoBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedadSeguimiento().setVisible(false);

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
