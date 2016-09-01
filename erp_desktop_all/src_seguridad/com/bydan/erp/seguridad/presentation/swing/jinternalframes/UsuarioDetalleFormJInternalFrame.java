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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.UsuarioConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class UsuarioDetalleFormJInternalFrame extends UsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUsuario;
	
	protected JMenuBar jmenuBarDetalleUsuario;
	
	protected JMenu jmenuDetalleUsuario;
	protected JMenu jmenuDetalleArchivoUsuario;
	protected JMenu jmenuDetalleAccionesUsuario;
	protected JMenu jmenuDetalleDatosUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUsuario;	
	protected GridBagConstraints gridBagConstraintsUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public UsuarioSessionBean usuarioSessionBean;
	
	

	public DepositoBancoBeanSwingJInternalFrame depositobancoBeanSwingJInternalFrame=null;
	public DepositoBancoBeanSwingJInternalFrame depositobancoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDepositoBanco=false;
	public DepositoBancoSessionBean depositobancoSessionBean;

	public HistorialCambioClaveBeanSwingJInternalFrame historialcambioclaveBeanSwingJInternalFrame=null;
	public HistorialCambioClaveBeanSwingJInternalFrame historialcambioclaveBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHistorialCambioClave=false;
	public HistorialCambioClaveSessionBean historialcambioclaveSessionBean;

	public AutoriRetencionBeanSwingJInternalFrame autoriretencionBeanSwingJInternalFrame=null;
	public AutoriRetencionBeanSwingJInternalFrame autoriretencionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriRetencion=false;
	public AutoriRetencionSessionBean autoriretencionSessionBean;

	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;
	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajeroTurno=false;
	public CajeroTurnoSessionBean cajeroturnoSessionBean;

	public DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=null;
	public DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleLiquidacionImpor=false;
	public DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean;

	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoSoli=false;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;

	public DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFrame=null;
	public DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDescuentoTipoPrecio=false;
	public DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean;

	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=null;
	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGuiaRemision=false;
	public GuiaRemisionSessionBean guiaremisionSessionBean;

	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;
	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoPuntoVenta=false;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;

	public GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame=null;
	public GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGastoEmpleado=false;
	public GastoEmpleadoSessionBean gastoempleadoSessionBean;

	public SecuencialUsuarioBeanSwingJInternalFrame secuencialusuarioBeanSwingJInternalFrame=null;
	public SecuencialUsuarioBeanSwingJInternalFrame secuencialusuarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSecuencialUsuario=false;
	public SecuencialUsuarioSessionBean secuencialusuarioSessionBean;

	public MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFrame=null;
	public MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMovimientoActivoFijo=false;
	public MovimientoActivoFijoSessionBean movimientoactivofijoSessionBean;

	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;
	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUsuarioOpcion=false;
	public UsuarioOpcionSessionBean usuarioopcionSessionBean;

	public PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=null;
	public PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoCompraImpor=false;
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;

	public OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=null;
	public OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOrdenCompra=false;
	public OrdenCompraSessionBean ordencompraSessionBean;

	public TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame=null;
	public TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTurnoPunVen=false;
	public TurnoPunVenSessionBean turnopunvenSessionBean;

	public NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame=null;
	public NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedad=false;
	public NovedadSessionBean novedadSessionBean;

	public ParametroGeneralUsuarioBeanSwingJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame=null;
	public ParametroGeneralUsuarioBeanSwingJInternalFrame parametrogeneralusuarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroGeneralUsuario=false;
	public ParametroGeneralUsuarioSessionBean parametrogeneralusuarioSessionBean;

	public AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFrame=null;
	public AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriPagoOrdenCompra=false;
	public AutoriPagoOrdenCompraSessionBean autoripagoordencompraSessionBean;

	public CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFrame=null;
	public CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCierreCaja=false;
	public CierreCajaSessionBean cierrecajaSessionBean;

	public DescuentoMontoBeanSwingJInternalFrame descuentomontoBeanSwingJInternalFrame=null;
	public DescuentoMontoBeanSwingJInternalFrame descuentomontoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDescuentoMonto=false;
	public DescuentoMontoSessionBean descuentomontoSessionBean;

	public CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame=null;
	public CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaEgreso=false;
	public CajaEgresoSessionBean cajaegresoSessionBean;

	public RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame=null;
	public RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRequisicionCompra=false;
	public RequisicionCompraSessionBean requisicioncompraSessionBean;

	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;
	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoPuntoVenta=false;
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;

	public PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFrame=null;
	public PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePlaneacionCompra=false;
	public PlaneacionCompraSessionBean planeacioncompraSessionBean;

	public PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame=null;
	public PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoCompra=false;
	public PedidoCompraSessionBean pedidocompraSessionBean;

	public PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFrame=null;
	public PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilUsuario=false;
	public PerfilUsuarioSessionBean perfilusuarioSessionBean;

	public ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame=null;
	public ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignatario=false;
	public ConsignatarioSessionBean consignatarioSessionBean;

	public TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame=null;
	public TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransferencia=false;
	public TransferenciaSessionBean transferenciaSessionBean;

	public DatoGeneralUsuarioBeanSwingJInternalFrame datogeneralusuarioBeanSwingJInternalFrame=null;
	public DatoGeneralUsuarioBeanSwingJInternalFrame datogeneralusuarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralUsuario=false;
	public DatoGeneralUsuarioSessionBean datogeneralusuarioSessionBean;

	public CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame=null;
	public CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaIngreso=false;
	public CajaIngresoSessionBean cajaingresoSessionBean;

	public ClienteCoaBeanSwingJInternalFrame clientecoaBeanSwingJInternalFrame=null;
	public ClienteCoaBeanSwingJInternalFrame clientecoaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteClienteCoa=false;
	public ClienteCoaSessionBean clientecoaSessionBean;

	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignacion=false;
	public ConsignacionSessionBean consignacionSessionBean;

	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFrame=null;
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMensajeCorreoInven=false;
	public DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public UsuarioLogic usuarioLogic;
	
	public JScrollPane jScrollPanelDatosUsuario;
	public JScrollPane jScrollPanelDatosEdicionUsuario;
	public JScrollPane jScrollPanelDatosGeneralUsuario;
	
	protected JPanel jPanelCamposUsuario;    
	protected JPanel jPanelCamposOcultosUsuario;    	
	protected JPanel jPanelAccionesUsuario;
	protected JPanel jPanelAccionesFormularioUsuario;
    
	
	
	protected Integer iXPanelCamposUsuario=0;
	protected Integer iYPanelCamposUsuario=0;
	
	protected Integer iXPanelCamposOcultosUsuario=0;
	protected Integer iYPanelCamposOcultosUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUsuario;
	public JButton jButtonModificarUsuario;
	public JButton jButtonActualizarUsuario;
    public JButton jButtonEliminarUsuario;
	public JButton jButtonCancelarUsuario;
    public JButton jButtonGuardarCambiosUsuario;
	public JButton jButtonGuardarCambiosTablaUsuario;
	protected JButton jButtonCerrarUsuario;
	
	
	protected JButton jButtonProcesarInformacionUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUsuario;
	protected JButton jButtonModificarToolBarUsuario;
	protected JButton jButtonActualizarToolBarUsuario;
    protected JButton jButtonEliminarToolBarUsuario;
	protected JButton jButtonCancelarToolBarUsuario;
    protected JButton jButtonGuardarCambiosToolBarUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarUsuario;
	protected JButton jButtonCerrarToolBarUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUsuario;
	protected JMenuItem jMenuItemModificarUsuario;
	protected JMenuItem jMenuItemActualizarUsuario;
    protected JMenuItem jMenuItemEliminarUsuario;
	protected JMenuItem jMenuItemCancelarUsuario;
    protected JMenuItem jMenuItemGuardarCambiosUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaUsuario;
	protected JMenuItem jMenuItemCerrarUsuario;
	protected JMenuItem jMenuItemDetalleCerrarUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUsuario;
	protected JMenuItem jMenuItemMostrarOcultarUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUsuario;
	public JLabel jLabelIdUsuario;
	public JLabel jLabelidUsuario;
	public JButton jButtonidUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneluser_nameUsuario;
	public JLabel jLabeluser_nameUsuario;
	public JTextField jTextFielduser_nameUsuario;
	public JButton jButtonuser_nameUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelclaveUsuario;
	public JLabel jLabelclaveUsuario;
	public JTextArea jTextAreaclaveUsuario;
	public JScrollPane jscrollPaneclaveUsuario;
	public JButton jButtonclaveUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelconfirmar_claveUsuario;
	public JLabel jLabelconfirmar_claveUsuario;
	public JTextArea jTextAreaconfirmar_claveUsuario;
	public JScrollPane jscrollPaneconfirmar_claveUsuario;
	public JButton jButtonconfirmar_claveUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreUsuario;
	public JLabel jLabelnombreUsuario;
	public JTextArea jTextAreanombreUsuario;
	public JScrollPane jscrollPanenombreUsuario;
	public JButton jButtonnombreUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_alternoUsuario;
	public JLabel jLabelcodigo_alternoUsuario;
	public JTextField jTextFieldcodigo_alternoUsuario;
	public JButton jButtoncodigo_alternoUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneltipoUsuario;
	public JLabel jLabeltipoUsuario;
	public JCheckBox jCheckBoxtipoUsuario;
	public JButton jButtontipoUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelestadoUsuario;
	public JLabel jLabelestadoUsuario;
	public JCheckBox jCheckBoxestadoUsuario;
	public JButton jButtonestadoUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUsuario;
	public JLabel jLabelid_empresaUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUsuario;
	public JButton jButtonid_empresaUsuario= new JButtonMe();
	public JButton jButtonid_empresaUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUsuario;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUsuario=new JPanel();
				this.jPanelAccionesFormularioUsuario=new JPanel();
				this.jmenuBarDetalleUsuario=new JMenuBar();
				this.jTtoolBarDetalleUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUsuario() {
		return this.jButtonActualizarToolBarUsuario;
	}
	
	public JButton getjButtonEliminarToolBarUsuario() {
		return this.jButtonEliminarToolBarUsuario;
	}
	
	public JButton getjButtonCancelarToolBarUsuario() {
		return this.jButtonCancelarToolBarUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionUsuario() {
		return this.jButtonProcesarInformacionUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUsuario)	{
		this.jButtonProcesarInformacionUsuario = jButtonProcesarInformacionUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUsuario() {
		return this.jComboBoxTiposAccionesUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUsuario(
			JComboBox jComboBoxTiposRelacionesUsuario) {
		this.jComboBoxTiposRelacionesUsuario = jComboBoxTiposRelacionesUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUsuario(
			JComboBox jComboBoxTiposAccionesUsuario) {
		this.jComboBoxTiposAccionesUsuario = jComboBoxTiposAccionesUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUsuario() {
		return this.jComboBoxTiposAccionesFormularioUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUsuario(
			JComboBox jComboBoxTiposAccionesFormularioUsuario) {
		this.jComboBoxTiposAccionesFormularioUsuario = jComboBoxTiposAccionesFormularioUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.usuarioSessionBean=new UsuarioSessionBean();
		
		this.usuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.usuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.depositobancoSessionBean=new DepositoBancoSessionBean();
		//this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		//this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
		//this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		//this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		//this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		//this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		//this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		//this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		//this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		//this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		//this.movimientoactivofijoSessionBean=new MovimientoActivoFijoSessionBean();
		//this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		//this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		//this.ordencompraSessionBean=new OrdenCompraSessionBean();
		//this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
		//this.novedadSessionBean=new NovedadSessionBean();
		//this.parametrogeneralusuarioSessionBean=new ParametroGeneralUsuarioSessionBean();
		//this.autoripagoordencompraSessionBean=new AutoriPagoOrdenCompraSessionBean();
		//this.cierrecajaSessionBean=new CierreCajaSessionBean();
		//this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
		//this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		//this.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
		//this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		//this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		//this.pedidocompraSessionBean=new PedidoCompraSessionBean();
		//this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		//this.consignatarioSessionBean=new ConsignatarioSessionBean();
		//this.transferenciaSessionBean=new TransferenciaSessionBean();
		//this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		//this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		//this.clientecoaSessionBean=new ClienteCoaSessionBean();
		//this.consignacionSessionBean=new ConsignacionSessionBean();
		//this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		UsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUsuario=new JButtonMe();
				this.jButtonModificarToolBarUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUsuario,this.jTtoolBarDetalleUsuario,
							"actualizar","actualizar","Actualizar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUsuario,this.jTtoolBarDetalleUsuario,
							"eliminar","eliminar","Eliminar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUsuario,this.jTtoolBarDetalleUsuario,
							"cancelar","cancelar","Cancelar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUsuario,this.jTtoolBarDetalleUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUsuario.add(this.jMenuItemDetalleCerrarUsuario);
		
		this.jmenuDetalleAccionesUsuario.add(this.jMenuItemActualizarUsuario);
		this.jmenuDetalleAccionesUsuario.add(this.jMenuItemEliminarUsuario);
		this.jmenuDetalleAccionesUsuario.add(this.jMenuItemCancelarUsuario);		
		
		//this.jmenuDetalleDatosUsuario.add(this.jMenuItemDetalleAbrirOrderByUsuario);				
		this.jmenuDetalleDatosUsuario.add(this.jMenuItemDetalleMostarOcultarUsuario);				
				
		//this.jmenuDetalleAccionesUsuario.add(this.jMenuItemGuardarCambiosUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUsuario.add(this.jmenuDetalleArchivoUsuario);		
		this.jmenuBarDetalleUsuario.add(this.jmenuDetalleAccionesUsuario);		
		this.jmenuBarDetalleUsuario.add(this.jmenuDetalleDatosUsuario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleUsuario.add(this.jmenuDetalleUsuario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUsuario);				
	}
	
	
	public void inicializarElementosCamposUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUsuario = new JLabelMe();
		jLabelIdUsuario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUsuario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUsuario= new GridBagLayout();

		this.jPanelidUsuario.setLayout(this.gridaBagLayoutUsuario);

		jLabelidUsuario = new JLabel();
		jLabelidUsuario.setText("Id");

		jLabelidUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeluser_nameUsuario = new JLabelMe();
		this.jLabeluser_nameUsuario.setText(""+UsuarioConstantesFunciones.LABEL_USERNAME+" : *");
		this.jLabeluser_nameUsuario.setToolTipText("Nombre Usuario");
		this.jLabeluser_nameUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeluser_nameUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeluser_nameUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeluser_nameUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneluser_nameUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneluser_nameUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_USERNAME);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPaneluser_nameUsuario.setLayout(this.gridaBagLayoutUsuario);


		jTextFielduser_nameUsuario= new JTextFieldMe();

		jTextFielduser_nameUsuario.setEnabled(false);
		jTextFielduser_nameUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduser_nameUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduser_nameUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielduser_nameUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonuser_nameUsuarioBusqueda= new JButtonMe();
		this.jButtonuser_nameUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonuser_nameUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonuser_nameUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonuser_nameUsuarioBusqueda.setText("U");
		this.jButtonuser_nameUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonuser_nameUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonuser_nameUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielduser_nameUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielduser_nameUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"user_nameUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonuser_nameUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelclaveUsuario = new JLabelMe();
		this.jLabelclaveUsuario.setText(""+UsuarioConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveUsuario.setToolTipText("Clave");
		this.jLabelclaveUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPanelclaveUsuario.setLayout(this.gridaBagLayoutUsuario);


		jTextAreaclaveUsuario= new JTextAreaMe();
		jTextAreaclaveUsuario.setEnabled(false);
		jTextAreaclaveUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaclaveUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaclaveUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaclaveUsuario.setLineWrap(true);
		jTextAreaclaveUsuario.setWrapStyleWord(true);
		jTextAreaclaveUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaclaveUsuario.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaclaveUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneclaveUsuario = new JScrollPane(jTextAreaclaveUsuario);
		jscrollPaneclaveUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneclaveUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneclaveUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonclaveUsuarioBusqueda= new JButtonMe();
		this.jButtonclaveUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveUsuarioBusqueda.setText("U");
		this.jButtonclaveUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaclaveUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaclaveUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelconfirmar_claveUsuario = new JLabelMe();
		this.jLabelconfirmar_claveUsuario.setText(""+UsuarioConstantesFunciones.LABEL_CONFIRMARCLAVE+" : *");
		this.jLabelconfirmar_claveUsuario.setToolTipText("Confirmar Clave");
		this.jLabelconfirmar_claveUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelconfirmar_claveUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelconfirmar_claveUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelconfirmar_claveUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconfirmar_claveUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconfirmar_claveUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_CONFIRMARCLAVE);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPanelconfirmar_claveUsuario.setLayout(this.gridaBagLayoutUsuario);


		jTextAreaconfirmar_claveUsuario= new JTextAreaMe();
		jTextAreaconfirmar_claveUsuario.setEnabled(false);
		jTextAreaconfirmar_claveUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconfirmar_claveUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconfirmar_claveUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaconfirmar_claveUsuario.setLineWrap(true);
		jTextAreaconfirmar_claveUsuario.setWrapStyleWord(true);
		jTextAreaconfirmar_claveUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaconfirmar_claveUsuario.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaconfirmar_claveUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneconfirmar_claveUsuario = new JScrollPane(jTextAreaconfirmar_claveUsuario);
		jscrollPaneconfirmar_claveUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneconfirmar_claveUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneconfirmar_claveUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonconfirmar_claveUsuarioBusqueda= new JButtonMe();
		this.jButtonconfirmar_claveUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconfirmar_claveUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconfirmar_claveUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconfirmar_claveUsuarioBusqueda.setText("U");
		this.jButtonconfirmar_claveUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconfirmar_claveUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconfirmar_claveUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaconfirmar_claveUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaconfirmar_claveUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"confirmar_claveUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconfirmar_claveUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreUsuario = new JLabelMe();
		this.jLabelnombreUsuario.setText(""+UsuarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreUsuario.setToolTipText("Nombre Completo");
		this.jLabelnombreUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombreUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombreUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPanelnombreUsuario.setLayout(this.gridaBagLayoutUsuario);


		jTextAreanombreUsuario= new JTextAreaMe();
		jTextAreanombreUsuario.setEnabled(false);
		jTextAreanombreUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreUsuario.setLineWrap(true);
		jTextAreanombreUsuario.setWrapStyleWord(true);
		jTextAreanombreUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreUsuario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreUsuario = new JScrollPane(jTextAreanombreUsuario);
		jscrollPanenombreUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreUsuarioBusqueda= new JButtonMe();
		this.jButtonnombreUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreUsuarioBusqueda.setText("U");
		this.jButtonnombreUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_alternoUsuario = new JLabelMe();
		this.jLabelcodigo_alternoUsuario.setText(""+UsuarioConstantesFunciones.LABEL_CODIGOALTERNO+" : *");
		this.jLabelcodigo_alternoUsuario.setToolTipText("Codigo Alterno");
		this.jLabelcodigo_alternoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_alternoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_alternoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_alternoUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_alternoUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_alternoUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_CODIGOALTERNO);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPanelcodigo_alternoUsuario.setLayout(this.gridaBagLayoutUsuario);


		jTextFieldcodigo_alternoUsuario= new JTextFieldMe();

		jTextFieldcodigo_alternoUsuario.setEnabled(false);
		jTextFieldcodigo_alternoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_alternoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_alternoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_alternoUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_alternoUsuarioBusqueda= new JButtonMe();
		this.jButtoncodigo_alternoUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_alternoUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_alternoUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_alternoUsuarioBusqueda.setText("U");
		this.jButtoncodigo_alternoUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_alternoUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_alternoUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_alternoUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_alternoUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_alternoUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_alternoUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeltipoUsuario = new JLabelMe();
		this.jLabeltipoUsuario.setText(""+UsuarioConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoUsuario.setToolTipText("Tipo");
		this.jLabeltipoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPaneltipoUsuario.setLayout(this.gridaBagLayoutUsuario);


		jCheckBoxtipoUsuario= new JCheckBoxMe();
		jCheckBoxtipoUsuario.setEnabled(false);

		jCheckBoxtipoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtipoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtipoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtipoUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoUsuarioBusqueda= new JButtonMe();
		this.jButtontipoUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoUsuarioBusqueda.setText("U");
		this.jButtontipoUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtipoUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtipoUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelestadoUsuario = new JLabelMe();
		this.jLabelestadoUsuario.setText(""+UsuarioConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoUsuario.setToolTipText("Estado");
		this.jLabelestadoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPanelestadoUsuario.setLayout(this.gridaBagLayoutUsuario);


		jCheckBoxestadoUsuario= new JCheckBoxMe();
		jCheckBoxestadoUsuario.setEnabled(false);

		jCheckBoxestadoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoUsuarioBusqueda= new JButtonMe();
		this.jButtonestadoUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoUsuarioBusqueda.setText("U");
		this.jButtonestadoUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUsuario = new JLabelMe();
		this.jLabelid_empresaUsuario.setText(""+UsuarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUsuario.setToolTipText("Empresa");
		this.jLabelid_empresaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUsuario.setToolTipText(UsuarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUsuario = new GridBagLayout();
		this.jPanelid_empresaUsuario.setLayout(this.gridaBagLayoutUsuario);


		jComboBoxid_empresaUsuario= new JComboBoxMe();
		jComboBoxid_empresaUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUsuario.setEnabled(false);

		this.jButtonid_empresaUsuario= new JButtonMe();
		this.jButtonid_empresaUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUsuario.setText("Buscar");
		this.jButtonid_empresaUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUsuario"));

		this.jButtonid_empresaUsuarioBusqueda= new JButtonMe();
		this.jButtonid_empresaUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUsuarioBusqueda.setText("U");
		this.jButtonid_empresaUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUsuarioBusqueda"));

		if(this.usuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaUsuarioUpdate= new JButtonMe();
		this.jButtonid_empresaUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUsuarioUpdate.setText("U");
		this.jButtonid_empresaUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUsuarioUpdate"));



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
		//this.jInternalFrameDetalleUsuario = new UsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUsuario= new GridBagLayout();
		

		
		String sToolTipUsuario="";
		sToolTipUsuario=UsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUsuario+="(Seguridad.Usuario)";
		}
		
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUsuario = new JButtonMe();
		this.jButtonModificarUsuario = new JButtonMe();
        this.jButtonActualizarUsuario = new JButtonMe();
        this.jButtonEliminarUsuario = new JButtonMe();
        this.jButtonCancelarUsuario = new JButtonMe();
        this.jButtonGuardarCambiosUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaUsuario = new JButtonMe();
		this.jButtonCerrarUsuario = new JButtonMe();
		
		this.jScrollPanelDatosUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Usuario";
		
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUsuario.setName("jPanelCamposUsuario"); 

		this.jPanelCamposOcultosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUsuario.setName("jPanelCamposOcultosUsuario"); 

        this.jPanelAccionesUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUsuario.setToolTipText("Acciones");
        this.jPanelAccionesUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUsuario.setText("Nuevo");
		this.jButtonModificarUsuario.setText("Editar");
        this.jButtonActualizarUsuario.setText("Actualizar");
        this.jButtonEliminarUsuario.setText("Eliminar");
        this.jButtonCancelarUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaUsuario.setText("Guardar");
		this.jButtonCerrarUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUsuario,"nuevo_button","Nuevo",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUsuario,"modificar_button","Editar",this.usuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUsuario,"actualizar_button","Actualizar",this.usuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUsuario,"eliminar_button","Eliminar",this.usuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUsuario,"cancelar_button","Cancelar",this.usuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUsuario,"guardarcambios_button","Guardar",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUsuario,"guardarcambiostabla_button","Guardar",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUsuario,"cerrar_button","Salir",this.usuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUsuario.setToolTipText("Nuevo"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUsuario.setToolTipText("Editar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUsuario.setToolTipText("Actualizar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUsuario.setToolTipText("Eliminar)"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUsuario.setToolTipText("Cancelar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUsuario.setToolTipText("Guardar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUsuario.setToolTipText("Guardar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUsuario.setToolTipText("Salir"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUsuario";
		inputMap = this.jButtonNuevoUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUsuario";
		inputMap = this.jButtonActualizarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarUsuario";
		inputMap = this.jButtonEliminarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarUsuario";
		inputMap = this.jButtonCancelarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarUsuario";
		inputMap = this.jButtonCerrarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUsuario";
		inputMap = this.jButtonGuardarCambiosTablaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUsuario.setToolTipText("Nuevo Usuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUsuario.setToolTipText("Sin Cerrar Ventana Usuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUsuario.setText("Accion");
		this.jComboBoxTiposAccionesUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUsuario = new JLabelMe();
		
		this.jLabelAccionesUsuario.setText("Acciones");		
		this.jLabelAccionesUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUsuario = new GridBagLayout();
		
		this.jPanelCamposUsuario.setLayout(gridaBagLayoutCamposUsuario);
		this.jPanelCamposOcultosUsuario.setLayout(gridaBagLayoutCamposOcultosUsuario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUsuario.add(jLabelIdUsuario, this.gridBagConstraintsUsuario);



	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUsuario.add(jLabelidUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUsuario.add(jLabelid_empresaUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUsuario.add(jButtonid_empresaUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 3;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUsuario.add(jButtonid_empresaUsuarioUpdate, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUsuario.add(jComboBoxid_empresaUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneluser_nameUsuario.add(jLabeluser_nameUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneluser_nameUsuario.add(jButtonuser_nameUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneluser_nameUsuario.add(jTextFielduser_nameUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveUsuario.add(jLabelclaveUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveUsuario.add(jButtonclaveUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveUsuario.add(jscrollPaneclaveUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconfirmar_claveUsuario.add(jLabelconfirmar_claveUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelconfirmar_claveUsuario.add(jButtonconfirmar_claveUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconfirmar_claveUsuario.add(jscrollPaneconfirmar_claveUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreUsuario.add(jLabelnombreUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreUsuario.add(jButtonnombreUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreUsuario.add(jscrollPanenombreUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_alternoUsuario.add(jLabelcodigo_alternoUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_alternoUsuario.add(jButtoncodigo_alternoUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_alternoUsuario.add(jTextFieldcodigo_alternoUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoUsuario.add(jLabeltipoUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoUsuario.add(jButtontipoUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoUsuario.add(jCheckBoxtipoUsuario, this.gridBagConstraintsUsuario);


	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 0;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoUsuario.add(jLabelestadoUsuario, this.gridBagConstraintsUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 2;
		this.gridBagConstraintsUsuario.ipadx = 0;
		this.gridBagConstraintsUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoUsuario.add(jButtonestadoUsuarioBusqueda, this.gridBagConstraintsUsuario);
	}

	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUsuario.gridy = 0;
	this.gridBagConstraintsUsuario.gridx = 1;
	this.gridBagConstraintsUsuario.ipadx = 0;
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoUsuario.add(jCheckBoxestadoUsuario, this.gridBagConstraintsUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPanelidUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPaneluser_nameUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPanelclaveUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPanelconfirmar_claveUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPanelnombreUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPanelcodigo_alternoUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPaneltipoUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUsuario.add(this.jPanelestadoUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposUsuario % 1==0) {
		iXPanelCamposUsuario=0;
		iYPanelCamposUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUsuario = new GridBagConstraints();
	this.gridBagConstraintsUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUsuario.gridy = iYPanelCamposOcultosUsuario;
	this.gridBagConstraintsUsuario.gridx = iXPanelCamposOcultosUsuario++;
	this.gridBagConstraintsUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUsuario.add(this.jPanelid_empresaUsuario, this.gridBagConstraintsUsuario);



	if(iXPanelCamposOcultosUsuario % 1==0) {
		iXPanelCamposOcultosUsuario=0;
		iYPanelCamposOcultosUsuario++;
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
			
		GridBagLayout gridaBagLayoutAccionesUsuario= new GridBagLayout();
		this.jPanelAccionesUsuario.setLayout(gridaBagLayoutAccionesUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioUsuario.setLayout(gridaBagLayoutAccionesFormularioUsuario);
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUsuario.add(this.jComboBoxTiposAccionesFormularioUsuario, this.gridBagConstraintsUsuario);

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUsuario.add(this.jCheckBoxPostAccionNuevoUsuario, this.gridBagConstraintsUsuario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.usuarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUsuario.add(this.jCheckBoxPostAccionSinCerrarUsuario, this.gridBagConstraintsUsuario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.usuarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUsuario.add(this.jCheckBoxPostAccionSinMensajeUsuario, this.gridBagConstraintsUsuario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesUsuario.add(this.jButtonModificarUsuario, this.gridBagConstraintsUsuario);							

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesUsuario.add(this.jButtonEliminarUsuario, this.gridBagConstraintsUsuario);
		
			
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = 0;		
		this.gridBagConstraintsUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesUsuario.add(this.jButtonActualizarUsuario, this.gridBagConstraintsUsuario);


		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = 0;		
		this.gridBagConstraintsUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesUsuario.add(this.jButtonGuardarCambiosUsuario, this.gridBagConstraintsUsuario);	
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = 0;		
		this.gridBagConstraintsUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesUsuario.add(this.jButtonCancelarUsuario, this.gridBagConstraintsUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.usuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUsuario = new GridBagConstraints();						
			this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUsuario.gridx = 0;		
			//this.gridBagConstraintsUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUsuario.gridx =0;
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUsuario, this.gridBagConstraintsUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUsuario = new UsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Usuario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UsuarioModel usuarioModel=new UsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//UsuarioModel.UsuarioFocusTraversalPolicy usuarioFocusTraversalPolicy = usuarioModel.new UsuarioFocusTraversalPolicy(this);
			
			//usuarioFocusTraversalPolicy.setusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(usuarioModel);
			
			
			this.jContentPaneDetalleUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUsuario = new GridBagLayout();	
			this.jContentPaneDetalleUsuario.setLayout(gridaBagLayoutDetalleUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUsuario = new GridBagConstraints();
				this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUsuario.gridx = 0;
					
				
				this.jContentPaneDetalleUsuario.add(jTtoolBarDetalleUsuario, gridBagConstraintsUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionUsuario=   new JScrollPane(jContentPaneDetalleUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUsuario.gridx = 0;
	        
			this.jContentPaneDetalleUsuario.add(jPanelCamposUsuario, gridBagConstraintsUsuario);
			
			
			
			
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
						&& usuarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAutoriPagoOrdenCompra(this.puedeCargarPorParteAutoriPagoOrdenCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameAutoriRetencion(this.puedeCargarPorParteAutoriRetencion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaEgreso(this.puedeCargarPorParteCajaEgreso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaIngreso(this.puedeCargarPorParteCajaIngreso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(this.puedeCargarPorParteCajeroTurno,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCierreCaja(this.puedeCargarPorParteCierreCaja,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteCoa(this.puedeCargarPorParteClienteCoa,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(this.puedeCargarPorParteConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignatario(this.puedeCargarPorParteConsignatario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralUsuario(this.puedeCargarPorParteDatoGeneralUsuario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDepositoBanco(this.puedeCargarPorParteDepositoBanco,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDescuentoMonto(this.puedeCargarPorParteDescuentoMonto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDescuentoTipoPrecio(this.puedeCargarPorParteDescuentoTipoPrecio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(this.puedeCargarPorParteDetalleLiquidacionImpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(this.puedeCargarPorParteDetalleMensajeCorreoInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(this.puedeCargarPorParteGastoEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(this.puedeCargarPorParteGuiaRemision,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialCambioClave(this.puedeCargarPorParteHistorialCambioClave,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMovimientoActivoFijo(this.puedeCargarPorParteMovimientoActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(this.puedeCargarPorParteNotaCreditoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(this.puedeCargarPorParteNotaCreditoSoli,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedad(this.puedeCargarPorParteNovedad,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameOrdenCompra(this.puedeCargarPorParteOrdenCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroGeneralUsuario(this.puedeCargarPorParteParametroGeneralUsuario,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(this.puedeCargarPorPartePedidoCompraImpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompra(this.puedeCargarPorPartePedidoCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(this.puedeCargarPorPartePedidoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePlaneacionCompra(this.puedeCargarPorPartePlaneacionCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRequisicionCompra(this.puedeCargarPorParteRequisicionCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSecuencialUsuario(this.puedeCargarPorParteSecuencialUsuario,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilUsuario(this.puedeCargarPorPartePerfilUsuario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransferencia(this.puedeCargarPorParteTransferencia,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTurnoPunVen(this.puedeCargarPorParteTurnoPunVen,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(this.puedeCargarPorParteUsuarioOpcion,false,-1);
					
					if(this.usuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUsuario= new GridBagConstraints();
						this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUsuario.gridx = 0;
						this.jContentPaneDetalleUsuario.add(this.jTabbedPaneRelacionesUsuario, this.gridBagConstraintsUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUsuario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAutoriPagoOrdenCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameAutoriRetencion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaEgreso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaIngreso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCierreCaja(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteCoa(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignatario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDepositoBanco(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDescuentoMonto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDescuentoTipoPrecio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialCambioClave(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMovimientoActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameOrdenCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroGeneralUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePlaneacionCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRequisicionCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSecuencialUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilUsuario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransferencia(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTurnoPunVen(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUsuario = new GridBagConstraints();
					this.gridBagConstraintsUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUsuario.gridx = 0;
					
				
					this.jContentPaneDetalleUsuario.add(jPanelCamposOcultosUsuario, gridBagConstraintsUsuario);
				
					this.jPanelCamposOcultosUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;//106;		
	        this.gridBagConstraintsUsuario.gridx = 0;
	        this.gridBagConstraintsUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUsuario.add(this.jPanelAccionesFormularioUsuario, this.gridBagConstraintsUsuario);							
			
			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
	        this.gridBagConstraintsUsuario.gridy = iGridyRelaciones;//106;		
	        this.gridBagConstraintsUsuario.gridx = 0;
	        
			
			this.jContentPaneDetalleUsuario.add(this.jPanelAccionesUsuario, this.gridBagConstraintsUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUsuario=   new JScrollPane(this.jPanelCamposUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUsuario.gridx = 0;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUsuario, this.gridBagConstraintsUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUsuario, this.gridBagConstraintsUsuario);			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUsuario, this.gridBagConstraintsUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUsuario, this.gridBagConstraintsUsuario);
			
			
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUsuario, this.gridBagConstraintsUsuario);
		
			
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUsuario, this.gridBagConstraintsUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionUsuario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAutoriPagoOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoripagoordencompraSessionBean=new AutoriPagoOrdenCompraSessionBean();
		this.autoripagoordencompraSessionBean.setConGuardarRelaciones(false);
		this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(true);

		this.autoripagoordencompraBeanSwingJInternalFrame=null;//new AutoriPagoOrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoripagoordencompraBeanSwingJInternalFramePopup=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoripagoordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {

				AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(true);

				this.autoripagoordencompraBeanSwingJInternalFrame=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoripagoordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoripagoordencompraBeanSwingJInternalFrame.setautoripagoordencompraSessionBean(this.autoripagoordencompraSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.autoripagoordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Autori Pago Orden Compras",this.autoripagoordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.autoripagoordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriPagoOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(false);
				this.autoripagoordencompraBeanSwingJInternalFrame=null;//new AutoriPagoOrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriPagoOrdenCompra) {
					this.jTabbedPaneRelacionesUsuario.add("Autori Pago Orden Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameAutoriRetencion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
		this.autoriretencionSessionBean.setConGuardarRelaciones(false);
		this.autoriretencionSessionBean.setEsGuardarRelacionado(true);

		this.autoriretencionBeanSwingJInternalFrame=null;//new AutoriRetencionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoriretencionBeanSwingJInternalFramePopup=new AutoriRetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoriretencionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {

				AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoriretencionSessionBean.setEsGuardarRelacionado(true);

				this.autoriretencionBeanSwingJInternalFrame=new AutoriRetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoriretencionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoriretencionBeanSwingJInternalFrame.setautoriretencionSessionBean(this.autoriretencionSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.autoriretencionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Autori Retenciones",this.autoriretencionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.autoriretencionBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoriretencionSessionBean.setEsGuardarRelacionado(false);
				this.autoriretencionBeanSwingJInternalFrame=null;//new AutoriRetencionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriRetencion) {
					this.jTabbedPaneRelacionesUsuario.add("Autori Retenciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajaEgreso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		this.cajaegresoSessionBean.setConGuardarRelaciones(false);
		this.cajaegresoSessionBean.setEsGuardarRelacionado(true);

		this.cajaegresoBeanSwingJInternalFrame=null;//new CajaEgresoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaegresoBeanSwingJInternalFramePopup=new CajaEgresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaegresoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {

				CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaegresoSessionBean.setEsGuardarRelacionado(true);

				this.cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaegresoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaegresoBeanSwingJInternalFrame.setcajaegresoSessionBean(this.cajaegresoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.cajaegresoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Caja Egresos",this.cajaegresoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.cajaegresoBeanSwingJInternalFrame.getContentPane());
				}

				//CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaegresoSessionBean.setEsGuardarRelacionado(false);
				this.cajaegresoBeanSwingJInternalFrame=null;//new CajaEgresoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaEgreso) {
					this.jTabbedPaneRelacionesUsuario.add("Caja Egresos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajaIngreso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		this.cajaingresoSessionBean.setConGuardarRelaciones(false);
		this.cajaingresoSessionBean.setEsGuardarRelacionado(true);

		this.cajaingresoBeanSwingJInternalFrame=null;//new CajaIngresoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaingresoBeanSwingJInternalFramePopup=new CajaIngresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaingresoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {

				CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaingresoSessionBean.setEsGuardarRelacionado(true);

				this.cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaingresoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaingresoBeanSwingJInternalFrame.setcajaingresoSessionBean(this.cajaingresoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.cajaingresoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Caja Ingresos",this.cajaingresoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.cajaingresoBeanSwingJInternalFrame.getContentPane());
				}

				//CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaingresoSessionBean.setEsGuardarRelacionado(false);
				this.cajaingresoBeanSwingJInternalFrame=null;//new CajaIngresoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaIngreso) {
					this.jTabbedPaneRelacionesUsuario.add("Caja Ingresos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajeroTurno(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		this.cajeroturnoSessionBean.setConGuardarRelaciones(false);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

		this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajeroturnoBeanSwingJInternalFramePopup=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajeroturnoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {

				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

				this.cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajeroturnoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajeroturnoBeanSwingJInternalFrame.setcajeroturnoSessionBean(this.cajeroturnoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.cajeroturnoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Cajero Turnos",this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				}

				//CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajeroTurno) {
					this.jTabbedPaneRelacionesUsuario.add("Cajero Turnos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCierreCaja(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cierrecajaSessionBean=new CierreCajaSessionBean();
		this.cierrecajaSessionBean.setConGuardarRelaciones(false);
		this.cierrecajaSessionBean.setEsGuardarRelacionado(true);

		this.cierrecajaBeanSwingJInternalFrame=null;//new CierreCajaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cierrecajaBeanSwingJInternalFramePopup=new CierreCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cierrecajaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {

				CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cierrecajaSessionBean.setEsGuardarRelacionado(true);

				this.cierrecajaBeanSwingJInternalFrame=new CierreCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cierrecajaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cierrecajaBeanSwingJInternalFrame.setcierrecajaSessionBean(this.cierrecajaSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.cierrecajaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Cierre Cajas",this.cierrecajaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.cierrecajaBeanSwingJInternalFrame.getContentPane());
				}

				//CierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cierrecajaSessionBean.setEsGuardarRelacionado(false);
				this.cierrecajaBeanSwingJInternalFrame=null;//new CierreCajaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCierreCaja) {
					this.jTabbedPaneRelacionesUsuario.add("Cierre Cajas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameClienteCoa(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clientecoaSessionBean=new ClienteCoaSessionBean();
		this.clientecoaSessionBean.setConGuardarRelaciones(false);
		this.clientecoaSessionBean.setEsGuardarRelacionado(true);

		this.clientecoaBeanSwingJInternalFrame=null;//new ClienteCoaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clientecoaBeanSwingJInternalFramePopup=new ClienteCoaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clientecoaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {

				ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clientecoaSessionBean.setEsGuardarRelacionado(true);

				this.clientecoaBeanSwingJInternalFrame=new ClienteCoaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clientecoaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clientecoaBeanSwingJInternalFrame.setclientecoaSessionBean(this.clientecoaSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.clientecoaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Coas",this.clientecoaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.clientecoaBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteCoaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clientecoaSessionBean.setEsGuardarRelacionado(false);
				this.clientecoaBeanSwingJInternalFrame=null;//new ClienteCoaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteClienteCoa) {
					this.jTabbedPaneRelacionesUsuario.add("Coas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignacionSessionBean=new ConsignacionSessionBean();
		this.consignacionSessionBean.setConGuardarRelaciones(true);
		this.consignacionSessionBean.setEsGuardarRelacionado(true);

		this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {

				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignacionSessionBean.setEsGuardarRelacionado(true);

				this.consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.consignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignacionBeanSwingJInternalFrame.setconsignacionSessionBean(this.consignacionSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.consignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Consignacions",this.consignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.consignacionBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignacionSessionBean.setEsGuardarRelacionado(false);
				this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignacion) {
					this.jTabbedPaneRelacionesUsuario.add("Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameConsignatario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignatarioSessionBean=new ConsignatarioSessionBean();
		this.consignatarioSessionBean.setConGuardarRelaciones(false);
		this.consignatarioSessionBean.setEsGuardarRelacionado(true);

		this.consignatarioBeanSwingJInternalFrame=null;//new ConsignatarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignatarioBeanSwingJInternalFramePopup=new ConsignatarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignatarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {

				ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignatarioSessionBean.setEsGuardarRelacionado(true);

				this.consignatarioBeanSwingJInternalFrame=new ConsignatarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.consignatarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignatarioBeanSwingJInternalFrame.setconsignatarioSessionBean(this.consignatarioSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.consignatarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Consignatarios",this.consignatarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.consignatarioBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignatarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignatarioSessionBean.setEsGuardarRelacionado(false);
				this.consignatarioBeanSwingJInternalFrame=null;//new ConsignatarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignatario) {
					this.jTabbedPaneRelacionesUsuario.add("Consignatarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		this.datogeneralusuarioSessionBean.setConGuardarRelaciones(false);
		this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralusuarioBeanSwingJInternalFrame=null;//new DatoGeneralUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralusuarioBeanSwingJInternalFramePopup=new DatoGeneralUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralusuarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralusuarioBeanSwingJInternalFrame=new DatoGeneralUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralusuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralusuarioBeanSwingJInternalFrame.setdatogeneralusuarioSessionBean(this.datogeneralusuarioSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.datogeneralusuarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Dato General Usuarios",this.datogeneralusuarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.datogeneralusuarioBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralusuarioBeanSwingJInternalFrame=null;//new DatoGeneralUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralUsuario) {
					this.jTabbedPaneRelacionesUsuario.add("Dato General Usuarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDepositoBanco(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.depositobancoSessionBean=new DepositoBancoSessionBean();
		this.depositobancoSessionBean.setConGuardarRelaciones(false);
		this.depositobancoSessionBean.setEsGuardarRelacionado(true);

		this.depositobancoBeanSwingJInternalFrame=null;//new DepositoBancoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.depositobancoBeanSwingJInternalFramePopup=new DepositoBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.depositobancoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {

				DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.depositobancoSessionBean.setEsGuardarRelacionado(true);

				this.depositobancoBeanSwingJInternalFrame=new DepositoBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.depositobancoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.depositobancoBeanSwingJInternalFrame.setdepositobancoSessionBean(this.depositobancoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.depositobancoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Deposito Bancos",this.depositobancoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.depositobancoBeanSwingJInternalFrame.getContentPane());
				}

				//DepositoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.depositobancoSessionBean.setEsGuardarRelacionado(false);
				this.depositobancoBeanSwingJInternalFrame=null;//new DepositoBancoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.depositobancoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDepositoBanco) {
					this.jTabbedPaneRelacionesUsuario.add("Deposito Bancos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDescuentoMonto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.descuentomontoSessionBean=new DescuentoMontoSessionBean();
		this.descuentomontoSessionBean.setConGuardarRelaciones(false);
		this.descuentomontoSessionBean.setEsGuardarRelacionado(true);

		this.descuentomontoBeanSwingJInternalFrame=null;//new DescuentoMontoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.descuentomontoBeanSwingJInternalFramePopup=new DescuentoMontoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.descuentomontoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {

				DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DescuentoMontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.descuentomontoSessionBean.setEsGuardarRelacionado(true);

				this.descuentomontoBeanSwingJInternalFrame=new DescuentoMontoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.descuentomontoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.descuentomontoBeanSwingJInternalFrame.setdescuentomontoSessionBean(this.descuentomontoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.descuentomontoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Descuento Montos",this.descuentomontoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.descuentomontoBeanSwingJInternalFrame.getContentPane());
				}

				//DescuentoMontoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.descuentomontoSessionBean.setEsGuardarRelacionado(false);
				this.descuentomontoBeanSwingJInternalFrame=null;//new DescuentoMontoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.descuentomontoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDescuentoMonto) {
					this.jTabbedPaneRelacionesUsuario.add("Descuento Montos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDescuentoTipoPrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		this.descuentotipoprecioSessionBean.setConGuardarRelaciones(false);
		this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(true);

		this.descuentotipoprecioBeanSwingJInternalFrame=null;//new DescuentoTipoPrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.descuentotipoprecioBeanSwingJInternalFramePopup=new DescuentoTipoPrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.descuentotipoprecioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {

				DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(true);

				this.descuentotipoprecioBeanSwingJInternalFrame=new DescuentoTipoPrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.descuentotipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.descuentotipoprecioBeanSwingJInternalFrame.setdescuentotipoprecioSessionBean(this.descuentotipoprecioSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.descuentotipoprecioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Descuento Tipo Precios",this.descuentotipoprecioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.descuentotipoprecioBeanSwingJInternalFrame.getContentPane());
				}

				//DescuentoTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(false);
				this.descuentotipoprecioBeanSwingJInternalFrame=null;//new DescuentoTipoPrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDescuentoTipoPrecio) {
					this.jTabbedPaneRelacionesUsuario.add("Descuento Tipo Precios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(false);
		this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);

		this.detalleliquidacionimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleliquidacionimporBeanSwingJInternalFramePopup=new DetalleLiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleliquidacionimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {

				DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);

				this.detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleliquidacionimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleliquidacionimporBeanSwingJInternalFrame.setdetalleliquidacionimporSessionBean(this.detalleliquidacionimporSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Detalle Liquidacion Impores",this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
				this.detalleliquidacionimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleLiquidacionImpor) {
					this.jTabbedPaneRelacionesUsuario.add("Detalle Liquidacion Impores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(false);
		this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);

		this.detallemensajecorreoinvenBeanSwingJInternalFrame=null;//new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemensajecorreoinvenBeanSwingJInternalFramePopup=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemensajecorreoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {

				DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);

				this.detallemensajecorreoinvenBeanSwingJInternalFrame=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemensajecorreoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemensajecorreoinvenBeanSwingJInternalFrame.setdetallemensajecorreoinvenSessionBean(this.detallemensajecorreoinvenSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Detalle Mensaje Correo Invenes",this.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
				this.detallemensajecorreoinvenBeanSwingJInternalFrame=null;//new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMensajeCorreoInven) {
					this.jTabbedPaneRelacionesUsuario.add("Detalle Mensaje Correo Invenes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGastoEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		this.gastoempleadoSessionBean.setConGuardarRelaciones(false);
		this.gastoempleadoSessionBean.setEsGuardarRelacionado(true);

		this.gastoempleadoBeanSwingJInternalFrame=null;//new GastoEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.gastoempleadoBeanSwingJInternalFramePopup=new GastoEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.gastoempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {

				GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.gastoempleadoSessionBean.setEsGuardarRelacionado(true);

				this.gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.gastoempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.gastoempleadoBeanSwingJInternalFrame.setgastoempleadoSessionBean(this.gastoempleadoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.gastoempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Gasto Empleados",this.gastoempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.gastoempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.gastoempleadoSessionBean.setEsGuardarRelacionado(false);
				this.gastoempleadoBeanSwingJInternalFrame=null;//new GastoEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGastoEmpleado) {
					this.jTabbedPaneRelacionesUsuario.add("Gasto Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGuiaRemision(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		this.guiaremisionSessionBean.setConGuardarRelaciones(true);
		this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

		this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.guiaremisionBeanSwingJInternalFramePopup=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.guiaremisionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {

				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

				this.guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.guiaremisionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.guiaremisionBeanSwingJInternalFrame.setguiaremisionSessionBean(this.guiaremisionSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.guiaremisionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Guia Remisiones",this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				}

				//GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.guiaremisionSessionBean.setEsGuardarRelacionado(false);
				this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGuiaRemision) {
					this.jTabbedPaneRelacionesUsuario.add("Guia Remisiones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHistorialCambioClave(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		this.historialcambioclaveSessionBean.setConGuardarRelaciones(false);
		this.historialcambioclaveSessionBean.setEsGuardarRelacionado(true);

		this.historialcambioclaveBeanSwingJInternalFrame=null;//new HistorialCambioClaveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.historialcambioclaveBeanSwingJInternalFramePopup=new HistorialCambioClaveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.historialcambioclaveBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {

				HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.historialcambioclaveSessionBean.setEsGuardarRelacionado(true);

				this.historialcambioclaveBeanSwingJInternalFrame=new HistorialCambioClaveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.historialcambioclaveBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.historialcambioclaveBeanSwingJInternalFrame.sethistorialcambioclaveSessionBean(this.historialcambioclaveSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.historialcambioclaveBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Historial Cambio Claves",this.historialcambioclaveBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.historialcambioclaveBeanSwingJInternalFrame.getContentPane());
				}

				//HistorialCambioClaveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.historialcambioclaveSessionBean.setEsGuardarRelacionado(false);
				this.historialcambioclaveBeanSwingJInternalFrame=null;//new HistorialCambioClaveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHistorialCambioClave) {
					this.jTabbedPaneRelacionesUsuario.add("Historial Cambio Claves",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMovimientoActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.movimientoactivofijoSessionBean=new MovimientoActivoFijoSessionBean();
		this.movimientoactivofijoSessionBean.setConGuardarRelaciones(false);
		this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.movimientoactivofijoBeanSwingJInternalFrame=null;//new MovimientoActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.movimientoactivofijoBeanSwingJInternalFramePopup=new MovimientoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.movimientoactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {

				MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.movimientoactivofijoBeanSwingJInternalFrame=new MovimientoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.movimientoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.movimientoactivofijoBeanSwingJInternalFrame.setmovimientoactivofijoSessionBean(this.movimientoactivofijoSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.movimientoactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Movimiento Activo Fijos",this.movimientoactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.movimientoactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//MovimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.movimientoactivofijoBeanSwingJInternalFrame=null;//new MovimientoActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMovimientoActivoFijo) {
					this.jTabbedPaneRelacionesUsuario.add("Movimiento Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaSessionBean(this.notacreditopuntoventaSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Nota Creditos",this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesUsuario.add("Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		this.notacreditosoliSessionBean.setConGuardarRelaciones(true);
		this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditosoliBeanSwingJInternalFrame.setnotacreditosoliSessionBean(this.notacreditosoliSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.notacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Solicitud Nota Creditos",this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoSoli) {
					this.jTabbedPaneRelacionesUsuario.add("Solicitud Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNovedad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadSessionBean=new NovedadSessionBean();
		this.novedadSessionBean.setConGuardarRelaciones(false);
		this.novedadSessionBean.setEsGuardarRelacionado(true);

		this.novedadBeanSwingJInternalFrame=null;//new NovedadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadBeanSwingJInternalFramePopup=new NovedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadSessionBean.getEsGuardarRelacionado()) {

				NovedadJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadSessionBean.setEsGuardarRelacionado(true);

				this.novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadBeanSwingJInternalFrame.setnovedadSessionBean(this.novedadSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.novedadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Novedades",this.novedadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.novedadBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadSessionBean.setEsGuardarRelacionado(false);
				this.novedadBeanSwingJInternalFrame=null;//new NovedadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedad) {
					this.jTabbedPaneRelacionesUsuario.add("Novedades",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ordencompraSessionBean=new OrdenCompraSessionBean();
		this.ordencompraSessionBean.setConGuardarRelaciones(true);
		this.ordencompraSessionBean.setEsGuardarRelacionado(true);

		this.ordencompraBeanSwingJInternalFrame=null;//new OrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ordencompraBeanSwingJInternalFramePopup=new OrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ordencompraSessionBean.getEsGuardarRelacionado()) {

				OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ordencompraSessionBean.setEsGuardarRelacionado(true);

				this.ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.ordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ordencompraBeanSwingJInternalFrame.setordencompraSessionBean(this.ordencompraSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.ordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("OrdenCompras",this.ordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.ordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ordencompraSessionBean.setEsGuardarRelacionado(false);
				this.ordencompraBeanSwingJInternalFrame=null;//new OrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOrdenCompra) {
					this.jTabbedPaneRelacionesUsuario.add("OrdenCompras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroGeneralUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrogeneralusuarioSessionBean=new ParametroGeneralUsuarioSessionBean();
		this.parametrogeneralusuarioSessionBean.setConGuardarRelaciones(false);
		this.parametrogeneralusuarioSessionBean.setEsGuardarRelacionado(true);

		this.parametrogeneralusuarioBeanSwingJInternalFrame=null;//new ParametroGeneralUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrogeneralusuarioBeanSwingJInternalFramePopup=new ParametroGeneralUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrogeneralusuarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {

				ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrogeneralusuarioSessionBean.setEsGuardarRelacionado(true);

				this.parametrogeneralusuarioBeanSwingJInternalFrame=new ParametroGeneralUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrogeneralusuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrogeneralusuarioBeanSwingJInternalFrame.setparametrogeneralusuarioSessionBean(this.parametrogeneralusuarioSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.parametrogeneralusuarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Parametro Generales",this.parametrogeneralusuarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.parametrogeneralusuarioBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrogeneralusuarioSessionBean.setEsGuardarRelacionado(false);
				this.parametrogeneralusuarioBeanSwingJInternalFrame=null;//new ParametroGeneralUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroGeneralUsuario) {
					this.jTabbedPaneRelacionesUsuario.add("Parametro Generales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		this.pedidocompraimporSessionBean.setConGuardarRelaciones(true);
		this.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);

		this.pedidocompraimporBeanSwingJInternalFrame=null;//new PedidoCompraImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidocompraimporBeanSwingJInternalFramePopup=new PedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidocompraimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {

				PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);

				this.pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidocompraimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidocompraimporBeanSwingJInternalFrame.setpedidocompraimporSessionBean(this.pedidocompraimporSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.pedidocompraimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Compras",this.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				this.pedidocompraimporBeanSwingJInternalFrame=null;//new PedidoCompraImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoCompraImpor) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidocompraSessionBean=new PedidoCompraSessionBean();
		this.pedidocompraSessionBean.setConGuardarRelaciones(true);
		this.pedidocompraSessionBean.setEsGuardarRelacionado(true);

		this.pedidocompraBeanSwingJInternalFrame=null;//new PedidoCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidocompraBeanSwingJInternalFramePopup=new PedidoCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidocompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidocompraSessionBean.getEsGuardarRelacionado()) {

				PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidocompraSessionBean.setEsGuardarRelacionado(true);

				this.pedidocompraBeanSwingJInternalFrame=new PedidoCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidocompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidocompraBeanSwingJInternalFrame.setpedidocompraSessionBean(this.pedidocompraSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.pedidocompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Compras",this.pedidocompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.pedidocompraBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidocompraSessionBean.setEsGuardarRelacionado(false);
				this.pedidocompraBeanSwingJInternalFrame=null;//new PedidoCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoCompra) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		this.pedidoexporSessionBean.setConGuardarRelaciones(true);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Exportacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		this.pedidopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidopuntoventaBeanSwingJInternalFramePopup=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {

				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventaSessionBean(this.pedidopuntoventaSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Punto Ventas",this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoPuntoVenta) {
					this.jTabbedPaneRelacionesUsuario.add("Pedido Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePlaneacionCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		this.planeacioncompraSessionBean.setConGuardarRelaciones(false);
		this.planeacioncompraSessionBean.setEsGuardarRelacionado(true);

		this.planeacioncompraBeanSwingJInternalFrame=null;//new PlaneacionCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.planeacioncompraBeanSwingJInternalFramePopup=new PlaneacionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.planeacioncompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {

				PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PlaneacionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.planeacioncompraSessionBean.setEsGuardarRelacionado(true);

				this.planeacioncompraBeanSwingJInternalFrame=new PlaneacionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.planeacioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.planeacioncompraBeanSwingJInternalFrame.setplaneacioncompraSessionBean(this.planeacioncompraSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.planeacioncompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Planeacion Compras",this.planeacioncompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.planeacioncompraBeanSwingJInternalFrame.getContentPane());
				}

				//PlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.planeacioncompraSessionBean.setEsGuardarRelacionado(false);
				this.planeacioncompraBeanSwingJInternalFrame=null;//new PlaneacionCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePlaneacionCompra) {
					this.jTabbedPaneRelacionesUsuario.add("Planeacion Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRequisicionCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
		this.requisicioncompraSessionBean.setConGuardarRelaciones(true);
		this.requisicioncompraSessionBean.setEsGuardarRelacionado(true);

		this.requisicioncompraBeanSwingJInternalFrame=null;//new RequisicionCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.requisicioncompraBeanSwingJInternalFramePopup=new RequisicionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.requisicioncompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {

				RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.requisicioncompraSessionBean.setEsGuardarRelacionado(true);

				this.requisicioncompraBeanSwingJInternalFrame=new RequisicionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.requisicioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.requisicioncompraBeanSwingJInternalFrame.setrequisicioncompraSessionBean(this.requisicioncompraSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.requisicioncompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Requisicion Compras",this.requisicioncompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.requisicioncompraBeanSwingJInternalFrame.getContentPane());
				}

				//RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.requisicioncompraSessionBean.setEsGuardarRelacionado(false);
				this.requisicioncompraBeanSwingJInternalFrame=null;//new RequisicionCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRequisicionCompra) {
					this.jTabbedPaneRelacionesUsuario.add("Requisicion Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSecuencialUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		this.secuencialusuarioSessionBean.setConGuardarRelaciones(false);
		this.secuencialusuarioSessionBean.setEsGuardarRelacionado(true);

		this.secuencialusuarioBeanSwingJInternalFrame=null;//new SecuencialUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.secuencialusuarioBeanSwingJInternalFramePopup=new SecuencialUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.secuencialusuarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {

				SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				SecuencialUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.secuencialusuarioSessionBean.setEsGuardarRelacionado(true);

				this.secuencialusuarioBeanSwingJInternalFrame=new SecuencialUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.secuencialusuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.secuencialusuarioBeanSwingJInternalFrame.setsecuencialusuarioSessionBean(this.secuencialusuarioSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.secuencialusuarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Secuencial Usuarios",this.secuencialusuarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.secuencialusuarioBeanSwingJInternalFrame.getContentPane());
				}

				//SecuencialUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.secuencialusuarioSessionBean.setEsGuardarRelacionado(false);
				this.secuencialusuarioBeanSwingJInternalFrame=null;//new SecuencialUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSecuencialUsuario) {
					this.jTabbedPaneRelacionesUsuario.add("Secuencial Usuarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePerfilUsuario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		this.perfilusuarioSessionBean.setConGuardarRelaciones(false);
		this.perfilusuarioSessionBean.setEsGuardarRelacionado(true);

		this.perfilusuarioBeanSwingJInternalFrame=null;//new PerfilUsuarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilusuarioBeanSwingJInternalFramePopup=new PerfilUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilusuarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {

				PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilusuarioSessionBean.setEsGuardarRelacionado(true);

				this.perfilusuarioBeanSwingJInternalFrame=new PerfilUsuarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilusuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilusuarioBeanSwingJInternalFrame.setperfilusuarioSessionBean(this.perfilusuarioSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.perfilusuarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Usuarios Perfiles s",this.perfilusuarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.perfilusuarioBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilusuarioSessionBean.setEsGuardarRelacionado(false);
				this.perfilusuarioBeanSwingJInternalFrame=null;//new PerfilUsuarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilUsuario) {
					this.jTabbedPaneRelacionesUsuario.add("Usuarios Perfiles s",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transferenciaSessionBean=new TransferenciaSessionBean();
		this.transferenciaSessionBean.setConGuardarRelaciones(true);
		this.transferenciaSessionBean.setEsGuardarRelacionado(true);

		this.transferenciaBeanSwingJInternalFrame=null;//new TransferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transferenciaBeanSwingJInternalFramePopup=new TransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transferenciaSessionBean.getEsGuardarRelacionado()) {

				TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transferenciaSessionBean.setEsGuardarRelacionado(true);

				this.transferenciaBeanSwingJInternalFrame=new TransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.transferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transferenciaBeanSwingJInternalFrame.settransferenciaSessionBean(this.transferenciaSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.transferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Transferencias",this.transferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.transferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transferenciaSessionBean.setEsGuardarRelacionado(false);
				this.transferenciaBeanSwingJInternalFrame=null;//new TransferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransferencia) {
					this.jTabbedPaneRelacionesUsuario.add("Transferencias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTurnoPunVen(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
		this.turnopunvenSessionBean.setConGuardarRelaciones(false);
		this.turnopunvenSessionBean.setEsGuardarRelacionado(true);

		this.turnopunvenBeanSwingJInternalFrame=null;//new TurnoPunVenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.turnopunvenBeanSwingJInternalFramePopup=new TurnoPunVenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.turnopunvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {

				TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.turnopunvenSessionBean.setEsGuardarRelacionado(true);

				this.turnopunvenBeanSwingJInternalFrame=new TurnoPunVenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.turnopunvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.turnopunvenBeanSwingJInternalFrame.setturnopunvenSessionBean(this.turnopunvenSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.turnopunvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Turno Pun Venes",this.turnopunvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.turnopunvenBeanSwingJInternalFrame.getContentPane());
				}

				//TurnoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.turnopunvenSessionBean.setEsGuardarRelacionado(false);
				this.turnopunvenBeanSwingJInternalFrame=null;//new TurnoPunVenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTurnoPunVen) {
					this.jTabbedPaneRelacionesUsuario.add("Turno Pun Venes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		this.usuarioopcionSessionBean.setConGuardarRelaciones(false);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

		this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.usuarioopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {

				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

				this.usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.usuarioopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.usuarioopcionBeanSwingJInternalFrame.setusuarioopcionSessionBean(this.usuarioopcionSessionBean);

				//this.gridBagConstraintsUsuario = new GridBagConstraints();
				//this.gridBagConstraintsUsuario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUsuario.gridx = 0;
				//this.jContentPaneDetalleUsuario.add(this.usuarioopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUsuario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUsuario.add("Usuario Opciones",this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUsuario.setComponentAt(iIndexTab,this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				}

				//UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUsuarioOpcion) {
					this.jTabbedPaneRelacionesUsuario.add("Usuario Opciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDepositoBancoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,DepositoBancoBeanSwingJInternalFrame depositobancoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//depositobancoBeanSwingJInternalFrame=new DepositoBancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					depositobancoBeanSwingJInternalFrame.getDepositoBancoLogic().setConnexion(this.usuarioLogic.getConnexion());

					depositobancoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					depositobancoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					depositobancoBeanSwingJInternalFrame.depositobancoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					depositobancoBeanSwingJInternalFrame.depositobancoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					depositobancoBeanSwingJInternalFrame.cargarCombosForeignKeyDepositoBanco(depositobancoBeanSwingJInternalFrame.isCargarCombosDependencia);
					depositobancoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					depositobancoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						depositobancoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					depositobancoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					depositobancoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					depositobancoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					depositobancoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					depositobancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepositoBanco(true);
					depositobancoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDepositoBanco("n",depositobancoBeanSwingJInternalFrame.isGuardarCambiosEnLote, depositobancoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					depositobancoBeanSwingJInternalFrame.setAutoscrolls(true);
					depositobancoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						depositobancoBeanSwingJInternalFrame.actualizarEstadoPanelsDepositoBanco("relacionado");
					} else {
						depositobancoBeanSwingJInternalFrame.actualizarEstadoPanelsDepositoBanco("no_relacionado");
					}

					depositobancoBeanSwingJInternalFrame.getjButtonRecargarInformacionDepositoBanco().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarHistorialCambioClaveBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,HistorialCambioClaveBeanSwingJInternalFrame historialcambioclaveBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//historialcambioclaveBeanSwingJInternalFrame=new HistorialCambioClaveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					historialcambioclaveBeanSwingJInternalFrame.getHistorialCambioClaveLogic().setConnexion(this.usuarioLogic.getConnexion());

					historialcambioclaveBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					historialcambioclaveBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					historialcambioclaveBeanSwingJInternalFrame.historialcambioclaveSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					historialcambioclaveBeanSwingJInternalFrame.historialcambioclaveSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					historialcambioclaveBeanSwingJInternalFrame.cargarCombosForeignKeyHistorialCambioClave(historialcambioclaveBeanSwingJInternalFrame.isCargarCombosDependencia);
					historialcambioclaveBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					historialcambioclaveBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						historialcambioclaveBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					historialcambioclaveBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					historialcambioclaveBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					historialcambioclaveBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					historialcambioclaveBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					historialcambioclaveBeanSwingJInternalFrame.inicializarActualizarBindingTablaHistorialCambioClave(true);
					historialcambioclaveBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHistorialCambioClave("n",historialcambioclaveBeanSwingJInternalFrame.isGuardarCambiosEnLote, historialcambioclaveBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					historialcambioclaveBeanSwingJInternalFrame.setAutoscrolls(true);
					historialcambioclaveBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						historialcambioclaveBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialCambioClave("relacionado");
					} else {
						historialcambioclaveBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialCambioClave("no_relacionado");
					}

					historialcambioclaveBeanSwingJInternalFrame.getjButtonRecargarInformacionHistorialCambioClave().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriRetencionBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,AutoriRetencionBeanSwingJInternalFrame autoriretencionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoriretencionBeanSwingJInternalFrame=new AutoriRetencionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoriretencionBeanSwingJInternalFrame.getAutoriRetencionLogic().setConnexion(this.usuarioLogic.getConnexion());

					autoriretencionBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					autoriretencionBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					autoriretencionBeanSwingJInternalFrame.autoriretencionSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					autoriretencionBeanSwingJInternalFrame.autoriretencionSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoriretencionBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriRetencion(autoriretencionBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoriretencionBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					autoriretencionBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						autoriretencionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoriretencionBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					autoriretencionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoriretencionBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					autoriretencionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					autoriretencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriRetencion(true);
					autoriretencionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriRetencion("n",autoriretencionBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoriretencionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoriretencionBeanSwingJInternalFrame.setAutoscrolls(true);
					autoriretencionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoriretencionBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriRetencion("relacionado");
					} else {
						autoriretencionBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriRetencion("no_relacionado");
					}

					autoriretencionBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriRetencion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajeroTurnoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajeroturnoBeanSwingJInternalFrame.getCajeroTurnoLogic().setConnexion(this.usuarioLogic.getConnexion());

					cajeroturnoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					cajeroturnoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajeroturnoBeanSwingJInternalFrame.cargarCombosForeignKeyCajeroTurno(cajeroturnoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajeroturnoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					cajeroturnoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						cajeroturnoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajeroturnoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					cajeroturnoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajeroturnoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					cajeroturnoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(true);
					cajeroturnoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajeroTurno("n",cajeroturnoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajeroturnoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajeroturnoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajeroturnoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("relacionado");
					} else {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("no_relacionado");
					}

					cajeroturnoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajeroTurno().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleLiquidacionImporBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleliquidacionimporBeanSwingJInternalFrame.getDetalleLiquidacionImporLogic().setConnexion(this.usuarioLogic.getConnexion());

					detalleliquidacionimporBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					detalleliquidacionimporBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleliquidacionimporBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleLiquidacionImpor(detalleliquidacionimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleliquidacionimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					detalleliquidacionimporBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						detalleliquidacionimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleliquidacionimporBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					detalleliquidacionimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleliquidacionimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					detalleliquidacionimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					detalleliquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpor(true);
					detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n",detalleliquidacionimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleliquidacionimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleliquidacionimporBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleliquidacionimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpor("relacionado");
					} else {
						detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpor("no_relacionado");
					}

					detalleliquidacionimporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleLiquidacionImpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoSoliBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditosoliBeanSwingJInternalFrame.getNotaCreditoSoliLogic().setConnexion(this.usuarioLogic.getConnexion());

					notacreditosoliBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					notacreditosoliBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoSoli(notacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					notacreditosoliBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						notacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					notacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					notacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoSoli("n",notacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("relacionado");
					} else {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");
					}

					notacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoSoli().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoExporBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.usuarioLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					pedidoexporBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					pedidoexporBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoExpor("n",pedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("relacionado");
					} else {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");
					}

					pedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoExpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDescuentoTipoPrecioBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//descuentotipoprecioBeanSwingJInternalFrame=new DescuentoTipoPrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					descuentotipoprecioBeanSwingJInternalFrame.getDescuentoTipoPrecioLogic().setConnexion(this.usuarioLogic.getConnexion());

					descuentotipoprecioBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					descuentotipoprecioBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					descuentotipoprecioBeanSwingJInternalFrame.descuentotipoprecioSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					descuentotipoprecioBeanSwingJInternalFrame.descuentotipoprecioSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					descuentotipoprecioBeanSwingJInternalFrame.cargarCombosForeignKeyDescuentoTipoPrecio(descuentotipoprecioBeanSwingJInternalFrame.isCargarCombosDependencia);
					descuentotipoprecioBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					descuentotipoprecioBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						descuentotipoprecioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					descuentotipoprecioBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					descuentotipoprecioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					descuentotipoprecioBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					descuentotipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					descuentotipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDescuentoTipoPrecio(true);
					descuentotipoprecioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n",descuentotipoprecioBeanSwingJInternalFrame.isGuardarCambiosEnLote, descuentotipoprecioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					descuentotipoprecioBeanSwingJInternalFrame.setAutoscrolls(true);
					descuentotipoprecioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						descuentotipoprecioBeanSwingJInternalFrame.actualizarEstadoPanelsDescuentoTipoPrecio("relacionado");
					} else {
						descuentotipoprecioBeanSwingJInternalFrame.actualizarEstadoPanelsDescuentoTipoPrecio("no_relacionado");
					}

					descuentotipoprecioBeanSwingJInternalFrame.getjButtonRecargarInformacionDescuentoTipoPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGuiaRemisionBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					guiaremisionBeanSwingJInternalFrame.getGuiaRemisionLogic().setConnexion(this.usuarioLogic.getConnexion());

					guiaremisionBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					guiaremisionBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					guiaremisionBeanSwingJInternalFrame.cargarCombosForeignKeyGuiaRemision(guiaremisionBeanSwingJInternalFrame.isCargarCombosDependencia);
					guiaremisionBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					guiaremisionBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						guiaremisionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					guiaremisionBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					guiaremisionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					guiaremisionBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					guiaremisionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					guiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGuiaRemision(true);
					guiaremisionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGuiaRemision("n",guiaremisionBeanSwingJInternalFrame.isGuardarCambiosEnLote, guiaremisionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					guiaremisionBeanSwingJInternalFrame.setAutoscrolls(true);
					guiaremisionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("relacionado");
					} else {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("no_relacionado");
					}

					guiaremisionBeanSwingJInternalFrame.getjButtonRecargarInformacionGuiaRemision().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoPuntoVentaBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidopuntoventaBeanSwingJInternalFrame.getPedidoPuntoVentaLogic().setConnexion(this.usuarioLogic.getConnexion());

					pedidopuntoventaBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					pedidopuntoventaBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					pedidopuntoventaBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						pedidopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					pedidopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					pedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta(true);
					pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoPuntoVenta("n",pedidopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("relacionado");
					} else {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("no_relacionado");
					}

					pedidopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGastoEmpleadoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					gastoempleadoBeanSwingJInternalFrame.getGastoEmpleadoLogic().setConnexion(this.usuarioLogic.getConnexion());

					gastoempleadoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					gastoempleadoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					gastoempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyGastoEmpleado(gastoempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					gastoempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					gastoempleadoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						gastoempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					gastoempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					gastoempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					gastoempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					gastoempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					gastoempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGastoEmpleado("n",gastoempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, gastoempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					gastoempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					gastoempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("relacionado");
					} else {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("no_relacionado");
					}

					gastoempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionGastoEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSecuencialUsuarioBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,SecuencialUsuarioBeanSwingJInternalFrame secuencialusuarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//secuencialusuarioBeanSwingJInternalFrame=new SecuencialUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					secuencialusuarioBeanSwingJInternalFrame.getSecuencialUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					secuencialusuarioBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					secuencialusuarioBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					secuencialusuarioBeanSwingJInternalFrame.secuencialusuarioSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					secuencialusuarioBeanSwingJInternalFrame.secuencialusuarioSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					secuencialusuarioBeanSwingJInternalFrame.cargarCombosForeignKeySecuencialUsuario(secuencialusuarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					secuencialusuarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					secuencialusuarioBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						secuencialusuarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					secuencialusuarioBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					secuencialusuarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					secuencialusuarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					secuencialusuarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					secuencialusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaSecuencialUsuario(true);
					secuencialusuarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSecuencialUsuario("n",secuencialusuarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, secuencialusuarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					secuencialusuarioBeanSwingJInternalFrame.setAutoscrolls(true);
					secuencialusuarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						secuencialusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsSecuencialUsuario("relacionado");
					} else {
						secuencialusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsSecuencialUsuario("no_relacionado");
					}

					secuencialusuarioBeanSwingJInternalFrame.getjButtonRecargarInformacionSecuencialUsuario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMovimientoActivoFijoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//movimientoactivofijoBeanSwingJInternalFrame=new MovimientoActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					movimientoactivofijoBeanSwingJInternalFrame.getMovimientoActivoFijoLogic().setConnexion(this.usuarioLogic.getConnexion());

					movimientoactivofijoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					movimientoactivofijoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					movimientoactivofijoBeanSwingJInternalFrame.movimientoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					movimientoactivofijoBeanSwingJInternalFrame.movimientoactivofijoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					movimientoactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyMovimientoActivoFijo(movimientoactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					movimientoactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					movimientoactivofijoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						movimientoactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					movimientoactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					movimientoactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					movimientoactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					movimientoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					movimientoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMovimientoActivoFijo(true);
					movimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMovimientoActivoFijo("n",movimientoactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, movimientoactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					movimientoactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					movimientoactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						movimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoActivoFijo("relacionado");
					} else {
						movimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoActivoFijo("no_relacionado");
					}

					movimientoactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionMovimientoActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarUsuarioOpcionBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					usuarioopcionBeanSwingJInternalFrame.getUsuarioOpcionLogic().setConnexion(this.usuarioLogic.getConnexion());

					usuarioopcionBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					usuarioopcionBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					usuarioopcionBeanSwingJInternalFrame.cargarCombosForeignKeyUsuarioOpcion(usuarioopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					usuarioopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					usuarioopcionBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						usuarioopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					usuarioopcionBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					usuarioopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					usuarioopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					usuarioopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUsuarioOpcion("n",usuarioopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, usuarioopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					usuarioopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					usuarioopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("relacionado");
					} else {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");
					}

					usuarioopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionUsuarioOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoCompraImporBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidocompraimporBeanSwingJInternalFrame.getPedidoCompraImporLogic().setConnexion(this.usuarioLogic.getConnexion());

					pedidocompraimporBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					pedidocompraimporBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidocompraimporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoCompraImpor(pedidocompraimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidocompraimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					pedidocompraimporBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						pedidocompraimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidocompraimporBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					pedidocompraimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidocompraimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					pedidocompraimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor(true);
					pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoCompraImpor("n",pedidocompraimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidocompraimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidocompraimporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidocompraimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompraImpor("relacionado");
					} else {
						pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompraImpor("no_relacionado");
					}

					pedidocompraimporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoCompraImpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarOrdenCompraBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ordencompraBeanSwingJInternalFrame.getOrdenCompraLogic().setConnexion(this.usuarioLogic.getConnexion());

					ordencompraBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					ordencompraBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyOrdenCompra(ordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					ordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					ordencompraBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						ordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					ordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					ordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					ordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenCompra(true);
					ordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOrdenCompra("n",ordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, ordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					ordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenCompra("relacionado");
					} else {
						ordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenCompra("no_relacionado");
					}

					ordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionOrdenCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTurnoPunVenBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//turnopunvenBeanSwingJInternalFrame=new TurnoPunVenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					turnopunvenBeanSwingJInternalFrame.getTurnoPunVenLogic().setConnexion(this.usuarioLogic.getConnexion());

					turnopunvenBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					turnopunvenBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					turnopunvenBeanSwingJInternalFrame.turnopunvenSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					turnopunvenBeanSwingJInternalFrame.turnopunvenSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					turnopunvenBeanSwingJInternalFrame.cargarCombosForeignKeyTurnoPunVen(turnopunvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					turnopunvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					turnopunvenBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						turnopunvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					turnopunvenBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					turnopunvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					turnopunvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					turnopunvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					turnopunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTurnoPunVen(true);
					turnopunvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTurnoPunVen("n",turnopunvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, turnopunvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					turnopunvenBeanSwingJInternalFrame.setAutoscrolls(true);
					turnopunvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						turnopunvenBeanSwingJInternalFrame.actualizarEstadoPanelsTurnoPunVen("relacionado");
					} else {
						turnopunvenBeanSwingJInternalFrame.actualizarEstadoPanelsTurnoPunVen("no_relacionado");
					}

					turnopunvenBeanSwingJInternalFrame.getjButtonRecargarInformacionTurnoPunVen().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNovedadBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadBeanSwingJInternalFrame.getNovedadLogic().setConnexion(this.usuarioLogic.getConnexion());

					novedadBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					novedadBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					novedadBeanSwingJInternalFrame.novedadSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					novedadBeanSwingJInternalFrame.novedadSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadBeanSwingJInternalFrame.cargarCombosForeignKeyNovedad(novedadBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					novedadBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						novedadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					novedadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					novedadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					novedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedad(true);
					novedadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedad("n",novedadBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadBeanSwingJInternalFrame.actualizarEstadoPanelsNovedad("relacionado");
					} else {
						novedadBeanSwingJInternalFrame.actualizarEstadoPanelsNovedad("no_relacionado");
					}

					novedadBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedad().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroGeneralUsuarioBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,ParametroGeneralUsuarioBeanSwingJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrogeneralusuarioBeanSwingJInternalFrame=new ParametroGeneralUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrogeneralusuarioBeanSwingJInternalFrame.getParametroGeneralUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					parametrogeneralusuarioBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					parametrogeneralusuarioBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					parametrogeneralusuarioBeanSwingJInternalFrame.parametrogeneralusuarioSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					parametrogeneralusuarioBeanSwingJInternalFrame.parametrogeneralusuarioSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrogeneralusuarioBeanSwingJInternalFrame.cargarCombosForeignKeyParametroGeneralUsuario(parametrogeneralusuarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrogeneralusuarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					parametrogeneralusuarioBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						parametrogeneralusuarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrogeneralusuarioBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					parametrogeneralusuarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrogeneralusuarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					parametrogeneralusuarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					parametrogeneralusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroGeneralUsuario(true);
					parametrogeneralusuarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroGeneralUsuario("n",parametrogeneralusuarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrogeneralusuarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrogeneralusuarioBeanSwingJInternalFrame.inicializarActualizarBindingParametroGeneralUsuario(false);
					parametrogeneralusuarioBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrogeneralusuarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrogeneralusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsParametroGeneralUsuario("relacionado");
					} else {
						parametrogeneralusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsParametroGeneralUsuario("no_relacionado");
					}

					parametrogeneralusuarioBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroGeneralUsuario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriPagoOrdenCompraBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoripagoordencompraBeanSwingJInternalFrame=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoripagoordencompraBeanSwingJInternalFrame.getAutoriPagoOrdenCompraLogic().setConnexion(this.usuarioLogic.getConnexion());

					autoripagoordencompraBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					autoripagoordencompraBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					autoripagoordencompraBeanSwingJInternalFrame.autoripagoordencompraSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					autoripagoordencompraBeanSwingJInternalFrame.autoripagoordencompraSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoripagoordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriPagoOrdenCompra(autoripagoordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoripagoordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					autoripagoordencompraBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						autoripagoordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoripagoordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					autoripagoordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoripagoordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					autoripagoordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					autoripagoordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPagoOrdenCompra(true);
					autoripagoordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriPagoOrdenCompra("n",autoripagoordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoripagoordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoripagoordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					autoripagoordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoripagoordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPagoOrdenCompra("relacionado");
					} else {
						autoripagoordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPagoOrdenCompra("no_relacionado");
					}

					autoripagoordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriPagoOrdenCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCierreCajaBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cierrecajaBeanSwingJInternalFrame=new CierreCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cierrecajaBeanSwingJInternalFrame.getCierreCajaLogic().setConnexion(this.usuarioLogic.getConnexion());

					cierrecajaBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					cierrecajaBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					cierrecajaBeanSwingJInternalFrame.cierrecajaSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					cierrecajaBeanSwingJInternalFrame.cierrecajaSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cierrecajaBeanSwingJInternalFrame.cargarCombosForeignKeyCierreCaja(cierrecajaBeanSwingJInternalFrame.isCargarCombosDependencia);
					cierrecajaBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					cierrecajaBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						cierrecajaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cierrecajaBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					cierrecajaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cierrecajaBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					cierrecajaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					cierrecajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCierreCaja(true);
					cierrecajaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCierreCaja("n",cierrecajaBeanSwingJInternalFrame.isGuardarCambiosEnLote, cierrecajaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cierrecajaBeanSwingJInternalFrame.setAutoscrolls(true);
					cierrecajaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cierrecajaBeanSwingJInternalFrame.actualizarEstadoPanelsCierreCaja("relacionado");
					} else {
						cierrecajaBeanSwingJInternalFrame.actualizarEstadoPanelsCierreCaja("no_relacionado");
					}

					cierrecajaBeanSwingJInternalFrame.getjButtonRecargarInformacionCierreCaja().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDescuentoMontoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,DescuentoMontoBeanSwingJInternalFrame descuentomontoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//descuentomontoBeanSwingJInternalFrame=new DescuentoMontoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					descuentomontoBeanSwingJInternalFrame.getDescuentoMontoLogic().setConnexion(this.usuarioLogic.getConnexion());

					descuentomontoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					descuentomontoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					descuentomontoBeanSwingJInternalFrame.descuentomontoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					descuentomontoBeanSwingJInternalFrame.descuentomontoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					descuentomontoBeanSwingJInternalFrame.cargarCombosForeignKeyDescuentoMonto(descuentomontoBeanSwingJInternalFrame.isCargarCombosDependencia);
					descuentomontoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					descuentomontoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						descuentomontoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					descuentomontoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					descuentomontoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					descuentomontoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					descuentomontoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					descuentomontoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDescuentoMonto(true);
					descuentomontoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDescuentoMonto("n",descuentomontoBeanSwingJInternalFrame.isGuardarCambiosEnLote, descuentomontoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					descuentomontoBeanSwingJInternalFrame.setAutoscrolls(true);
					descuentomontoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						descuentomontoBeanSwingJInternalFrame.actualizarEstadoPanelsDescuentoMonto("relacionado");
					} else {
						descuentomontoBeanSwingJInternalFrame.actualizarEstadoPanelsDescuentoMonto("no_relacionado");
					}

					descuentomontoBeanSwingJInternalFrame.getjButtonRecargarInformacionDescuentoMonto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajaEgresoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaegresoBeanSwingJInternalFrame.getCajaEgresoLogic().setConnexion(this.usuarioLogic.getConnexion());

					cajaegresoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					cajaegresoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaegresoBeanSwingJInternalFrame.cargarCombosForeignKeyCajaEgreso(cajaegresoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaegresoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					cajaegresoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						cajaegresoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaegresoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					cajaegresoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaegresoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					cajaegresoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					cajaegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgreso(true);
					cajaegresoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaEgreso("n",cajaegresoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaegresoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaegresoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaegresoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("relacionado");
					} else {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("no_relacionado");
					}

					cajaegresoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaEgreso().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRequisicionCompraBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//requisicioncompraBeanSwingJInternalFrame=new RequisicionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					requisicioncompraBeanSwingJInternalFrame.getRequisicionCompraLogic().setConnexion(this.usuarioLogic.getConnexion());

					requisicioncompraBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					requisicioncompraBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					requisicioncompraBeanSwingJInternalFrame.cargarCombosForeignKeyRequisicionCompra(requisicioncompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					requisicioncompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					requisicioncompraBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						requisicioncompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					requisicioncompraBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					requisicioncompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					requisicioncompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					requisicioncompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					requisicioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaRequisicionCompra(true);
					requisicioncompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRequisicionCompra("n",requisicioncompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, requisicioncompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					requisicioncompraBeanSwingJInternalFrame.setAutoscrolls(true);
					requisicioncompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						requisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsRequisicionCompra("relacionado");
					} else {
						requisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsRequisicionCompra("no_relacionado");
					}

					requisicioncompraBeanSwingJInternalFrame.getjButtonRecargarInformacionRequisicionCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().setConnexion(this.usuarioLogic.getConnexion());

					notacreditopuntoventaBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					notacreditopuntoventaBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoPuntoVenta(notacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						notacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					notacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					notacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoPuntoVenta("n",notacreditopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("relacionado");
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");
					}

					notacreditopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPlaneacionCompraBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//planeacioncompraBeanSwingJInternalFrame=new PlaneacionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					planeacioncompraBeanSwingJInternalFrame.getPlaneacionCompraLogic().setConnexion(this.usuarioLogic.getConnexion());

					planeacioncompraBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					planeacioncompraBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					planeacioncompraBeanSwingJInternalFrame.planeacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					planeacioncompraBeanSwingJInternalFrame.planeacioncompraSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					planeacioncompraBeanSwingJInternalFrame.cargarCombosForeignKeyPlaneacionCompra(planeacioncompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					planeacioncompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					planeacioncompraBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						planeacioncompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					planeacioncompraBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					planeacioncompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					planeacioncompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					planeacioncompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					planeacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPlaneacionCompra(true);
					planeacioncompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPlaneacionCompra("n",planeacioncompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, planeacioncompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					planeacioncompraBeanSwingJInternalFrame.setAutoscrolls(true);
					planeacioncompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						planeacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsPlaneacionCompra("relacionado");
					} else {
						planeacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsPlaneacionCompra("no_relacionado");
					}

					planeacioncompraBeanSwingJInternalFrame.getjButtonRecargarInformacionPlaneacionCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoCompraBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidocompraBeanSwingJInternalFrame=new PedidoCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidocompraBeanSwingJInternalFrame.getPedidoCompraLogic().setConnexion(this.usuarioLogic.getConnexion());

					pedidocompraBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					pedidocompraBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					pedidocompraBeanSwingJInternalFrame.pedidocompraSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					pedidocompraBeanSwingJInternalFrame.pedidocompraSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidocompraBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoCompra(pedidocompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidocompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					pedidocompraBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						pedidocompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidocompraBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					pedidocompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidocompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					pedidocompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					pedidocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompra(true);
					pedidocompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoCompra("n",pedidocompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidocompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidocompraBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidocompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidocompraBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompra("relacionado");
					} else {
						pedidocompraBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompra("no_relacionado");
					}

					pedidocompraBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPerfilUsuarioBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilusuarioBeanSwingJInternalFrame=new PerfilUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilusuarioBeanSwingJInternalFrame.getPerfilUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					perfilusuarioBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					perfilusuarioBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilusuarioBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilUsuario(perfilusuarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilusuarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					perfilusuarioBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						perfilusuarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilusuarioBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					perfilusuarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilusuarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					perfilusuarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					perfilusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilUsuario(true);
					perfilusuarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilUsuario("n",perfilusuarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilusuarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilusuarioBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilusuarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilUsuario("relacionado");
					} else {
						perfilusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilUsuario("no_relacionado");
					}

					perfilusuarioBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilUsuario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConsignatarioBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignatarioBeanSwingJInternalFrame=new ConsignatarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignatarioBeanSwingJInternalFrame.getConsignatarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					consignatarioBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					consignatarioBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					consignatarioBeanSwingJInternalFrame.consignatarioSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					consignatarioBeanSwingJInternalFrame.consignatarioSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignatarioBeanSwingJInternalFrame.cargarCombosForeignKeyConsignatario(consignatarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignatarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					consignatarioBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						consignatarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignatarioBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					consignatarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignatarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					consignatarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					consignatarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignatario(true);
					consignatarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignatario("n",consignatarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignatarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignatarioBeanSwingJInternalFrame.setAutoscrolls(true);
					consignatarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignatarioBeanSwingJInternalFrame.actualizarEstadoPanelsConsignatario("relacionado");
					} else {
						consignatarioBeanSwingJInternalFrame.actualizarEstadoPanelsConsignatario("no_relacionado");
					}

					consignatarioBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignatario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTransferenciaBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transferenciaBeanSwingJInternalFrame=new TransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transferenciaBeanSwingJInternalFrame.getTransferenciaLogic().setConnexion(this.usuarioLogic.getConnexion());

					transferenciaBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					transferenciaBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyTransferencia(transferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					transferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					transferenciaBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						transferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transferenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					transferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					transferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					transferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransferencia(true);
					transferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransferencia("n",transferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, transferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					transferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTransferencia("relacionado");
					} else {
						transferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTransferencia("no_relacionado");
					}

					transferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionTransferencia().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoGeneralUsuarioBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,DatoGeneralUsuarioBeanSwingJInternalFrame datogeneralusuarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralusuarioBeanSwingJInternalFrame=new DatoGeneralUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralusuarioBeanSwingJInternalFrame.getDatoGeneralUsuarioLogic().setConnexion(this.usuarioLogic.getConnexion());

					datogeneralusuarioBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					datogeneralusuarioBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					datogeneralusuarioBeanSwingJInternalFrame.datogeneralusuarioSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					datogeneralusuarioBeanSwingJInternalFrame.datogeneralusuarioSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralusuarioBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralUsuario(datogeneralusuarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralusuarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					datogeneralusuarioBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralusuarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralusuarioBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					datogeneralusuarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralusuarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					datogeneralusuarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					datogeneralusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralUsuario(true);
					datogeneralusuarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n",datogeneralusuarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralusuarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralusuarioBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralUsuario(false);
					datogeneralusuarioBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralusuarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralUsuario("relacionado");
					} else {
						datogeneralusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralUsuario("no_relacionado");
					}

					datogeneralusuarioBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralUsuario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajaIngresoBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaingresoBeanSwingJInternalFrame.getCajaIngresoLogic().setConnexion(this.usuarioLogic.getConnexion());

					cajaingresoBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					cajaingresoBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaingresoBeanSwingJInternalFrame.cargarCombosForeignKeyCajaIngreso(cajaingresoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaingresoBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					cajaingresoBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						cajaingresoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaingresoBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					cajaingresoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaingresoBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					cajaingresoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					cajaingresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngreso(true);
					cajaingresoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaIngreso("n",cajaingresoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaingresoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaingresoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaingresoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("relacionado");
					} else {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("no_relacionado");
					}

					cajaingresoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaIngreso().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteCoaBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,ClienteCoaBeanSwingJInternalFrame clientecoaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clientecoaBeanSwingJInternalFrame=new ClienteCoaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clientecoaBeanSwingJInternalFrame.getClienteCoaLogic().setConnexion(this.usuarioLogic.getConnexion());

					clientecoaBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					clientecoaBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					clientecoaBeanSwingJInternalFrame.clientecoaSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					clientecoaBeanSwingJInternalFrame.clientecoaSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clientecoaBeanSwingJInternalFrame.cargarCombosForeignKeyClienteCoa(clientecoaBeanSwingJInternalFrame.isCargarCombosDependencia);
					clientecoaBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					clientecoaBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						clientecoaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clientecoaBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					clientecoaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clientecoaBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					clientecoaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					clientecoaBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteCoa(true);
					clientecoaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesClienteCoa("n",clientecoaBeanSwingJInternalFrame.isGuardarCambiosEnLote, clientecoaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clientecoaBeanSwingJInternalFrame.setAutoscrolls(true);
					clientecoaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clientecoaBeanSwingJInternalFrame.actualizarEstadoPanelsClienteCoa("relacionado");
					} else {
						clientecoaBeanSwingJInternalFrame.actualizarEstadoPanelsClienteCoa("no_relacionado");
					}

					clientecoaBeanSwingJInternalFrame.getjButtonRecargarInformacionClienteCoa().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConsignacionBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignacionBeanSwingJInternalFrame.getConsignacionLogic().setConnexion(this.usuarioLogic.getConnexion());

					consignacionBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					consignacionBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignacionBeanSwingJInternalFrame.cargarCombosForeignKeyConsignacion(consignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					consignacionBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						consignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					consignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					consignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(true);
					consignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignacion("n",consignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					consignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("relacionado");
					} else {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");
					}

					consignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleMensajeCorreoInvenBeanSwingJInternalFrame(List<Usuario> usuarios,Usuario usuario,DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemensajecorreoinvenBeanSwingJInternalFrame=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemensajecorreoinvenBeanSwingJInternalFrame.getDetalleMensajeCorreoInvenLogic().setConnexion(this.usuarioLogic.getConnexion());

					detallemensajecorreoinvenBeanSwingJInternalFrame.setusuariosForeignKey(usuarios);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setusuarioForeignKey(usuario);
					detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionUsuario(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setlidUsuarioActual(usuario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemensajecorreoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMensajeCorreoInven(detallemensajecorreoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaUsuario(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setid_usuarioFK_IdUsuario(usuario.getId());

					if(!this.conCargarFormDetalle) {
						detallemensajecorreoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemensajecorreoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameUsuarioForeignKey(usuario,1,false,true,true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemensajecorreoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdUsuario");
					detallemensajecorreoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUsuario");
					detallemensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n",detallemensajecorreoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemensajecorreoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemensajecorreoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMensajeCorreoInven("relacionado");
					} else {
						detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMensajeCorreoInven("no_relacionado");
					}

					detallemensajecorreoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMensajeCorreoInven().setVisible(false);

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
