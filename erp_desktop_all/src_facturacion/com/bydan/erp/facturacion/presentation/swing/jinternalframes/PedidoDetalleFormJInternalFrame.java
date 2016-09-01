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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.PedidoConstantesFunciones;

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
public class PedidoDetalleFormJInternalFrame extends PedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedido;
	
	protected JMenuBar jmenuBarDetallePedido;
	
	protected JMenu jmenuDetallePedido;
	protected JMenu jmenuDetalleArchivoPedido;
	protected JMenu jmenuDetalleAccionesPedido;
	protected JMenu jmenuDetalleDatosPedido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedido;	
	protected GridBagConstraints gridBagConstraintsPedido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoBeanSwingJInternalFrameAdditional jInternalFrameDetallePedido;		
	
	
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

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consultor="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedido="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rutatransporte="";

	protected TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipollamada="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public PedidoSessionBean pedidoSessionBean;
	
	

	public DetallePedidoBeanSwingJInternalFrame detallepedidoBeanSwingJInternalFrame=null;
	public DetallePedidoBeanSwingJInternalFrame detallepedidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedido=false;
	public DetallePedidoSessionBean detallepedidoSessionBean;
	
	
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
	public VendedorSessionBean vendedorSessionBean;
	public ConsultorSessionBean consultorSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoPedidoSessionBean estadopedidoSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public RutaTransporteSessionBean rutatransporteSessionBean;
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ZonaSessionBean zonaSessionBean;	
	
	public PedidoLogic pedidoLogic;
	
	public JScrollPane jScrollPanelDatosPedido;
	public JScrollPane jScrollPanelDatosEdicionPedido;
	public JScrollPane jScrollPanelDatosGeneralPedido;
	
	protected JPanel jPanelCamposPedido;    
	protected JPanel jPanelCamposOcultosPedido;    	
	protected JPanel jPanelAccionesPedido;
	protected JPanel jPanelAccionesFormularioPedido;
    
	
	
	protected Integer iXPanelCamposPedido=0;
	protected Integer iYPanelCamposPedido=0;
	
	protected Integer iXPanelCamposOcultosPedido=0;
	protected Integer iYPanelCamposOcultosPedido=0;
	
	

	protected JPanel jPanelCamposFintotalPedido;
	protected Integer iXPanelCamposFintotalPedido=0;
	protected Integer iYPanelCamposFintotalPedido=0;

	protected JPanel jPanelCamposIniciogeneralPedido;
	protected Integer iXPanelCamposIniciogeneralPedido=0;
	protected Integer iYPanelCamposIniciogeneralPedido=0;

	protected JPanel jPanelCamposInicioresumenPedido;
	protected Integer iXPanelCamposInicioresumenPedido=0;
	protected Integer iYPanelCamposInicioresumenPedido=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedido;
	public JButton jButtonModificarPedido;
	public JButton jButtonActualizarPedido;
    public JButton jButtonEliminarPedido;
	public JButton jButtonCancelarPedido;
    public JButton jButtonGuardarCambiosPedido;
	public JButton jButtonGuardarCambiosTablaPedido;
	protected JButton jButtonCerrarPedido;
	
	
	protected JButton jButtonProcesarInformacionPedido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedido;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedido;
	protected JButton jButtonModificarToolBarPedido;
	protected JButton jButtonActualizarToolBarPedido;
    protected JButton jButtonEliminarToolBarPedido;
	protected JButton jButtonCancelarToolBarPedido;
    protected JButton jButtonGuardarCambiosToolBarPedido;
	protected JButton jButtonGuardarCambiosTablaToolBarPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarPedido;
	protected JButton jButtonCerrarToolBarPedido;
	
	protected JButton jButtonProcesarInformacionToolBarPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedido;
	protected JMenuItem jMenuItemModificarPedido;
	protected JMenuItem jMenuItemActualizarPedido;
    protected JMenuItem jMenuItemEliminarPedido;
	protected JMenuItem jMenuItemCancelarPedido;
    protected JMenuItem jMenuItemGuardarCambiosPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedido;
	protected JMenuItem jMenuItemCerrarPedido;
	protected JMenuItem jMenuItemDetalleCerrarPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedido;
	
	protected JMenuItem jMenuItemProcesarInformacionPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedido;
	protected JMenuItem jMenuItemMostrarOcultarPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedido;
	public JLabel jLabelIdPedido;
	public JLabel jLabelidPedido;
	public JButton jButtonidPedidoBusqueda= new JButtonMe();

	public JPanel jPanelnumeroPedido;
	public JLabel jLabelnumeroPedido;
	public JTextField jTextFieldnumeroPedido;
	public JButton jButtonnumeroPedidoBusqueda= new JButtonMe();

	public JPanel jPanelpre_impresoPedido;
	public JLabel jLabelpre_impresoPedido;
	public JTextField jTextFieldpre_impresoPedido;
	public JButton jButtonpre_impresoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPedido;
	public JLabel jLabelfecha_emisionPedido;
	//public JFormattedTextField jDateChooserfecha_emisionPedido;

	public JDateChooser jDateChooserfecha_emisionPedido;
	public JButton jButtonfecha_emisionPedidoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaPedido;
	public JLabel jLabelfecha_entregaPedido;
	//public JFormattedTextField jDateChooserfecha_entregaPedido;

	public JDateChooser jDateChooserfecha_entregaPedido;
	public JButton jButtonfecha_entregaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionPedido;
	public JLabel jLabelcotizacionPedido;
	public JTextField jTextFieldcotizacionPedido;
	public JButton jButtoncotizacionPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldireccionPedido;
	public JLabel jLabeldireccionPedido;
	public JTextArea jTextAreadireccionPedido;
	public JScrollPane jscrollPanedireccionPedido;
	public JButton jButtondireccionPedidoBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoPedido;
	public JLabel jLabeltelefonoPedido;
	public JTextField jTextFieldtelefonoPedido;
	public JButton jButtontelefonoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelrucPedido;
	public JLabel jLabelrucPedido;
	public JTextField jTextFieldrucPedido;
	public JButton jButtonrucPedidoBusqueda= new JButtonMe();

	public JPanel jPanelordenPedido;
	public JLabel jLabelordenPedido;
	public JTextField jTextFieldordenPedido;
	public JButton jButtonordenPedidoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_rutaPedido;
	public JLabel jLabelvalor_rutaPedido;
	public JTextField jTextFieldvalor_rutaPedido;
	public JButton jButtonvalor_rutaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioPedido;
	public JLabel jLabelhora_inicioPedido;
	public JSpinner jSpinnerhora_inicioPedido= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioPedidoBusqueda= new JButtonMe();

	public JPanel jPanelhora_finPedido;
	public JLabel jLabelhora_finPedido;
	public JSpinner jSpinnerhora_finPedido= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPedido;
	public JLabel jLabeldescripcionPedido;
	public JTextArea jTextAreadescripcionPedido;
	public JScrollPane jscrollPanedescripcionPedido;
	public JButton jButtondescripcionPedidoBusqueda= new JButtonMe();

	public JPanel jPanelcupoPedido;
	public JLabel jLabelcupoPedido;
	public JTextField jTextFieldcupoPedido;
	public JButton jButtoncupoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelsaldoPedido;
	public JLabel jLabelsaldoPedido;
	public JTextField jTextFieldsaldoPedido;
	public JButton jButtonsaldoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelpedidosPedido;
	public JLabel jLabelpedidosPedido;
	public JTextField jTextFieldpedidosPedido;
	public JButton jButtonpedidosPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldocumentosPedido;
	public JLabel jLabeldocumentosPedido;
	public JTextField jTextFielddocumentosPedido;
	public JButton jButtondocumentosPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldisponiblePedido;
	public JLabel jLabeldisponiblePedido;
	public JTextField jTextFielddisponiblePedido;
	public JButton jButtondisponiblePedidoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajePedido;
	public JLabel jLabeldescuento_porcentajePedido;
	public JTextField jTextFielddescuento_porcentajePedido;
	public JButton jButtondescuento_porcentajePedidoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_con_ivaPedido;
	public JLabel jLabeltotal_con_ivaPedido;
	public JTextField jTextFieldtotal_con_ivaPedido;
	public JButton jButtontotal_con_ivaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelsumanPedido;
	public JLabel jLabelsumanPedido;
	public JTextField jTextFieldsumanPedido;
	public JButton jButtonsumanPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorPedido;
	public JLabel jLabeldescuento_valorPedido;
	public JTextField jTextFielddescuento_valorPedido;
	public JButton jButtondescuento_valorPedidoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaPedido;
	public JLabel jLabeltotal_sin_ivaPedido;
	public JTextField jTextFieldtotal_sin_ivaPedido;
	public JButton jButtontotal_sin_ivaPedidoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_totalPedido;
	public JLabel jLabeldescuento_totalPedido;
	public JTextField jTextFielddescuento_totalPedido;
	public JButton jButtondescuento_totalPedidoBusqueda= new JButtonMe();

	public JPanel jPanelfletePedido;
	public JLabel jLabelfletePedido;
	public JTextField jTextFieldfletePedido;
	public JButton jButtonfletePedidoBusqueda= new JButtonMe();

	public JPanel jPaneltotalPedido;
	public JLabel jLabeltotalPedido;
	public JTextField jTextFieldtotalPedido;
	public JButton jButtontotalPedidoBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalPedido;
	public JLabel jLabelsubtotalPedido;
	public JTextField jTextFieldsubtotalPedido;
	public JButton jButtonsubtotalPedidoBusqueda= new JButtonMe();

	public JPanel jPanelotroPedido;
	public JLabel jLabelotroPedido;
	public JTextField jTextFieldotroPedido;
	public JButton jButtonotroPedidoBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoPedido;
	public JLabel jLabelultimo_costoPedido;
	public JTextField jTextFieldultimo_costoPedido;
	public JButton jButtonultimo_costoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelivaPedido;
	public JLabel jLabelivaPedido;
	public JTextField jTextFieldivaPedido;
	public JButton jButtonivaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoPedido;
	public JLabel jLabelfinanciamientoPedido;
	public JTextField jTextFieldfinanciamientoPedido;
	public JButton jButtonfinanciamientoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelmargen_utilidadPedido;
	public JLabel jLabelmargen_utilidadPedido;
	public JTextField jTextFieldmargen_utilidadPedido;
	public JButton jButtonmargen_utilidadPedidoBusqueda= new JButtonMe();

	public JPanel jPanelotros_valoresPedido;
	public JLabel jLabelotros_valoresPedido;
	public JTextField jTextFieldotros_valoresPedido;
	public JButton jButtonotros_valoresPedidoBusqueda= new JButtonMe();

	public JPanel jPanelanticipoPedido;
	public JLabel jLabelanticipoPedido;
	public JTextField jTextFieldanticipoPedido;
	public JButton jButtonanticipoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelfechaPedido;
	public JLabel jLabelfechaPedido;
	//public JFormattedTextField jDateChooserfechaPedido;

	public JDateChooser jDateChooserfechaPedido;
	public JButton jButtonfechaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_fuePedido;
	public JLabel jLabelnumero_fuePedido;
	public JTextField jTextFieldnumero_fuePedido;
	public JButton jButtonnumero_fuePedidoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_servidorPedido;
	public JLabel jLabelfecha_servidorPedido;
	//public JFormattedTextField jDateChooserfecha_servidorPedido;

	public JDateChooser jDateChooserfecha_servidorPedido;
	public JButton jButtonfecha_servidorPedidoBusqueda= new JButtonMe();

	public JPanel jPanelmonto_retencionPedido;
	public JLabel jLabelmonto_retencionPedido;
	public JTextField jTextFieldmonto_retencionPedido;
	public JButton jButtonmonto_retencionPedidoBusqueda= new JButtonMe();

	public JPanel jPanelicePedido;
	public JLabel jLabelicePedido;
	public JTextField jTextFieldicePedido;
	public JButton jButtonicePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedido;
	public JLabel jLabelid_empresaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedido;
	public JButton jButtonid_empresaPedido= new JButtonMe();
	public JButton jButtonid_empresaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedido;
	public JLabel jLabelid_sucursalPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedido;
	public JButton jButtonid_sucursalPedido= new JButtonMe();
	public JButton jButtonid_sucursalPedidoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPedido;
	public JLabel jLabelid_ejercicioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPedido;
	public JButton jButtonid_ejercicioPedido= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPedido;
	public JLabel jLabelid_periodoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPedido;
	public JButton jButtonid_periodoPedido= new JButtonMe();
	public JButton jButtonid_periodoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_periodoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPedido;
	public JLabel jLabelid_anioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPedido;
	public JButton jButtonid_anioPedido= new JButtonMe();
	public JButton jButtonid_anioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_anioPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPedido;
	public JLabel jLabelid_mesPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPedido;
	public JButton jButtonid_mesPedido= new JButtonMe();
	public JButton jButtonid_mesPedidoUpdate= new JButtonMe();
	public JButton jButtonid_mesPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPedido;
	public JLabel jLabelid_usuarioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPedido;
	public JButton jButtonid_usuarioPedido= new JButtonMe();
	public JButton jButtonid_usuarioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaPedido;
	public JLabel jLabelid_monedaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaPedido;
	public JButton jButtonid_monedaPedido= new JButtonMe();
	public JButton jButtonid_monedaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_monedaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPedido;
	public JLabel jLabelid_empleadoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPedido;
	public JButton jButtonid_empleadoPedido= new JButtonMe();
	public JButton jButtonid_empleadoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioPedido;
	public JLabel jLabelid_tipo_precioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioPedido;
	public JButton jButtonid_tipo_precioPedido= new JButtonMe();
	public JButton jButtonid_tipo_precioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoPedido;
	public JLabel jLabelid_formatoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoPedido;
	public JButton jButtonid_formatoPedido= new JButtonMe();
	public JButton jButtonid_formatoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_formatoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePedido;
	public JLabel jLabelid_clientePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePedido;
	public JButton jButtonid_clientePedido= new JButtonMe();
	public JButton jButtonid_clientePedidoUpdate= new JButtonMe();
	public JButton jButtonid_clientePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_clientePedido;
	public JLabel jLabelid_sub_clientePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clientePedido;
	public JButton jButtonid_sub_clientePedido= new JButtonMe();
	public JButton jButtonid_sub_clientePedidoUpdate= new JButtonMe();
	public JButton jButtonid_sub_clientePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorPedido;
	public JLabel jLabelid_vendedorPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorPedido;
	public JButton jButtonid_vendedorPedido= new JButtonMe();
	public JButton jButtonid_vendedorPedidoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorPedidoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorPedidoArbol= new JButtonMe();

	public JPanel jPanelid_consultorPedido;
	public JLabel jLabelid_consultorPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consultorPedido;
	public JButton jButtonid_consultorPedido= new JButtonMe();
	public JButton jButtonid_consultorPedidoUpdate= new JButtonMe();
	public JButton jButtonid_consultorPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_responsablePedido;
	public JLabel jLabelid_responsablePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsablePedido;
	public JButton jButtonid_responsablePedido= new JButtonMe();
	public JButton jButtonid_responsablePedidoUpdate= new JButtonMe();
	public JButton jButtonid_responsablePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedidoPedido;
	public JLabel jLabelid_estado_pedidoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoPedido;
	public JButton jButtonid_estado_pedidoPedido= new JButtonMe();
	public JButton jButtonid_estado_pedidoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_transportePedido;
	public JLabel jLabelid_transportePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportePedido;
	public JButton jButtonid_transportePedido= new JButtonMe();
	public JButton jButtonid_transportePedidoUpdate= new JButtonMe();
	public JButton jButtonid_transportePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_ruta_transportePedido;
	public JLabel jLabelid_ruta_transportePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ruta_transportePedido;
	public JButton jButtonid_ruta_transportePedido= new JButtonMe();
	public JButton jButtonid_ruta_transportePedidoUpdate= new JButtonMe();
	public JButton jButtonid_ruta_transportePedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_llamadaPedido;
	public JLabel jLabelid_tipo_llamadaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_llamadaPedido;
	public JButton jButtonid_tipo_llamadaPedido= new JButtonMe();
	public JButton jButtonid_tipo_llamadaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_llamadaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaPedido;
	public JLabel jLabelid_transportistaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaPedido;
	public JButton jButtonid_transportistaPedido= new JButtonMe();
	public JButton jButtonid_transportistaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_transportistaPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioPedido;
	public JLabel jLabelid_tipo_cambioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioPedido;
	public JButton jButtonid_tipo_cambioPedido= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoPedido;
	public JLabel jLabelid_centro_costoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoPedido;
	public JButton jButtonid_centro_costoPedido= new JButtonMe();
	public JButton jButtonid_centro_costoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoPedidoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoPedidoArbol= new JButtonMe();

	public JPanel jPanelid_zonaPedido;
	public JLabel jLabelid_zonaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaPedido;
	public JButton jButtonid_zonaPedido= new JButtonMe();
	public JButton jButtonid_zonaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_zonaPedidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedido;
	
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
	public int iHeightFormulario=803;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedido=new JPanel();
				this.jPanelAccionesFormularioPedido=new JPanel();
				this.jmenuBarDetallePedido=new JMenuBar();
				this.jTtoolBarDetallePedido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedido() {
		return this.jButtonActualizarToolBarPedido;
	}
	
	public JButton getjButtonEliminarToolBarPedido() {
		return this.jButtonEliminarToolBarPedido;
	}
	
	public JButton getjButtonCancelarToolBarPedido() {
		return this.jButtonCancelarToolBarPedido;
	}		
	
	public JButton getjButtonProcesarInformacionPedido() {
		return this.jButtonProcesarInformacionPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedido)	{
		this.jButtonProcesarInformacionPedido = jButtonProcesarInformacionPedido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedido() {
		return this.jComboBoxTiposAccionesPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedido(
			JComboBox jComboBoxTiposRelacionesPedido) {
		this.jComboBoxTiposRelacionesPedido = jComboBoxTiposRelacionesPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedido(
			JComboBox jComboBoxTiposAccionesPedido) {
		this.jComboBoxTiposAccionesPedido = jComboBoxTiposAccionesPedido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedido() {
		return this.jComboBoxTiposAccionesFormularioPedido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedido(
			JComboBox jComboBoxTiposAccionesFormularioPedido) {
		this.jComboBoxTiposAccionesFormularioPedido = jComboBoxTiposAccionesFormularioPedido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidoSessionBean=new PedidoSessionBean();
		
		this.pedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallepedidoSessionBean=new DetallePedidoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 5050) {
			iWidth=5050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedido=new JButtonMe();
				this.jButtonModificarToolBarPedido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedido,this.jTtoolBarDetallePedido,
							"actualizar","actualizar","Actualizar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedido,this.jTtoolBarDetallePedido,
							"eliminar","eliminar","Eliminar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedido,this.jTtoolBarDetallePedido,
							"cancelar","cancelar","Cancelar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedido,this.jTtoolBarDetallePedido,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedido.add(this.jMenuItemDetalleCerrarPedido);
		
		this.jmenuDetalleAccionesPedido.add(this.jMenuItemActualizarPedido);
		this.jmenuDetalleAccionesPedido.add(this.jMenuItemEliminarPedido);
		this.jmenuDetalleAccionesPedido.add(this.jMenuItemCancelarPedido);		
		
		//this.jmenuDetalleDatosPedido.add(this.jMenuItemDetalleAbrirOrderByPedido);				
		this.jmenuDetalleDatosPedido.add(this.jMenuItemDetalleMostarOcultarPedido);				
				
		//this.jmenuDetalleAccionesPedido.add(this.jMenuItemGuardarCambiosPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedido.add(this.jmenuDetalleArchivoPedido);		
		this.jmenuBarDetallePedido.add(this.jmenuDetalleAccionesPedido);		
		this.jmenuBarDetallePedido.add(this.jmenuDetalleDatosPedido);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedido.add(this.jmenuDetallePedido);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedido = new JLabelMe();
		jLabelIdPedido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedido.setToolTipText(PedidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedido= new GridBagLayout();

		this.jPanelidPedido.setLayout(this.gridaBagLayoutPedido);

		jLabelidPedido = new JLabel();
		jLabelidPedido.setText("Id");

		jLabelidPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroPedido = new JLabelMe();
		this.jLabelnumeroPedido.setText(""+PedidoConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroPedido.setToolTipText("Numero");
		this.jLabelnumeroPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroPedido.setToolTipText(PedidoConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelnumeroPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldnumeroPedido= new JTextFieldMe();

		jTextFieldnumeroPedido.setEnabled(false);
		jTextFieldnumeroPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroPedidoBusqueda= new JButtonMe();
		this.jButtonnumeroPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroPedidoBusqueda.setText("U");
		this.jButtonnumeroPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroPedidoBusqueda.setVisible(false);		}


					
		this.jLabelpre_impresoPedido = new JLabelMe();
		this.jLabelpre_impresoPedido.setText(""+PedidoConstantesFunciones.LABEL_PREIMPRESO+" :");
		this.jLabelpre_impresoPedido.setToolTipText("Preimpreso");
		this.jLabelpre_impresoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpre_impresoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpre_impresoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpre_impresoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpre_impresoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpre_impresoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_PREIMPRESO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelpre_impresoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldpre_impresoPedido= new JTextFieldMe();

		jTextFieldpre_impresoPedido.setEnabled(false);
		jTextFieldpre_impresoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpre_impresoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpre_impresoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpre_impresoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpre_impresoPedidoBusqueda= new JButtonMe();
		this.jButtonpre_impresoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpre_impresoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpre_impresoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpre_impresoPedidoBusqueda.setText("U");
		this.jButtonpre_impresoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpre_impresoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpre_impresoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpre_impresoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpre_impresoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pre_impresoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpre_impresoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPedido = new JLabelMe();
		this.jLabelfecha_emisionPedido.setText(""+PedidoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPedido.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPedido.setToolTipText(PedidoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelfecha_emisionPedido.setLayout(this.gridaBagLayoutPedido);


		//jFormattedTextFieldfecha_emisionPedido= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPedido= new JDateChooser();
		jDateChooserfecha_emisionPedido.setEnabled(false);
		jDateChooserfecha_emisionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPedido.setDate(new Date());
		jDateChooserfecha_emisionPedido.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPedido.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPedidoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPedidoBusqueda.setText("U");
		this.jButtonfecha_emisionPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPedidoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaPedido = new JLabelMe();
		this.jLabelfecha_entregaPedido.setText(""+PedidoConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaPedido.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelfecha_entregaPedido.setLayout(this.gridaBagLayoutPedido);


		//jFormattedTextFieldfecha_entregaPedido= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaPedido= new JDateChooser();
		jDateChooserfecha_entregaPedido.setEnabled(false);
		jDateChooserfecha_entregaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaPedido.setDate(new Date());
		jDateChooserfecha_entregaPedido.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaPedido.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaPedidoBusqueda= new JButtonMe();
		this.jButtonfecha_entregaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaPedidoBusqueda.setText("U");
		this.jButtonfecha_entregaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaPedidoBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionPedido = new JLabelMe();
		this.jLabelcotizacionPedido.setText(""+PedidoConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionPedido.setToolTipText("Cotizacion");
		this.jLabelcotizacionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionPedido.setToolTipText(PedidoConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelcotizacionPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldcotizacionPedido= new JTextFieldMe();
		jTextFieldcotizacionPedido.setEnabled(false);
		jTextFieldcotizacionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionPedido.setText("0.0");

		this.jButtoncotizacionPedidoBusqueda= new JButtonMe();
		this.jButtoncotizacionPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionPedidoBusqueda.setText("U");
		this.jButtoncotizacionPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldireccionPedido = new JLabelMe();
		this.jLabeldireccionPedido.setText(""+PedidoConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionPedido.setToolTipText("Direccion");
		this.jLabeldireccionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionPedido.setToolTipText(PedidoConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldireccionPedido.setLayout(this.gridaBagLayoutPedido);


		jTextAreadireccionPedido= new JTextAreaMe();
		jTextAreadireccionPedido.setEnabled(false);
		jTextAreadireccionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionPedido.setLineWrap(true);
		jTextAreadireccionPedido.setWrapStyleWord(true);
		jTextAreadireccionPedido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionPedido.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionPedido = new JScrollPane(jTextAreadireccionPedido);
		jscrollPanedireccionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionPedidoBusqueda= new JButtonMe();
		this.jButtondireccionPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionPedidoBusqueda.setText("U");
		this.jButtondireccionPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionPedidoBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoPedido = new JLabelMe();
		this.jLabeltelefonoPedido.setText(""+PedidoConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoPedido.setToolTipText("Telefono");
		this.jLabeltelefonoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneltelefonoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldtelefonoPedido= new JTextFieldMe();

		jTextFieldtelefonoPedido.setEnabled(false);
		jTextFieldtelefonoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoPedidoBusqueda= new JButtonMe();
		this.jButtontelefonoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoPedidoBusqueda.setText("U");
		this.jButtontelefonoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelrucPedido = new JLabelMe();
		this.jLabelrucPedido.setText(""+PedidoConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucPedido.setToolTipText("Ruc");
		this.jLabelrucPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucPedido.setToolTipText(PedidoConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelrucPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldrucPedido= new JTextFieldMe();

		jTextFieldrucPedido.setEnabled(false);
		jTextFieldrucPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucPedidoBusqueda= new JButtonMe();
		this.jButtonrucPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucPedidoBusqueda.setText("U");
		this.jButtonrucPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucPedidoBusqueda.setVisible(false);		}


					
		this.jLabelordenPedido = new JLabelMe();
		this.jLabelordenPedido.setText(""+PedidoConstantesFunciones.LABEL_ORDEN+" :");
		this.jLabelordenPedido.setToolTipText("Orden");
		this.jLabelordenPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPedido.setToolTipText(PedidoConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelordenPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldordenPedido= new JTextFieldMe();

		jTextFieldordenPedido.setEnabled(false);
		jTextFieldordenPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonordenPedidoBusqueda= new JButtonMe();
		this.jButtonordenPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPedidoBusqueda.setText("U");
		this.jButtonordenPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPedidoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_rutaPedido = new JLabelMe();
		this.jLabelvalor_rutaPedido.setText(""+PedidoConstantesFunciones.LABEL_VALORRUTA+" : *");
		this.jLabelvalor_rutaPedido.setToolTipText("Valor Ruta");
		this.jLabelvalor_rutaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_rutaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_rutaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_rutaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_rutaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_rutaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_VALORRUTA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelvalor_rutaPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldvalor_rutaPedido= new JTextFieldMe();
		jTextFieldvalor_rutaPedido.setEnabled(false);
		jTextFieldvalor_rutaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_rutaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_rutaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_rutaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_rutaPedido.setText("0.0");

		this.jButtonvalor_rutaPedidoBusqueda= new JButtonMe();
		this.jButtonvalor_rutaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_rutaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_rutaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_rutaPedidoBusqueda.setText("U");
		this.jButtonvalor_rutaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_rutaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_rutaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_rutaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_rutaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_rutaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_rutaPedidoBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioPedido = new JLabelMe();
		this.jLabelhora_inicioPedido.setText(""+PedidoConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioPedido.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioPedido.setToolTipText(PedidoConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelhora_inicioPedido.setLayout(this.gridaBagLayoutPedido);


		//jFormattedTextFieldhora_inicioPedido= new JFormattedTextFieldMe();

		jSpinnerhora_inicioPedido= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioPedido.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioPedido = new JSpinner.DateEditor(jSpinnerhora_inicioPedido, "HH:mm:ss");

		jSpinnerhora_inicioPedido.setEditor(timeEditorhora_inicioPedido);

		jSpinnerhora_inicioPedido.setValue(new Date());

		jSpinnerhora_inicioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioPedido.setValue(new Date());
		//jSpinnerhora_inicioPedido.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioPedido.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioPedidoBusqueda= new JButtonMe();
		this.jButtonhora_inicioPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioPedidoBusqueda.setText("U");
		this.jButtonhora_inicioPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioPedidoBusqueda.setVisible(false);		}


					
		this.jLabelhora_finPedido = new JLabelMe();
		this.jLabelhora_finPedido.setText(""+PedidoConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finPedido.setToolTipText("Hora Fin");
		this.jLabelhora_finPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finPedido.setToolTipText(PedidoConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelhora_finPedido.setLayout(this.gridaBagLayoutPedido);


		//jFormattedTextFieldhora_finPedido= new JFormattedTextFieldMe();

		jSpinnerhora_finPedido= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finPedido.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finPedido = new JSpinner.DateEditor(jSpinnerhora_finPedido, "HH:mm:ss");

		jSpinnerhora_finPedido.setEditor(timeEditorhora_finPedido);

		jSpinnerhora_finPedido.setValue(new Date());

		jSpinnerhora_finPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finPedido.setValue(new Date());
		//jSpinnerhora_finPedido.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finPedido.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finPedidoBusqueda= new JButtonMe();
		this.jButtonhora_finPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finPedidoBusqueda.setText("U");
		this.jButtonhora_finPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPedido = new JLabelMe();
		this.jLabeldescripcionPedido.setText(""+PedidoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPedido.setToolTipText("Descripcion");
		this.jLabeldescripcionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPedido.setToolTipText(PedidoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldescripcionPedido.setLayout(this.gridaBagLayoutPedido);


		jTextAreadescripcionPedido= new JTextAreaMe();
		jTextAreadescripcionPedido.setEnabled(false);
		jTextAreadescripcionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedido.setLineWrap(true);
		jTextAreadescripcionPedido.setWrapStyleWord(true);
		jTextAreadescripcionPedido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPedido.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPedido = new JScrollPane(jTextAreadescripcionPedido);
		jscrollPanedescripcionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionPedidoBusqueda= new JButtonMe();
		this.jButtondescripcionPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPedidoBusqueda.setText("U");
		this.jButtondescripcionPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPedidoBusqueda.setVisible(false);		}


					
		this.jLabelcupoPedido = new JLabelMe();
		this.jLabelcupoPedido.setText(""+PedidoConstantesFunciones.LABEL_CUPO+" : *");
		this.jLabelcupoPedido.setToolTipText("Cupo");
		this.jLabelcupoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcupoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcupoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcupoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_CUPO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelcupoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldcupoPedido= new JTextFieldMe();
		jTextFieldcupoPedido.setEnabled(false);
		jTextFieldcupoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcupoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcupoPedido.setText("0.0");

		this.jButtoncupoPedidoBusqueda= new JButtonMe();
		this.jButtoncupoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncupoPedidoBusqueda.setText("U");
		this.jButtoncupoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncupoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncupoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcupoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcupoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cupoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncupoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelsaldoPedido = new JLabelMe();
		this.jLabelsaldoPedido.setText(""+PedidoConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoPedido.setToolTipText("Saldo");
		this.jLabelsaldoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelsaldoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldsaldoPedido= new JTextFieldMe();
		jTextFieldsaldoPedido.setEnabled(false);
		jTextFieldsaldoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoPedido.setText("0.0");

		this.jButtonsaldoPedidoBusqueda= new JButtonMe();
		this.jButtonsaldoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoPedidoBusqueda.setText("U");
		this.jButtonsaldoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelpedidosPedido = new JLabelMe();
		this.jLabelpedidosPedido.setText(""+PedidoConstantesFunciones.LABEL_PEDIDOS+" : *");
		this.jLabelpedidosPedido.setToolTipText("Pedidos");
		this.jLabelpedidosPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpedidosPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpedidosPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpedidosPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpedidosPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpedidosPedido.setToolTipText(PedidoConstantesFunciones.LABEL_PEDIDOS);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelpedidosPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldpedidosPedido= new JTextFieldMe();
		jTextFieldpedidosPedido.setEnabled(false);
		jTextFieldpedidosPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpedidosPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpedidosPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpedidosPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpedidosPedido.setText("0.0");

		this.jButtonpedidosPedidoBusqueda= new JButtonMe();
		this.jButtonpedidosPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpedidosPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpedidosPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpedidosPedidoBusqueda.setText("U");
		this.jButtonpedidosPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpedidosPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpedidosPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpedidosPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpedidosPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pedidosPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpedidosPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldocumentosPedido = new JLabelMe();
		this.jLabeldocumentosPedido.setText(""+PedidoConstantesFunciones.LABEL_DOCUMENTOS+" : *");
		this.jLabeldocumentosPedido.setToolTipText("Documentos");
		this.jLabeldocumentosPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldocumentosPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldocumentosPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldocumentosPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldocumentosPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldocumentosPedido.setToolTipText(PedidoConstantesFunciones.LABEL_DOCUMENTOS);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldocumentosPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFielddocumentosPedido= new JTextFieldMe();
		jTextFielddocumentosPedido.setEnabled(false);
		jTextFielddocumentosPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumentosPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumentosPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddocumentosPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddocumentosPedido.setText("0.0");

		this.jButtondocumentosPedidoBusqueda= new JButtonMe();
		this.jButtondocumentosPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumentosPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumentosPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondocumentosPedidoBusqueda.setText("U");
		this.jButtondocumentosPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondocumentosPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondocumentosPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddocumentosPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddocumentosPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"documentosPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondocumentosPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldisponiblePedido = new JLabelMe();
		this.jLabeldisponiblePedido.setText(""+PedidoConstantesFunciones.LABEL_DISPONIBLE+" : *");
		this.jLabeldisponiblePedido.setToolTipText("Disponible");
		this.jLabeldisponiblePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponiblePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponiblePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponiblePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponiblePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponiblePedido.setToolTipText(PedidoConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldisponiblePedido.setLayout(this.gridaBagLayoutPedido);


		jTextFielddisponiblePedido= new JTextFieldMe();
		jTextFielddisponiblePedido.setEnabled(false);
		jTextFielddisponiblePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponiblePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponiblePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponiblePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponiblePedido.setText("0.0");

		this.jButtondisponiblePedidoBusqueda= new JButtonMe();
		this.jButtondisponiblePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponiblePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponiblePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponiblePedidoBusqueda.setText("U");
		this.jButtondisponiblePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponiblePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponiblePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponiblePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponiblePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponiblePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponiblePedidoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajePedido = new JLabelMe();
		this.jLabeldescuento_porcentajePedido.setText(""+PedidoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajePedido.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajePedido.setToolTipText(PedidoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldescuento_porcentajePedido.setLayout(this.gridaBagLayoutPedido);


		jTextFielddescuento_porcentajePedido= new JTextFieldMe();
		jTextFielddescuento_porcentajePedido.setEnabled(false);
		jTextFielddescuento_porcentajePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajePedido.setText("0.0");

		this.jButtondescuento_porcentajePedidoBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajePedidoBusqueda.setText("U");
		this.jButtondescuento_porcentajePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajePedidoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_con_ivaPedido = new JLabelMe();
		this.jLabeltotal_con_ivaPedido.setText(""+PedidoConstantesFunciones.LABEL_TOTALCONIVA+" : *");
		this.jLabeltotal_con_ivaPedido.setToolTipText("Monto Con Iva");
		this.jLabeltotal_con_ivaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_con_ivaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_con_ivaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_con_ivaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_con_ivaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_con_ivaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_TOTALCONIVA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneltotal_con_ivaPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldtotal_con_ivaPedido= new JTextFieldMe();
		jTextFieldtotal_con_ivaPedido.setEnabled(false);
		jTextFieldtotal_con_ivaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_con_ivaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_con_ivaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_con_ivaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_con_ivaPedido.setText("0.0");

		this.jButtontotal_con_ivaPedidoBusqueda= new JButtonMe();
		this.jButtontotal_con_ivaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_con_ivaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_con_ivaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_con_ivaPedidoBusqueda.setText("U");
		this.jButtontotal_con_ivaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_con_ivaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_con_ivaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_con_ivaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_con_ivaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_con_ivaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_con_ivaPedidoBusqueda.setVisible(false);		}


					
		this.jLabelsumanPedido = new JLabelMe();
		this.jLabelsumanPedido.setText(""+PedidoConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanPedido.setToolTipText("Suman");
		this.jLabelsumanPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanPedido.setToolTipText(PedidoConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelsumanPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldsumanPedido= new JTextFieldMe();
		jTextFieldsumanPedido.setEnabled(false);
		jTextFieldsumanPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanPedido.setText("0.0");

		this.jButtonsumanPedidoBusqueda= new JButtonMe();
		this.jButtonsumanPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanPedidoBusqueda.setText("U");
		this.jButtonsumanPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorPedido = new JLabelMe();
		this.jLabeldescuento_valorPedido.setText(""+PedidoConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorPedido.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorPedido.setToolTipText(PedidoConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldescuento_valorPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFielddescuento_valorPedido= new JTextFieldMe();
		jTextFielddescuento_valorPedido.setEnabled(false);
		jTextFielddescuento_valorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorPedido.setText("0.0");

		this.jButtondescuento_valorPedidoBusqueda= new JButtonMe();
		this.jButtondescuento_valorPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorPedidoBusqueda.setText("U");
		this.jButtondescuento_valorPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorPedidoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaPedido = new JLabelMe();
		this.jLabeltotal_sin_ivaPedido.setText(""+PedidoConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaPedido.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneltotal_sin_ivaPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldtotal_sin_ivaPedido= new JTextFieldMe();
		jTextFieldtotal_sin_ivaPedido.setEnabled(false);
		jTextFieldtotal_sin_ivaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaPedido.setText("0.0");

		this.jButtontotal_sin_ivaPedidoBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaPedidoBusqueda.setText("U");
		this.jButtontotal_sin_ivaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaPedidoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_totalPedido = new JLabelMe();
		this.jLabeldescuento_totalPedido.setText(""+PedidoConstantesFunciones.LABEL_DESCUENTOTOTAL+" : *");
		this.jLabeldescuento_totalPedido.setToolTipText("Descuento Total");
		this.jLabeldescuento_totalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_totalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_totalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_totalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_totalPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_totalPedido.setToolTipText(PedidoConstantesFunciones.LABEL_DESCUENTOTOTAL);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneldescuento_totalPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFielddescuento_totalPedido= new JTextFieldMe();
		jTextFielddescuento_totalPedido.setEnabled(false);
		jTextFielddescuento_totalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_totalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_totalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_totalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_totalPedido.setText("0.0");

		this.jButtondescuento_totalPedidoBusqueda= new JButtonMe();
		this.jButtondescuento_totalPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_totalPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_totalPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_totalPedidoBusqueda.setText("U");
		this.jButtondescuento_totalPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_totalPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_totalPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_totalPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_totalPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_totalPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_totalPedidoBusqueda.setVisible(false);		}


					
		this.jLabelfletePedido = new JLabelMe();
		this.jLabelfletePedido.setText(""+PedidoConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfletePedido.setToolTipText("Flete");
		this.jLabelfletePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfletePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfletePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfletePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfletePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfletePedido.setToolTipText(PedidoConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelfletePedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldfletePedido= new JTextFieldMe();
		jTextFieldfletePedido.setEnabled(false);
		jTextFieldfletePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfletePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfletePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfletePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfletePedido.setText("0.0");

		this.jButtonfletePedidoBusqueda= new JButtonMe();
		this.jButtonfletePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfletePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfletePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfletePedidoBusqueda.setText("U");
		this.jButtonfletePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfletePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfletePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfletePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfletePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fletePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfletePedidoBusqueda.setVisible(false);		}


					
		this.jLabeltotalPedido = new JLabelMe();
		this.jLabeltotalPedido.setText(""+PedidoConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPedido.setToolTipText("Total");
		this.jLabeltotalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPedido.setToolTipText(PedidoConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPaneltotalPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldtotalPedido= new JTextFieldMe();
		jTextFieldtotalPedido.setEnabled(false);
		jTextFieldtotalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPedido.setText("0.0");

		this.jButtontotalPedidoBusqueda= new JButtonMe();
		this.jButtontotalPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPedidoBusqueda.setText("U");
		this.jButtontotalPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPedidoBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalPedido = new JLabelMe();
		this.jLabelsubtotalPedido.setText(""+PedidoConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalPedido.setToolTipText("Subtotal");
		this.jLabelsubtotalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalPedido.setToolTipText(PedidoConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelsubtotalPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldsubtotalPedido= new JTextFieldMe();
		jTextFieldsubtotalPedido.setEnabled(false);
		jTextFieldsubtotalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalPedido.setText("0.0");

		this.jButtonsubtotalPedidoBusqueda= new JButtonMe();
		this.jButtonsubtotalPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalPedidoBusqueda.setText("U");
		this.jButtonsubtotalPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalPedidoBusqueda.setVisible(false);		}


					
		this.jLabelotroPedido = new JLabelMe();
		this.jLabelotroPedido.setText(""+PedidoConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroPedido.setToolTipText("Otros Cargos");
		this.jLabelotroPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroPedido.setToolTipText(PedidoConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelotroPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldotroPedido= new JTextFieldMe();
		jTextFieldotroPedido.setEnabled(false);
		jTextFieldotroPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroPedido.setText("0.0");

		this.jButtonotroPedidoBusqueda= new JButtonMe();
		this.jButtonotroPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroPedidoBusqueda.setText("U");
		this.jButtonotroPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroPedidoBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoPedido = new JLabelMe();
		this.jLabelultimo_costoPedido.setText(""+PedidoConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoPedido.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelultimo_costoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldultimo_costoPedido= new JTextFieldMe();
		jTextFieldultimo_costoPedido.setEnabled(false);
		jTextFieldultimo_costoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoPedido.setText("0.0");

		this.jButtonultimo_costoPedidoBusqueda= new JButtonMe();
		this.jButtonultimo_costoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoPedidoBusqueda.setText("U");
		this.jButtonultimo_costoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelivaPedido = new JLabelMe();
		this.jLabelivaPedido.setText(""+PedidoConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaPedido.setToolTipText("Iva");
		this.jLabelivaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelivaPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldivaPedido= new JTextFieldMe();
		jTextFieldivaPedido.setEnabled(false);
		jTextFieldivaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaPedido.setText("0.0");

		this.jButtonivaPedidoBusqueda= new JButtonMe();
		this.jButtonivaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaPedidoBusqueda.setText("U");
		this.jButtonivaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaPedidoBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoPedido = new JLabelMe();
		this.jLabelfinanciamientoPedido.setText(""+PedidoConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoPedido.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelfinanciamientoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldfinanciamientoPedido= new JTextFieldMe();
		jTextFieldfinanciamientoPedido.setEnabled(false);
		jTextFieldfinanciamientoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoPedido.setText("0.0");

		this.jButtonfinanciamientoPedidoBusqueda= new JButtonMe();
		this.jButtonfinanciamientoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoPedidoBusqueda.setText("U");
		this.jButtonfinanciamientoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelmargen_utilidadPedido = new JLabelMe();
		this.jLabelmargen_utilidadPedido.setText(""+PedidoConstantesFunciones.LABEL_MARGENUTILIDAD+" : *");
		this.jLabelmargen_utilidadPedido.setToolTipText("Margen Utilidad");
		this.jLabelmargen_utilidadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmargen_utilidadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmargen_utilidadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmargen_utilidadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmargen_utilidadPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmargen_utilidadPedido.setToolTipText(PedidoConstantesFunciones.LABEL_MARGENUTILIDAD);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelmargen_utilidadPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldmargen_utilidadPedido= new JTextFieldMe();
		jTextFieldmargen_utilidadPedido.setEnabled(false);
		jTextFieldmargen_utilidadPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargen_utilidadPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargen_utilidadPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmargen_utilidadPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmargen_utilidadPedido.setText("0.0");

		this.jButtonmargen_utilidadPedidoBusqueda= new JButtonMe();
		this.jButtonmargen_utilidadPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargen_utilidadPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargen_utilidadPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmargen_utilidadPedidoBusqueda.setText("U");
		this.jButtonmargen_utilidadPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmargen_utilidadPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmargen_utilidadPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmargen_utilidadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmargen_utilidadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"margen_utilidadPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmargen_utilidadPedidoBusqueda.setVisible(false);		}


					
		this.jLabelotros_valoresPedido = new JLabelMe();
		this.jLabelotros_valoresPedido.setText(""+PedidoConstantesFunciones.LABEL_OTROSVALORES+" : *");
		this.jLabelotros_valoresPedido.setToolTipText("Otros Valores");
		this.jLabelotros_valoresPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_valoresPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_valoresPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_valoresPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_valoresPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_valoresPedido.setToolTipText(PedidoConstantesFunciones.LABEL_OTROSVALORES);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelotros_valoresPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldotros_valoresPedido= new JTextFieldMe();
		jTextFieldotros_valoresPedido.setEnabled(false);
		jTextFieldotros_valoresPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_valoresPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_valoresPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_valoresPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_valoresPedido.setText("0.0");

		this.jButtonotros_valoresPedidoBusqueda= new JButtonMe();
		this.jButtonotros_valoresPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_valoresPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_valoresPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_valoresPedidoBusqueda.setText("U");
		this.jButtonotros_valoresPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_valoresPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_valoresPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_valoresPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_valoresPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_valoresPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_valoresPedidoBusqueda.setVisible(false);		}


					
		this.jLabelanticipoPedido = new JLabelMe();
		this.jLabelanticipoPedido.setText(""+PedidoConstantesFunciones.LABEL_ANTICIPO+" : *");
		this.jLabelanticipoPedido.setToolTipText("Anticipo");
		this.jLabelanticipoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanticipoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanticipoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanticipoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanticipoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanticipoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_ANTICIPO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelanticipoPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldanticipoPedido= new JTextFieldMe();
		jTextFieldanticipoPedido.setEnabled(false);
		jTextFieldanticipoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanticipoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanticipoPedido.setText("0.0");

		this.jButtonanticipoPedidoBusqueda= new JButtonMe();
		this.jButtonanticipoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanticipoPedidoBusqueda.setText("U");
		this.jButtonanticipoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanticipoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanticipoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanticipoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanticipoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anticipoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanticipoPedidoBusqueda.setVisible(false);		}


					
		this.jLabelfechaPedido = new JLabelMe();
		this.jLabelfechaPedido.setText(""+PedidoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPedido.setToolTipText("Fecha");
		this.jLabelfechaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelfechaPedido.setLayout(this.gridaBagLayoutPedido);


		//jFormattedTextFieldfechaPedido= new JFormattedTextFieldMe();

		jDateChooserfechaPedido= new JDateChooser();
		jDateChooserfechaPedido.setEnabled(false);
		jDateChooserfechaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPedido.setDate(new Date());
		jDateChooserfechaPedido.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPedido.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPedidoBusqueda= new JButtonMe();
		this.jButtonfechaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPedidoBusqueda.setText("U");
		this.jButtonfechaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPedidoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_fuePedido = new JLabelMe();
		this.jLabelnumero_fuePedido.setText(""+PedidoConstantesFunciones.LABEL_NUMEROFUE+" :");
		this.jLabelnumero_fuePedido.setToolTipText("Nro Fue");
		this.jLabelnumero_fuePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fuePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fuePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_fuePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_fuePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_fuePedido.setToolTipText(PedidoConstantesFunciones.LABEL_NUMEROFUE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelnumero_fuePedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldnumero_fuePedido= new JTextFieldMe();

		jTextFieldnumero_fuePedido.setEnabled(false);
		jTextFieldnumero_fuePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fuePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fuePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_fuePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_fuePedidoBusqueda= new JButtonMe();
		this.jButtonnumero_fuePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fuePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fuePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_fuePedidoBusqueda.setText("U");
		this.jButtonnumero_fuePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_fuePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_fuePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_fuePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_fuePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_fuePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_fuePedidoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_servidorPedido = new JLabelMe();
		this.jLabelfecha_servidorPedido.setText(""+PedidoConstantesFunciones.LABEL_FECHASERVIDOR+" : *");
		this.jLabelfecha_servidorPedido.setToolTipText("Fecha Servidor");
		this.jLabelfecha_servidorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_servidorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_servidorPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_servidorPedido.setToolTipText(PedidoConstantesFunciones.LABEL_FECHASERVIDOR);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelfecha_servidorPedido.setLayout(this.gridaBagLayoutPedido);


		//jFormattedTextFieldfecha_servidorPedido= new JFormattedTextFieldMe();

		jDateChooserfecha_servidorPedido= new JDateChooser();
		jDateChooserfecha_servidorPedido.setEnabled(false);
		jDateChooserfecha_servidorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_servidorPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_servidorPedido.setDate(new Date());
		jDateChooserfecha_servidorPedido.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_servidorPedido.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_servidorPedidoBusqueda= new JButtonMe();
		this.jButtonfecha_servidorPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_servidorPedidoBusqueda.setText("U");
		this.jButtonfecha_servidorPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_servidorPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_servidorPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_servidorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_servidorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_servidorPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_servidorPedidoBusqueda.setVisible(false);		}


					
		this.jLabelmonto_retencionPedido = new JLabelMe();
		this.jLabelmonto_retencionPedido.setText(""+PedidoConstantesFunciones.LABEL_MONTORETENCION+" : *");
		this.jLabelmonto_retencionPedido.setToolTipText("Monto Retencion");
		this.jLabelmonto_retencionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_retencionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_retencionPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_retencionPedido.setToolTipText(PedidoConstantesFunciones.LABEL_MONTORETENCION);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelmonto_retencionPedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldmonto_retencionPedido= new JTextFieldMe();
		jTextFieldmonto_retencionPedido.setEnabled(false);
		jTextFieldmonto_retencionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_retencionPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_retencionPedido.setText("0.0");

		this.jButtonmonto_retencionPedidoBusqueda= new JButtonMe();
		this.jButtonmonto_retencionPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_retencionPedidoBusqueda.setText("U");
		this.jButtonmonto_retencionPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_retencionPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_retencionPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_retencionPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_retencionPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_retencionPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_retencionPedidoBusqueda.setVisible(false);		}


					
		this.jLabelicePedido = new JLabelMe();
		this.jLabelicePedido.setText(""+PedidoConstantesFunciones.LABEL_ICE+" : *");
		this.jLabelicePedido.setToolTipText("Ice");
		this.jLabelicePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelicePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelicePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelicePedido.setToolTipText(PedidoConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelicePedido.setLayout(this.gridaBagLayoutPedido);


		jTextFieldicePedido= new JTextFieldMe();
		jTextFieldicePedido.setEnabled(false);
		jTextFieldicePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldicePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldicePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldicePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldicePedido.setText("0.0");

		this.jButtonicePedidoBusqueda= new JButtonMe();
		this.jButtonicePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonicePedidoBusqueda.setText("U");
		this.jButtonicePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonicePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonicePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldicePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldicePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"icePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonicePedidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedido = new JLabelMe();
		this.jLabelid_empresaPedido.setText(""+PedidoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedido.setToolTipText("Empresa");
		this.jLabelid_empresaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_empresaPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_empresaPedido= new JComboBoxMe();
		jComboBoxid_empresaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedido.setEnabled(false);

		this.jButtonid_empresaPedido= new JButtonMe();
		this.jButtonid_empresaPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedido.setText("Buscar");
		this.jButtonid_empresaPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedido"));

		this.jButtonid_empresaPedidoBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoBusqueda.setText("U");
		this.jButtonid_empresaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoUpdate.setText("U");
		this.jButtonid_empresaPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoUpdate"));



					
		this.jLabelid_sucursalPedido = new JLabelMe();
		this.jLabelid_sucursalPedido.setText(""+PedidoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedido.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_sucursalPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_sucursalPedido= new JComboBoxMe();
		jComboBoxid_sucursalPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedido.setEnabled(false);

		this.jButtonid_sucursalPedido= new JButtonMe();
		this.jButtonid_sucursalPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedido.setText("Buscar");
		this.jButtonid_sucursalPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedido"));

		this.jButtonid_sucursalPedidoBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoBusqueda.setText("U");
		this.jButtonid_sucursalPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoUpdate.setText("U");
		this.jButtonid_sucursalPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoUpdate"));



					
		this.jLabelid_ejercicioPedido = new JLabelMe();
		this.jLabelid_ejercicioPedido.setText(""+PedidoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPedido.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_ejercicioPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_ejercicioPedido= new JComboBoxMe();
		jComboBoxid_ejercicioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPedido.setEnabled(false);

		this.jButtonid_ejercicioPedido= new JButtonMe();
		this.jButtonid_ejercicioPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedido.setText("Buscar");
		this.jButtonid_ejercicioPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedido"));

		this.jButtonid_ejercicioPedidoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoBusqueda.setText("U");
		this.jButtonid_ejercicioPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPedidoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPedidoUpdate= new JButtonMe();
		this.jButtonid_ejercicioPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoUpdate.setText("U");
		this.jButtonid_ejercicioPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoUpdate"));



					
		this.jLabelid_periodoPedido = new JLabelMe();
		this.jLabelid_periodoPedido.setText(""+PedidoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPedido.setToolTipText("Periodo");
		this.jLabelid_periodoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_periodoPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_periodoPedido= new JComboBoxMe();
		jComboBoxid_periodoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPedido.setEnabled(false);

		this.jButtonid_periodoPedido= new JButtonMe();
		this.jButtonid_periodoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedido.setText("Buscar");
		this.jButtonid_periodoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedido"));

		this.jButtonid_periodoPedidoBusqueda= new JButtonMe();
		this.jButtonid_periodoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoBusqueda.setText("U");
		this.jButtonid_periodoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_periodoPedidoUpdate= new JButtonMe();
		this.jButtonid_periodoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoUpdate.setText("U");
		this.jButtonid_periodoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoUpdate"));



					
		this.jLabelid_anioPedido = new JLabelMe();
		this.jLabelid_anioPedido.setText(""+PedidoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPedido.setToolTipText("Anio");
		this.jLabelid_anioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_anioPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_anioPedido= new JComboBoxMe();
		jComboBoxid_anioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPedido.setEnabled(false);

		this.jButtonid_anioPedido= new JButtonMe();
		this.jButtonid_anioPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedido.setText("Buscar");
		this.jButtonid_anioPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedido"));

		this.jButtonid_anioPedidoBusqueda= new JButtonMe();
		this.jButtonid_anioPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoBusqueda.setText("U");
		this.jButtonid_anioPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPedidoBusqueda.setVisible(false);		}

		this.jButtonid_anioPedidoUpdate= new JButtonMe();
		this.jButtonid_anioPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoUpdate.setText("U");
		this.jButtonid_anioPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoUpdate"));



					
		this.jLabelid_mesPedido = new JLabelMe();
		this.jLabelid_mesPedido.setText(""+PedidoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPedido.setToolTipText("Mes");
		this.jLabelid_mesPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_mesPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_mesPedido= new JComboBoxMe();
		jComboBoxid_mesPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPedido.setEnabled(false);

		this.jButtonid_mesPedido= new JButtonMe();
		this.jButtonid_mesPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedido.setText("Buscar");
		this.jButtonid_mesPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedido"));

		this.jButtonid_mesPedidoBusqueda= new JButtonMe();
		this.jButtonid_mesPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoBusqueda.setText("U");
		this.jButtonid_mesPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPedidoBusqueda.setVisible(false);		}

		this.jButtonid_mesPedidoUpdate= new JButtonMe();
		this.jButtonid_mesPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoUpdate.setText("U");
		this.jButtonid_mesPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoUpdate"));



					
		this.jLabelid_usuarioPedido = new JLabelMe();
		this.jLabelid_usuarioPedido.setText(""+PedidoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPedido.setToolTipText("Usuario");
		this.jLabelid_usuarioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_usuarioPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_usuarioPedido= new JComboBoxMe();
		jComboBoxid_usuarioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPedido.setEnabled(false);

		this.jButtonid_usuarioPedido= new JButtonMe();
		this.jButtonid_usuarioPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedido.setText("Buscar");
		this.jButtonid_usuarioPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedido"));

		this.jButtonid_usuarioPedidoBusqueda= new JButtonMe();
		this.jButtonid_usuarioPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoBusqueda.setText("U");
		this.jButtonid_usuarioPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPedidoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPedidoUpdate= new JButtonMe();
		this.jButtonid_usuarioPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoUpdate.setText("U");
		this.jButtonid_usuarioPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoUpdate"));



					
		this.jLabelid_monedaPedido = new JLabelMe();
		this.jLabelid_monedaPedido.setText(""+PedidoConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaPedido.setToolTipText("Moneda");
		this.jLabelid_monedaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_monedaPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_monedaPedido= new JComboBoxMe();
		jComboBoxid_monedaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaPedido= new JButtonMe();
		this.jButtonid_monedaPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedido.setText("Buscar");
		this.jButtonid_monedaPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedido"));

		this.jButtonid_monedaPedidoBusqueda= new JButtonMe();
		this.jButtonid_monedaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoBusqueda.setText("U");
		this.jButtonid_monedaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaPedidoBusqueda.setVisible(false);		}

		this.jButtonid_monedaPedidoUpdate= new JButtonMe();
		this.jButtonid_monedaPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoUpdate.setText("U");
		this.jButtonid_monedaPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoUpdate"));



					
		this.jLabelid_empleadoPedido = new JLabelMe();
		this.jLabelid_empleadoPedido.setText(""+PedidoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPedido.setToolTipText("Empleado");
		this.jLabelid_empleadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_empleadoPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_empleadoPedido= new JComboBoxMe();
		jComboBoxid_empleadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPedido= new JButtonMe();
		this.jButtonid_empleadoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedido.setText("Buscar");
		this.jButtonid_empleadoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedido"));

		this.jButtonid_empleadoPedidoBusqueda= new JButtonMe();
		this.jButtonid_empleadoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoBusqueda.setText("U");
		this.jButtonid_empleadoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPedidoUpdate= new JButtonMe();
		this.jButtonid_empleadoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoUpdate.setText("U");
		this.jButtonid_empleadoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoUpdate"));



					
		this.jLabelid_tipo_precioPedido = new JLabelMe();
		this.jLabelid_tipo_precioPedido.setText(""+PedidoConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioPedido.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_tipo_precioPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_tipo_precioPedido= new JComboBoxMe();
		jComboBoxid_tipo_precioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioPedido= new JButtonMe();
		this.jButtonid_tipo_precioPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedido.setText("Buscar");
		this.jButtonid_tipo_precioPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedido"));

		this.jButtonid_tipo_precioPedidoBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPedidoBusqueda.setText("U");
		this.jButtonid_tipo_precioPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioPedidoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioPedidoUpdate= new JButtonMe();
		this.jButtonid_tipo_precioPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPedidoUpdate.setText("U");
		this.jButtonid_tipo_precioPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoUpdate"));



					
		this.jLabelid_formatoPedido = new JLabelMe();
		this.jLabelid_formatoPedido.setText(""+PedidoConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoPedido.setToolTipText("Formato");
		this.jLabelid_formatoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_formatoPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_formatoPedido= new JComboBoxMe();
		jComboBoxid_formatoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoPedido= new JButtonMe();
		this.jButtonid_formatoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedido.setText("Buscar");
		this.jButtonid_formatoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedido"));

		this.jButtonid_formatoPedidoBusqueda= new JButtonMe();
		this.jButtonid_formatoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoBusqueda.setText("U");
		this.jButtonid_formatoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_formatoPedidoUpdate= new JButtonMe();
		this.jButtonid_formatoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoUpdate.setText("U");
		this.jButtonid_formatoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoUpdate"));



					
		this.jLabelid_clientePedido = new JLabelMe();
		this.jLabelid_clientePedido.setText(""+PedidoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePedido.setToolTipText("Cliente");
		this.jLabelid_clientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_clientePedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_clientePedido= new JComboBoxMe();
		jComboBoxid_clientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePedido= new JButtonMe();
		this.jButtonid_clientePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedido.setText("Buscar");
		this.jButtonid_clientePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedido"));

		this.jButtonid_clientePedidoBusqueda= new JButtonMe();
		this.jButtonid_clientePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoBusqueda.setText("U");
		this.jButtonid_clientePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePedidoBusqueda.setVisible(false);		}

		this.jButtonid_clientePedidoUpdate= new JButtonMe();
		this.jButtonid_clientePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoUpdate.setText("U");
		this.jButtonid_clientePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoUpdate"));



					
		this.jLabelid_sub_clientePedido = new JLabelMe();
		this.jLabelid_sub_clientePedido.setText(""+PedidoConstantesFunciones.LABEL_IDSUBCLIENTE+" :");
		this.jLabelid_sub_clientePedido.setToolTipText("Contacto");
		this.jLabelid_sub_clientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clientePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_clientePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_clientePedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDSUBCLIENTE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_sub_clientePedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_sub_clientePedido= new JComboBoxMe();
		jComboBoxid_sub_clientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clientePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_clientePedido= new JButtonMe();
		this.jButtonid_sub_clientePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clientePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clientePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clientePedido.setText("Buscar");
		this.jButtonid_sub_clientePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_clientePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clientePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_clientePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clientePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clientePedido"));

		this.jButtonid_sub_clientePedidoBusqueda= new JButtonMe();
		this.jButtonid_sub_clientePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clientePedidoBusqueda.setText("U");
		this.jButtonid_sub_clientePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_clientePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clientePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_clientePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clientePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clientePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_clientePedidoBusqueda.setVisible(false);		}

		this.jButtonid_sub_clientePedidoUpdate= new JButtonMe();
		this.jButtonid_sub_clientePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clientePedidoUpdate.setText("U");
		this.jButtonid_sub_clientePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_clientePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clientePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_clientePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clientePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clientePedidoUpdate"));



					
		this.jLabelid_vendedorPedido = new JLabelMe();
		this.jLabelid_vendedorPedido.setText(""+PedidoConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorPedido.setToolTipText("Vendedor");
		this.jLabelid_vendedorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_vendedorPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_vendedorPedido= new JComboBoxMe();
		jComboBoxid_vendedorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorPedido= new JButtonMe();
		this.jButtonid_vendedorPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedido.setText("Buscar");
		this.jButtonid_vendedorPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedido"));

		this.jButtonid_vendedorPedidoBusqueda= new JButtonMe();
		this.jButtonid_vendedorPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPedidoBusqueda.setText("U");
		this.jButtonid_vendedorPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorPedidoBusqueda.setVisible(false);		}

		this.jButtonid_vendedorPedidoUpdate= new JButtonMe();
		this.jButtonid_vendedorPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPedidoUpdate.setText("U");
		this.jButtonid_vendedorPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoUpdate"));


		jButtonid_vendedorPedidoArbol= new JButtonMe();
		jButtonid_vendedorPedidoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoArbol.setText("Arbol");
		jButtonid_vendedorPedidoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorPedidoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoArbol"));



					
		this.jLabelid_consultorPedido = new JLabelMe();
		this.jLabelid_consultorPedido.setText(""+PedidoConstantesFunciones.LABEL_IDCONSULTOR+" :");
		this.jLabelid_consultorPedido.setToolTipText("Consultor");
		this.jLabelid_consultorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consultorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consultorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consultorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consultorPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consultorPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDCONSULTOR);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_consultorPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_consultorPedido= new JComboBoxMe();
		jComboBoxid_consultorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consultorPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_consultorPedido= new JButtonMe();
		this.jButtonid_consultorPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorPedido.setText("Buscar");
		this.jButtonid_consultorPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consultorPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consultorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorPedido"));

		this.jButtonid_consultorPedidoBusqueda= new JButtonMe();
		this.jButtonid_consultorPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consultorPedidoBusqueda.setText("U");
		this.jButtonid_consultorPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consultorPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consultorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consultorPedidoBusqueda.setVisible(false);		}

		this.jButtonid_consultorPedidoUpdate= new JButtonMe();
		this.jButtonid_consultorPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consultorPedidoUpdate.setText("U");
		this.jButtonid_consultorPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consultorPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consultorPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorPedidoUpdate"));



					
		this.jLabelid_responsablePedido = new JLabelMe();
		this.jLabelid_responsablePedido.setText(""+PedidoConstantesFunciones.LABEL_IDRESPONSABLE+" :");
		this.jLabelid_responsablePedido.setToolTipText("Responsable");
		this.jLabelid_responsablePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsablePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsablePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsablePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsablePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsablePedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDRESPONSABLE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_responsablePedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_responsablePedido= new JComboBoxMe();
		jComboBoxid_responsablePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsablePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsablePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsablePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_responsablePedido= new JButtonMe();
		this.jButtonid_responsablePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsablePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsablePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsablePedido.setText("Buscar");
		this.jButtonid_responsablePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsablePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsablePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsablePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsablePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsablePedido"));

		this.jButtonid_responsablePedidoBusqueda= new JButtonMe();
		this.jButtonid_responsablePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsablePedidoBusqueda.setText("U");
		this.jButtonid_responsablePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsablePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsablePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsablePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsablePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsablePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsablePedidoBusqueda.setVisible(false);		}

		this.jButtonid_responsablePedidoUpdate= new JButtonMe();
		this.jButtonid_responsablePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsablePedidoUpdate.setText("U");
		this.jButtonid_responsablePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsablePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsablePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsablePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsablePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsablePedidoUpdate"));



					
		this.jLabelid_estado_pedidoPedido = new JLabelMe();
		this.jLabelid_estado_pedidoPedido.setText(""+PedidoConstantesFunciones.LABEL_IDESTADOPEDIDO+" : *");
		this.jLabelid_estado_pedidoPedido.setToolTipText("Estado");
		this.jLabelid_estado_pedidoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedidoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedidoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDESTADOPEDIDO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_estado_pedidoPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_estado_pedidoPedido= new JComboBoxMe();
		jComboBoxid_estado_pedidoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedidoPedido= new JButtonMe();
		this.jButtonid_estado_pedidoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedido.setText("Buscar");
		this.jButtonid_estado_pedidoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedidoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedidoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedido"));

		this.jButtonid_estado_pedidoPedidoBusqueda= new JButtonMe();
		this.jButtonid_estado_pedidoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoPedidoBusqueda.setText("U");
		this.jButtonid_estado_pedidoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedidoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedidoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedidoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedidoPedidoUpdate= new JButtonMe();
		this.jButtonid_estado_pedidoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoPedidoUpdate.setText("U");
		this.jButtonid_estado_pedidoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedidoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedidoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidoUpdate"));



					
		this.jLabelid_transportePedido = new JLabelMe();
		this.jLabelid_transportePedido.setText(""+PedidoConstantesFunciones.LABEL_IDTRANSPORTE+" :");
		this.jLabelid_transportePedido.setToolTipText("Forma Envio");
		this.jLabelid_transportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportePedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_transportePedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_transportePedido= new JComboBoxMe();
		jComboBoxid_transportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportePedido= new JButtonMe();
		this.jButtonid_transportePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePedido.setText("Buscar");
		this.jButtonid_transportePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePedido"));

		this.jButtonid_transportePedidoBusqueda= new JButtonMe();
		this.jButtonid_transportePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportePedidoBusqueda.setText("U");
		this.jButtonid_transportePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportePedidoBusqueda.setVisible(false);		}

		this.jButtonid_transportePedidoUpdate= new JButtonMe();
		this.jButtonid_transportePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportePedidoUpdate.setText("U");
		this.jButtonid_transportePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePedidoUpdate"));



					
		this.jLabelid_ruta_transportePedido = new JLabelMe();
		this.jLabelid_ruta_transportePedido.setText(""+PedidoConstantesFunciones.LABEL_IDRUTATRANSPORTE+" :");
		this.jLabelid_ruta_transportePedido.setToolTipText("Ruta");
		this.jLabelid_ruta_transportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ruta_transportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ruta_transportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ruta_transportePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ruta_transportePedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ruta_transportePedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDRUTATRANSPORTE);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_ruta_transportePedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_ruta_transportePedido= new JComboBoxMe();
		jComboBoxid_ruta_transportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ruta_transportePedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ruta_transportePedido= new JButtonMe();
		this.jButtonid_ruta_transportePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transportePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transportePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transportePedido.setText("Buscar");
		this.jButtonid_ruta_transportePedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ruta_transportePedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transportePedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ruta_transportePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transportePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transportePedido"));

		this.jButtonid_ruta_transportePedidoBusqueda= new JButtonMe();
		this.jButtonid_ruta_transportePedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transportePedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transportePedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ruta_transportePedidoBusqueda.setText("U");
		this.jButtonid_ruta_transportePedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ruta_transportePedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transportePedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ruta_transportePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transportePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transportePedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ruta_transportePedidoBusqueda.setVisible(false);		}

		this.jButtonid_ruta_transportePedidoUpdate= new JButtonMe();
		this.jButtonid_ruta_transportePedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transportePedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transportePedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ruta_transportePedidoUpdate.setText("U");
		this.jButtonid_ruta_transportePedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ruta_transportePedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transportePedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ruta_transportePedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transportePedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transportePedidoUpdate"));



					
		this.jLabelid_tipo_llamadaPedido = new JLabelMe();
		this.jLabelid_tipo_llamadaPedido.setText(""+PedidoConstantesFunciones.LABEL_IDTIPOLLAMADA+" :");
		this.jLabelid_tipo_llamadaPedido.setToolTipText("Llamada");
		this.jLabelid_tipo_llamadaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_llamadaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_llamadaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_llamadaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_llamadaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_llamadaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDTIPOLLAMADA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_tipo_llamadaPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_tipo_llamadaPedido= new JComboBoxMe();
		jComboBoxid_tipo_llamadaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_llamadaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_llamadaPedido= new JButtonMe();
		this.jButtonid_tipo_llamadaPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaPedido.setText("Buscar");
		this.jButtonid_tipo_llamadaPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_llamadaPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_llamadaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaPedido"));

		this.jButtonid_tipo_llamadaPedidoBusqueda= new JButtonMe();
		this.jButtonid_tipo_llamadaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_llamadaPedidoBusqueda.setText("U");
		this.jButtonid_tipo_llamadaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_llamadaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_llamadaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_llamadaPedidoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_llamadaPedidoUpdate= new JButtonMe();
		this.jButtonid_tipo_llamadaPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_llamadaPedidoUpdate.setText("U");
		this.jButtonid_tipo_llamadaPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_llamadaPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_llamadaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaPedidoUpdate"));



					
		this.jLabelid_transportistaPedido = new JLabelMe();
		this.jLabelid_transportistaPedido.setText(""+PedidoConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaPedido.setToolTipText("Transportista");
		this.jLabelid_transportistaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_transportistaPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_transportistaPedido= new JComboBoxMe();
		jComboBoxid_transportistaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaPedido= new JButtonMe();
		this.jButtonid_transportistaPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaPedido.setText("Buscar");
		this.jButtonid_transportistaPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaPedido"));

		this.jButtonid_transportistaPedidoBusqueda= new JButtonMe();
		this.jButtonid_transportistaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaPedidoBusqueda.setText("U");
		this.jButtonid_transportistaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaPedidoBusqueda.setVisible(false);		}

		this.jButtonid_transportistaPedidoUpdate= new JButtonMe();
		this.jButtonid_transportistaPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaPedidoUpdate.setText("U");
		this.jButtonid_transportistaPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaPedidoUpdate"));



					
		this.jLabelid_tipo_cambioPedido = new JLabelMe();
		this.jLabelid_tipo_cambioPedido.setText(""+PedidoConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioPedido.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_tipo_cambioPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_tipo_cambioPedido= new JComboBoxMe();
		jComboBoxid_tipo_cambioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioPedido.setEnabled(false);

		this.jButtonid_tipo_cambioPedido= new JButtonMe();
		this.jButtonid_tipo_cambioPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedido.setText("Buscar");
		this.jButtonid_tipo_cambioPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedido"));

		this.jButtonid_tipo_cambioPedidoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoBusqueda.setText("U");
		this.jButtonid_tipo_cambioPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioPedidoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioPedidoUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoUpdate.setText("U");
		this.jButtonid_tipo_cambioPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoUpdate"));



					
		this.jLabelid_centro_costoPedido = new JLabelMe();
		this.jLabelid_centro_costoPedido.setText(""+PedidoConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoPedido.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_centro_costoPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_centro_costoPedido= new JComboBoxMe();
		jComboBoxid_centro_costoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoPedido.setEnabled(false);

		this.jButtonid_centro_costoPedido= new JButtonMe();
		this.jButtonid_centro_costoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPedido.setText("Buscar");
		this.jButtonid_centro_costoPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedido"));

		this.jButtonid_centro_costoPedidoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPedidoBusqueda.setText("U");
		this.jButtonid_centro_costoPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoPedidoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoPedidoUpdate= new JButtonMe();
		this.jButtonid_centro_costoPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPedidoUpdate.setText("U");
		this.jButtonid_centro_costoPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoUpdate"));


		jButtonid_centro_costoPedidoArbol= new JButtonMe();
		jButtonid_centro_costoPedidoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPedidoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPedidoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPedidoArbol.setText("Arbol");
		jButtonid_centro_costoPedidoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoPedidoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoArbol"));



					
		this.jLabelid_zonaPedido = new JLabelMe();
		this.jLabelid_zonaPedido.setText(""+PedidoConstantesFunciones.LABEL_IDZONA+" :");
		this.jLabelid_zonaPedido.setToolTipText("Zona");
		this.jLabelid_zonaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaPedido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaPedido.setToolTipText(PedidoConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutPedido = new GridBagLayout();
		this.jPanelid_zonaPedido.setLayout(this.gridaBagLayoutPedido);


		jComboBoxid_zonaPedido= new JComboBoxMe();
		jComboBoxid_zonaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_zonaPedido.setEnabled(false);

		this.jButtonid_zonaPedido= new JButtonMe();
		this.jButtonid_zonaPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaPedido.setText("Buscar");
		this.jButtonid_zonaPedido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaPedido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPedido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPedido"));

		this.jButtonid_zonaPedidoBusqueda= new JButtonMe();
		this.jButtonid_zonaPedidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPedidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPedidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaPedidoBusqueda.setText("U");
		this.jButtonid_zonaPedidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaPedidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPedidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPedidoBusqueda"));

		if(this.pedidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaPedidoBusqueda.setVisible(false);		}

		this.jButtonid_zonaPedidoUpdate= new JButtonMe();
		this.jButtonid_zonaPedidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPedidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaPedidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaPedidoUpdate.setText("U");
		this.jButtonid_zonaPedidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaPedidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaPedidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaPedidoUpdate"));



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
		//this.jInternalFrameDetallePedido = new PedidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedido= new GridBagLayout();
		

		
		String sToolTipPedido="";
		sToolTipPedido=PedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedido+="(Facturacion.Pedido)";
		}
		
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedido = new JButtonMe();
		this.jButtonModificarPedido = new JButtonMe();
        this.jButtonActualizarPedido = new JButtonMe();
        this.jButtonEliminarPedido = new JButtonMe();
        this.jButtonCancelarPedido = new JButtonMe();
        this.jButtonGuardarCambiosPedido = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedido = new JButtonMe();
		this.jButtonCerrarPedido = new JButtonMe();
		
		this.jScrollPanelDatosPedido = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedido = new JScrollPane();
		this.jScrollPanelDatosGeneralPedido = new JScrollPane();
				
		
		
		this.jPanelCamposPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioresumenPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido";
		
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposPedido.setName("jPanelCamposPedido"); 

		this.jPanelCamposOcultosPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedido.setName("jPanelCamposOcultosPedido"); 

        this.jPanelAccionesPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedido.setToolTipText("Acciones");
        this.jPanelAccionesPedido.setName("Acciones"); 

		this.jPanelAccionesFormularioPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalPedido.setName("jPanelCamposFintotalPedido");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralPedido.setName("jPanelCamposFingeneralPedido");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposInicioresumenPedido.setName("jPanelCamposFinresumenPedido");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioresumenPedido, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedido.setText("Nuevo");
		this.jButtonModificarPedido.setText("Editar");
        this.jButtonActualizarPedido.setText("Actualizar");
        this.jButtonEliminarPedido.setText("Eliminar");
        this.jButtonCancelarPedido.setText("Cancelar");
        this.jButtonGuardarCambiosPedido.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedido.setText("Guardar");
		this.jButtonCerrarPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedido,"nuevo_button","Nuevo",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedido,"modificar_button","Editar",this.pedidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedido,"actualizar_button","Actualizar",this.pedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedido,"eliminar_button","Eliminar",this.pedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedido,"cancelar_button","Cancelar",this.pedidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedido,"guardarcambios_button","Guardar",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedido,"guardarcambiostabla_button","Guardar",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedido,"cerrar_button","Salir",this.pedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedido.setToolTipText("Nuevo"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedido.setToolTipText("Editar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedido.setToolTipText("Actualizar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedido.setToolTipText("Eliminar)"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedido.setToolTipText("Cancelar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedido.setToolTipText("Guardar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedido.setToolTipText("Guardar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedido.setToolTipText("Salir"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedido";
		inputMap = this.jButtonNuevoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedido";
		inputMap = this.jButtonActualizarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedido"));
		
		//ELIMINAR
		sMapKey = "EliminarPedido";
		inputMap = this.jButtonEliminarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedido"));
		
		//CANCELAR	
		sMapKey = "CancelarPedido";
		inputMap = this.jButtonCancelarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedido"));
		
		//CERRAR		
		sMapKey = "CerrarPedido";
		inputMap = this.jButtonCerrarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedido";
		inputMap = this.jButtonGuardarCambiosTablaPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedido.setToolTipText("Nuevo Pedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedido.setToolTipText("Sin Cerrar Ventana Pedido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedido.setText("Accion");
		this.jComboBoxTiposAccionesPedido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedido = new JLabelMe();
		
		this.jLabelAccionesPedido.setText("Acciones");		
		this.jLabelAccionesPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedido=new JTabbedPane();
		this.jTabbedPaneRelacionesPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedido = new GridBagLayout();
		
		this.jPanelCamposPedido.setLayout(gridaBagLayoutCamposPedido);
		this.jPanelCamposOcultosPedido.setLayout(gridaBagLayoutCamposOcultosPedido);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalPedido= new GridBagLayout();
		this.jPanelCamposFintotalPedido.setLayout(gridaBagLayoutCamposFintotalPedido);

		GridBagLayout gridaBagLayoutCamposIniciogeneralPedido= new GridBagLayout();
		this.jPanelCamposIniciogeneralPedido.setLayout(gridaBagLayoutCamposIniciogeneralPedido);

		GridBagLayout gridaBagLayoutCamposInicioresumenPedido= new GridBagLayout();
		this.jPanelCamposInicioresumenPedido.setLayout(gridaBagLayoutCamposInicioresumenPedido);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedido.add(jLabelIdPedido, this.gridBagConstraintsPedido);



	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedido.add(jLabelidPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedido.add(jLabelid_empresaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedido.add(jButtonid_empresaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedido.add(jButtonid_empresaPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedido.add(jComboBoxid_empresaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedido.add(jLabelid_sucursalPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedido.add(jButtonid_sucursalPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedido.add(jButtonid_sucursalPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedido.add(jComboBoxid_sucursalPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPedido.add(jLabelid_ejercicioPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedido.add(jButtonid_ejercicioPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedido.add(jButtonid_ejercicioPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPedido.add(jComboBoxid_ejercicioPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPedido.add(jLabelid_periodoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedido.add(jButtonid_periodoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedido.add(jButtonid_periodoPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPedido.add(jComboBoxid_periodoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPedido.add(jLabelid_anioPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedido.add(jButtonid_anioPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedido.add(jButtonid_anioPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPedido.add(jComboBoxid_anioPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPedido.add(jLabelid_mesPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedido.add(jButtonid_mesPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedido.add(jButtonid_mesPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPedido.add(jComboBoxid_mesPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPedido.add(jLabelid_usuarioPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedido.add(jButtonid_usuarioPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedido.add(jButtonid_usuarioPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPedido.add(jComboBoxid_usuarioPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroPedido.add(jLabelnumeroPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroPedido.add(jButtonnumeroPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroPedido.add(jTextFieldnumeroPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpre_impresoPedido.add(jLabelpre_impresoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelpre_impresoPedido.add(jButtonpre_impresoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpre_impresoPedido.add(jTextFieldpre_impresoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPedido.add(jLabelfecha_emisionPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPedido.add(jButtonfecha_emisionPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPedido.add(jDateChooserfecha_emisionPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaPedido.add(jLabelfecha_entregaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaPedido.add(jButtonfecha_entregaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaPedido.add(jDateChooserfecha_entregaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaPedido.add(jLabelid_monedaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedido.add(jButtonid_monedaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedido.add(jButtonid_monedaPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaPedido.add(jComboBoxid_monedaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcotizacionPedido.add(jLabelcotizacionPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionPedido.add(jButtoncotizacionPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcotizacionPedido.add(jTextFieldcotizacionPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPedido.add(jLabelid_empleadoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 2;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPedido.add(jButtonid_empleadoPedido, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedido.add(jButtonid_empleadoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 4;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedido.add(jButtonid_empleadoPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPedido.add(jComboBoxid_empleadoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioPedido.add(jLabelid_tipo_precioPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPedido.add(jButtonid_tipo_precioPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPedido.add(jButtonid_tipo_precioPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioPedido.add(jComboBoxid_tipo_precioPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoPedido.add(jLabelid_formatoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedido.add(jButtonid_formatoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedido.add(jButtonid_formatoPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoPedido.add(jComboBoxid_formatoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionPedido.add(jLabeldireccionPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionPedido.add(jButtondireccionPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionPedido.add(jscrollPanedireccionPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePedido.add(jLabelid_clientePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 2;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePedido.add(jButtonid_clientePedido, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedido.add(jButtonid_clientePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 4;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedido.add(jButtonid_clientePedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePedido.add(jComboBoxid_clientePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoPedido.add(jLabeltelefonoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoPedido.add(jButtontelefonoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoPedido.add(jTextFieldtelefonoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucPedido.add(jLabelrucPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucPedido.add(jButtonrucPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucPedido.add(jTextFieldrucPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_clientePedido.add(jLabelid_sub_clientePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clientePedido.add(jButtonid_sub_clientePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clientePedido.add(jButtonid_sub_clientePedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_clientePedido.add(jComboBoxid_sub_clientePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorPedido.add(jLabelid_vendedorPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 2;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorPedido.add(jButtonid_vendedorPedido, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 3;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorPedido.add(jButtonid_vendedorPedidoArbol, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 4;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPedido.add(jButtonid_vendedorPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 5;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPedido.add(jButtonid_vendedorPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorPedido.add(jComboBoxid_vendedorPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_consultorPedido.add(jLabelid_consultorPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consultorPedido.add(jButtonid_consultorPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consultorPedido.add(jButtonid_consultorPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_consultorPedido.add(jComboBoxid_consultorPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPedido.add(jLabelordenPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPedido.add(jButtonordenPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPedido.add(jTextFieldordenPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_responsablePedido.add(jLabelid_responsablePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsablePedido.add(jButtonid_responsablePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsablePedido.add(jButtonid_responsablePedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_responsablePedido.add(jComboBoxid_responsablePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedidoPedido.add(jLabelid_estado_pedidoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoPedido.add(jButtonid_estado_pedidoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoPedido.add(jButtonid_estado_pedidoPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedidoPedido.add(jComboBoxid_estado_pedidoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportePedido.add(jLabelid_transportePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportePedido.add(jButtonid_transportePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportePedido.add(jButtonid_transportePedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportePedido.add(jComboBoxid_transportePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ruta_transportePedido.add(jLabelid_ruta_transportePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ruta_transportePedido.add(jButtonid_ruta_transportePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ruta_transportePedido.add(jButtonid_ruta_transportePedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ruta_transportePedido.add(jComboBoxid_ruta_transportePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_rutaPedido.add(jLabelvalor_rutaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_rutaPedido.add(jButtonvalor_rutaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_rutaPedido.add(jTextFieldvalor_rutaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_llamadaPedido.add(jLabelid_tipo_llamadaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_llamadaPedido.add(jButtonid_tipo_llamadaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_llamadaPedido.add(jButtonid_tipo_llamadaPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_llamadaPedido.add(jComboBoxid_tipo_llamadaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaPedido.add(jLabelid_transportistaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaPedido.add(jButtonid_transportistaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaPedido.add(jButtonid_transportistaPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaPedido.add(jComboBoxid_transportistaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioPedido.add(jLabelhora_inicioPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioPedido.add(jButtonhora_inicioPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioPedido.add(jSpinnerhora_inicioPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finPedido.add(jLabelhora_finPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finPedido.add(jButtonhora_finPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finPedido.add(jSpinnerhora_finPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPedido.add(jLabeldescripcionPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPedido.add(jButtondescripcionPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPedido.add(jscrollPanedescripcionPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcupoPedido.add(jLabelcupoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcupoPedido.add(jButtoncupoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcupoPedido.add(jTextFieldcupoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoPedido.add(jLabelsaldoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoPedido.add(jButtonsaldoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoPedido.add(jTextFieldsaldoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpedidosPedido.add(jLabelpedidosPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelpedidosPedido.add(jButtonpedidosPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpedidosPedido.add(jTextFieldpedidosPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldocumentosPedido.add(jLabeldocumentosPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldocumentosPedido.add(jButtondocumentosPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldocumentosPedido.add(jTextFielddocumentosPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponiblePedido.add(jLabeldisponiblePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponiblePedido.add(jButtondisponiblePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponiblePedido.add(jTextFielddisponiblePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_porcentajePedido.add(jLabeldescuento_porcentajePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajePedido.add(jButtondescuento_porcentajePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_porcentajePedido.add(jTextFielddescuento_porcentajePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_con_ivaPedido.add(jLabeltotal_con_ivaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_con_ivaPedido.add(jButtontotal_con_ivaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_con_ivaPedido.add(jTextFieldtotal_con_ivaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsumanPedido.add(jLabelsumanPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanPedido.add(jButtonsumanPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsumanPedido.add(jTextFieldsumanPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorPedido.add(jLabeldescuento_valorPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorPedido.add(jButtondescuento_valorPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorPedido.add(jTextFielddescuento_valorPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaPedido.add(jLabeltotal_sin_ivaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaPedido.add(jButtontotal_sin_ivaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaPedido.add(jTextFieldtotal_sin_ivaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_totalPedido.add(jLabeldescuento_totalPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_totalPedido.add(jButtondescuento_totalPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_totalPedido.add(jTextFielddescuento_totalPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfletePedido.add(jLabelfletePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelfletePedido.add(jButtonfletePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfletePedido.add(jTextFieldfletePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalPedido.add(jLabeltotalPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPedido.add(jButtontotalPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalPedido.add(jTextFieldtotalPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalPedido.add(jLabelsubtotalPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalPedido.add(jButtonsubtotalPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalPedido.add(jTextFieldsubtotalPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroPedido.add(jLabelotroPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroPedido.add(jButtonotroPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroPedido.add(jTextFieldotroPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelultimo_costoPedido.add(jLabelultimo_costoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoPedido.add(jButtonultimo_costoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelultimo_costoPedido.add(jTextFieldultimo_costoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaPedido.add(jLabelivaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaPedido.add(jButtonivaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaPedido.add(jTextFieldivaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoPedido.add(jLabelfinanciamientoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoPedido.add(jButtonfinanciamientoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoPedido.add(jTextFieldfinanciamientoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmargen_utilidadPedido.add(jLabelmargen_utilidadPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelmargen_utilidadPedido.add(jButtonmargen_utilidadPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmargen_utilidadPedido.add(jTextFieldmargen_utilidadPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotros_valoresPedido.add(jLabelotros_valoresPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_valoresPedido.add(jButtonotros_valoresPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotros_valoresPedido.add(jTextFieldotros_valoresPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanticipoPedido.add(jLabelanticipoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelanticipoPedido.add(jButtonanticipoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanticipoPedido.add(jTextFieldanticipoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioPedido.add(jLabelid_tipo_cambioPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 2;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioPedido.add(jButtonid_tipo_cambioPedido, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedido.add(jButtonid_tipo_cambioPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 4;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedido.add(jButtonid_tipo_cambioPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioPedido.add(jComboBoxid_tipo_cambioPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoPedido.add(jLabelid_centro_costoPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 2;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoPedido.add(jButtonid_centro_costoPedido, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedido = new GridBagConstraints();
	//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 3;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoPedido.add(jButtonid_centro_costoPedidoArbol, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 4;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPedido.add(jButtonid_centro_costoPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 5;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPedido.add(jButtonid_centro_costoPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoPedido.add(jComboBoxid_centro_costoPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaPedido.add(jLabelid_zonaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaPedido.add(jButtonid_zonaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 3;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaPedido.add(jButtonid_zonaPedidoUpdate, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaPedido.add(jComboBoxid_zonaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPedido.add(jLabelfechaPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPedido.add(jButtonfechaPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPedido.add(jDateChooserfechaPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_fuePedido.add(jLabelnumero_fuePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_fuePedido.add(jButtonnumero_fuePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_fuePedido.add(jTextFieldnumero_fuePedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_servidorPedido.add(jLabelfecha_servidorPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_servidorPedido.add(jButtonfecha_servidorPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_servidorPedido.add(jDateChooserfecha_servidorPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_retencionPedido.add(jLabelmonto_retencionPedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_retencionPedido.add(jButtonmonto_retencionPedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_retencionPedido.add(jTextFieldmonto_retencionPedido, this.gridBagConstraintsPedido);


	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 0;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelicePedido.add(jLabelicePedido, this.gridBagConstraintsPedido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 2;
		this.gridBagConstraintsPedido.ipadx = 0;
		this.gridBagConstraintsPedido.insets = new Insets(0, 0, 0, 0);
		this.jPanelicePedido.add(jButtonicePedidoBusqueda, this.gridBagConstraintsPedido);
	}

	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedido.gridy = 0;
	this.gridBagConstraintsPedido.gridx = 1;
	this.gridBagConstraintsPedido.ipadx = 0;
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelicePedido.add(jTextFieldicePedido, this.gridBagConstraintsPedido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_empresaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_sucursalPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_ejercicioPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_periodoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_anioPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_mesPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_usuarioPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_tipo_cambioPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_centro_costoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelid_zonaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelfechaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelnumero_fuePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelfecha_servidorPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 4==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelmonto_retencionPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 3==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposOcultosPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposOcultosPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedido.add(this.jPanelicePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposOcultosPedido % 3==0) {
		iXPanelCamposOcultosPedido=0;
		iYPanelCamposOcultosPedido++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelidPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelnumeroPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelpre_impresoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelfecha_emisionPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelfecha_entregaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_monedaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelcotizacionPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_empleadoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_tipo_precioPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_formatoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPaneldireccionPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_clientePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPaneltelefonoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelrucPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_sub_clientePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_vendedorPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_consultorPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelordenPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_responsablePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_estado_pedidoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_transportePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_ruta_transportePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelvalor_rutaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_tipo_llamadaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelid_transportistaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelhora_inicioPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPanelhora_finPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposIniciogeneralPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposIniciogeneralPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPedido.add(this.jPaneldescripcionPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposIniciogeneralPedido % 4==0) {
		iXPanelCamposIniciogeneralPedido=0;
		iYPanelCamposIniciogeneralPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposInicioresumenPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposInicioresumenPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioresumenPedido.add(this.jPanelcupoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposInicioresumenPedido % 5==0) {
		iXPanelCamposInicioresumenPedido=0;
		iYPanelCamposInicioresumenPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposInicioresumenPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposInicioresumenPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioresumenPedido.add(this.jPanelsaldoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposInicioresumenPedido % 5==0) {
		iXPanelCamposInicioresumenPedido=0;
		iYPanelCamposInicioresumenPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposInicioresumenPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposInicioresumenPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioresumenPedido.add(this.jPanelpedidosPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposInicioresumenPedido % 5==0) {
		iXPanelCamposInicioresumenPedido=0;
		iYPanelCamposInicioresumenPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposInicioresumenPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposInicioresumenPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioresumenPedido.add(this.jPaneldocumentosPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposInicioresumenPedido % 5==0) {
		iXPanelCamposInicioresumenPedido=0;
		iYPanelCamposInicioresumenPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposInicioresumenPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposInicioresumenPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioresumenPedido.add(this.jPaneldisponiblePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposInicioresumenPedido % 5==0) {
		iXPanelCamposInicioresumenPedido=0;
		iYPanelCamposInicioresumenPedido++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPaneldescuento_porcentajePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPaneltotal_con_ivaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelsumanPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPaneldescuento_valorPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPaneltotal_sin_ivaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPaneldescuento_totalPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelfletePedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPaneltotalPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelsubtotalPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelotroPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelultimo_costoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelivaPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelfinanciamientoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelmargen_utilidadPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelotros_valoresPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
	}
	this.gridBagConstraintsPedido = new GridBagConstraints();
	this.gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedido.gridy = iYPanelCamposFintotalPedido;
	this.gridBagConstraintsPedido.gridx = iXPanelCamposFintotalPedido++;
	this.gridBagConstraintsPedido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedido.add(this.jPanelanticipoPedido, this.gridBagConstraintsPedido);



	if(iXPanelCamposFintotalPedido % 3==0) {
		iXPanelCamposFintotalPedido=0;
		iYPanelCamposFintotalPedido++;
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
			
		GridBagLayout gridaBagLayoutAccionesPedido= new GridBagLayout();
		this.jPanelAccionesPedido.setLayout(gridaBagLayoutAccionesPedido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedido= new GridBagLayout();
		this.jPanelAccionesFormularioPedido.setLayout(gridaBagLayoutAccionesFormularioPedido);
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedido.add(this.jComboBoxTiposAccionesFormularioPedido, this.gridBagConstraintsPedido);

		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedido.add(this.jCheckBoxPostAccionNuevoPedido, this.gridBagConstraintsPedido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedido.add(this.jCheckBoxPostAccionSinCerrarPedido, this.gridBagConstraintsPedido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedido.add(this.jCheckBoxPostAccionSinMensajePedido, this.gridBagConstraintsPedido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedido.add(this.jButtonModificarPedido, this.gridBagConstraintsPedido);							

		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedido.add(this.jButtonEliminarPedido, this.gridBagConstraintsPedido);
		
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = 0;		
		this.gridBagConstraintsPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedido.add(this.jButtonActualizarPedido, this.gridBagConstraintsPedido);


		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = 0;		
		this.gridBagConstraintsPedido.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedido.add(this.jButtonGuardarCambiosPedido, this.gridBagConstraintsPedido);	
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = 0;		
		this.gridBagConstraintsPedido.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedido.add(this.jButtonCancelarPedido, this.gridBagConstraintsPedido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedido = new GridBagConstraints();						
			this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedido.gridx = 0;		
			//this.gridBagConstraintsPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedido.gridx =0;
		this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedido, this.gridBagConstraintsPedido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedido = new PedidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoModel pedidoModel=new PedidoModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoModel.PedidoFocusTraversalPolicy pedidoFocusTraversalPolicy = pedidoModel.new PedidoFocusTraversalPolicy(this);
			
			//pedidoFocusTraversalPolicy.setpedidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidoModel);
			
			
			this.jContentPaneDetallePedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedido = new GridBagLayout();	
			this.jContentPaneDetallePedido.setLayout(gridaBagLayoutDetallePedido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionPedido=   new JScrollPane(jContentPaneDetallePedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedido.gridx = 0;
	        
			this.jContentPaneDetallePedido.add(jPanelCamposPedido, gridBagConstraintsPedido);
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPedido.gridx = 0;

		this.jContentPaneDetallePedido.add(jPanelCamposIniciogeneralPedido, gridBagConstraintsPedido);


		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPedido.gridx = 0;

		this.jContentPaneDetallePedido.add(jPanelCamposInicioresumenPedido, gridBagConstraintsPedido);
			
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
						&& pedidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePedido(this.puedeCargarPorParteDetallePedido,false,-1);
					
					if(this.pedidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedido= new GridBagConstraints();
						this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedido.gridx = 0;
						this.jContentPaneDetallePedido.add(this.jTabbedPaneRelacionesPedido, this.gridBagConstraintsPedido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedido.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePedido(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPedido.gridx = 0;

		this.jContentPaneDetallePedido.add(jPanelCamposFintotalPedido, gridBagConstraintsPedido);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedido = new GridBagConstraints();
					this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedido.gridx = 0;
					
				
					this.jContentPaneDetallePedido.add(jPanelCamposOcultosPedido, gridBagConstraintsPedido);
				
					this.jPanelCamposOcultosPedido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPedido.gridx = 0;
	        this.gridBagConstraintsPedido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedido.add(this.jPanelAccionesFormularioPedido, this.gridBagConstraintsPedido);							
			
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsPedido.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPedido.gridx = 0;
	        
			
			this.jContentPaneDetallePedido.add(this.jPanelAccionesPedido, this.gridBagConstraintsPedido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedido=   new JScrollPane(this.jPanelCamposPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedido.gridx = 0;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedido, this.gridBagConstraintsPedido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedido, this.gridBagConstraintsPedido);			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedido, this.gridBagConstraintsPedido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedido, this.gridBagConstraintsPedido);
			
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedido, this.gridBagConstraintsPedido);
		
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedido, this.gridBagConstraintsPedido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedido;//jContentPane;
		
		return jScrollPanelDatosEdicionPedido;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePedido(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidoSessionBean=new DetallePedidoSessionBean();
		this.detallepedidoSessionBean.setConGuardarRelaciones(false);
		this.detallepedidoSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidoBeanSwingJInternalFrame=null;//new DetallePedidoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidoBeanSwingJInternalFramePopup=new DetallePedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidoSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidoSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidoBeanSwingJInternalFrame=new DetallePedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidoBeanSwingJInternalFrame.setdetallepedidoSessionBean(this.detallepedidoSessionBean);

				//this.gridBagConstraintsPedido = new GridBagConstraints();
				//this.gridBagConstraintsPedido.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedido.gridx = 0;
				//this.jContentPaneDetallePedido.add(this.detallepedidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedido);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedido.add("Detalle Pedidos",this.detallepedidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedido.setComponentAt(iIndexTab,this.detallepedidoBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidoSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidoBeanSwingJInternalFrame=null;//new DetallePedidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedido) {
					this.jTabbedPaneRelacionesPedido.add("Detalle Pedidos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetallePedidoBeanSwingJInternalFrame(List<Pedido> pedidos,Pedido pedido,DetallePedidoBeanSwingJInternalFrame detallepedidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidoBeanSwingJInternalFrame=new DetallePedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidoBeanSwingJInternalFrame.getDetallePedidoLogic().setConnexion(this.pedidoLogic.getConnexion());

					detallepedidoBeanSwingJInternalFrame.setpedidosForeignKey(pedidos);
					detallepedidoBeanSwingJInternalFrame.setpedidoForeignKey(pedido);
					detallepedidoBeanSwingJInternalFrame.detallepedidoSessionBean.setisBusquedaDesdeForeignKeySesionPedido(true);
					detallepedidoBeanSwingJInternalFrame.detallepedidoSessionBean.setlidPedidoActual(pedido.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidoBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedido(detallepedidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedido(true);
					detallepedidoBeanSwingJInternalFrame.setid_pedidoFK_IdPedido(pedido.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidoBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoForeignKey(pedido,1,false,true,true);
					detallepedidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedido");
					detallepedidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedido");
					detallepedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedido(true);
					detallepedidoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedido("n",detallepedidoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidoBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidoBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedido("relacionado");
					} else {
						detallepedidoBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedido("no_relacionado");
					}

					detallepedidoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedido().setVisible(false);

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
