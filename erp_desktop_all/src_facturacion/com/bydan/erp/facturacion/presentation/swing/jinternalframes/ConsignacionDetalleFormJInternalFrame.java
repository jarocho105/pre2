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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ConsignacionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ConsignacionDetalleFormJInternalFrame extends ConsignacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsignacion;
	
	protected JMenuBar jmenuBarDetalleConsignacion;
	
	protected JMenu jmenuDetalleConsignacion;
	protected JMenu jmenuDetalleArchivoConsignacion;
	protected JMenu jmenuDetalleAccionesConsignacion;
	protected JMenu jmenuDetalleDatosConsignacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsignacion;	
	protected GridBagConstraints gridBagConstraintsConsignacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsignacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsignacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

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

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignatario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedido="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";
	
	public ConsignacionSessionBean consignacionSessionBean;
	
	

	public DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFrame=null;
	public DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleConsignacion=false;
	public DetalleConsignacionSessionBean detalleconsignacionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public ConsignatarioSessionBean consignatarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public EstadoPedidoSessionBean estadopedidoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TransporteSessionBean transporteSessionBean;	
	
	public ConsignacionLogic consignacionLogic;
	
	public JScrollPane jScrollPanelDatosConsignacion;
	public JScrollPane jScrollPanelDatosEdicionConsignacion;
	public JScrollPane jScrollPanelDatosGeneralConsignacion;
	
	protected JPanel jPanelCamposConsignacion;    
	protected JPanel jPanelCamposOcultosConsignacion;    	
	protected JPanel jPanelAccionesConsignacion;
	protected JPanel jPanelAccionesFormularioConsignacion;
    
	
	
	protected Integer iXPanelCamposConsignacion=0;
	protected Integer iYPanelCamposConsignacion=0;
	
	protected Integer iXPanelCamposOcultosConsignacion=0;
	protected Integer iYPanelCamposOcultosConsignacion=0;
	
	

	protected JPanel jPanelCamposFintotalConsignacion;
	protected Integer iXPanelCamposFintotalConsignacion=0;
	protected Integer iYPanelCamposFintotalConsignacion=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsignacion;
	public JButton jButtonModificarConsignacion;
	public JButton jButtonActualizarConsignacion;
    public JButton jButtonEliminarConsignacion;
	public JButton jButtonCancelarConsignacion;
    public JButton jButtonGuardarCambiosConsignacion;
	public JButton jButtonGuardarCambiosTablaConsignacion;
	protected JButton jButtonCerrarConsignacion;
	
	
	protected JButton jButtonProcesarInformacionConsignacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsignacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsignacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsignacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsignacion;
	protected JButton jButtonModificarToolBarConsignacion;
	protected JButton jButtonActualizarToolBarConsignacion;
    protected JButton jButtonEliminarToolBarConsignacion;
	protected JButton jButtonCancelarToolBarConsignacion;
    protected JButton jButtonGuardarCambiosToolBarConsignacion;
	protected JButton jButtonGuardarCambiosTablaToolBarConsignacion;
	protected JButton jButtonMostrarOcultarTablaToolBarConsignacion;
	protected JButton jButtonCerrarToolBarConsignacion;
	
	protected JButton jButtonProcesarInformacionToolBarConsignacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsignacion;
	protected JMenuItem jMenuItemModificarConsignacion;
	protected JMenuItem jMenuItemActualizarConsignacion;
    protected JMenuItem jMenuItemEliminarConsignacion;
	protected JMenuItem jMenuItemCancelarConsignacion;
    protected JMenuItem jMenuItemGuardarCambiosConsignacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsignacion;
	protected JMenuItem jMenuItemCerrarConsignacion;
	protected JMenuItem jMenuItemDetalleCerrarConsignacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsignacion;
	
	protected JMenuItem jMenuItemProcesarInformacionConsignacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsignacion;
	protected JMenuItem jMenuItemMostrarOcultarConsignacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsignacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsignacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsignacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsignacion;
	public JLabel jLabelIdConsignacion;
	public JLabel jLabelidConsignacion;
	public JButton jButtonidConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelnumeroConsignacion;
	public JLabel jLabelnumeroConsignacion;
	public JTextField jTextFieldnumeroConsignacion;
	public JButton jButtonnumeroConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionConsignacion;
	public JLabel jLabelnumero_autorizacionConsignacion;
	public JTextField jTextFieldnumero_autorizacionConsignacion;
	public JButton jButtonnumero_autorizacionConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionConsignacion;
	public JLabel jLabelfecha_emisionConsignacion;
	//public JFormattedTextField jDateChooserfecha_emisionConsignacion;

	public JDateChooser jDateChooserfecha_emisionConsignacion;
	public JButton jButtonfecha_emisionConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoConsignacion;
	public JLabel jLabelfecha_vencimientoConsignacion;
	//public JFormattedTextField jDateChooserfecha_vencimientoConsignacion;

	public JDateChooser jDateChooserfecha_vencimientoConsignacion;
	public JButton jButtonfecha_vencimientoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionConsignacion;
	public JLabel jLabelcotizacionConsignacion;
	public JTextField jTextFieldcotizacionConsignacion;
	public JButton jButtoncotizacionConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldireccionConsignacion;
	public JLabel jLabeldireccionConsignacion;
	public JTextArea jTextAreadireccionConsignacion;
	public JScrollPane jscrollPanedireccionConsignacion;
	public JButton jButtondireccionConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoConsignacion;
	public JLabel jLabeltelefonoConsignacion;
	public JTextField jTextFieldtelefonoConsignacion;
	public JButton jButtontelefonoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelrucConsignacion;
	public JLabel jLabelrucConsignacion;
	public JTextField jTextFieldrucConsignacion;
	public JButton jButtonrucConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionConsignacion;
	public JLabel jLabeldescripcionConsignacion;
	public JTextArea jTextAreadescripcionConsignacion;
	public JScrollPane jscrollPanedescripcionConsignacion;
	public JButton jButtondescripcionConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeConsignacion;
	public JLabel jLabeldescuento_porcentajeConsignacion;
	public JTextField jTextFielddescuento_porcentajeConsignacion;
	public JButton jButtondescuento_porcentajeConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_con_ivaConsignacion;
	public JLabel jLabeltotal_con_ivaConsignacion;
	public JTextField jTextFieldtotal_con_ivaConsignacion;
	public JButton jButtontotal_con_ivaConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelsumanConsignacion;
	public JLabel jLabelsumanConsignacion;
	public JTextField jTextFieldsumanConsignacion;
	public JButton jButtonsumanConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorConsignacion;
	public JLabel jLabeldescuento_valorConsignacion;
	public JTextField jTextFielddescuento_valorConsignacion;
	public JButton jButtondescuento_valorConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaConsignacion;
	public JLabel jLabeltotal_sin_ivaConsignacion;
	public JTextField jTextFieldtotal_sin_ivaConsignacion;
	public JButton jButtontotal_sin_ivaConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoConsignacion;
	public JLabel jLabeltotal_descuentoConsignacion;
	public JTextField jTextFieldtotal_descuentoConsignacion;
	public JButton jButtontotal_descuentoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfleteConsignacion;
	public JLabel jLabelfleteConsignacion;
	public JTextField jTextFieldfleteConsignacion;
	public JButton jButtonfleteConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneltotalConsignacion;
	public JLabel jLabeltotalConsignacion;
	public JTextField jTextFieldtotalConsignacion;
	public JButton jButtontotalConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalConsignacion;
	public JLabel jLabelsubtotalConsignacion;
	public JTextField jTextFieldsubtotalConsignacion;
	public JButton jButtonsubtotalConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelotroConsignacion;
	public JLabel jLabelotroConsignacion;
	public JTextField jTextFieldotroConsignacion;
	public JButton jButtonotroConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoConsignacion;
	public JLabel jLabelfinanciamientoConsignacion;
	public JTextField jTextFieldfinanciamientoConsignacion;
	public JButton jButtonfinanciamientoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelivaConsignacion;
	public JLabel jLabelivaConsignacion;
	public JTextField jTextFieldivaConsignacion;
	public JButton jButtonivaConsignacionBusqueda= new JButtonMe();

	public JPanel jPaneliceConsignacion;
	public JLabel jLabeliceConsignacion;
	public JTextField jTextFieldiceConsignacion;
	public JButton jButtoniceConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelmonto_retencionConsignacion;
	public JLabel jLabelmonto_retencionConsignacion;
	public JTextField jTextFieldmonto_retencionConsignacion;
	public JButton jButtonmonto_retencionConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_fueConsignacion;
	public JLabel jLabelnumero_fueConsignacion;
	public JTextField jTextFieldnumero_fueConsignacion;
	public JButton jButtonnumero_fueConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfechaConsignacion;
	public JLabel jLabelfechaConsignacion;
	//public JFormattedTextField jDateChooserfechaConsignacion;

	public JDateChooser jDateChooserfechaConsignacion;
	public JButton jButtonfechaConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_servidorConsignacion;
	public JLabel jLabelfecha_servidorConsignacion;
	//public JFormattedTextField jDateChooserfecha_servidorConsignacion;

	public JDateChooser jDateChooserfecha_servidorConsignacion;
	public JButton jButtonfecha_servidorConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioConsignacion;
	public JLabel jLabelhora_inicioConsignacion;
	public JSpinner jSpinnerhora_inicioConsignacion= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelhora_finConsignacion;
	public JLabel jLabelhora_finConsignacion;
	public JSpinner jSpinnerhora_finConsignacion= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsignacion;
	public JLabel jLabelid_empresaConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsignacion;
	public JButton jButtonid_empresaConsignacion= new JButtonMe();
	public JButton jButtonid_empresaConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalConsignacion;
	public JLabel jLabelid_sucursalConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalConsignacion;
	public JButton jButtonid_sucursalConsignacion= new JButtonMe();
	public JButton jButtonid_sucursalConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioConsignacion;
	public JLabel jLabelid_ejercicioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioConsignacion;
	public JButton jButtonid_ejercicioConsignacion= new JButtonMe();
	public JButton jButtonid_ejercicioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoConsignacion;
	public JLabel jLabelid_periodoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoConsignacion;
	public JButton jButtonid_periodoConsignacion= new JButtonMe();
	public JButton jButtonid_periodoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_periodoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioConsignacion;
	public JLabel jLabelid_anioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioConsignacion;
	public JButton jButtonid_anioConsignacion= new JButtonMe();
	public JButton jButtonid_anioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_anioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesConsignacion;
	public JLabel jLabelid_mesConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesConsignacion;
	public JButton jButtonid_mesConsignacion= new JButtonMe();
	public JButton jButtonid_mesConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_mesConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioConsignacion;
	public JLabel jLabelid_usuarioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioConsignacion;
	public JButton jButtonid_usuarioConsignacion= new JButtonMe();
	public JButton jButtonid_usuarioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_usuarioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaConsignacion;
	public JLabel jLabelid_monedaConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaConsignacion;
	public JButton jButtonid_monedaConsignacion= new JButtonMe();
	public JButton jButtonid_monedaConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_monedaConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoConsignacion;
	public JLabel jLabelid_empleadoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoConsignacion;
	public JButton jButtonid_empleadoConsignacion= new JButtonMe();
	public JButton jButtonid_empleadoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioConsignacion;
	public JLabel jLabelid_tipo_precioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioConsignacion;
	public JButton jButtonid_tipo_precioConsignacion= new JButtonMe();
	public JButton jButtonid_tipo_precioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoConsignacion;
	public JLabel jLabelid_formatoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoConsignacion;
	public JButton jButtonid_formatoConsignacion= new JButtonMe();
	public JButton jButtonid_formatoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_formatoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteConsignacion;
	public JLabel jLabelid_clienteConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteConsignacion;
	public JButton jButtonid_clienteConsignacion= new JButtonMe();
	public JButton jButtonid_clienteConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_clienteConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_clienteConsignacion;
	public JLabel jLabelid_sub_clienteConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteConsignacion;
	public JButton jButtonid_sub_clienteConsignacion= new JButtonMe();
	public JButton jButtonid_sub_clienteConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_consignatarioConsignacion;
	public JLabel jLabelid_consignatarioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignatarioConsignacion;
	public JButton jButtonid_consignatarioConsignacion= new JButtonMe();
	public JButton jButtonid_consignatarioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_consignatarioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorConsignacion;
	public JLabel jLabelid_vendedorConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorConsignacion;
	public JButton jButtonid_vendedorConsignacion= new JButtonMe();
	public JButton jButtonid_vendedorConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_vendedorConsignacionBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorConsignacionArbol= new JButtonMe();

	public JPanel jPanelid_estado_pedidoConsignacion;
	public JLabel jLabelid_estado_pedidoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoConsignacion;
	public JButton jButtonid_estado_pedidoConsignacion= new JButtonMe();
	public JButton jButtonid_estado_pedidoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioConsignacion;
	public JLabel jLabelid_tipo_cambioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioConsignacion;
	public JButton jButtonid_tipo_cambioConsignacion= new JButtonMe();
	public JButton jButtonid_tipo_cambioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaConsignacion;
	public JLabel jLabelid_zonaConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaConsignacion;
	public JButton jButtonid_zonaConsignacion= new JButtonMe();
	public JButton jButtonid_zonaConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_zonaConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoConsignacion;
	public JLabel jLabelid_centro_costoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoConsignacion;
	public JButton jButtonid_centro_costoConsignacion= new JButtonMe();
	public JButton jButtonid_centro_costoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoConsignacionBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoConsignacionArbol= new JButtonMe();

	public JPanel jPanelid_responsableConsignacion;
	public JLabel jLabelid_responsableConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableConsignacion;
	public JButton jButtonid_responsableConsignacion= new JButtonMe();
	public JButton jButtonid_responsableConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_responsableConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaConsignacion;
	public JLabel jLabelid_transportistaConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaConsignacion;
	public JButton jButtonid_transportistaConsignacion= new JButtonMe();
	public JButton jButtonid_transportistaConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_transportistaConsignacionBusqueda= new JButtonMe();

	public JPanel jPanelid_transporteConsignacion;
	public JLabel jLabelid_transporteConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteConsignacion;
	public JButton jButtonid_transporteConsignacion= new JButtonMe();
	public JButton jButtonid_transporteConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_transporteConsignacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsignacion;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConsignacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsignacion=new JPanel();
				this.jPanelAccionesFormularioConsignacion=new JPanel();
				this.jmenuBarDetalleConsignacion=new JMenuBar();
				this.jTtoolBarDetalleConsignacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsignacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarConsignacion() {
		return this.jButtonActualizarToolBarConsignacion;
	}
	
	public JButton getjButtonEliminarToolBarConsignacion() {
		return this.jButtonEliminarToolBarConsignacion;
	}
	
	public JButton getjButtonCancelarToolBarConsignacion() {
		return this.jButtonCancelarToolBarConsignacion;
	}		
	
	public JButton getjButtonProcesarInformacionConsignacion() {
		return this.jButtonProcesarInformacionConsignacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsignacion)	{
		this.jButtonProcesarInformacionConsignacion = jButtonProcesarInformacionConsignacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsignacion() {
		return this.jComboBoxTiposAccionesConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsignacion(
			JComboBox jComboBoxTiposRelacionesConsignacion) {
		this.jComboBoxTiposRelacionesConsignacion = jComboBoxTiposRelacionesConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsignacion(
			JComboBox jComboBoxTiposAccionesConsignacion) {
		this.jComboBoxTiposAccionesConsignacion = jComboBoxTiposAccionesConsignacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsignacion() {
		return this.jComboBoxTiposAccionesFormularioConsignacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsignacion(
			JComboBox jComboBoxTiposAccionesFormularioConsignacion) {
		this.jComboBoxTiposAccionesFormularioConsignacion = jComboBoxTiposAccionesFormularioConsignacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consignacionSessionBean=new ConsignacionSessionBean();
		
		this.consignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consignacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsignacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consignacion MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsignacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsignacion=new JButtonMe();
				this.jButtonModificarToolBarConsignacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsignacion,this.jTtoolBarDetalleConsignacion,
							"actualizar","actualizar","Actualizar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsignacion,this.jTtoolBarDetalleConsignacion,
							"eliminar","eliminar","Eliminar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsignacion,this.jTtoolBarDetalleConsignacion,
							"cancelar","cancelar","Cancelar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsignacion,this.jTtoolBarDetalleConsignacion,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsignacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsignacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsignacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsignacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsignacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsignacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsignacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsignacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsignacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsignacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsignacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsignacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsignacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsignacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsignacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsignacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsignacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsignacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsignacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsignacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsignacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsignacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsignacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsignacion.add(this.jMenuItemDetalleCerrarConsignacion);
		
		this.jmenuDetalleAccionesConsignacion.add(this.jMenuItemActualizarConsignacion);
		this.jmenuDetalleAccionesConsignacion.add(this.jMenuItemEliminarConsignacion);
		this.jmenuDetalleAccionesConsignacion.add(this.jMenuItemCancelarConsignacion);		
		
		//this.jmenuDetalleDatosConsignacion.add(this.jMenuItemDetalleAbrirOrderByConsignacion);				
		this.jmenuDetalleDatosConsignacion.add(this.jMenuItemDetalleMostarOcultarConsignacion);				
				
		//this.jmenuDetalleAccionesConsignacion.add(this.jMenuItemGuardarCambiosConsignacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsignacion.add(this.jmenuDetalleArchivoConsignacion);		
		this.jmenuBarDetalleConsignacion.add(this.jmenuDetalleAccionesConsignacion);		
		this.jmenuBarDetalleConsignacion.add(this.jmenuDetalleDatosConsignacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleConsignacion.add(this.jmenuDetalleConsignacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsignacion);				
	}
	
	
	public void inicializarElementosCamposConsignacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsignacion = new JLabelMe();
		jLabelIdConsignacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsignacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsignacion= new GridBagLayout();

		this.jPanelidConsignacion.setLayout(this.gridaBagLayoutConsignacion);

		jLabelidConsignacion = new JLabel();
		jLabelidConsignacion.setText("Id");

		jLabelidConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroConsignacion = new JLabelMe();
		this.jLabelnumeroConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroConsignacion.setToolTipText("Numero");
		this.jLabelnumeroConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelnumeroConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldnumeroConsignacion= new JTextFieldMe();

		jTextFieldnumeroConsignacion.setEnabled(false);
		jTextFieldnumeroConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroConsignacionBusqueda= new JButtonMe();
		this.jButtonnumeroConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroConsignacionBusqueda.setText("U");
		this.jButtonnumeroConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionConsignacion = new JLabelMe();
		this.jLabelnumero_autorizacionConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_NUMEROAUTORIZACION+" :");
		this.jLabelnumero_autorizacionConsignacion.setToolTipText("Numero PreImpreso");
		this.jLabelnumero_autorizacionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelnumero_autorizacionConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldnumero_autorizacionConsignacion= new JTextFieldMe();

		jTextFieldnumero_autorizacionConsignacion.setEnabled(false);
		jTextFieldnumero_autorizacionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionConsignacionBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionConsignacionBusqueda.setText("U");
		this.jButtonnumero_autorizacionConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionConsignacion = new JLabelMe();
		this.jLabelfecha_emisionConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionConsignacion.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelfecha_emisionConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		//jFormattedTextFieldfecha_emisionConsignacion= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionConsignacion= new JDateChooser();
		jDateChooserfecha_emisionConsignacion.setEnabled(false);
		jDateChooserfecha_emisionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionConsignacion.setDate(new Date());
		jDateChooserfecha_emisionConsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionConsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionConsignacionBusqueda= new JButtonMe();
		this.jButtonfecha_emisionConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionConsignacionBusqueda.setText("U");
		this.jButtonfecha_emisionConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoConsignacion = new JLabelMe();
		this.jLabelfecha_vencimientoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoConsignacion.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelfecha_vencimientoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		//jFormattedTextFieldfecha_vencimientoConsignacion= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoConsignacion= new JDateChooser();
		jDateChooserfecha_vencimientoConsignacion.setEnabled(false);
		jDateChooserfecha_vencimientoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoConsignacion.setDate(new Date());
		jDateChooserfecha_vencimientoConsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoConsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoConsignacionBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoConsignacionBusqueda.setText("U");
		this.jButtonfecha_vencimientoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionConsignacion = new JLabelMe();
		this.jLabelcotizacionConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionConsignacion.setToolTipText("Cotizacion");
		this.jLabelcotizacionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelcotizacionConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldcotizacionConsignacion= new JTextFieldMe();
		jTextFieldcotizacionConsignacion.setEnabled(false);
		jTextFieldcotizacionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionConsignacion.setText("0.0");

		this.jButtoncotizacionConsignacionBusqueda= new JButtonMe();
		this.jButtoncotizacionConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionConsignacionBusqueda.setText("U");
		this.jButtoncotizacionConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldireccionConsignacion = new JLabelMe();
		this.jLabeldireccionConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionConsignacion.setToolTipText("Direccion");
		this.jLabeldireccionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneldireccionConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextAreadireccionConsignacion= new JTextAreaMe();
		jTextAreadireccionConsignacion.setEnabled(false);
		jTextAreadireccionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionConsignacion.setLineWrap(true);
		jTextAreadireccionConsignacion.setWrapStyleWord(true);
		jTextAreadireccionConsignacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionConsignacion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionConsignacion = new JScrollPane(jTextAreadireccionConsignacion);
		jscrollPanedireccionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionConsignacionBusqueda= new JButtonMe();
		this.jButtondireccionConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionConsignacionBusqueda.setText("U");
		this.jButtondireccionConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoConsignacion = new JLabelMe();
		this.jLabeltelefonoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoConsignacion.setToolTipText("Telefono");
		this.jLabeltelefonoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneltelefonoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldtelefonoConsignacion= new JTextFieldMe();

		jTextFieldtelefonoConsignacion.setEnabled(false);
		jTextFieldtelefonoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoConsignacionBusqueda= new JButtonMe();
		this.jButtontelefonoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoConsignacionBusqueda.setText("U");
		this.jButtontelefonoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelrucConsignacion = new JLabelMe();
		this.jLabelrucConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucConsignacion.setToolTipText("Ruc");
		this.jLabelrucConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelrucConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldrucConsignacion= new JTextFieldMe();

		jTextFieldrucConsignacion.setEnabled(false);
		jTextFieldrucConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucConsignacionBusqueda= new JButtonMe();
		this.jButtonrucConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucConsignacionBusqueda.setText("U");
		this.jButtonrucConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionConsignacion = new JLabelMe();
		this.jLabeldescripcionConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionConsignacion.setToolTipText("Descripcion");
		this.jLabeldescripcionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneldescripcionConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextAreadescripcionConsignacion= new JTextAreaMe();
		jTextAreadescripcionConsignacion.setEnabled(false);
		jTextAreadescripcionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionConsignacion.setLineWrap(true);
		jTextAreadescripcionConsignacion.setWrapStyleWord(true);
		jTextAreadescripcionConsignacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionConsignacion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionConsignacion = new JScrollPane(jTextAreadescripcionConsignacion);
		jscrollPanedescripcionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionConsignacionBusqueda= new JButtonMe();
		this.jButtondescripcionConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionConsignacionBusqueda.setText("U");
		this.jButtondescripcionConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeConsignacion = new JLabelMe();
		this.jLabeldescuento_porcentajeConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeConsignacion.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajeConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneldescuento_porcentajeConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFielddescuento_porcentajeConsignacion= new JTextFieldMe();
		jTextFielddescuento_porcentajeConsignacion.setEnabled(false);
		jTextFielddescuento_porcentajeConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeConsignacion.setText("0.0");

		this.jButtondescuento_porcentajeConsignacionBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeConsignacionBusqueda.setText("U");
		this.jButtondescuento_porcentajeConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_con_ivaConsignacion = new JLabelMe();
		this.jLabeltotal_con_ivaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_TOTALCONIVA+" : *");
		this.jLabeltotal_con_ivaConsignacion.setToolTipText("Monto Con Iva");
		this.jLabeltotal_con_ivaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_con_ivaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_con_ivaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_con_ivaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_con_ivaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_con_ivaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_TOTALCONIVA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneltotal_con_ivaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldtotal_con_ivaConsignacion= new JTextFieldMe();
		jTextFieldtotal_con_ivaConsignacion.setEnabled(false);
		jTextFieldtotal_con_ivaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_con_ivaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_con_ivaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_con_ivaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_con_ivaConsignacion.setText("0.0");

		this.jButtontotal_con_ivaConsignacionBusqueda= new JButtonMe();
		this.jButtontotal_con_ivaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_con_ivaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_con_ivaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_con_ivaConsignacionBusqueda.setText("U");
		this.jButtontotal_con_ivaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_con_ivaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_con_ivaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_con_ivaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_con_ivaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_con_ivaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_con_ivaConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelsumanConsignacion = new JLabelMe();
		this.jLabelsumanConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanConsignacion.setToolTipText("Suman");
		this.jLabelsumanConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelsumanConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldsumanConsignacion= new JTextFieldMe();
		jTextFieldsumanConsignacion.setEnabled(false);
		jTextFieldsumanConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanConsignacion.setText("0.0");

		this.jButtonsumanConsignacionBusqueda= new JButtonMe();
		this.jButtonsumanConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanConsignacionBusqueda.setText("U");
		this.jButtonsumanConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorConsignacion = new JLabelMe();
		this.jLabeldescuento_valorConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorConsignacion.setToolTipText("Dscto General");
		this.jLabeldescuento_valorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneldescuento_valorConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFielddescuento_valorConsignacion= new JTextFieldMe();
		jTextFielddescuento_valorConsignacion.setEnabled(false);
		jTextFielddescuento_valorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorConsignacion.setText("0.0");

		this.jButtondescuento_valorConsignacionBusqueda= new JButtonMe();
		this.jButtondescuento_valorConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorConsignacionBusqueda.setText("U");
		this.jButtondescuento_valorConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaConsignacion = new JLabelMe();
		this.jLabeltotal_sin_ivaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaConsignacion.setToolTipText("Monto Sin Iva");
		this.jLabeltotal_sin_ivaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneltotal_sin_ivaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldtotal_sin_ivaConsignacion= new JTextFieldMe();
		jTextFieldtotal_sin_ivaConsignacion.setEnabled(false);
		jTextFieldtotal_sin_ivaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaConsignacion.setText("0.0");

		this.jButtontotal_sin_ivaConsignacionBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaConsignacionBusqueda.setText("U");
		this.jButtontotal_sin_ivaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoConsignacion = new JLabelMe();
		this.jLabeltotal_descuentoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoConsignacion.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneltotal_descuentoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldtotal_descuentoConsignacion= new JTextFieldMe();
		jTextFieldtotal_descuentoConsignacion.setEnabled(false);
		jTextFieldtotal_descuentoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoConsignacion.setText("0.0");

		this.jButtontotal_descuentoConsignacionBusqueda= new JButtonMe();
		this.jButtontotal_descuentoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoConsignacionBusqueda.setText("U");
		this.jButtontotal_descuentoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfleteConsignacion = new JLabelMe();
		this.jLabelfleteConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteConsignacion.setToolTipText("Flete");
		this.jLabelfleteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelfleteConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldfleteConsignacion= new JTextFieldMe();
		jTextFieldfleteConsignacion.setEnabled(false);
		jTextFieldfleteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteConsignacion.setText("0.0");

		this.jButtonfleteConsignacionBusqueda= new JButtonMe();
		this.jButtonfleteConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteConsignacionBusqueda.setText("U");
		this.jButtonfleteConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeltotalConsignacion = new JLabelMe();
		this.jLabeltotalConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalConsignacion.setToolTipText("Total");
		this.jLabeltotalConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneltotalConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldtotalConsignacion= new JTextFieldMe();
		jTextFieldtotalConsignacion.setEnabled(false);
		jTextFieldtotalConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalConsignacion.setText("0.0");

		this.jButtontotalConsignacionBusqueda= new JButtonMe();
		this.jButtontotalConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalConsignacionBusqueda.setText("U");
		this.jButtontotalConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalConsignacion = new JLabelMe();
		this.jLabelsubtotalConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalConsignacion.setToolTipText("Subtotal");
		this.jLabelsubtotalConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelsubtotalConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldsubtotalConsignacion= new JTextFieldMe();
		jTextFieldsubtotalConsignacion.setEnabled(false);
		jTextFieldsubtotalConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalConsignacion.setText("0.0");

		this.jButtonsubtotalConsignacionBusqueda= new JButtonMe();
		this.jButtonsubtotalConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalConsignacionBusqueda.setText("U");
		this.jButtonsubtotalConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelotroConsignacion = new JLabelMe();
		this.jLabelotroConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroConsignacion.setToolTipText("Otro");
		this.jLabelotroConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelotroConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldotroConsignacion= new JTextFieldMe();
		jTextFieldotroConsignacion.setEnabled(false);
		jTextFieldotroConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroConsignacion.setText("0.0");

		this.jButtonotroConsignacionBusqueda= new JButtonMe();
		this.jButtonotroConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroConsignacionBusqueda.setText("U");
		this.jButtonotroConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoConsignacion = new JLabelMe();
		this.jLabelfinanciamientoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoConsignacion.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelfinanciamientoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldfinanciamientoConsignacion= new JTextFieldMe();
		jTextFieldfinanciamientoConsignacion.setEnabled(false);
		jTextFieldfinanciamientoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoConsignacion.setText("0.0");

		this.jButtonfinanciamientoConsignacionBusqueda= new JButtonMe();
		this.jButtonfinanciamientoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoConsignacionBusqueda.setText("U");
		this.jButtonfinanciamientoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelivaConsignacion = new JLabelMe();
		this.jLabelivaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaConsignacion.setToolTipText("Iva");
		this.jLabelivaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelivaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldivaConsignacion= new JTextFieldMe();
		jTextFieldivaConsignacion.setEnabled(false);
		jTextFieldivaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaConsignacion.setText("0.0");

		this.jButtonivaConsignacionBusqueda= new JButtonMe();
		this.jButtonivaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaConsignacionBusqueda.setText("U");
		this.jButtonivaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaConsignacionBusqueda.setVisible(false);		}


					
		this.jLabeliceConsignacion = new JLabelMe();
		this.jLabeliceConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceConsignacion.setToolTipText("Ice");
		this.jLabeliceConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPaneliceConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldiceConsignacion= new JTextFieldMe();
		jTextFieldiceConsignacion.setEnabled(false);
		jTextFieldiceConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceConsignacion.setText("0.0");

		this.jButtoniceConsignacionBusqueda= new JButtonMe();
		this.jButtoniceConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceConsignacionBusqueda.setText("U");
		this.jButtoniceConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelmonto_retencionConsignacion = new JLabelMe();
		this.jLabelmonto_retencionConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_MONTORETENCION+" : *");
		this.jLabelmonto_retencionConsignacion.setToolTipText("Monto Retencion");
		this.jLabelmonto_retencionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_retencionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_retencionConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_retencionConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_MONTORETENCION);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelmonto_retencionConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldmonto_retencionConsignacion= new JTextFieldMe();
		jTextFieldmonto_retencionConsignacion.setEnabled(false);
		jTextFieldmonto_retencionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_retencionConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_retencionConsignacion.setText("0.0");

		this.jButtonmonto_retencionConsignacionBusqueda= new JButtonMe();
		this.jButtonmonto_retencionConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_retencionConsignacionBusqueda.setText("U");
		this.jButtonmonto_retencionConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_retencionConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_retencionConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_retencionConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_retencionConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_retencionConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_retencionConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_fueConsignacion = new JLabelMe();
		this.jLabelnumero_fueConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_NUMEROFUE+" : *");
		this.jLabelnumero_fueConsignacion.setToolTipText("Numero Fue");
		this.jLabelnumero_fueConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fueConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fueConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_fueConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_fueConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_fueConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_NUMEROFUE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelnumero_fueConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jTextFieldnumero_fueConsignacion= new JTextFieldMe();

		jTextFieldnumero_fueConsignacion.setEnabled(false);
		jTextFieldnumero_fueConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fueConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fueConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_fueConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_fueConsignacionBusqueda= new JButtonMe();
		this.jButtonnumero_fueConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fueConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fueConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_fueConsignacionBusqueda.setText("U");
		this.jButtonnumero_fueConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_fueConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_fueConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_fueConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_fueConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_fueConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_fueConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfechaConsignacion = new JLabelMe();
		this.jLabelfechaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaConsignacion.setToolTipText("Fecha");
		this.jLabelfechaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelfechaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		//jFormattedTextFieldfechaConsignacion= new JFormattedTextFieldMe();

		jDateChooserfechaConsignacion= new JDateChooser();
		jDateChooserfechaConsignacion.setEnabled(false);
		jDateChooserfechaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaConsignacion.setDate(new Date());
		jDateChooserfechaConsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaConsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaConsignacionBusqueda= new JButtonMe();
		this.jButtonfechaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaConsignacionBusqueda.setText("U");
		this.jButtonfechaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_servidorConsignacion = new JLabelMe();
		this.jLabelfecha_servidorConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_FECHASERVIDOR+" : *");
		this.jLabelfecha_servidorConsignacion.setToolTipText("Fecha Servidor");
		this.jLabelfecha_servidorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_servidorConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_servidorConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_servidorConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_FECHASERVIDOR);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelfecha_servidorConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		//jFormattedTextFieldfecha_servidorConsignacion= new JFormattedTextFieldMe();

		jDateChooserfecha_servidorConsignacion= new JDateChooser();
		jDateChooserfecha_servidorConsignacion.setEnabled(false);
		jDateChooserfecha_servidorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_servidorConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_servidorConsignacion.setDate(new Date());
		jDateChooserfecha_servidorConsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_servidorConsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_servidorConsignacionBusqueda= new JButtonMe();
		this.jButtonfecha_servidorConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_servidorConsignacionBusqueda.setText("U");
		this.jButtonfecha_servidorConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_servidorConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_servidorConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_servidorConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_servidorConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_servidorConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_servidorConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioConsignacion = new JLabelMe();
		this.jLabelhora_inicioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioConsignacion.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelhora_inicioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		//jFormattedTextFieldhora_inicioConsignacion= new JFormattedTextFieldMe();

		jSpinnerhora_inicioConsignacion= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioConsignacion.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioConsignacion = new JSpinner.DateEditor(jSpinnerhora_inicioConsignacion, "HH:mm:ss");

		jSpinnerhora_inicioConsignacion.setEditor(timeEditorhora_inicioConsignacion);

		jSpinnerhora_inicioConsignacion.setValue(new Date());

		jSpinnerhora_inicioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioConsignacion.setValue(new Date());
		//jSpinnerhora_inicioConsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioConsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioConsignacionBusqueda= new JButtonMe();
		this.jButtonhora_inicioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioConsignacionBusqueda.setText("U");
		this.jButtonhora_inicioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioConsignacionBusqueda.setVisible(false);		}


					
		this.jLabelhora_finConsignacion = new JLabelMe();
		this.jLabelhora_finConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finConsignacion.setToolTipText("Hora Fin");
		this.jLabelhora_finConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelhora_finConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		//jFormattedTextFieldhora_finConsignacion= new JFormattedTextFieldMe();

		jSpinnerhora_finConsignacion= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finConsignacion.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finConsignacion = new JSpinner.DateEditor(jSpinnerhora_finConsignacion, "HH:mm:ss");

		jSpinnerhora_finConsignacion.setEditor(timeEditorhora_finConsignacion);

		jSpinnerhora_finConsignacion.setValue(new Date());

		jSpinnerhora_finConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finConsignacion.setValue(new Date());
		//jSpinnerhora_finConsignacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finConsignacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finConsignacionBusqueda= new JButtonMe();
		this.jButtonhora_finConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finConsignacionBusqueda.setText("U");
		this.jButtonhora_finConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finConsignacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsignacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsignacion = new JLabelMe();
		this.jLabelid_empresaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsignacion.setToolTipText("Empresa");
		this.jLabelid_empresaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_empresaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_empresaConsignacion= new JComboBoxMe();
		jComboBoxid_empresaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsignacion.setEnabled(false);

		this.jButtonid_empresaConsignacion= new JButtonMe();
		this.jButtonid_empresaConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsignacion.setText("Buscar");
		this.jButtonid_empresaConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsignacion"));

		this.jButtonid_empresaConsignacionBusqueda= new JButtonMe();
		this.jButtonid_empresaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsignacionBusqueda.setText("U");
		this.jButtonid_empresaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsignacionUpdate= new JButtonMe();
		this.jButtonid_empresaConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsignacionUpdate.setText("U");
		this.jButtonid_empresaConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsignacionUpdate"));



					
		this.jLabelid_sucursalConsignacion = new JLabelMe();
		this.jLabelid_sucursalConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalConsignacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_sucursalConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_sucursalConsignacion= new JComboBoxMe();
		jComboBoxid_sucursalConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalConsignacion.setEnabled(false);

		this.jButtonid_sucursalConsignacion= new JButtonMe();
		this.jButtonid_sucursalConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConsignacion.setText("Buscar");
		this.jButtonid_sucursalConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConsignacion"));

		this.jButtonid_sucursalConsignacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConsignacionBusqueda.setText("U");
		this.jButtonid_sucursalConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalConsignacionUpdate= new JButtonMe();
		this.jButtonid_sucursalConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConsignacionUpdate.setText("U");
		this.jButtonid_sucursalConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConsignacionUpdate"));



					
		this.jLabelid_ejercicioConsignacion = new JLabelMe();
		this.jLabelid_ejercicioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioConsignacion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_ejercicioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_ejercicioConsignacion= new JComboBoxMe();
		jComboBoxid_ejercicioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioConsignacion.setEnabled(false);

		this.jButtonid_ejercicioConsignacion= new JButtonMe();
		this.jButtonid_ejercicioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioConsignacion.setText("Buscar");
		this.jButtonid_ejercicioConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioConsignacion"));

		this.jButtonid_ejercicioConsignacionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioConsignacionBusqueda.setText("U");
		this.jButtonid_ejercicioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioConsignacionUpdate= new JButtonMe();
		this.jButtonid_ejercicioConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioConsignacionUpdate.setText("U");
		this.jButtonid_ejercicioConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioConsignacionUpdate"));



					
		this.jLabelid_periodoConsignacion = new JLabelMe();
		this.jLabelid_periodoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoConsignacion.setToolTipText("Periodo");
		this.jLabelid_periodoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_periodoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_periodoConsignacion= new JComboBoxMe();
		jComboBoxid_periodoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoConsignacion.setEnabled(false);

		this.jButtonid_periodoConsignacion= new JButtonMe();
		this.jButtonid_periodoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoConsignacion.setText("Buscar");
		this.jButtonid_periodoConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoConsignacion"));

		this.jButtonid_periodoConsignacionBusqueda= new JButtonMe();
		this.jButtonid_periodoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoConsignacionBusqueda.setText("U");
		this.jButtonid_periodoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_periodoConsignacionUpdate= new JButtonMe();
		this.jButtonid_periodoConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoConsignacionUpdate.setText("U");
		this.jButtonid_periodoConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoConsignacionUpdate"));



					
		this.jLabelid_anioConsignacion = new JLabelMe();
		this.jLabelid_anioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioConsignacion.setToolTipText("Anio");
		this.jLabelid_anioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_anioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_anioConsignacion= new JComboBoxMe();
		jComboBoxid_anioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioConsignacion.setEnabled(false);

		this.jButtonid_anioConsignacion= new JButtonMe();
		this.jButtonid_anioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioConsignacion.setText("Buscar");
		this.jButtonid_anioConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioConsignacion"));

		this.jButtonid_anioConsignacionBusqueda= new JButtonMe();
		this.jButtonid_anioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioConsignacionBusqueda.setText("U");
		this.jButtonid_anioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_anioConsignacionUpdate= new JButtonMe();
		this.jButtonid_anioConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioConsignacionUpdate.setText("U");
		this.jButtonid_anioConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioConsignacionUpdate"));



					
		this.jLabelid_mesConsignacion = new JLabelMe();
		this.jLabelid_mesConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesConsignacion.setToolTipText("Mes");
		this.jLabelid_mesConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_mesConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_mesConsignacion= new JComboBoxMe();
		jComboBoxid_mesConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesConsignacion.setEnabled(false);

		this.jButtonid_mesConsignacion= new JButtonMe();
		this.jButtonid_mesConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesConsignacion.setText("Buscar");
		this.jButtonid_mesConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesConsignacion"));

		this.jButtonid_mesConsignacionBusqueda= new JButtonMe();
		this.jButtonid_mesConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesConsignacionBusqueda.setText("U");
		this.jButtonid_mesConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_mesConsignacionUpdate= new JButtonMe();
		this.jButtonid_mesConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesConsignacionUpdate.setText("U");
		this.jButtonid_mesConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesConsignacionUpdate"));



					
		this.jLabelid_usuarioConsignacion = new JLabelMe();
		this.jLabelid_usuarioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioConsignacion.setToolTipText("Usuario");
		this.jLabelid_usuarioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_usuarioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_usuarioConsignacion= new JComboBoxMe();
		jComboBoxid_usuarioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioConsignacion.setEnabled(false);

		this.jButtonid_usuarioConsignacion= new JButtonMe();
		this.jButtonid_usuarioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioConsignacion.setText("Buscar");
		this.jButtonid_usuarioConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioConsignacion"));

		this.jButtonid_usuarioConsignacionBusqueda= new JButtonMe();
		this.jButtonid_usuarioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioConsignacionBusqueda.setText("U");
		this.jButtonid_usuarioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_usuarioConsignacionUpdate= new JButtonMe();
		this.jButtonid_usuarioConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioConsignacionUpdate.setText("U");
		this.jButtonid_usuarioConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioConsignacionUpdate"));



					
		this.jLabelid_monedaConsignacion = new JLabelMe();
		this.jLabelid_monedaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaConsignacion.setToolTipText("Moneda");
		this.jLabelid_monedaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_monedaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_monedaConsignacion= new JComboBoxMe();
		jComboBoxid_monedaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaConsignacion= new JButtonMe();
		this.jButtonid_monedaConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaConsignacion.setText("Buscar");
		this.jButtonid_monedaConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaConsignacion"));

		this.jButtonid_monedaConsignacionBusqueda= new JButtonMe();
		this.jButtonid_monedaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaConsignacionBusqueda.setText("U");
		this.jButtonid_monedaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_monedaConsignacionUpdate= new JButtonMe();
		this.jButtonid_monedaConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaConsignacionUpdate.setText("U");
		this.jButtonid_monedaConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaConsignacionUpdate"));



					
		this.jLabelid_empleadoConsignacion = new JLabelMe();
		this.jLabelid_empleadoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoConsignacion.setToolTipText("Empleado");
		this.jLabelid_empleadoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_empleadoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_empleadoConsignacion= new JComboBoxMe();
		jComboBoxid_empleadoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoConsignacion= new JButtonMe();
		this.jButtonid_empleadoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoConsignacion.setText("Buscar");
		this.jButtonid_empleadoConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoConsignacion"));

		this.jButtonid_empleadoConsignacionBusqueda= new JButtonMe();
		this.jButtonid_empleadoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoConsignacionBusqueda.setText("U");
		this.jButtonid_empleadoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoConsignacionUpdate= new JButtonMe();
		this.jButtonid_empleadoConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoConsignacionUpdate.setText("U");
		this.jButtonid_empleadoConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoConsignacionUpdate"));



					
		this.jLabelid_tipo_precioConsignacion = new JLabelMe();
		this.jLabelid_tipo_precioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioConsignacion.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_tipo_precioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_tipo_precioConsignacion= new JComboBoxMe();
		jComboBoxid_tipo_precioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioConsignacion= new JButtonMe();
		this.jButtonid_tipo_precioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioConsignacion.setText("Buscar");
		this.jButtonid_tipo_precioConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioConsignacion"));

		this.jButtonid_tipo_precioConsignacionBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioConsignacionBusqueda.setText("U");
		this.jButtonid_tipo_precioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioConsignacionUpdate= new JButtonMe();
		this.jButtonid_tipo_precioConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioConsignacionUpdate.setText("U");
		this.jButtonid_tipo_precioConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioConsignacionUpdate"));



					
		this.jLabelid_formatoConsignacion = new JLabelMe();
		this.jLabelid_formatoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoConsignacion.setToolTipText("Formato");
		this.jLabelid_formatoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_formatoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_formatoConsignacion= new JComboBoxMe();
		jComboBoxid_formatoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoConsignacion= new JButtonMe();
		this.jButtonid_formatoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoConsignacion.setText("Buscar");
		this.jButtonid_formatoConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoConsignacion"));

		this.jButtonid_formatoConsignacionBusqueda= new JButtonMe();
		this.jButtonid_formatoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoConsignacionBusqueda.setText("U");
		this.jButtonid_formatoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_formatoConsignacionUpdate= new JButtonMe();
		this.jButtonid_formatoConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoConsignacionUpdate.setText("U");
		this.jButtonid_formatoConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoConsignacionUpdate"));



					
		this.jLabelid_clienteConsignacion = new JLabelMe();
		this.jLabelid_clienteConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteConsignacion.setToolTipText("Cliente");
		this.jLabelid_clienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_clienteConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_clienteConsignacion= new JComboBoxMe();
		jComboBoxid_clienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteConsignacion= new JButtonMe();
		this.jButtonid_clienteConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConsignacion.setText("Buscar");
		this.jButtonid_clienteConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConsignacion"));

		this.jButtonid_clienteConsignacionBusqueda= new JButtonMe();
		this.jButtonid_clienteConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteConsignacionBusqueda.setText("U");
		this.jButtonid_clienteConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_clienteConsignacionUpdate= new JButtonMe();
		this.jButtonid_clienteConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteConsignacionUpdate.setText("U");
		this.jButtonid_clienteConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConsignacionUpdate"));



					
		this.jLabelid_sub_clienteConsignacion = new JLabelMe();
		this.jLabelid_sub_clienteConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDSUBCLIENTE+" :");
		this.jLabelid_sub_clienteConsignacion.setToolTipText("Sub Cliente");
		this.jLabelid_sub_clienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_clienteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_clienteConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDSUBCLIENTE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_sub_clienteConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_sub_clienteConsignacion= new JComboBoxMe();
		jComboBoxid_sub_clienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_clienteConsignacion= new JButtonMe();
		this.jButtonid_sub_clienteConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteConsignacion.setText("Buscar");
		this.jButtonid_sub_clienteConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_clienteConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_clienteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteConsignacion"));

		this.jButtonid_sub_clienteConsignacionBusqueda= new JButtonMe();
		this.jButtonid_sub_clienteConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteConsignacionBusqueda.setText("U");
		this.jButtonid_sub_clienteConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_clienteConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_clienteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_clienteConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_sub_clienteConsignacionUpdate= new JButtonMe();
		this.jButtonid_sub_clienteConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteConsignacionUpdate.setText("U");
		this.jButtonid_sub_clienteConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_clienteConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_clienteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteConsignacionUpdate"));



					
		this.jLabelid_consignatarioConsignacion = new JLabelMe();
		this.jLabelid_consignatarioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDCONSIGNATARIO+" :");
		this.jLabelid_consignatarioConsignacion.setToolTipText("Consignatario");
		this.jLabelid_consignatarioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignatarioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignatarioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consignatarioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consignatarioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consignatarioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDCONSIGNATARIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_consignatarioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_consignatarioConsignacion= new JComboBoxMe();
		jComboBoxid_consignatarioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignatarioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_consignatarioConsignacion= new JButtonMe();
		this.jButtonid_consignatarioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioConsignacion.setText("Buscar");
		this.jButtonid_consignatarioConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consignatarioConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consignatarioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioConsignacion"));

		this.jButtonid_consignatarioConsignacionBusqueda= new JButtonMe();
		this.jButtonid_consignatarioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignatarioConsignacionBusqueda.setText("U");
		this.jButtonid_consignatarioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consignatarioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consignatarioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consignatarioConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_consignatarioConsignacionUpdate= new JButtonMe();
		this.jButtonid_consignatarioConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignatarioConsignacionUpdate.setText("U");
		this.jButtonid_consignatarioConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consignatarioConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consignatarioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioConsignacionUpdate"));



					
		this.jLabelid_vendedorConsignacion = new JLabelMe();
		this.jLabelid_vendedorConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorConsignacion.setToolTipText("Vendedor");
		this.jLabelid_vendedorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_vendedorConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_vendedorConsignacion= new JComboBoxMe();
		jComboBoxid_vendedorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorConsignacion= new JButtonMe();
		this.jButtonid_vendedorConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorConsignacion.setText("Buscar");
		this.jButtonid_vendedorConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorConsignacion"));

		this.jButtonid_vendedorConsignacionBusqueda= new JButtonMe();
		this.jButtonid_vendedorConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorConsignacionBusqueda.setText("U");
		this.jButtonid_vendedorConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_vendedorConsignacionUpdate= new JButtonMe();
		this.jButtonid_vendedorConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorConsignacionUpdate.setText("U");
		this.jButtonid_vendedorConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorConsignacionUpdate"));


		jButtonid_vendedorConsignacionArbol= new JButtonMe();
		jButtonid_vendedorConsignacionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorConsignacionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorConsignacionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorConsignacionArbol.setText("Arbol");
		jButtonid_vendedorConsignacionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorConsignacionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorConsignacionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorConsignacionArbol"));



					
		this.jLabelid_estado_pedidoConsignacion = new JLabelMe();
		this.jLabelid_estado_pedidoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDESTADOPEDIDO+" : *");
		this.jLabelid_estado_pedidoConsignacion.setToolTipText("Estado Pedido");
		this.jLabelid_estado_pedidoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedidoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedidoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDESTADOPEDIDO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_estado_pedidoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_estado_pedidoConsignacion= new JComboBoxMe();
		jComboBoxid_estado_pedidoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedidoConsignacion= new JButtonMe();
		this.jButtonid_estado_pedidoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoConsignacion.setText("Buscar");
		this.jButtonid_estado_pedidoConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedidoConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedidoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoConsignacion"));

		this.jButtonid_estado_pedidoConsignacionBusqueda= new JButtonMe();
		this.jButtonid_estado_pedidoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoConsignacionBusqueda.setText("U");
		this.jButtonid_estado_pedidoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedidoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedidoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedidoConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedidoConsignacionUpdate= new JButtonMe();
		this.jButtonid_estado_pedidoConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoConsignacionUpdate.setText("U");
		this.jButtonid_estado_pedidoConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedidoConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedidoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoConsignacionUpdate"));



					
		this.jLabelid_tipo_cambioConsignacion = new JLabelMe();
		this.jLabelid_tipo_cambioConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDTIPOCAMBIO+" : *");
		this.jLabelid_tipo_cambioConsignacion.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_tipo_cambioConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_tipo_cambioConsignacion= new JComboBoxMe();
		jComboBoxid_tipo_cambioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioConsignacion.setEnabled(false);

		this.jButtonid_tipo_cambioConsignacion= new JButtonMe();
		this.jButtonid_tipo_cambioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioConsignacion.setText("Buscar");
		this.jButtonid_tipo_cambioConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioConsignacion"));

		this.jButtonid_tipo_cambioConsignacionBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioConsignacionBusqueda.setText("U");
		this.jButtonid_tipo_cambioConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioConsignacionUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioConsignacionUpdate.setText("U");
		this.jButtonid_tipo_cambioConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioConsignacionUpdate"));



					
		this.jLabelid_zonaConsignacion = new JLabelMe();
		this.jLabelid_zonaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDZONA+" :");
		this.jLabelid_zonaConsignacion.setToolTipText("Zona");
		this.jLabelid_zonaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_zonaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_zonaConsignacion= new JComboBoxMe();
		jComboBoxid_zonaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_zonaConsignacion.setEnabled(false);

		this.jButtonid_zonaConsignacion= new JButtonMe();
		this.jButtonid_zonaConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaConsignacion.setText("Buscar");
		this.jButtonid_zonaConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaConsignacion"));

		this.jButtonid_zonaConsignacionBusqueda= new JButtonMe();
		this.jButtonid_zonaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaConsignacionBusqueda.setText("U");
		this.jButtonid_zonaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_zonaConsignacionUpdate= new JButtonMe();
		this.jButtonid_zonaConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaConsignacionUpdate.setText("U");
		this.jButtonid_zonaConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaConsignacionUpdate"));



					
		this.jLabelid_centro_costoConsignacion = new JLabelMe();
		this.jLabelid_centro_costoConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoConsignacion.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_centro_costoConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_centro_costoConsignacion= new JComboBoxMe();
		jComboBoxid_centro_costoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoConsignacion.setEnabled(false);

		this.jButtonid_centro_costoConsignacion= new JButtonMe();
		this.jButtonid_centro_costoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoConsignacion.setText("Buscar");
		this.jButtonid_centro_costoConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoConsignacion"));

		this.jButtonid_centro_costoConsignacionBusqueda= new JButtonMe();
		this.jButtonid_centro_costoConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoConsignacionBusqueda.setText("U");
		this.jButtonid_centro_costoConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoConsignacionUpdate= new JButtonMe();
		this.jButtonid_centro_costoConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoConsignacionUpdate.setText("U");
		this.jButtonid_centro_costoConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoConsignacionUpdate"));


		jButtonid_centro_costoConsignacionArbol= new JButtonMe();
		jButtonid_centro_costoConsignacionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoConsignacionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoConsignacionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoConsignacionArbol.setText("Arbol");
		jButtonid_centro_costoConsignacionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoConsignacionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoConsignacionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoConsignacionArbol"));



					
		this.jLabelid_responsableConsignacion = new JLabelMe();
		this.jLabelid_responsableConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDRESPONSABLE+" :");
		this.jLabelid_responsableConsignacion.setToolTipText("Responsable");
		this.jLabelid_responsableConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsableConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsableConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsableConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDRESPONSABLE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_responsableConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_responsableConsignacion= new JComboBoxMe();
		jComboBoxid_responsableConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_responsableConsignacion.setEnabled(false);

		this.jButtonid_responsableConsignacion= new JButtonMe();
		this.jButtonid_responsableConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableConsignacion.setText("Buscar");
		this.jButtonid_responsableConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsableConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsableConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableConsignacion"));

		this.jButtonid_responsableConsignacionBusqueda= new JButtonMe();
		this.jButtonid_responsableConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableConsignacionBusqueda.setText("U");
		this.jButtonid_responsableConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsableConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsableConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsableConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_responsableConsignacionUpdate= new JButtonMe();
		this.jButtonid_responsableConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableConsignacionUpdate.setText("U");
		this.jButtonid_responsableConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsableConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsableConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableConsignacionUpdate"));



					
		this.jLabelid_transportistaConsignacion = new JLabelMe();
		this.jLabelid_transportistaConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaConsignacion.setToolTipText("Transportista");
		this.jLabelid_transportistaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_transportistaConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_transportistaConsignacion= new JComboBoxMe();
		jComboBoxid_transportistaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transportistaConsignacion.setEnabled(false);

		this.jButtonid_transportistaConsignacion= new JButtonMe();
		this.jButtonid_transportistaConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaConsignacion.setText("Buscar");
		this.jButtonid_transportistaConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaConsignacion"));

		this.jButtonid_transportistaConsignacionBusqueda= new JButtonMe();
		this.jButtonid_transportistaConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaConsignacionBusqueda.setText("U");
		this.jButtonid_transportistaConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_transportistaConsignacionUpdate= new JButtonMe();
		this.jButtonid_transportistaConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaConsignacionUpdate.setText("U");
		this.jButtonid_transportistaConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaConsignacionUpdate"));



					
		this.jLabelid_transporteConsignacion = new JLabelMe();
		this.jLabelid_transporteConsignacion.setText(""+ConsignacionConstantesFunciones.LABEL_IDTRANSPORTE+" :");
		this.jLabelid_transporteConsignacion.setToolTipText("Transporte");
		this.jLabelid_transporteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transporteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transporteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transporteConsignacion.setToolTipText(ConsignacionConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutConsignacion = new GridBagLayout();
		this.jPanelid_transporteConsignacion.setLayout(this.gridaBagLayoutConsignacion);


		jComboBoxid_transporteConsignacion= new JComboBoxMe();
		jComboBoxid_transporteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transporteConsignacion.setEnabled(false);

		this.jButtonid_transporteConsignacion= new JButtonMe();
		this.jButtonid_transporteConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteConsignacion.setText("Buscar");
		this.jButtonid_transporteConsignacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transporteConsignacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteConsignacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transporteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteConsignacion"));

		this.jButtonid_transporteConsignacionBusqueda= new JButtonMe();
		this.jButtonid_transporteConsignacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteConsignacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteConsignacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteConsignacionBusqueda.setText("U");
		this.jButtonid_transporteConsignacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transporteConsignacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteConsignacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transporteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteConsignacionBusqueda"));

		if(this.consignacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transporteConsignacionBusqueda.setVisible(false);		}

		this.jButtonid_transporteConsignacionUpdate= new JButtonMe();
		this.jButtonid_transporteConsignacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteConsignacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteConsignacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteConsignacionUpdate.setText("U");
		this.jButtonid_transporteConsignacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transporteConsignacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteConsignacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transporteConsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteConsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteConsignacionUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleConsignacion = new ConsignacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consignacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsignacion= new GridBagLayout();
		

		
		String sToolTipConsignacion="";
		sToolTipConsignacion=ConsignacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsignacion+="(Facturacion.Consignacion)";
		}
		
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsignacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsignacion = new JButtonMe();
		this.jButtonModificarConsignacion = new JButtonMe();
        this.jButtonActualizarConsignacion = new JButtonMe();
        this.jButtonEliminarConsignacion = new JButtonMe();
        this.jButtonCancelarConsignacion = new JButtonMe();
        this.jButtonGuardarCambiosConsignacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsignacion = new JButtonMe();
		this.jButtonCerrarConsignacion = new JButtonMe();
		
		this.jScrollPanelDatosConsignacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsignacion = new JScrollPane();
		this.jScrollPanelDatosGeneralConsignacion = new JScrollPane();
				
		
		
		this.jPanelCamposConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Consignacion";
		
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignacions" + this.sPath));
		} else {
			this.jScrollPanelDatosConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposConsignacion.setName("jPanelCamposConsignacion"); 

		this.jPanelCamposOcultosConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsignacion.setName("jPanelCamposOcultosConsignacion"); 

        this.jPanelAccionesConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsignacion.setToolTipText("Acciones");
        this.jPanelAccionesConsignacion.setName("Acciones"); 

		this.jPanelAccionesFormularioConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsignacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsignacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalConsignacion.setName("jPanelCamposFintotalConsignacion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsignacion.setText("Nuevo");
		this.jButtonModificarConsignacion.setText("Editar");
        this.jButtonActualizarConsignacion.setText("Actualizar");
        this.jButtonEliminarConsignacion.setText("Eliminar");
        this.jButtonCancelarConsignacion.setText("Cancelar");
        this.jButtonGuardarCambiosConsignacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsignacion.setText("Guardar");
		this.jButtonCerrarConsignacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsignacion,"nuevo_button","Nuevo",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsignacion,"modificar_button","Editar",this.consignacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsignacion,"actualizar_button","Actualizar",this.consignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsignacion,"eliminar_button","Eliminar",this.consignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsignacion,"cancelar_button","Cancelar",this.consignacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsignacion,"guardarcambios_button","Guardar",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsignacion,"guardarcambiostabla_button","Guardar",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsignacion,"cerrar_button","Salir",this.consignacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsignacion.setToolTipText("Nuevo"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsignacion.setToolTipText("Editar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsignacion.setToolTipText("Actualizar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsignacion.setToolTipText("Eliminar)"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsignacion.setToolTipText("Cancelar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsignacion.setToolTipText("Guardar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsignacion.setToolTipText("Guardar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsignacion.setToolTipText("Salir"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsignacion";
		inputMap = this.jButtonNuevoConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsignacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsignacion";
		inputMap = this.jButtonActualizarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsignacion"));
		
		//ELIMINAR
		sMapKey = "EliminarConsignacion";
		inputMap = this.jButtonEliminarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsignacion"));
		
		//CANCELAR	
		sMapKey = "CancelarConsignacion";
		inputMap = this.jButtonCancelarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsignacion"));
		
		//CERRAR		
		sMapKey = "CerrarConsignacion";
		inputMap = this.jButtonCerrarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsignacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsignacion";
		inputMap = this.jButtonGuardarCambiosTablaConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsignacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsignacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsignacion.setToolTipText("Nuevo Consignacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsignacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsignacion.setToolTipText("Sin Cerrar Ventana Consignacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsignacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsignacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsignacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsignacion.setText("Accion");
		this.jComboBoxTiposAccionesConsignacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsignacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsignacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsignacion = new JLabelMe();
		
		this.jLabelAccionesConsignacion.setText("Acciones");		
		this.jLabelAccionesConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsignacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsignacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsignacion=new JTabbedPane();
		this.jTabbedPaneRelacionesConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsignacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsignacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsignacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsignacion = new GridBagLayout();
		
		this.jPanelCamposConsignacion.setLayout(gridaBagLayoutCamposConsignacion);
		this.jPanelCamposOcultosConsignacion.setLayout(gridaBagLayoutCamposOcultosConsignacion);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalConsignacion= new GridBagLayout();
		this.jPanelCamposFintotalConsignacion.setLayout(gridaBagLayoutCamposFintotalConsignacion);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsignacion.add(jLabelIdConsignacion, this.gridBagConstraintsConsignacion);



	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsignacion.add(jLabelidConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsignacion.add(jLabelid_empresaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsignacion.add(jButtonid_empresaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsignacion.add(jButtonid_empresaConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsignacion.add(jComboBoxid_empresaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalConsignacion.add(jLabelid_sucursalConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConsignacion.add(jButtonid_sucursalConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConsignacion.add(jButtonid_sucursalConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalConsignacion.add(jComboBoxid_sucursalConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioConsignacion.add(jLabelid_ejercicioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioConsignacion.add(jButtonid_ejercicioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioConsignacion.add(jButtonid_ejercicioConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioConsignacion.add(jComboBoxid_ejercicioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoConsignacion.add(jLabelid_periodoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoConsignacion.add(jButtonid_periodoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoConsignacion.add(jButtonid_periodoConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoConsignacion.add(jComboBoxid_periodoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioConsignacion.add(jLabelid_anioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioConsignacion.add(jButtonid_anioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioConsignacion.add(jButtonid_anioConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioConsignacion.add(jComboBoxid_anioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesConsignacion.add(jLabelid_mesConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesConsignacion.add(jButtonid_mesConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesConsignacion.add(jButtonid_mesConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesConsignacion.add(jComboBoxid_mesConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioConsignacion.add(jLabelid_usuarioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioConsignacion.add(jButtonid_usuarioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioConsignacion.add(jButtonid_usuarioConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioConsignacion.add(jComboBoxid_usuarioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroConsignacion.add(jLabelnumeroConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroConsignacion.add(jButtonnumeroConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroConsignacion.add(jTextFieldnumeroConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionConsignacion.add(jLabelnumero_autorizacionConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionConsignacion.add(jButtonnumero_autorizacionConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionConsignacion.add(jTextFieldnumero_autorizacionConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionConsignacion.add(jLabelfecha_emisionConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionConsignacion.add(jButtonfecha_emisionConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionConsignacion.add(jDateChooserfecha_emisionConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoConsignacion.add(jLabelfecha_vencimientoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoConsignacion.add(jButtonfecha_vencimientoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoConsignacion.add(jDateChooserfecha_vencimientoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaConsignacion.add(jLabelid_monedaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaConsignacion.add(jButtonid_monedaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaConsignacion.add(jButtonid_monedaConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaConsignacion.add(jComboBoxid_monedaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcotizacionConsignacion.add(jLabelcotizacionConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionConsignacion.add(jButtoncotizacionConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcotizacionConsignacion.add(jTextFieldcotizacionConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoConsignacion.add(jLabelid_empleadoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 2;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoConsignacion.add(jButtonid_empleadoConsignacion, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoConsignacion.add(jButtonid_empleadoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 4;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoConsignacion.add(jButtonid_empleadoConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoConsignacion.add(jComboBoxid_empleadoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioConsignacion.add(jLabelid_tipo_precioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioConsignacion.add(jButtonid_tipo_precioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioConsignacion.add(jButtonid_tipo_precioConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioConsignacion.add(jComboBoxid_tipo_precioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoConsignacion.add(jLabelid_formatoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoConsignacion.add(jButtonid_formatoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoConsignacion.add(jButtonid_formatoConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoConsignacion.add(jComboBoxid_formatoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionConsignacion.add(jLabeldireccionConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionConsignacion.add(jButtondireccionConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionConsignacion.add(jscrollPanedireccionConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteConsignacion.add(jLabelid_clienteConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 2;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteConsignacion.add(jButtonid_clienteConsignacion, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteConsignacion.add(jButtonid_clienteConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 4;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteConsignacion.add(jButtonid_clienteConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteConsignacion.add(jComboBoxid_clienteConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoConsignacion.add(jLabeltelefonoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoConsignacion.add(jButtontelefonoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoConsignacion.add(jTextFieldtelefonoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucConsignacion.add(jLabelrucConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucConsignacion.add(jButtonrucConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucConsignacion.add(jTextFieldrucConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_clienteConsignacion.add(jLabelid_sub_clienteConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteConsignacion.add(jButtonid_sub_clienteConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteConsignacion.add(jButtonid_sub_clienteConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_clienteConsignacion.add(jComboBoxid_sub_clienteConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_consignatarioConsignacion.add(jLabelid_consignatarioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignatarioConsignacion.add(jButtonid_consignatarioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignatarioConsignacion.add(jButtonid_consignatarioConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_consignatarioConsignacion.add(jComboBoxid_consignatarioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorConsignacion.add(jLabelid_vendedorConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 2;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorConsignacion.add(jButtonid_vendedorConsignacion, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 3;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorConsignacion.add(jButtonid_vendedorConsignacionArbol, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 4;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorConsignacion.add(jButtonid_vendedorConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 5;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorConsignacion.add(jButtonid_vendedorConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorConsignacion.add(jComboBoxid_vendedorConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionConsignacion.add(jLabeldescripcionConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionConsignacion.add(jButtondescripcionConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionConsignacion.add(jscrollPanedescripcionConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedidoConsignacion.add(jLabelid_estado_pedidoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoConsignacion.add(jButtonid_estado_pedidoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoConsignacion.add(jButtonid_estado_pedidoConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedidoConsignacion.add(jComboBoxid_estado_pedidoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_porcentajeConsignacion.add(jLabeldescuento_porcentajeConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeConsignacion.add(jButtondescuento_porcentajeConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_porcentajeConsignacion.add(jTextFielddescuento_porcentajeConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_con_ivaConsignacion.add(jLabeltotal_con_ivaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_con_ivaConsignacion.add(jButtontotal_con_ivaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_con_ivaConsignacion.add(jTextFieldtotal_con_ivaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsumanConsignacion.add(jLabelsumanConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanConsignacion.add(jButtonsumanConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsumanConsignacion.add(jTextFieldsumanConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorConsignacion.add(jLabeldescuento_valorConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorConsignacion.add(jButtondescuento_valorConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorConsignacion.add(jTextFielddescuento_valorConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaConsignacion.add(jLabeltotal_sin_ivaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaConsignacion.add(jButtontotal_sin_ivaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaConsignacion.add(jTextFieldtotal_sin_ivaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoConsignacion.add(jLabeltotal_descuentoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoConsignacion.add(jButtontotal_descuentoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoConsignacion.add(jTextFieldtotal_descuentoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteConsignacion.add(jLabelfleteConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteConsignacion.add(jButtonfleteConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteConsignacion.add(jTextFieldfleteConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalConsignacion.add(jLabeltotalConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalConsignacion.add(jButtontotalConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalConsignacion.add(jTextFieldtotalConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalConsignacion.add(jLabelsubtotalConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalConsignacion.add(jButtonsubtotalConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalConsignacion.add(jTextFieldsubtotalConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroConsignacion.add(jLabelotroConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroConsignacion.add(jButtonotroConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroConsignacion.add(jTextFieldotroConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoConsignacion.add(jLabelfinanciamientoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoConsignacion.add(jButtonfinanciamientoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoConsignacion.add(jTextFieldfinanciamientoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaConsignacion.add(jLabelivaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaConsignacion.add(jButtonivaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaConsignacion.add(jTextFieldivaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceConsignacion.add(jLabeliceConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceConsignacion.add(jButtoniceConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceConsignacion.add(jTextFieldiceConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_retencionConsignacion.add(jLabelmonto_retencionConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_retencionConsignacion.add(jButtonmonto_retencionConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_retencionConsignacion.add(jTextFieldmonto_retencionConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioConsignacion.add(jLabelid_tipo_cambioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 2;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioConsignacion.add(jButtonid_tipo_cambioConsignacion, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioConsignacion.add(jButtonid_tipo_cambioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 4;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioConsignacion.add(jButtonid_tipo_cambioConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioConsignacion.add(jComboBoxid_tipo_cambioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_fueConsignacion.add(jLabelnumero_fueConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_fueConsignacion.add(jButtonnumero_fueConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_fueConsignacion.add(jTextFieldnumero_fueConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaConsignacion.add(jLabelid_zonaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaConsignacion.add(jButtonid_zonaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaConsignacion.add(jButtonid_zonaConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaConsignacion.add(jComboBoxid_zonaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaConsignacion.add(jLabelfechaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaConsignacion.add(jButtonfechaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaConsignacion.add(jDateChooserfechaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoConsignacion.add(jLabelid_centro_costoConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 2;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoConsignacion.add(jButtonid_centro_costoConsignacion, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 3;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoConsignacion.add(jButtonid_centro_costoConsignacionArbol, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 4;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoConsignacion.add(jButtonid_centro_costoConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 5;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoConsignacion.add(jButtonid_centro_costoConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoConsignacion.add(jComboBoxid_centro_costoConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_servidorConsignacion.add(jLabelfecha_servidorConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_servidorConsignacion.add(jButtonfecha_servidorConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_servidorConsignacion.add(jDateChooserfecha_servidorConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_responsableConsignacion.add(jLabelid_responsableConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableConsignacion.add(jButtonid_responsableConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableConsignacion.add(jButtonid_responsableConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_responsableConsignacion.add(jComboBoxid_responsableConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioConsignacion.add(jLabelhora_inicioConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioConsignacion.add(jButtonhora_inicioConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioConsignacion.add(jSpinnerhora_inicioConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finConsignacion.add(jLabelhora_finConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finConsignacion.add(jButtonhora_finConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finConsignacion.add(jSpinnerhora_finConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaConsignacion.add(jLabelid_transportistaConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaConsignacion.add(jButtonid_transportistaConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaConsignacion.add(jButtonid_transportistaConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaConsignacion.add(jComboBoxid_transportistaConsignacion, this.gridBagConstraintsConsignacion);


	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 0;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transporteConsignacion.add(jLabelid_transporteConsignacion, this.gridBagConstraintsConsignacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 2;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteConsignacion.add(jButtonid_transporteConsignacionBusqueda, this.gridBagConstraintsConsignacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 3;
		this.gridBagConstraintsConsignacion.ipadx = 0;
		this.gridBagConstraintsConsignacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteConsignacion.add(jButtonid_transporteConsignacionUpdate, this.gridBagConstraintsConsignacion);
	}

	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignacion.gridy = 0;
	this.gridBagConstraintsConsignacion.gridx = 1;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transporteConsignacion.add(jComboBoxid_transporteConsignacion, this.gridBagConstraintsConsignacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelidConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelnumeroConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelnumero_autorizacionConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelfecha_emisionConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelfecha_vencimientoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_monedaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelcotizacionConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_empleadoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_tipo_precioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_formatoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPaneldireccionConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_clienteConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPaneltelefonoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelrucConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_sub_clienteConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_consignatarioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_vendedorConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPaneldescripcionConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignacion.add(this.jPanelid_estado_pedidoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposConsignacion % 4==0) {
		iXPanelCamposConsignacion=0;
		iYPanelCamposConsignacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_empresaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_sucursalConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_ejercicioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_periodoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_anioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_mesConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_usuarioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelivaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 3==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPaneliceConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 3==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelmonto_retencionConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 3==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_tipo_cambioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelnumero_fueConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_zonaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelfechaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_centro_costoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelfecha_servidorConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_responsableConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelhora_inicioConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelhora_finConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_transportistaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposOcultosConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposOcultosConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignacion.add(this.jPanelid_transporteConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposOcultosConsignacion % 4==0) {
		iXPanelCamposOcultosConsignacion=0;
		iYPanelCamposOcultosConsignacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPaneldescuento_porcentajeConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPaneltotal_con_ivaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPanelsumanConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPaneldescuento_valorConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPaneltotal_sin_ivaConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPaneltotal_descuentoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPanelfleteConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPaneltotalConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPanelsubtotalConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPanelotroConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
	this.gridBagConstraintsConsignacion = new GridBagConstraints();
	this.gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignacion.gridy = iYPanelCamposFintotalConsignacion;
	this.gridBagConstraintsConsignacion.gridx = iXPanelCamposFintotalConsignacion++;
	this.gridBagConstraintsConsignacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalConsignacion.add(this.jPanelfinanciamientoConsignacion, this.gridBagConstraintsConsignacion);



	if(iXPanelCamposFintotalConsignacion % 3==0) {
		iXPanelCamposFintotalConsignacion=0;
		iYPanelCamposFintotalConsignacion++;
	}
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsignacion= new GridBagLayout();
		this.jPanelAccionesConsignacion.setLayout(gridaBagLayoutAccionesConsignacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsignacion= new GridBagLayout();
		this.jPanelAccionesFormularioConsignacion.setLayout(gridaBagLayoutAccionesFormularioConsignacion);
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsignacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsignacion.add(this.jComboBoxTiposAccionesFormularioConsignacion, this.gridBagConstraintsConsignacion);

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsignacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsignacion.add(this.jCheckBoxPostAccionNuevoConsignacion, this.gridBagConstraintsConsignacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.consignacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConsignacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConsignacion.add(this.jCheckBoxPostAccionSinCerrarConsignacion, this.gridBagConstraintsConsignacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.consignacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConsignacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConsignacion.add(this.jCheckBoxPostAccionSinMensajeConsignacion, this.gridBagConstraintsConsignacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsignacion.add(this.jButtonModificarConsignacion, this.gridBagConstraintsConsignacion);							

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsignacion.add(this.jButtonEliminarConsignacion, this.gridBagConstraintsConsignacion);
		
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = 0;		
		this.gridBagConstraintsConsignacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsignacion.add(this.jButtonActualizarConsignacion, this.gridBagConstraintsConsignacion);


		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = 0;		
		this.gridBagConstraintsConsignacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsignacion.add(this.jButtonGuardarCambiosConsignacion, this.gridBagConstraintsConsignacion);	
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = 0;		
		this.gridBagConstraintsConsignacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsignacion.add(this.jButtonCancelarConsignacion, this.gridBagConstraintsConsignacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsignacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsignacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consignacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsignacion = new GridBagConstraints();						
			this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsignacion.gridx = 0;		
			//this.gridBagConstraintsConsignacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsignacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsignacion.gridx =0;
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsignacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsignacion, this.gridBagConstraintsConsignacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsignacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsignacion = new ConsignacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consignacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consignacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consignacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsignacionModel consignacionModel=new ConsignacionModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsignacionModel.ConsignacionFocusTraversalPolicy consignacionFocusTraversalPolicy = consignacionModel.new ConsignacionFocusTraversalPolicy(this);
			
			//consignacionFocusTraversalPolicy.setconsignacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consignacionModel);
			
			
			this.jContentPaneDetalleConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsignacion = new GridBagLayout();	
			this.jContentPaneDetalleConsignacion.setLayout(gridaBagLayoutDetalleConsignacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsignacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsignacion = new GridBagConstraints();
				this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsignacion.gridx = 0;
					
				
				this.jContentPaneDetalleConsignacion.add(jTtoolBarDetalleConsignacion, gridBagConstraintsConsignacion);								
				
}
			
			this.jScrollPanelDatosEdicionConsignacion=   new JScrollPane(jContentPaneDetalleConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsignacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsignacion.gridx = 0;
	        
			this.jContentPaneDetalleConsignacion.add(jPanelCamposConsignacion, gridBagConstraintsConsignacion);
			
			
			
			
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
						&& consignacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(this.puedeCargarPorParteDetalleConsignacion,false,-1);
					
					if(this.consignacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsignacion= new GridBagConstraints();
						this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsignacion.gridx = 0;
						this.jContentPaneDetalleConsignacion.add(this.jTabbedPaneRelacionesConsignacion, this.gridBagConstraintsConsignacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsignacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;
		this.gridBagConstraintsConsignacion.gridx = 0;

		this.jContentPaneDetalleConsignacion.add(jPanelCamposFintotalConsignacion, gridBagConstraintsConsignacion);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsignacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsignacion = new GridBagConstraints();
					this.gridBagConstraintsConsignacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsignacion.gridx = 0;
					
				
					this.jContentPaneDetalleConsignacion.add(jPanelCamposOcultosConsignacion, gridBagConstraintsConsignacion);
				
					this.jPanelCamposOcultosConsignacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsConsignacion.gridx = 0;
	        this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsignacion.add(this.jPanelAccionesFormularioConsignacion, this.gridBagConstraintsConsignacion);							
			
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsConsignacion.gridx = 0;
	        
			
			this.jContentPaneDetalleConsignacion.add(this.jPanelAccionesConsignacion, this.gridBagConstraintsConsignacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsignacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsignacion=   new JScrollPane(this.jPanelCamposConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsignacion.gridx = 0;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsignacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsignacion, this.gridBagConstraintsConsignacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsignacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsignacion, this.gridBagConstraintsConsignacion);			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsignacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsignacion, this.gridBagConstraintsConsignacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsignacion, this.gridBagConstraintsConsignacion);
			
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsignacion, this.gridBagConstraintsConsignacion);
		
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsignacion, this.gridBagConstraintsConsignacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsignacion;//jContentPane;
		
		return jScrollPanelDatosEdicionConsignacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleconsignacionSessionBean=new DetalleConsignacionSessionBean();
		this.detalleconsignacionSessionBean.setConGuardarRelaciones(false);
		this.detalleconsignacionSessionBean.setEsGuardarRelacionado(true);

		this.detalleconsignacionBeanSwingJInternalFrame=null;//new DetalleConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleconsignacionBeanSwingJInternalFramePopup=new DetalleConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleconsignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {

				DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleconsignacionSessionBean.setEsGuardarRelacionado(true);

				this.detalleconsignacionBeanSwingJInternalFrame=new DetalleConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleconsignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleconsignacionBeanSwingJInternalFrame.setdetalleconsignacionSessionBean(this.detalleconsignacionSessionBean);

				//this.gridBagConstraintsConsignacion = new GridBagConstraints();
				//this.gridBagConstraintsConsignacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsignacion.gridx = 0;
				//this.jContentPaneDetalleConsignacion.add(this.detalleconsignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsignacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsignacion.add("Detalle Consignacions",this.detalleconsignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsignacion.setComponentAt(iIndexTab,this.detalleconsignacionBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleconsignacionSessionBean.setEsGuardarRelacionado(false);
				this.detalleconsignacionBeanSwingJInternalFrame=null;//new DetalleConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleconsignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleConsignacion) {
					this.jTabbedPaneRelacionesConsignacion.add("Detalle Consignacions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleConsignacionBeanSwingJInternalFrame(List<Consignacion> consignacions,Consignacion consignacion,DetalleConsignacionBeanSwingJInternalFrame detalleconsignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleconsignacionBeanSwingJInternalFrame=new DetalleConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleconsignacionBeanSwingJInternalFrame.getDetalleConsignacionLogic().setConnexion(this.consignacionLogic.getConnexion());

					detalleconsignacionBeanSwingJInternalFrame.setconsignacionsForeignKey(consignacions);
					detalleconsignacionBeanSwingJInternalFrame.setconsignacionForeignKey(consignacion);
					detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setisBusquedaDesdeForeignKeySesionConsignacion(true);
					detalleconsignacionBeanSwingJInternalFrame.detalleconsignacionSessionBean.setlidConsignacionActual(consignacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleconsignacionBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleConsignacion(detalleconsignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleconsignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsignacion(true);
					detalleconsignacionBeanSwingJInternalFrame.setid_consignacionFK_IdConsignacion(consignacion.getId());

					if(!this.conCargarFormDetalle) {
						detalleconsignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleconsignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameConsignacionForeignKey(consignacion,1,false,true,true);
					detalleconsignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleconsignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsignacion");
					detalleconsignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsignacion");
					detalleconsignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleConsignacion(true);
					detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleConsignacion("n",detalleconsignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleconsignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleconsignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleconsignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleConsignacion("relacionado");
					} else {
						detalleconsignacionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleConsignacion("no_relacionado");
					}

					detalleconsignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleConsignacion().setVisible(false);

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
