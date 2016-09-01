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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleProveConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleProveDetalleFormJInternalFrame extends DetalleProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleProve;
	
	protected JMenuBar jmenuBarDetalleDetalleProve;
	
	protected JMenu jmenuDetalleDetalleProve;
	protected JMenu jmenuDetalleArchivoDetalleProve;
	protected JMenu jmenuDetalleAccionesDetalleProve;
	protected JMenu jmenuDetalleDatosDetalleProve;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleProve;	
	protected GridBagConstraints gridBagConstraintsDetalleProve;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleProveBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleProve;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected SucursalBeanSwingJInternalFrame sucursalmovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmovimiento="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected EstadoDetalleClienteBeanSwingJInternalFrame estadodetalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallecliente="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleProveSessionBean detalleproveSessionBean;
	
	

	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;
	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePagoAuto=false;
	public PagoAutoSessionBean pagoautoSessionBean;

	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;
	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriPago=false;
	public AutoriPagoSessionBean autoripagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public SucursalSessionBean sucursalmovimientoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public OrdenCompraSessionBean ordencompraSessionBean;
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetalleProveLogic detalleproveLogic;
	
	public JScrollPane jScrollPanelDatosDetalleProve;
	public JScrollPane jScrollPanelDatosEdicionDetalleProve;
	public JScrollPane jScrollPanelDatosGeneralDetalleProve;
	
	protected JPanel jPanelCamposDetalleProve;    
	protected JPanel jPanelCamposOcultosDetalleProve;    	
	protected JPanel jPanelAccionesDetalleProve;
	protected JPanel jPanelAccionesFormularioDetalleProve;
    
	
	
	protected Integer iXPanelCamposDetalleProve=0;
	protected Integer iYPanelCamposDetalleProve=0;
	
	protected Integer iXPanelCamposOcultosDetalleProve=0;
	protected Integer iYPanelCamposOcultosDetalleProve=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleProve;
	public JButton jButtonModificarDetalleProve;
	public JButton jButtonActualizarDetalleProve;
    public JButton jButtonEliminarDetalleProve;
	public JButton jButtonCancelarDetalleProve;
    public JButton jButtonGuardarCambiosDetalleProve;
	public JButton jButtonGuardarCambiosTablaDetalleProve;
	protected JButton jButtonCerrarDetalleProve;
	
	
	protected JButton jButtonProcesarInformacionDetalleProve;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleProve;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleProve;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleProve;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleProve;
	protected JButton jButtonModificarToolBarDetalleProve;
	protected JButton jButtonActualizarToolBarDetalleProve;
    protected JButton jButtonEliminarToolBarDetalleProve;
	protected JButton jButtonCancelarToolBarDetalleProve;
    protected JButton jButtonGuardarCambiosToolBarDetalleProve;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleProve;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleProve;
	protected JButton jButtonCerrarToolBarDetalleProve;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleProve;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleProve;
	protected JMenuItem jMenuItemModificarDetalleProve;
	protected JMenuItem jMenuItemActualizarDetalleProve;
    protected JMenuItem jMenuItemEliminarDetalleProve;
	protected JMenuItem jMenuItemCancelarDetalleProve;
    protected JMenuItem jMenuItemGuardarCambiosDetalleProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleProve;
	protected JMenuItem jMenuItemCerrarDetalleProve;
	protected JMenuItem jMenuItemDetalleCerrarDetalleProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleProve;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleProve;
	protected JMenuItem jMenuItemMostrarOcultarDetalleProve;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleProve;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleProve;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleProve;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleProve;
	public JLabel jLabelIdDetalleProve;
	public JLabel jLabelidDetalleProve;
	public JButton jButtonidDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ventaDetalleProve;
	public JLabel jLabelfecha_ventaDetalleProve;
	//public JFormattedTextField jDateChooserfecha_ventaDetalleProve;

	public JDateChooser jDateChooserfecha_ventaDetalleProve;
	public JButton jButtonfecha_ventaDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDetalleProve;
	public JLabel jLabelfecha_emisionDetalleProve;
	//public JFormattedTextField jDateChooserfecha_emisionDetalleProve;

	public JDateChooser jDateChooserfecha_emisionDetalleProve;
	public JButton jButtonfecha_emisionDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pagoDetalleProve;
	public JLabel jLabelfecha_pagoDetalleProve;
	//public JFormattedTextField jDateChooserfecha_pagoDetalleProve;

	public JDateChooser jDateChooserfecha_pagoDetalleProve;
	public JButton jButtonfecha_pagoDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoDetalleProve;
	public JLabel jLabelfecha_vencimientoDetalleProve;
	//public JFormattedTextField jDateChooserfecha_vencimientoDetalleProve;

	public JDateChooser jDateChooserfecha_vencimientoDetalleProve;
	public JButton jButtonfecha_vencimientoDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_localDetalleProve;
	public JLabel jLabelmonto_mone_localDetalleProve;
	public JTextField jTextFieldmonto_mone_localDetalleProve;
	public JButton jButtonmonto_mone_localDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_extraDetalleProve;
	public JLabel jLabelmonto_mone_extraDetalleProve;
	public JTextField jTextFieldmonto_mone_extraDetalleProve;
	public JButton jButtonmonto_mone_extraDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleProve;
	public JLabel jLabelnumero_comprobanteDetalleProve;
	public JTextField jTextFieldnumero_comprobanteDetalleProve;
	public JButton jButtonnumero_comprobanteDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaDetalleProve;
	public JLabel jLabelnumero_facturaDetalleProve;
	public JTextField jTextFieldnumero_facturaDetalleProve;
	public JButton jButtonnumero_facturaDetalleProveBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localDetalleProve;
	public JLabel jLabeldebito_mone_localDetalleProve;
	public JTextField jTextFielddebito_mone_localDetalleProve;
	public JButton jButtondebito_mone_localDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localDetalleProve;
	public JLabel jLabelcredito_mone_localDetalleProve;
	public JTextField jTextFieldcredito_mone_localDetalleProve;
	public JButton jButtoncredito_mone_localDetalleProveBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraDetalleProve;
	public JLabel jLabeldebito_mone_extraDetalleProve;
	public JTextField jTextFielddebito_mone_extraDetalleProve;
	public JButton jButtondebito_mone_extraDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_extraDetalleProve;
	public JLabel jLabelcredito_mone_extraDetalleProve;
	public JTextField jTextFieldcredito_mone_extraDetalleProve;
	public JButton jButtoncredito_mone_extraDetalleProveBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleProve;
	public JLabel jLabeldescripcionDetalleProve;
	public JTextArea jTextAreadescripcionDetalleProve;
	public JScrollPane jscrollPanedescripcionDetalleProve;
	public JButton jButtondescripcionDetalleProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleProve;
	public JLabel jLabelid_empresaDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleProve;
	public JButton jButtonid_empresaDetalleProve= new JButtonMe();
	public JButton jButtonid_empresaDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleProve;
	public JLabel jLabelid_sucursalDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleProve;
	public JButton jButtonid_sucursalDetalleProve= new JButtonMe();
	public JButton jButtonid_sucursalDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_movimientoDetalleProve;
	public JLabel jLabelid_sucursal_movimientoDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_movimientoDetalleProve;
	public JButton jButtonid_sucursal_movimientoDetalleProve= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleProve;
	public JLabel jLabelid_ejercicioDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleProve;
	public JButton jButtonid_ejercicioDetalleProve= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleProve;
	public JLabel jLabelid_periodoDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleProve;
	public JButton jButtonid_periodoDetalleProve= new JButtonMe();
	public JButton jButtonid_periodoDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDetalleProve;
	public JLabel jLabelid_moduloDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDetalleProve;
	public JButton jButtonid_moduloDetalleProve= new JButtonMe();
	public JButton jButtonid_moduloDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_moduloDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaDetalleProve;
	public JLabel jLabelid_monedaDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaDetalleProve;
	public JButton jButtonid_monedaDetalleProve= new JButtonMe();
	public JButton jButtonid_monedaDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_monedaDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDetalleProve;
	public JLabel jLabelid_clienteDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDetalleProve;
	public JButton jButtonid_clienteDetalleProve= new JButtonMe();
	public JButton jButtonid_clienteDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_clienteDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionDetalleProve;
	public JLabel jLabelid_transaccionDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionDetalleProve;
	public JButton jButtonid_transaccionDetalleProve= new JButtonMe();
	public JButton jButtonid_transaccionDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_transaccionDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloDetalleProve;
	public JLabel jLabelid_tipo_transaccion_moduloDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloDetalleProve;
	public JButton jButtonid_tipo_transaccion_moduloDetalleProve= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetalleProve;
	public JLabel jLabelid_asiento_contableDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetalleProve;
	public JButton jButtonid_asiento_contableDetalleProve= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaDetalleProve;
	public JLabel jLabelid_facturaDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaDetalleProve;
	public JButton jButtonid_facturaDetalleProve= new JButtonMe();
	public JButton jButtonid_facturaDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_facturaDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_orden_compraDetalleProve;
	public JLabel jLabelid_orden_compraDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraDetalleProve;
	public JButton jButtonid_orden_compraDetalleProve= new JButtonMe();
	public JButton jButtonid_orden_compraDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraDetalleProveBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraDetalleProveArbol= new JButtonMe();

	public JPanel jPanelid_estado_detalle_clienteDetalleProve;
	public JLabel jLabelid_estado_detalle_clienteDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_clienteDetalleProve;
	public JButton jButtonid_estado_detalle_clienteDetalleProve= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleProve;
	public JLabel jLabelid_anioDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleProve;
	public JButton jButtonid_anioDetalleProve= new JButtonMe();
	public JButton jButtonid_anioDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleProveBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleProve;
	public JLabel jLabelid_mesDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleProve;
	public JButton jButtonid_mesDetalleProve= new JButtonMe();
	public JButton jButtonid_mesDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleProveBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleProve;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=1342;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleProveDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleProve=new JPanel();
				this.jPanelAccionesFormularioDetalleProve=new JPanel();
				this.jmenuBarDetalleDetalleProve=new JMenuBar();
				this.jTtoolBarDetalleDetalleProve=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleProveDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleProve() {
		return this.jButtonActualizarToolBarDetalleProve;
	}
	
	public JButton getjButtonEliminarToolBarDetalleProve() {
		return this.jButtonEliminarToolBarDetalleProve;
	}
	
	public JButton getjButtonCancelarToolBarDetalleProve() {
		return this.jButtonCancelarToolBarDetalleProve;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleProve() {
		return this.jButtonProcesarInformacionDetalleProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleProve)	{
		this.jButtonProcesarInformacionDetalleProve = jButtonProcesarInformacionDetalleProve;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleProve() {
		return this.jComboBoxTiposAccionesDetalleProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleProve(
			JComboBox jComboBoxTiposRelacionesDetalleProve) {
		this.jComboBoxTiposRelacionesDetalleProve = jComboBoxTiposRelacionesDetalleProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleProve(
			JComboBox jComboBoxTiposAccionesDetalleProve) {
		this.jComboBoxTiposAccionesDetalleProve = jComboBoxTiposAccionesDetalleProve;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleProve() {
		return this.jComboBoxTiposAccionesFormularioDetalleProve;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleProve(
			JComboBox jComboBoxTiposAccionesFormularioDetalleProve) {
		this.jComboBoxTiposAccionesFormularioDetalleProve = jComboBoxTiposAccionesFormularioDetalleProve;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleproveSessionBean=new DetalleProveSessionBean();
		
		this.detalleproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleproveSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pagoautoSessionBean=new PagoAutoSessionBean();
		//this.autoripagoSessionBean=new AutoriPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Prove MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleProve= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleProve=new JButtonMe();
				this.jButtonModificarToolBarDetalleProve=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleProve,this.jTtoolBarDetalleDetalleProve,
							"actualizar","actualizar","Actualizar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleProve,this.jTtoolBarDetalleDetalleProve,
							"eliminar","eliminar","Eliminar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleProve,this.jTtoolBarDetalleDetalleProve,
							"cancelar","cancelar","Cancelar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleProve,this.jTtoolBarDetalleDetalleProve,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleProve=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleProve=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleProve=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleProve=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleProve=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleProve= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleProve.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleProve,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleProve= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleProve.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleProve,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleProve= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleProve.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleProve,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleProve= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleProve.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleProve,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleProve.add(this.jMenuItemDetalleCerrarDetalleProve);
		
		this.jmenuDetalleAccionesDetalleProve.add(this.jMenuItemActualizarDetalleProve);
		this.jmenuDetalleAccionesDetalleProve.add(this.jMenuItemEliminarDetalleProve);
		this.jmenuDetalleAccionesDetalleProve.add(this.jMenuItemCancelarDetalleProve);		
		
		//this.jmenuDetalleDatosDetalleProve.add(this.jMenuItemDetalleAbrirOrderByDetalleProve);				
		this.jmenuDetalleDatosDetalleProve.add(this.jMenuItemDetalleMostarOcultarDetalleProve);				
				
		//this.jmenuDetalleAccionesDetalleProve.add(this.jMenuItemGuardarCambiosDetalleProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleProve.add(this.jmenuDetalleArchivoDetalleProve);		
		this.jmenuBarDetalleDetalleProve.add(this.jmenuDetalleAccionesDetalleProve);		
		this.jmenuBarDetalleDetalleProve.add(this.jmenuDetalleDatosDetalleProve);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetalleProve.add(this.jmenuDetalleDetalleProve);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleProve);				
	}
	
	
	public void inicializarElementosCamposDetalleProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleProve = new JLabelMe();
		jLabelIdDetalleProve.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleProve = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleProve= new GridBagLayout();

		this.jPanelidDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);

		jLabelidDetalleProve = new JLabel();
		jLabelidDetalleProve.setText("Id");

		jLabelidDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_ventaDetalleProve = new JLabelMe();
		this.jLabelfecha_ventaDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_FECHAVENTA+" : *");
		this.jLabelfecha_ventaDetalleProve.setToolTipText("Fecha Venta");
		this.jLabelfecha_ventaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_ventaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ventaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ventaDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ventaDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_FECHAVENTA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelfecha_ventaDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		//jFormattedTextFieldfecha_ventaDetalleProve= new JFormattedTextFieldMe();

		jDateChooserfecha_ventaDetalleProve= new JDateChooser();
		jDateChooserfecha_ventaDetalleProve.setEnabled(false);
		jDateChooserfecha_ventaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ventaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ventaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ventaDetalleProve.setDate(new Date());
		jDateChooserfecha_ventaDetalleProve.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ventaDetalleProve.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ventaDetalleProveBusqueda= new JButtonMe();
		this.jButtonfecha_ventaDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ventaDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ventaDetalleProveBusqueda.setText("U");
		this.jButtonfecha_ventaDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ventaDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ventaDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ventaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ventaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ventaDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ventaDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionDetalleProve = new JLabelMe();
		this.jLabelfecha_emisionDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDetalleProve.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelfecha_emisionDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		//jFormattedTextFieldfecha_emisionDetalleProve= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDetalleProve= new JDateChooser();
		jDateChooserfecha_emisionDetalleProve.setEnabled(false);
		jDateChooserfecha_emisionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDetalleProve.setDate(new Date());
		jDateChooserfecha_emisionDetalleProve.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDetalleProve.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDetalleProveBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDetalleProveBusqueda.setText("U");
		this.jButtonfecha_emisionDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pagoDetalleProve = new JLabelMe();
		this.jLabelfecha_pagoDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_FECHAPAGO+" : *");
		this.jLabelfecha_pagoDetalleProve.setToolTipText("Fecha Pago");
		this.jLabelfecha_pagoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pagoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pagoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pagoDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pagoDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_FECHAPAGO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelfecha_pagoDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		//jFormattedTextFieldfecha_pagoDetalleProve= new JFormattedTextFieldMe();

		jDateChooserfecha_pagoDetalleProve= new JDateChooser();
		jDateChooserfecha_pagoDetalleProve.setEnabled(false);
		jDateChooserfecha_pagoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pagoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pagoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pagoDetalleProve.setDate(new Date());
		jDateChooserfecha_pagoDetalleProve.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pagoDetalleProve.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pagoDetalleProveBusqueda= new JButtonMe();
		this.jButtonfecha_pagoDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pagoDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pagoDetalleProveBusqueda.setText("U");
		this.jButtonfecha_pagoDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pagoDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pagoDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pagoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pagoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pagoDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pagoDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoDetalleProve = new JLabelMe();
		this.jLabelfecha_vencimientoDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoDetalleProve.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelfecha_vencimientoDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		//jFormattedTextFieldfecha_vencimientoDetalleProve= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoDetalleProve= new JDateChooser();
		jDateChooserfecha_vencimientoDetalleProve.setEnabled(false);
		jDateChooserfecha_vencimientoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoDetalleProve.setDate(new Date());
		jDateChooserfecha_vencimientoDetalleProve.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoDetalleProve.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoDetalleProveBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoDetalleProveBusqueda.setText("U");
		this.jButtonfecha_vencimientoDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_localDetalleProve = new JLabelMe();
		this.jLabelmonto_mone_localDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_MONTOMONELOCAL+" : *");
		this.jLabelmonto_mone_localDetalleProve.setToolTipText("Monto Mone Local");
		this.jLabelmonto_mone_localDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_localDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_localDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_localDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_MONTOMONELOCAL);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelmonto_mone_localDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFieldmonto_mone_localDetalleProve= new JTextFieldMe();
		jTextFieldmonto_mone_localDetalleProve.setEnabled(false);
		jTextFieldmonto_mone_localDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_localDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_localDetalleProve.setText("0.0");

		this.jButtonmonto_mone_localDetalleProveBusqueda= new JButtonMe();
		this.jButtonmonto_mone_localDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_localDetalleProveBusqueda.setText("U");
		this.jButtonmonto_mone_localDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_localDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_localDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_localDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_localDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_localDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_localDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_extraDetalleProve = new JLabelMe();
		this.jLabelmonto_mone_extraDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_MONTOMONEEXTRA+" : *");
		this.jLabelmonto_mone_extraDetalleProve.setToolTipText("Monto Mone Extra");
		this.jLabelmonto_mone_extraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_extraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_extraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_extraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_extraDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_extraDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_MONTOMONEEXTRA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelmonto_mone_extraDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFieldmonto_mone_extraDetalleProve= new JTextFieldMe();
		jTextFieldmonto_mone_extraDetalleProve.setEnabled(false);
		jTextFieldmonto_mone_extraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_extraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_extraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_extraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_extraDetalleProve.setText("0.0");

		this.jButtonmonto_mone_extraDetalleProveBusqueda= new JButtonMe();
		this.jButtonmonto_mone_extraDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_extraDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_extraDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_extraDetalleProveBusqueda.setText("U");
		this.jButtonmonto_mone_extraDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_extraDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_extraDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_extraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_extraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_extraDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_extraDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleProve = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteDetalleProve.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFieldnumero_comprobanteDetalleProve= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleProve.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleProveBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleProveBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaDetalleProve = new JLabelMe();
		this.jLabelnumero_facturaDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaDetalleProve.setToolTipText("Num Factura");
		this.jLabelnumero_facturaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelnumero_facturaDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFieldnumero_facturaDetalleProve= new JTextFieldMe();

		jTextFieldnumero_facturaDetalleProve.setEnabled(false);
		jTextFieldnumero_facturaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaDetalleProveBusqueda= new JButtonMe();
		this.jButtonnumero_facturaDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaDetalleProveBusqueda.setText("U");
		this.jButtonnumero_facturaDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localDetalleProve = new JLabelMe();
		this.jLabeldebito_mone_localDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localDetalleProve.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPaneldebito_mone_localDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFielddebito_mone_localDetalleProve= new JTextFieldMe();
		jTextFielddebito_mone_localDetalleProve.setEnabled(false);
		jTextFielddebito_mone_localDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localDetalleProve.setText("0.0");

		this.jButtondebito_mone_localDetalleProveBusqueda= new JButtonMe();
		this.jButtondebito_mone_localDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localDetalleProveBusqueda.setText("U");
		this.jButtondebito_mone_localDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localDetalleProve = new JLabelMe();
		this.jLabelcredito_mone_localDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localDetalleProve.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelcredito_mone_localDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFieldcredito_mone_localDetalleProve= new JTextFieldMe();
		jTextFieldcredito_mone_localDetalleProve.setEnabled(false);
		jTextFieldcredito_mone_localDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localDetalleProve.setText("0.0");

		this.jButtoncredito_mone_localDetalleProveBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localDetalleProveBusqueda.setText("U");
		this.jButtoncredito_mone_localDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraDetalleProve = new JLabelMe();
		this.jLabeldebito_mone_extraDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraDetalleProve.setToolTipText("Debito Mone Extra");
		this.jLabeldebito_mone_extraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPaneldebito_mone_extraDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFielddebito_mone_extraDetalleProve= new JTextFieldMe();
		jTextFielddebito_mone_extraDetalleProve.setEnabled(false);
		jTextFielddebito_mone_extraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraDetalleProve.setText("0.0");

		this.jButtondebito_mone_extraDetalleProveBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraDetalleProveBusqueda.setText("U");
		this.jButtondebito_mone_extraDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_extraDetalleProve = new JLabelMe();
		this.jLabelcredito_mone_extraDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_CREDITOMONEEXTRA+" : *");
		this.jLabelcredito_mone_extraDetalleProve.setToolTipText("Credito Mone Extra");
		this.jLabelcredito_mone_extraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_extraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_extraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_extraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_extraDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_extraDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelcredito_mone_extraDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextFieldcredito_mone_extraDetalleProve= new JTextFieldMe();
		jTextFieldcredito_mone_extraDetalleProve.setEnabled(false);
		jTextFieldcredito_mone_extraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_extraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_extraDetalleProve.setText("0.0");

		this.jButtoncredito_mone_extraDetalleProveBusqueda= new JButtonMe();
		this.jButtoncredito_mone_extraDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_extraDetalleProveBusqueda.setText("U");
		this.jButtoncredito_mone_extraDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_extraDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_extraDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_extraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_extraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_extraDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_extraDetalleProveBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleProve = new JLabelMe();
		this.jLabeldescripcionDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleProve.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPaneldescripcionDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jTextAreadescripcionDetalleProve= new JTextAreaMe();
		jTextAreadescripcionDetalleProve.setEnabled(false);
		jTextAreadescripcionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleProve.setLineWrap(true);
		jTextAreadescripcionDetalleProve.setWrapStyleWord(true);
		jTextAreadescripcionDetalleProve.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleProve.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleProve = new JScrollPane(jTextAreadescripcionDetalleProve);
		jscrollPanedescripcionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleProveBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleProveBusqueda.setText("U");
		this.jButtondescripcionDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleProveBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleProve = new JLabelMe();
		this.jLabelid_empresaDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleProve.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_empresaDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_empresaDetalleProve= new JComboBoxMe();
		jComboBoxid_empresaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleProve.setEnabled(false);

		this.jButtonid_empresaDetalleProve= new JButtonMe();
		this.jButtonid_empresaDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleProve.setText("Buscar");
		this.jButtonid_empresaDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleProve"));

		this.jButtonid_empresaDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleProveBusqueda.setText("U");
		this.jButtonid_empresaDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleProveUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleProveUpdate.setText("U");
		this.jButtonid_empresaDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleProveUpdate"));



					
		this.jLabelid_sucursalDetalleProve = new JLabelMe();
		this.jLabelid_sucursalDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleProve.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_sucursalDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_sucursalDetalleProve= new JComboBoxMe();
		jComboBoxid_sucursalDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleProve.setEnabled(false);

		this.jButtonid_sucursalDetalleProve= new JButtonMe();
		this.jButtonid_sucursalDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleProve.setText("Buscar");
		this.jButtonid_sucursalDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleProve"));

		this.jButtonid_sucursalDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleProveBusqueda.setText("U");
		this.jButtonid_sucursalDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleProveUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleProveUpdate.setText("U");
		this.jButtonid_sucursalDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleProveUpdate"));



					
		this.jLabelid_sucursal_movimientoDetalleProve = new JLabelMe();
		this.jLabelid_sucursal_movimientoDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO+" : *");
		this.jLabelid_sucursal_movimientoDetalleProve.setToolTipText("Sucursal Movimiento");
		this.jLabelid_sucursal_movimientoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_movimientoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_movimientoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_movimientoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_movimientoDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_movimientoDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_sucursal_movimientoDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_sucursal_movimientoDetalleProve= new JComboBoxMe();
		jComboBoxid_sucursal_movimientoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_movimientoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursal_movimientoDetalleProve= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleProve.setText("Buscar");
		this.jButtonid_sucursal_movimientoDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_movimientoDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_movimientoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleProve"));

		this.jButtonid_sucursal_movimientoDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setText("U");
		this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_movimientoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_movimientoDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_movimientoDetalleProveUpdate= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_movimientoDetalleProveUpdate.setText("U");
		this.jButtonid_sucursal_movimientoDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_movimientoDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_movimientoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleProveUpdate"));



					
		this.jLabelid_ejercicioDetalleProve = new JLabelMe();
		this.jLabelid_ejercicioDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleProve.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_ejercicioDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_ejercicioDetalleProve= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleProve.setEnabled(false);

		this.jButtonid_ejercicioDetalleProve= new JButtonMe();
		this.jButtonid_ejercicioDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleProve.setText("Buscar");
		this.jButtonid_ejercicioDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleProve"));

		this.jButtonid_ejercicioDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleProveBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleProveUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleProveUpdate.setText("U");
		this.jButtonid_ejercicioDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleProveUpdate"));



					
		this.jLabelid_periodoDetalleProve = new JLabelMe();
		this.jLabelid_periodoDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleProve.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_periodoDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_periodoDetalleProve= new JComboBoxMe();
		jComboBoxid_periodoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleProve.setEnabled(false);

		this.jButtonid_periodoDetalleProve= new JButtonMe();
		this.jButtonid_periodoDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleProve.setText("Buscar");
		this.jButtonid_periodoDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleProve"));

		this.jButtonid_periodoDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleProveBusqueda.setText("U");
		this.jButtonid_periodoDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleProveUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleProveUpdate.setText("U");
		this.jButtonid_periodoDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleProveUpdate"));



					
		this.jLabelid_moduloDetalleProve = new JLabelMe();
		this.jLabelid_moduloDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDetalleProve.setToolTipText("Modulo");
		this.jLabelid_moduloDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_moduloDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_moduloDetalleProve= new JComboBoxMe();
		jComboBoxid_moduloDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDetalleProve.setEnabled(false);

		this.jButtonid_moduloDetalleProve= new JButtonMe();
		this.jButtonid_moduloDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleProve.setText("Buscar");
		this.jButtonid_moduloDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleProve"));

		this.jButtonid_moduloDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_moduloDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleProveBusqueda.setText("U");
		this.jButtonid_moduloDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_moduloDetalleProveUpdate= new JButtonMe();
		this.jButtonid_moduloDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleProveUpdate.setText("U");
		this.jButtonid_moduloDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleProveUpdate"));



					
		this.jLabelid_monedaDetalleProve = new JLabelMe();
		this.jLabelid_monedaDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaDetalleProve.setToolTipText("Moneda");
		this.jLabelid_monedaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_monedaDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_monedaDetalleProve= new JComboBoxMe();
		jComboBoxid_monedaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaDetalleProve= new JButtonMe();
		this.jButtonid_monedaDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleProve.setText("Buscar");
		this.jButtonid_monedaDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleProve"));

		this.jButtonid_monedaDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_monedaDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDetalleProveBusqueda.setText("U");
		this.jButtonid_monedaDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_monedaDetalleProveUpdate= new JButtonMe();
		this.jButtonid_monedaDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDetalleProveUpdate.setText("U");
		this.jButtonid_monedaDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleProveUpdate"));



					
		this.jLabelid_clienteDetalleProve = new JLabelMe();
		this.jLabelid_clienteDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDetalleProve.setToolTipText("Cliente");
		this.jLabelid_clienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_clienteDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_clienteDetalleProve= new JComboBoxMe();
		jComboBoxid_clienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDetalleProve= new JButtonMe();
		this.jButtonid_clienteDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleProve.setText("Buscar");
		this.jButtonid_clienteDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleProve"));

		this.jButtonid_clienteDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_clienteDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleProveBusqueda.setText("U");
		this.jButtonid_clienteDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_clienteDetalleProveUpdate= new JButtonMe();
		this.jButtonid_clienteDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleProveUpdate.setText("U");
		this.jButtonid_clienteDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleProveUpdate"));



					
		this.jLabelid_transaccionDetalleProve = new JLabelMe();
		this.jLabelid_transaccionDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionDetalleProve.setToolTipText("Transaccion");
		this.jLabelid_transaccionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_transaccionDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_transaccionDetalleProve= new JComboBoxMe();
		jComboBoxid_transaccionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionDetalleProve= new JButtonMe();
		this.jButtonid_transaccionDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleProve.setText("Buscar");
		this.jButtonid_transaccionDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleProve"));

		this.jButtonid_transaccionDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_transaccionDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleProveBusqueda.setText("U");
		this.jButtonid_transaccionDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_transaccionDetalleProveUpdate= new JButtonMe();
		this.jButtonid_transaccionDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleProveUpdate.setText("U");
		this.jButtonid_transaccionDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleProveUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloDetalleProve = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloDetalleProve.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_tipo_transaccion_moduloDetalleProve= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloDetalleProve.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloDetalleProve= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleProve.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleProve"));

		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleProveUpdate"));



					
		this.jLabelid_asiento_contableDetalleProve = new JLabelMe();
		this.jLabelid_asiento_contableDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetalleProve.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_asiento_contableDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_asiento_contableDetalleProve= new JComboBoxMe();
		jComboBoxid_asiento_contableDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetalleProve= new JButtonMe();
		this.jButtonid_asiento_contableDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleProve.setText("Buscar");
		this.jButtonid_asiento_contableDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleProve"));

		this.jButtonid_asiento_contableDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleProveBusqueda.setText("U");
		this.jButtonid_asiento_contableDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetalleProveUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleProveUpdate.setText("U");
		this.jButtonid_asiento_contableDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleProveUpdate"));



					
		this.jLabelid_facturaDetalleProve = new JLabelMe();
		this.jLabelid_facturaDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaDetalleProve.setToolTipText("Factura");
		this.jLabelid_facturaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_facturaDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_facturaDetalleProve= new JComboBoxMe();
		jComboBoxid_facturaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaDetalleProve= new JButtonMe();
		this.jButtonid_facturaDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleProve.setText("Buscar");
		this.jButtonid_facturaDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleProve"));

		this.jButtonid_facturaDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_facturaDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleProveBusqueda.setText("U");
		this.jButtonid_facturaDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_facturaDetalleProveUpdate= new JButtonMe();
		this.jButtonid_facturaDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleProveUpdate.setText("U");
		this.jButtonid_facturaDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleProveUpdate"));



					
		this.jLabelid_orden_compraDetalleProve = new JLabelMe();
		this.jLabelid_orden_compraDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDORDENCOMPRA+" : *");
		this.jLabelid_orden_compraDetalleProve.setToolTipText("Orden Compra");
		this.jLabelid_orden_compraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_compraDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_compraDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDORDENCOMPRA);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_orden_compraDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_orden_compraDetalleProve= new JComboBoxMe();
		jComboBoxid_orden_compraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_compraDetalleProve= new JButtonMe();
		this.jButtonid_orden_compraDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraDetalleProve.setText("Buscar");
		this.jButtonid_orden_compraDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_compraDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_compraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleProve"));

		this.jButtonid_orden_compraDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_orden_compraDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraDetalleProveBusqueda.setText("U");
		this.jButtonid_orden_compraDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_compraDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_compraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_compraDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_orden_compraDetalleProveUpdate= new JButtonMe();
		this.jButtonid_orden_compraDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraDetalleProveUpdate.setText("U");
		this.jButtonid_orden_compraDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_compraDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_compraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleProveUpdate"));


		jButtonid_orden_compraDetalleProveArbol= new JButtonMe();
		jButtonid_orden_compraDetalleProveArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraDetalleProveArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraDetalleProveArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraDetalleProveArbol.setText("Arbol");
		jButtonid_orden_compraDetalleProveArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_orden_compraDetalleProveArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraDetalleProveArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_orden_compraDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraDetalleProveArbol"));



					
		this.jLabelid_estado_detalle_clienteDetalleProve = new JLabelMe();
		this.jLabelid_estado_detalle_clienteDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDESTADODETALLECLIENTE+" : *");
		this.jLabelid_estado_detalle_clienteDetalleProve.setToolTipText("Estado Detalle Cliente");
		this.jLabelid_estado_detalle_clienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_detalle_clienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_detalle_clienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_clienteDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_clienteDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_clienteDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDESTADODETALLECLIENTE);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_estado_detalle_clienteDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_estado_detalle_clienteDetalleProve= new JComboBoxMe();
		jComboBoxid_estado_detalle_clienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_clienteDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_detalle_clienteDetalleProve= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleProve.setText("Buscar");
		this.jButtonid_estado_detalle_clienteDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_clienteDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_clienteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleProve"));

		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setText("U");
		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_clienteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_clienteDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_clienteDetalleProveUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_clienteDetalleProveUpdate.setText("U");
		this.jButtonid_estado_detalle_clienteDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_clienteDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_clienteDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleProveUpdate"));



					
		this.jLabelid_anioDetalleProve = new JLabelMe();
		this.jLabelid_anioDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleProve.setToolTipText("Anio");
		this.jLabelid_anioDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_anioDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_anioDetalleProve= new JComboBoxMe();
		jComboBoxid_anioDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleProve.setEnabled(false);

		this.jButtonid_anioDetalleProve= new JButtonMe();
		this.jButtonid_anioDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleProve.setText("Buscar");
		this.jButtonid_anioDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleProve"));

		this.jButtonid_anioDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleProveBusqueda.setText("U");
		this.jButtonid_anioDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleProveUpdate= new JButtonMe();
		this.jButtonid_anioDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleProveUpdate.setText("U");
		this.jButtonid_anioDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleProveUpdate"));



					
		this.jLabelid_mesDetalleProve = new JLabelMe();
		this.jLabelid_mesDetalleProve.setText(""+DetalleProveConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleProve.setToolTipText("Mes");
		this.jLabelid_mesDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleProve.setToolTipText(DetalleProveConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleProve = new GridBagLayout();
		this.jPanelid_mesDetalleProve.setLayout(this.gridaBagLayoutDetalleProve);


		jComboBoxid_mesDetalleProve= new JComboBoxMe();
		jComboBoxid_mesDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleProve.setEnabled(false);

		this.jButtonid_mesDetalleProve= new JButtonMe();
		this.jButtonid_mesDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleProve.setText("Buscar");
		this.jButtonid_mesDetalleProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleProve"));

		this.jButtonid_mesDetalleProveBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleProveBusqueda.setText("U");
		this.jButtonid_mesDetalleProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleProveBusqueda"));

		if(this.detalleproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleProveBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleProveUpdate= new JButtonMe();
		this.jButtonid_mesDetalleProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleProveUpdate.setText("U");
		this.jButtonid_mesDetalleProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleProveUpdate"));



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
		//this.jInternalFrameDetalleDetalleProve = new DetalleProveBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Prove DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleProve= new GridBagLayout();
		

		
		String sToolTipDetalleProve="";
		sToolTipDetalleProve=DetalleProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleProve+="(Cartera.DetalleProve)";
		}
		
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleProve+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleProve = new JButtonMe();
		this.jButtonModificarDetalleProve = new JButtonMe();
        this.jButtonActualizarDetalleProve = new JButtonMe();
        this.jButtonEliminarDetalleProve = new JButtonMe();
        this.jButtonCancelarDetalleProve = new JButtonMe();
        this.jButtonGuardarCambiosDetalleProve = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleProve = new JButtonMe();
		this.jButtonCerrarDetalleProve = new JButtonMe();
		
		this.jScrollPanelDatosDetalleProve = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleProve = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleProve = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Prove";
		
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proves" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleProve.setName("jPanelCamposDetalleProve"); 

		this.jPanelCamposOcultosDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleProve.setName("jPanelCamposOcultosDetalleProve"); 

        this.jPanelAccionesDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleProve.setToolTipText("Acciones");
        this.jPanelAccionesDetalleProve.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleProve.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleProve.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleProve.setText("Nuevo");
		this.jButtonModificarDetalleProve.setText("Editar");
        this.jButtonActualizarDetalleProve.setText("Actualizar");
        this.jButtonEliminarDetalleProve.setText("Eliminar");
        this.jButtonCancelarDetalleProve.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleProve.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleProve.setText("Guardar");
		this.jButtonCerrarDetalleProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleProve,"nuevo_button","Nuevo",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleProve,"modificar_button","Editar",this.detalleproveSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleProve,"actualizar_button","Actualizar",this.detalleproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleProve,"eliminar_button","Eliminar",this.detalleproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleProve,"cancelar_button","Cancelar",this.detalleproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleProve,"guardarcambios_button","Guardar",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleProve,"guardarcambiostabla_button","Guardar",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleProve,"cerrar_button","Salir",this.detalleproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleProve.setToolTipText("Nuevo"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleProve.setToolTipText("Editar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleProve.setToolTipText("Actualizar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleProve.setToolTipText("Eliminar)"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleProve.setToolTipText("Cancelar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleProve.setToolTipText("Guardar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleProve.setToolTipText("Guardar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleProve.setToolTipText("Salir"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleProve";
		inputMap = this.jButtonNuevoDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleProve"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleProve";
		inputMap = this.jButtonActualizarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleProve"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleProve";
		inputMap = this.jButtonEliminarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleProve"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleProve";
		inputMap = this.jButtonCancelarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleProve"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleProve";
		inputMap = this.jButtonCerrarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleProve";
		inputMap = this.jButtonGuardarCambiosTablaDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleProve"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleProve.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleProve.setToolTipText("Nuevo DetalleProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleProve.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleProve.setToolTipText("Sin Cerrar Ventana DetalleProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleProve.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleProve.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleProve.setText("Accion");
		this.jComboBoxTiposAccionesDetalleProve.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleProve.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleProve.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleProve = new JLabelMe();
		
		this.jLabelAccionesDetalleProve.setText("Acciones");		
		this.jLabelAccionesDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleProve();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleProve();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleProve=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleProve,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleProve.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleProve = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleProve = new GridBagLayout();
		
		this.jPanelCamposDetalleProve.setLayout(gridaBagLayoutCamposDetalleProve);
		this.jPanelCamposOcultosDetalleProve.setLayout(gridaBagLayoutCamposOcultosDetalleProve);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleProve.add(jLabelIdDetalleProve, this.gridBagConstraintsDetalleProve);



	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleProve.add(jLabelidDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleProve.add(jLabelid_empresaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleProve.add(jButtonid_empresaDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleProve.add(jButtonid_empresaDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleProve.add(jComboBoxid_empresaDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleProve.add(jLabelid_sucursalDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleProve.add(jButtonid_sucursalDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleProve.add(jButtonid_sucursalDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleProve.add(jComboBoxid_sucursalDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursal_movimientoDetalleProve.add(jLabelid_sucursal_movimientoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_movimientoDetalleProve.add(jButtonid_sucursal_movimientoDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_movimientoDetalleProve.add(jButtonid_sucursal_movimientoDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursal_movimientoDetalleProve.add(jComboBoxid_sucursal_movimientoDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleProve.add(jLabelid_ejercicioDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleProve.add(jButtonid_ejercicioDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleProve.add(jButtonid_ejercicioDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleProve.add(jComboBoxid_ejercicioDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleProve.add(jLabelid_periodoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleProve.add(jButtonid_periodoDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleProve.add(jButtonid_periodoDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleProve.add(jComboBoxid_periodoDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloDetalleProve.add(jLabelid_moduloDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleProve.add(jButtonid_moduloDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleProve.add(jButtonid_moduloDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloDetalleProve.add(jComboBoxid_moduloDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaDetalleProve.add(jLabelid_monedaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDetalleProve.add(jButtonid_monedaDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDetalleProve.add(jButtonid_monedaDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaDetalleProve.add(jComboBoxid_monedaDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteDetalleProve.add(jLabelid_clienteDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 2;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDetalleProve.add(jButtonid_clienteDetalleProve, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleProve.add(jButtonid_clienteDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 4;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleProve.add(jButtonid_clienteDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteDetalleProve.add(jComboBoxid_clienteDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionDetalleProve.add(jLabelid_transaccionDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleProve.add(jButtonid_transaccionDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleProve.add(jButtonid_transaccionDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionDetalleProve.add(jComboBoxid_transaccionDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloDetalleProve.add(jLabelid_tipo_transaccion_moduloDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleProve.add(jButtonid_tipo_transaccion_moduloDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleProve.add(jButtonid_tipo_transaccion_moduloDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloDetalleProve.add(jComboBoxid_tipo_transaccion_moduloDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDetalleProve.add(jLabelid_asiento_contableDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 2;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetalleProve.add(jButtonid_asiento_contableDetalleProve, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleProve.add(jButtonid_asiento_contableDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 4;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleProve.add(jButtonid_asiento_contableDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDetalleProve.add(jComboBoxid_asiento_contableDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaDetalleProve.add(jLabelid_facturaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 2;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaDetalleProve.add(jButtonid_facturaDetalleProve, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleProve.add(jButtonid_facturaDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 4;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleProve.add(jButtonid_facturaDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaDetalleProve.add(jComboBoxid_facturaDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_compraDetalleProve.add(jLabelid_orden_compraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraDetalleProve.add(jButtonid_orden_compraDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraDetalleProve.add(jButtonid_orden_compraDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_compraDetalleProve.add(jComboBoxid_orden_compraDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_clienteDetalleProve.add(jLabelid_estado_detalle_clienteDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_clienteDetalleProve.add(jButtonid_estado_detalle_clienteDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_clienteDetalleProve.add(jButtonid_estado_detalle_clienteDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_clienteDetalleProve.add(jComboBoxid_estado_detalle_clienteDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ventaDetalleProve.add(jLabelfecha_ventaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ventaDetalleProve.add(jButtonfecha_ventaDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ventaDetalleProve.add(jDateChooserfecha_ventaDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionDetalleProve.add(jLabelfecha_emisionDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDetalleProve.add(jButtonfecha_emisionDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionDetalleProve.add(jDateChooserfecha_emisionDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pagoDetalleProve.add(jLabelfecha_pagoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pagoDetalleProve.add(jButtonfecha_pagoDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pagoDetalleProve.add(jDateChooserfecha_pagoDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoDetalleProve.add(jLabelfecha_vencimientoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoDetalleProve.add(jButtonfecha_vencimientoDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoDetalleProve.add(jDateChooserfecha_vencimientoDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_mone_localDetalleProve.add(jLabelmonto_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_localDetalleProve.add(jButtonmonto_mone_localDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_mone_localDetalleProve.add(jTextFieldmonto_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_mone_extraDetalleProve.add(jLabelmonto_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_extraDetalleProve.add(jButtonmonto_mone_extraDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_mone_extraDetalleProve.add(jTextFieldmonto_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleProve.add(jLabelnumero_comprobanteDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleProve.add(jButtonnumero_comprobanteDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleProve.add(jTextFieldnumero_comprobanteDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaDetalleProve.add(jLabelnumero_facturaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaDetalleProve.add(jButtonnumero_facturaDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaDetalleProve.add(jTextFieldnumero_facturaDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localDetalleProve.add(jLabeldebito_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localDetalleProve.add(jButtondebito_mone_localDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localDetalleProve.add(jTextFielddebito_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localDetalleProve.add(jLabelcredito_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localDetalleProve.add(jButtoncredito_mone_localDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localDetalleProve.add(jTextFieldcredito_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_extraDetalleProve.add(jLabeldebito_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraDetalleProve.add(jButtondebito_mone_extraDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_extraDetalleProve.add(jTextFielddebito_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_extraDetalleProve.add(jLabelcredito_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_extraDetalleProve.add(jButtoncredito_mone_extraDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_extraDetalleProve.add(jTextFieldcredito_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleProve.add(jLabeldescripcionDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleProve.add(jButtondescripcionDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleProve.add(jscrollPanedescripcionDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleProve.add(jLabelid_anioDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleProve.add(jButtonid_anioDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleProve.add(jButtonid_anioDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleProve.add(jComboBoxid_anioDetalleProve, this.gridBagConstraintsDetalleProve);


	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 0;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleProve.add(jLabelid_mesDetalleProve, this.gridBagConstraintsDetalleProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 2;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleProve.add(jButtonid_mesDetalleProveBusqueda, this.gridBagConstraintsDetalleProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 3;
		this.gridBagConstraintsDetalleProve.ipadx = 0;
		this.gridBagConstraintsDetalleProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleProve.add(jButtonid_mesDetalleProveUpdate, this.gridBagConstraintsDetalleProve);
	}

	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleProve.gridy = 0;
	this.gridBagConstraintsDetalleProve.gridx = 1;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleProve.add(jComboBoxid_mesDetalleProve, this.gridBagConstraintsDetalleProve);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelidDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_sucursal_movimientoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_monedaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_clienteDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_transaccionDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_asiento_contableDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_facturaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_orden_compraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelid_estado_detalle_clienteDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelfecha_ventaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelfecha_emisionDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelfecha_pagoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelfecha_vencimientoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelmonto_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelmonto_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelnumero_comprobanteDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelnumero_facturaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPaneldebito_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelcredito_mone_localDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPaneldebito_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPanelcredito_mone_extraDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleProve.add(this.jPaneldescripcionDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposDetalleProve % 1==0) {
		iXPanelCamposDetalleProve=0;
		iYPanelCamposDetalleProve++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_empresaDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_sucursalDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_ejercicioDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_periodoDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_moduloDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_tipo_transaccion_moduloDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_anioDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
	}
	this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleProve.gridy = iYPanelCamposOcultosDetalleProve;
	this.gridBagConstraintsDetalleProve.gridx = iXPanelCamposOcultosDetalleProve++;
	this.gridBagConstraintsDetalleProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleProve.add(this.jPanelid_mesDetalleProve, this.gridBagConstraintsDetalleProve);



	if(iXPanelCamposOcultosDetalleProve % 1==0) {
		iXPanelCamposOcultosDetalleProve=0;
		iYPanelCamposOcultosDetalleProve++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleProve= new GridBagLayout();
		this.jPanelAccionesDetalleProve.setLayout(gridaBagLayoutAccionesDetalleProve);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleProve= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleProve.setLayout(gridaBagLayoutAccionesFormularioDetalleProve);
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleProve.add(this.jComboBoxTiposAccionesFormularioDetalleProve, this.gridBagConstraintsDetalleProve);

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleProve.add(this.jCheckBoxPostAccionNuevoDetalleProve, this.gridBagConstraintsDetalleProve);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleproveSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleProve.add(this.jCheckBoxPostAccionSinCerrarDetalleProve, this.gridBagConstraintsDetalleProve);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleproveSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleProve.add(this.jCheckBoxPostAccionSinMensajeDetalleProve, this.gridBagConstraintsDetalleProve);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleProve.add(this.jButtonModificarDetalleProve, this.gridBagConstraintsDetalleProve);							

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleProve.add(this.jButtonEliminarDetalleProve, this.gridBagConstraintsDetalleProve);
		
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = 0;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleProve.add(this.jButtonActualizarDetalleProve, this.gridBagConstraintsDetalleProve);


		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = 0;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleProve.add(this.jButtonGuardarCambiosDetalleProve, this.gridBagConstraintsDetalleProve);	
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = 0;		
		this.gridBagConstraintsDetalleProve.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleProve.add(this.jButtonCancelarDetalleProve, this.gridBagConstraintsDetalleProve);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleProve);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleproveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();						
			this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleProve.gridx = 0;		
			//this.gridBagConstraintsDetalleProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleProve.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleProve.gridx =0;
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleProve, this.gridBagConstraintsDetalleProve);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleProveJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleProve = new DetalleProveBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Prove DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Prove DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Prove Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleProveModel detalleproveModel=new DetalleProveModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleProveModel.DetalleProveFocusTraversalPolicy detalleproveFocusTraversalPolicy = detalleproveModel.new DetalleProveFocusTraversalPolicy(this);
			
			//detalleproveFocusTraversalPolicy.setdetalleproveJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleproveModel);
			
			
			this.jContentPaneDetalleDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleProve = new GridBagLayout();	
			this.jContentPaneDetalleDetalleProve.setLayout(gridaBagLayoutDetalleDetalleProve);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleProve = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleProve.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleProve.add(jTtoolBarDetalleDetalleProve, gridBagConstraintsDetalleProve);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleProve=   new JScrollPane(jContentPaneDetalleDetalleProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleProve.gridx = 0;
	        
			this.jContentPaneDetalleDetalleProve.add(jPanelCamposDetalleProve, gridBagConstraintsDetalleProve);
			
			
			
			
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
						&& detalleproveSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(this.puedeCargarPorParteAutoriPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(this.puedeCargarPorPartePagoAuto,false,-1);
					
					if(this.detalleproveSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleProve= new GridBagConstraints();
						this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleProve.gridx = 0;
						this.jContentPaneDetalleDetalleProve.add(this.jTabbedPaneRelacionesDetalleProve, this.gridBagConstraintsDetalleProve);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleProve.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleProve.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleProve = new GridBagConstraints();
					this.gridBagConstraintsDetalleProve.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleProve.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleProve.add(jPanelCamposOcultosDetalleProve, gridBagConstraintsDetalleProve);
				
					this.jPanelCamposOcultosDetalleProve.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsDetalleProve.gridx = 0;
	        this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleProve.add(this.jPanelAccionesFormularioDetalleProve, this.gridBagConstraintsDetalleProve);							
			
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
	        this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsDetalleProve.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleProve.add(this.jPanelAccionesDetalleProve, this.gridBagConstraintsDetalleProve);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleProve);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleProve=   new JScrollPane(this.jPanelCamposDetalleProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleProve.gridx = 0;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleProve.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleProve, this.gridBagConstraintsDetalleProve);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleProve, this.gridBagConstraintsDetalleProve);			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleProve, this.gridBagConstraintsDetalleProve);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleProve, this.gridBagConstraintsDetalleProve);
			
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleProve, this.gridBagConstraintsDetalleProve);
		
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleProve, this.gridBagConstraintsDetalleProve);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleProve;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleProve;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAutoriPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoripagoSessionBean=new AutoriPagoSessionBean();
		this.autoripagoSessionBean.setConGuardarRelaciones(false);
		this.autoripagoSessionBean.setEsGuardarRelacionado(true);

		this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoripagoBeanSwingJInternalFramePopup=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoripagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {

				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoripagoSessionBean.setEsGuardarRelacionado(true);

				this.autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoripagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoripagoBeanSwingJInternalFrame.setautoripagoSessionBean(this.autoripagoSessionBean);

				//this.gridBagConstraintsDetalleProve = new GridBagConstraints();
				//this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleProve.gridx = 0;
				//this.jContentPaneDetalleDetalleProve.add(this.autoripagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleProve);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleProve.add("Autori Pagos",this.autoripagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleProve.setComponentAt(iIndexTab,this.autoripagoBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoripagoSessionBean.setEsGuardarRelacionado(false);
				this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriPago) {
					this.jTabbedPaneRelacionesDetalleProve.add("Autori Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePagoAuto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pagoautoSessionBean=new PagoAutoSessionBean();
		this.pagoautoSessionBean.setConGuardarRelaciones(false);
		this.pagoautoSessionBean.setEsGuardarRelacionado(true);

		this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pagoautoBeanSwingJInternalFramePopup=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pagoautoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {

				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL;
				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pagoautoSessionBean.setEsGuardarRelacionado(true);

				this.pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pagoautoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pagoautoBeanSwingJInternalFrame.setpagoautoSessionBean(this.pagoautoSessionBean);

				//this.gridBagConstraintsDetalleProve = new GridBagConstraints();
				//this.gridBagConstraintsDetalleProve.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleProve.gridx = 0;
				//this.jContentPaneDetalleDetalleProve.add(this.pagoautoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleProve);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleProve.add("Pago Autos",this.pagoautoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleProve.setComponentAt(iIndexTab,this.pagoautoBeanSwingJInternalFrame.getContentPane());
				}

				//PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pagoautoSessionBean.setEsGuardarRelacionado(false);
				this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePagoAuto) {
					this.jTabbedPaneRelacionesDetalleProve.add("Pago Autos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPagoAutoBeanSwingJInternalFrame(List<DetalleProve> detalleproves,DetalleProve detalleprove,PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pagoautoBeanSwingJInternalFrame.getPagoAutoLogic().setConnexion(this.detalleproveLogic.getConnexion());

					pagoautoBeanSwingJInternalFrame.setdetalleprovesForeignKey(detalleproves);
					pagoautoBeanSwingJInternalFrame.setdetalleproveForeignKey(detalleprove);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleProve(true);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setlidDetalleProveActual(detalleprove.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pagoautoBeanSwingJInternalFrame.cargarCombosForeignKeyPagoAuto(pagoautoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pagoautoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleProve(true);
					pagoautoBeanSwingJInternalFrame.setid_detalle_proveFK_IdDetalleProve(detalleprove.getId());

					if(!this.conCargarFormDetalle) {
						pagoautoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pagoautoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleProveForeignKey(detalleprove,1,false,true,true);
					pagoautoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pagoautoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleProve");
					pagoautoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleProve");
					pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(true);
					pagoautoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPagoAuto("n",pagoautoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pagoautoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pagoautoBeanSwingJInternalFrame.setAutoscrolls(true);
					pagoautoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("relacionado");
					} else {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("no_relacionado");
					}

					pagoautoBeanSwingJInternalFrame.getjButtonRecargarInformacionPagoAuto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriPagoBeanSwingJInternalFrame(List<DetalleProve> detalleproves,DetalleProve detalleprove,AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoripagoBeanSwingJInternalFrame.getAutoriPagoLogic().setConnexion(this.detalleproveLogic.getConnexion());

					autoripagoBeanSwingJInternalFrame.setdetalleprovesForeignKey(detalleproves);
					autoripagoBeanSwingJInternalFrame.setdetalleproveForeignKey(detalleprove);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleProve(true);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setlidDetalleProveActual(detalleprove.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoripagoBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriPago(autoripagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoripagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleProve(true);
					autoripagoBeanSwingJInternalFrame.setid_detalle_proveFK_IdDetalleProve(detalleprove.getId());

					if(!this.conCargarFormDetalle) {
						autoripagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoripagoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleProveForeignKey(detalleprove,1,false,true,true);
					autoripagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoripagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleProve");
					autoripagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleProve");
					autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(true);
					autoripagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriPago("n",autoripagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoripagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoripagoBeanSwingJInternalFrame.setAutoscrolls(true);
					autoripagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("relacionado");
					} else {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("no_relacionado");
					}

					autoripagoBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriPago().setVisible(false);

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
