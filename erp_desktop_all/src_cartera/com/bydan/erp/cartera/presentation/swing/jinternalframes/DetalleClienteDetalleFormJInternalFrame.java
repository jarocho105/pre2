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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.DetalleClienteConstantesFunciones;

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
public class DetalleClienteDetalleFormJInternalFrame extends DetalleClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleCliente;
	
	protected JMenuBar jmenuBarDetalleDetalleCliente;
	
	protected JMenu jmenuDetalleDetalleCliente;
	protected JMenu jmenuDetalleArchivoDetalleCliente;
	protected JMenu jmenuDetalleAccionesDetalleCliente;
	protected JMenu jmenuDetalleDatosDetalleCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCliente;	
	protected GridBagConstraints gridBagConstraintsDetalleCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleCliente;		
	
	
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

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected SucursalBeanSwingJInternalFrame sucursalmovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmovimiento="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected EstadoDetalleClienteBeanSwingJInternalFrame estadodetalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallecliente="";
	
	public DetalleClienteSessionBean detalleclienteSessionBean;
	
	

	public DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFrame=null;
	public DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleRecap=false;
	public DetalleRecapSessionBean detallerecapSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public SucursalSessionBean sucursalmovimientoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;	
	
	public DetalleClienteLogic detalleclienteLogic;
	
	public JScrollPane jScrollPanelDatosDetalleCliente;
	public JScrollPane jScrollPanelDatosEdicionDetalleCliente;
	public JScrollPane jScrollPanelDatosGeneralDetalleCliente;
	
	protected JPanel jPanelCamposDetalleCliente;    
	protected JPanel jPanelCamposOcultosDetalleCliente;    	
	protected JPanel jPanelAccionesDetalleCliente;
	protected JPanel jPanelAccionesFormularioDetalleCliente;
    
	
	
	protected Integer iXPanelCamposDetalleCliente=0;
	protected Integer iYPanelCamposDetalleCliente=0;
	
	protected Integer iXPanelCamposOcultosDetalleCliente=0;
	protected Integer iYPanelCamposOcultosDetalleCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleCliente;
	public JButton jButtonModificarDetalleCliente;
	public JButton jButtonActualizarDetalleCliente;
    public JButton jButtonEliminarDetalleCliente;
	public JButton jButtonCancelarDetalleCliente;
    public JButton jButtonGuardarCambiosDetalleCliente;
	public JButton jButtonGuardarCambiosTablaDetalleCliente;
	protected JButton jButtonCerrarDetalleCliente;
	
	
	protected JButton jButtonProcesarInformacionDetalleCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCliente;
	protected JButton jButtonModificarToolBarDetalleCliente;
	protected JButton jButtonActualizarToolBarDetalleCliente;
    protected JButton jButtonEliminarToolBarDetalleCliente;
	protected JButton jButtonCancelarToolBarDetalleCliente;
    protected JButton jButtonGuardarCambiosToolBarDetalleCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCliente;
	protected JButton jButtonCerrarToolBarDetalleCliente;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCliente;
	protected JMenuItem jMenuItemModificarDetalleCliente;
	protected JMenuItem jMenuItemActualizarDetalleCliente;
    protected JMenuItem jMenuItemEliminarDetalleCliente;
	protected JMenuItem jMenuItemCancelarDetalleCliente;
    protected JMenuItem jMenuItemGuardarCambiosDetalleCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCliente;
	protected JMenuItem jMenuItemCerrarDetalleCliente;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCliente;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleCliente;
	public JLabel jLabelIdDetalleCliente;
	public JLabel jLabelidDetalleCliente;
	public JButton jButtonidDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaDetalleCliente;
	public JLabel jLabelnumero_facturaDetalleCliente;
	public JTextField jTextFieldnumero_facturaDetalleCliente;
	public JButton jButtonnumero_facturaDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceDetalleCliente;
	public JLabel jLabelfecha_venceDetalleCliente;
	//public JFormattedTextField jDateChooserfecha_venceDetalleCliente;

	public JDateChooser jDateChooserfecha_venceDetalleCliente;
	public JButton jButtonfecha_venceDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleCliente;
	public JLabel jLabeldescripcionDetalleCliente;
	public JTextArea jTextAreadescripcionDetalleCliente;
	public JScrollPane jscrollPanedescripcionDetalleCliente;
	public JButton jButtondescripcionDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localDetalleCliente;
	public JLabel jLabeldebito_mone_localDetalleCliente;
	public JTextField jTextFielddebito_mone_localDetalleCliente;
	public JButton jButtondebito_mone_localDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localDetalleCliente;
	public JLabel jLabelcredito_mone_localDetalleCliente;
	public JTextField jTextFieldcredito_mone_localDetalleCliente;
	public JButton jButtoncredito_mone_localDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraDetalleCliente;
	public JLabel jLabeldebito_mone_extraDetalleCliente;
	public JTextField jTextFielddebito_mone_extraDetalleCliente;
	public JButton jButtondebito_mone_extraDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_extraDetalleCliente;
	public JLabel jLabelcredito_mone_extraDetalleCliente;
	public JTextField jTextFieldcredito_mone_extraDetalleCliente;
	public JButton jButtoncredito_mone_extraDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionDetalleCliente;
	public JLabel jLabelcotizacionDetalleCliente;
	public JTextField jTextFieldcotizacionDetalleCliente;
	public JButton jButtoncotizacionDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDetalleCliente;
	public JLabel jLabelfecha_emisionDetalleCliente;
	//public JFormattedTextField jDateChooserfecha_emisionDetalleCliente;

	public JDateChooser jDateChooserfecha_emisionDetalleCliente;
	public JButton jButtonfecha_emisionDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioDetalleCliente;
	public JLabel jLabelbeneficiarioDetalleCliente;
	public JTextArea jTextAreabeneficiarioDetalleCliente;
	public JScrollPane jscrollPanebeneficiarioDetalleCliente;
	public JButton jButtonbeneficiarioDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_localDetalleCliente;
	public JLabel jLabelmonto_mone_localDetalleCliente;
	public JTextField jTextFieldmonto_mone_localDetalleCliente;
	public JButton jButtonmonto_mone_localDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_extraDetalleCliente;
	public JLabel jLabelmonto_mone_extraDetalleCliente;
	public JTextField jTextFieldmonto_mone_extraDetalleCliente;
	public JButton jButtonmonto_mone_extraDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleCliente;
	public JLabel jLabelnumero_comprobanteDetalleCliente;
	public JTextField jTextFieldnumero_comprobanteDetalleCliente;
	public JButton jButtonnumero_comprobanteDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleCliente;
	public JLabel jLabelid_empresaDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleCliente;
	public JButton jButtonid_empresaDetalleCliente= new JButtonMe();
	public JButton jButtonid_empresaDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleCliente;
	public JLabel jLabelid_sucursalDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleCliente;
	public JButton jButtonid_sucursalDetalleCliente= new JButtonMe();
	public JButton jButtonid_sucursalDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleCliente;
	public JLabel jLabelid_ejercicioDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleCliente;
	public JButton jButtonid_ejercicioDetalleCliente= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleCliente;
	public JLabel jLabelid_periodoDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleCliente;
	public JButton jButtonid_periodoDetalleCliente= new JButtonMe();
	public JButton jButtonid_periodoDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleCliente;
	public JLabel jLabelid_anioDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleCliente;
	public JButton jButtonid_anioDetalleCliente= new JButtonMe();
	public JButton jButtonid_anioDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleCliente;
	public JLabel jLabelid_mesDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleCliente;
	public JButton jButtonid_mesDetalleCliente= new JButtonMe();
	public JButton jButtonid_mesDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDetalleCliente;
	public JLabel jLabelid_moduloDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDetalleCliente;
	public JButton jButtonid_moduloDetalleCliente= new JButtonMe();
	public JButton jButtonid_moduloDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_moduloDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetalleCliente;
	public JLabel jLabelid_asiento_contableDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetalleCliente;
	public JButton jButtonid_asiento_contableDetalleCliente= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDetalleCliente;
	public JLabel jLabelid_clienteDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDetalleCliente;
	public JButton jButtonid_clienteDetalleCliente= new JButtonMe();
	public JButton jButtonid_clienteDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionDetalleCliente;
	public JLabel jLabelid_transaccionDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionDetalleCliente;
	public JButton jButtonid_transaccionDetalleCliente= new JButtonMe();
	public JButton jButtonid_transaccionDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccionDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaDetalleCliente;
	public JLabel jLabelid_facturaDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaDetalleCliente;
	public JButton jButtonid_facturaDetalleCliente= new JButtonMe();
	public JButton jButtonid_facturaDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_facturaDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaDetalleCliente;
	public JLabel jLabelid_monedaDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaDetalleCliente;
	public JButton jButtonid_monedaDetalleCliente= new JButtonMe();
	public JButton jButtonid_monedaDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_monedaDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_movimientoDetalleCliente;
	public JLabel jLabelid_sucursal_movimientoDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_movimientoDetalleCliente;
	public JButton jButtonid_sucursal_movimientoDetalleCliente= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloDetalleCliente;
	public JLabel jLabelid_tipo_transaccion_moduloDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloDetalleCliente;
	public JButton jButtonid_tipo_transaccion_moduloDetalleCliente= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_clienteDetalleCliente;
	public JLabel jLabelid_estado_detalle_clienteDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_clienteDetalleCliente;
	public JButton jButtonid_estado_detalle_clienteDetalleCliente= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteDetalleClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleCliente;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleCliente=new JPanel();
				this.jPanelAccionesFormularioDetalleCliente=new JPanel();
				this.jmenuBarDetalleDetalleCliente=new JMenuBar();
				this.jTtoolBarDetalleDetalleCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleCliente() {
		return this.jButtonActualizarToolBarDetalleCliente;
	}
	
	public JButton getjButtonEliminarToolBarDetalleCliente() {
		return this.jButtonEliminarToolBarDetalleCliente;
	}
	
	public JButton getjButtonCancelarToolBarDetalleCliente() {
		return this.jButtonCancelarToolBarDetalleCliente;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleCliente() {
		return this.jButtonProcesarInformacionDetalleCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCliente)	{
		this.jButtonProcesarInformacionDetalleCliente = jButtonProcesarInformacionDetalleCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCliente() {
		return this.jComboBoxTiposAccionesDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCliente(
			JComboBox jComboBoxTiposRelacionesDetalleCliente) {
		this.jComboBoxTiposRelacionesDetalleCliente = jComboBoxTiposRelacionesDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCliente(
			JComboBox jComboBoxTiposAccionesDetalleCliente) {
		this.jComboBoxTiposAccionesDetalleCliente = jComboBoxTiposAccionesDetalleCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleCliente() {
		return this.jComboBoxTiposAccionesFormularioDetalleCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleCliente(
			JComboBox jComboBoxTiposAccionesFormularioDetalleCliente) {
		this.jComboBoxTiposAccionesFormularioDetalleCliente = jComboBoxTiposAccionesFormularioDetalleCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleclienteSessionBean=new DetalleClienteSessionBean();
		
		this.detalleclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallerecapSessionBean=new DetalleRecapSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleCliente=new JButtonMe();
				this.jButtonModificarToolBarDetalleCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleCliente,this.jTtoolBarDetalleDetalleCliente,
							"actualizar","actualizar","Actualizar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleCliente,this.jTtoolBarDetalleDetalleCliente,
							"eliminar","eliminar","Eliminar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleCliente,this.jTtoolBarDetalleDetalleCliente,
							"cancelar","cancelar","Cancelar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleCliente,this.jTtoolBarDetalleDetalleCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleCliente.add(this.jMenuItemDetalleCerrarDetalleCliente);
		
		this.jmenuDetalleAccionesDetalleCliente.add(this.jMenuItemActualizarDetalleCliente);
		this.jmenuDetalleAccionesDetalleCliente.add(this.jMenuItemEliminarDetalleCliente);
		this.jmenuDetalleAccionesDetalleCliente.add(this.jMenuItemCancelarDetalleCliente);		
		
		//this.jmenuDetalleDatosDetalleCliente.add(this.jMenuItemDetalleAbrirOrderByDetalleCliente);				
		this.jmenuDetalleDatosDetalleCliente.add(this.jMenuItemDetalleMostarOcultarDetalleCliente);				
				
		//this.jmenuDetalleAccionesDetalleCliente.add(this.jMenuItemGuardarCambiosDetalleCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleCliente.add(this.jmenuDetalleArchivoDetalleCliente);		
		this.jmenuBarDetalleDetalleCliente.add(this.jmenuDetalleAccionesDetalleCliente);		
		this.jmenuBarDetalleDetalleCliente.add(this.jmenuDetalleDatosDetalleCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetalleCliente.add(this.jmenuDetalleDetalleCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleCliente);				
	}
	
	
	public void inicializarElementosCamposDetalleCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleCliente = new JLabelMe();
		jLabelIdDetalleCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleCliente= new GridBagLayout();

		this.jPanelidDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);

		jLabelidDetalleCliente = new JLabel();
		jLabelidDetalleCliente.setText("Id");

		jLabelidDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_facturaDetalleCliente = new JLabelMe();
		this.jLabelnumero_facturaDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaDetalleCliente.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelnumero_facturaDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldnumero_facturaDetalleCliente= new JTextFieldMe();

		jTextFieldnumero_facturaDetalleCliente.setEnabled(false);
		jTextFieldnumero_facturaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaDetalleClienteBusqueda= new JButtonMe();
		this.jButtonnumero_facturaDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaDetalleClienteBusqueda.setText("U");
		this.jButtonnumero_facturaDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceDetalleCliente = new JLabelMe();
		this.jLabelfecha_venceDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceDetalleCliente.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelfecha_venceDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		//jFormattedTextFieldfecha_venceDetalleCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_venceDetalleCliente= new JDateChooser();
		jDateChooserfecha_venceDetalleCliente.setEnabled(false);
		jDateChooserfecha_venceDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceDetalleCliente.setDate(new Date());
		jDateChooserfecha_venceDetalleCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceDetalleCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceDetalleClienteBusqueda= new JButtonMe();
		this.jButtonfecha_venceDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceDetalleClienteBusqueda.setText("U");
		this.jButtonfecha_venceDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleCliente = new JLabelMe();
		this.jLabeldescripcionDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPaneldescripcionDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextAreadescripcionDetalleCliente= new JTextAreaMe();
		jTextAreadescripcionDetalleCliente.setEnabled(false);
		jTextAreadescripcionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCliente.setLineWrap(true);
		jTextAreadescripcionDetalleCliente.setWrapStyleWord(true);
		jTextAreadescripcionDetalleCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleCliente = new JScrollPane(jTextAreadescripcionDetalleCliente);
		jscrollPanedescripcionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDetalleClienteBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleClienteBusqueda.setText("U");
		this.jButtondescripcionDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localDetalleCliente = new JLabelMe();
		this.jLabeldebito_mone_localDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localDetalleCliente.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPaneldebito_mone_localDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFielddebito_mone_localDetalleCliente= new JTextFieldMe();
		jTextFielddebito_mone_localDetalleCliente.setEnabled(false);
		jTextFielddebito_mone_localDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localDetalleCliente.setText("0.0");

		this.jButtondebito_mone_localDetalleClienteBusqueda= new JButtonMe();
		this.jButtondebito_mone_localDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localDetalleClienteBusqueda.setText("U");
		this.jButtondebito_mone_localDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localDetalleCliente = new JLabelMe();
		this.jLabelcredito_mone_localDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localDetalleCliente.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelcredito_mone_localDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldcredito_mone_localDetalleCliente= new JTextFieldMe();
		jTextFieldcredito_mone_localDetalleCliente.setEnabled(false);
		jTextFieldcredito_mone_localDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localDetalleCliente.setText("0.0");

		this.jButtoncredito_mone_localDetalleClienteBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localDetalleClienteBusqueda.setText("U");
		this.jButtoncredito_mone_localDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraDetalleCliente = new JLabelMe();
		this.jLabeldebito_mone_extraDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraDetalleCliente.setToolTipText("Debito Mone Extra");
		this.jLabeldebito_mone_extraDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPaneldebito_mone_extraDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFielddebito_mone_extraDetalleCliente= new JTextFieldMe();
		jTextFielddebito_mone_extraDetalleCliente.setEnabled(false);
		jTextFielddebito_mone_extraDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraDetalleCliente.setText("0.0");

		this.jButtondebito_mone_extraDetalleClienteBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraDetalleClienteBusqueda.setText("U");
		this.jButtondebito_mone_extraDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_extraDetalleCliente = new JLabelMe();
		this.jLabelcredito_mone_extraDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_CREDITOMONEEXTRA+" : *");
		this.jLabelcredito_mone_extraDetalleCliente.setToolTipText("Credito Mone Extra");
		this.jLabelcredito_mone_extraDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_extraDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_extraDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_extraDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_extraDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_extraDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelcredito_mone_extraDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldcredito_mone_extraDetalleCliente= new JTextFieldMe();
		jTextFieldcredito_mone_extraDetalleCliente.setEnabled(false);
		jTextFieldcredito_mone_extraDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_extraDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_extraDetalleCliente.setText("0.0");

		this.jButtoncredito_mone_extraDetalleClienteBusqueda= new JButtonMe();
		this.jButtoncredito_mone_extraDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_extraDetalleClienteBusqueda.setText("U");
		this.jButtoncredito_mone_extraDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_extraDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_extraDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_extraDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_extraDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_extraDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_extraDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionDetalleCliente = new JLabelMe();
		this.jLabelcotizacionDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionDetalleCliente.setToolTipText("Cotizacion");
		this.jLabelcotizacionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelcotizacionDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldcotizacionDetalleCliente= new JTextFieldMe();
		jTextFieldcotizacionDetalleCliente.setEnabled(false);
		jTextFieldcotizacionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionDetalleCliente.setText("0.0");

		this.jButtoncotizacionDetalleClienteBusqueda= new JButtonMe();
		this.jButtoncotizacionDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionDetalleClienteBusqueda.setText("U");
		this.jButtoncotizacionDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionDetalleCliente = new JLabelMe();
		this.jLabelfecha_emisionDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDetalleCliente.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelfecha_emisionDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		//jFormattedTextFieldfecha_emisionDetalleCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDetalleCliente= new JDateChooser();
		jDateChooserfecha_emisionDetalleCliente.setEnabled(false);
		jDateChooserfecha_emisionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDetalleCliente.setDate(new Date());
		jDateChooserfecha_emisionDetalleCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDetalleCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDetalleClienteBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDetalleClienteBusqueda.setText("U");
		this.jButtonfecha_emisionDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioDetalleCliente = new JLabelMe();
		this.jLabelbeneficiarioDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioDetalleCliente.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelbeneficiarioDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextAreabeneficiarioDetalleCliente= new JTextAreaMe();
		jTextAreabeneficiarioDetalleCliente.setEnabled(false);
		jTextAreabeneficiarioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioDetalleCliente.setLineWrap(true);
		jTextAreabeneficiarioDetalleCliente.setWrapStyleWord(true);
		jTextAreabeneficiarioDetalleCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioDetalleCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioDetalleCliente = new JScrollPane(jTextAreabeneficiarioDetalleCliente);
		jscrollPanebeneficiarioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioDetalleClienteBusqueda= new JButtonMe();
		this.jButtonbeneficiarioDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioDetalleClienteBusqueda.setText("U");
		this.jButtonbeneficiarioDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_localDetalleCliente = new JLabelMe();
		this.jLabelmonto_mone_localDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_MONTOMONELOCAL+" : *");
		this.jLabelmonto_mone_localDetalleCliente.setToolTipText("Monto Mone Local");
		this.jLabelmonto_mone_localDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_localDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_localDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_localDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_MONTOMONELOCAL);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelmonto_mone_localDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldmonto_mone_localDetalleCliente= new JTextFieldMe();
		jTextFieldmonto_mone_localDetalleCliente.setEnabled(false);
		jTextFieldmonto_mone_localDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_localDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_localDetalleCliente.setText("0.0");

		this.jButtonmonto_mone_localDetalleClienteBusqueda= new JButtonMe();
		this.jButtonmonto_mone_localDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_localDetalleClienteBusqueda.setText("U");
		this.jButtonmonto_mone_localDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_localDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_localDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_localDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_localDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_localDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_localDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_extraDetalleCliente = new JLabelMe();
		this.jLabelmonto_mone_extraDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_MONTOMONEEXTRA+" : *");
		this.jLabelmonto_mone_extraDetalleCliente.setToolTipText("Monto Mone Extra");
		this.jLabelmonto_mone_extraDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_extraDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_extraDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_extraDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_extraDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_extraDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_MONTOMONEEXTRA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelmonto_mone_extraDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldmonto_mone_extraDetalleCliente= new JTextFieldMe();
		jTextFieldmonto_mone_extraDetalleCliente.setEnabled(false);
		jTextFieldmonto_mone_extraDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_extraDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_extraDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_extraDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_extraDetalleCliente.setText("0.0");

		this.jButtonmonto_mone_extraDetalleClienteBusqueda= new JButtonMe();
		this.jButtonmonto_mone_extraDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_extraDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_extraDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_extraDetalleClienteBusqueda.setText("U");
		this.jButtonmonto_mone_extraDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_extraDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_extraDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_extraDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_extraDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_extraDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_extraDetalleClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleCliente = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteDetalleCliente.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jTextFieldnumero_comprobanteDetalleCliente= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleCliente.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleClienteBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleClienteBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleCliente = new JLabelMe();
		this.jLabelid_empresaDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleCliente.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_empresaDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_empresaDetalleCliente= new JComboBoxMe();
		jComboBoxid_empresaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleCliente.setEnabled(false);

		this.jButtonid_empresaDetalleCliente= new JButtonMe();
		this.jButtonid_empresaDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleCliente.setText("Buscar");
		this.jButtonid_empresaDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleCliente"));

		this.jButtonid_empresaDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleClienteBusqueda.setText("U");
		this.jButtonid_empresaDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleClienteUpdate.setText("U");
		this.jButtonid_empresaDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleClienteUpdate"));



					
		this.jLabelid_sucursalDetalleCliente = new JLabelMe();
		this.jLabelid_sucursalDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleCliente.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_sucursalDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_sucursalDetalleCliente= new JComboBoxMe();
		jComboBoxid_sucursalDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleCliente.setEnabled(false);

		this.jButtonid_sucursalDetalleCliente= new JButtonMe();
		this.jButtonid_sucursalDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleCliente.setText("Buscar");
		this.jButtonid_sucursalDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleCliente"));

		this.jButtonid_sucursalDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleClienteBusqueda.setText("U");
		this.jButtonid_sucursalDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleClienteUpdate.setText("U");
		this.jButtonid_sucursalDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleClienteUpdate"));



					
		this.jLabelid_ejercicioDetalleCliente = new JLabelMe();
		this.jLabelid_ejercicioDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleCliente.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_ejercicioDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_ejercicioDetalleCliente= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleCliente.setEnabled(false);

		this.jButtonid_ejercicioDetalleCliente= new JButtonMe();
		this.jButtonid_ejercicioDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleCliente.setText("Buscar");
		this.jButtonid_ejercicioDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleCliente"));

		this.jButtonid_ejercicioDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleClienteBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleClienteUpdate.setText("U");
		this.jButtonid_ejercicioDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleClienteUpdate"));



					
		this.jLabelid_periodoDetalleCliente = new JLabelMe();
		this.jLabelid_periodoDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleCliente.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_periodoDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_periodoDetalleCliente= new JComboBoxMe();
		jComboBoxid_periodoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleCliente.setEnabled(false);

		this.jButtonid_periodoDetalleCliente= new JButtonMe();
		this.jButtonid_periodoDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleCliente.setText("Buscar");
		this.jButtonid_periodoDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleCliente"));

		this.jButtonid_periodoDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleClienteBusqueda.setText("U");
		this.jButtonid_periodoDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleClienteUpdate.setText("U");
		this.jButtonid_periodoDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleClienteUpdate"));



					
		this.jLabelid_anioDetalleCliente = new JLabelMe();
		this.jLabelid_anioDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleCliente.setToolTipText("Anio");
		this.jLabelid_anioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_anioDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_anioDetalleCliente= new JComboBoxMe();
		jComboBoxid_anioDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleCliente.setEnabled(false);

		this.jButtonid_anioDetalleCliente= new JButtonMe();
		this.jButtonid_anioDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleCliente.setText("Buscar");
		this.jButtonid_anioDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleCliente"));

		this.jButtonid_anioDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleClienteBusqueda.setText("U");
		this.jButtonid_anioDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_anioDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleClienteUpdate.setText("U");
		this.jButtonid_anioDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleClienteUpdate"));



					
		this.jLabelid_mesDetalleCliente = new JLabelMe();
		this.jLabelid_mesDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleCliente.setToolTipText("Mes");
		this.jLabelid_mesDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_mesDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_mesDetalleCliente= new JComboBoxMe();
		jComboBoxid_mesDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleCliente.setEnabled(false);

		this.jButtonid_mesDetalleCliente= new JButtonMe();
		this.jButtonid_mesDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleCliente.setText("Buscar");
		this.jButtonid_mesDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleCliente"));

		this.jButtonid_mesDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleClienteBusqueda.setText("U");
		this.jButtonid_mesDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_mesDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleClienteUpdate.setText("U");
		this.jButtonid_mesDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleClienteUpdate"));



					
		this.jLabelid_moduloDetalleCliente = new JLabelMe();
		this.jLabelid_moduloDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDetalleCliente.setToolTipText("Modulo");
		this.jLabelid_moduloDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_moduloDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_moduloDetalleCliente= new JComboBoxMe();
		jComboBoxid_moduloDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDetalleCliente.setEnabled(false);

		this.jButtonid_moduloDetalleCliente= new JButtonMe();
		this.jButtonid_moduloDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleCliente.setText("Buscar");
		this.jButtonid_moduloDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleCliente"));

		this.jButtonid_moduloDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_moduloDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleClienteBusqueda.setText("U");
		this.jButtonid_moduloDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_moduloDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_moduloDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleClienteUpdate.setText("U");
		this.jButtonid_moduloDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleClienteUpdate"));



					
		this.jLabelid_asiento_contableDetalleCliente = new JLabelMe();
		this.jLabelid_asiento_contableDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetalleCliente.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_asiento_contableDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_asiento_contableDetalleCliente= new JComboBoxMe();
		jComboBoxid_asiento_contableDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetalleCliente= new JButtonMe();
		this.jButtonid_asiento_contableDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleCliente.setText("Buscar");
		this.jButtonid_asiento_contableDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleCliente"));

		this.jButtonid_asiento_contableDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleClienteBusqueda.setText("U");
		this.jButtonid_asiento_contableDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleClienteUpdate.setText("U");
		this.jButtonid_asiento_contableDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleClienteUpdate"));



					
		this.jLabelid_clienteDetalleCliente = new JLabelMe();
		this.jLabelid_clienteDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDetalleCliente.setToolTipText("Cliente");
		this.jLabelid_clienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_clienteDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_clienteDetalleCliente= new JComboBoxMe();
		jComboBoxid_clienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDetalleCliente= new JButtonMe();
		this.jButtonid_clienteDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleCliente.setText("Buscar");
		this.jButtonid_clienteDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleCliente"));

		this.jButtonid_clienteDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleClienteBusqueda.setText("U");
		this.jButtonid_clienteDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_clienteDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleClienteUpdate.setText("U");
		this.jButtonid_clienteDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleClienteUpdate"));



					
		this.jLabelid_transaccionDetalleCliente = new JLabelMe();
		this.jLabelid_transaccionDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionDetalleCliente.setToolTipText("Transaccion");
		this.jLabelid_transaccionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_transaccionDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_transaccionDetalleCliente= new JComboBoxMe();
		jComboBoxid_transaccionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionDetalleCliente= new JButtonMe();
		this.jButtonid_transaccionDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleCliente.setText("Buscar");
		this.jButtonid_transaccionDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleCliente"));

		this.jButtonid_transaccionDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_transaccionDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleClienteBusqueda.setText("U");
		this.jButtonid_transaccionDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_transaccionDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_transaccionDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleClienteUpdate.setText("U");
		this.jButtonid_transaccionDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleClienteUpdate"));



					
		this.jLabelid_facturaDetalleCliente = new JLabelMe();
		this.jLabelid_facturaDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaDetalleCliente.setToolTipText("Factura");
		this.jLabelid_facturaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_facturaDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_facturaDetalleCliente= new JComboBoxMe();
		jComboBoxid_facturaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaDetalleCliente= new JButtonMe();
		this.jButtonid_facturaDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleCliente.setText("Buscar");
		this.jButtonid_facturaDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleCliente"));

		this.jButtonid_facturaDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_facturaDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleClienteBusqueda.setText("U");
		this.jButtonid_facturaDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_facturaDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_facturaDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleClienteUpdate.setText("U");
		this.jButtonid_facturaDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleClienteUpdate"));



					
		this.jLabelid_monedaDetalleCliente = new JLabelMe();
		this.jLabelid_monedaDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaDetalleCliente.setToolTipText("Moneda");
		this.jLabelid_monedaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_monedaDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_monedaDetalleCliente= new JComboBoxMe();
		jComboBoxid_monedaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaDetalleCliente= new JButtonMe();
		this.jButtonid_monedaDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleCliente.setText("Buscar");
		this.jButtonid_monedaDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleCliente"));

		this.jButtonid_monedaDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_monedaDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDetalleClienteBusqueda.setText("U");
		this.jButtonid_monedaDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_monedaDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_monedaDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDetalleClienteUpdate.setText("U");
		this.jButtonid_monedaDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleClienteUpdate"));



					
		this.jLabelid_sucursal_movimientoDetalleCliente = new JLabelMe();
		this.jLabelid_sucursal_movimientoDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO+" : *");
		this.jLabelid_sucursal_movimientoDetalleCliente.setToolTipText("Sucursal Movimiento");
		this.jLabelid_sucursal_movimientoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_movimientoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_movimientoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_movimientoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_movimientoDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_movimientoDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_sucursal_movimientoDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_sucursal_movimientoDetalleCliente= new JComboBoxMe();
		jComboBoxid_sucursal_movimientoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_movimientoDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursal_movimientoDetalleCliente.setEnabled(false);

		this.jButtonid_sucursal_movimientoDetalleCliente= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleCliente.setText("Buscar");
		this.jButtonid_sucursal_movimientoDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_movimientoDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_movimientoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleCliente"));

		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setText("U");
		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_movimientoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_movimientoDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_movimientoDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_movimientoDetalleClienteUpdate.setText("U");
		this.jButtonid_sucursal_movimientoDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_movimientoDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_movimientoDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleClienteUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloDetalleCliente = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloDetalleCliente.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_tipo_transaccion_moduloDetalleCliente= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloDetalleCliente= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleCliente.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleCliente"));

		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleClienteUpdate"));



					
		this.jLabelid_estado_detalle_clienteDetalleCliente = new JLabelMe();
		this.jLabelid_estado_detalle_clienteDetalleCliente.setText(""+DetalleClienteConstantesFunciones.LABEL_IDESTADODETALLECLIENTE+" : *");
		this.jLabelid_estado_detalle_clienteDetalleCliente.setToolTipText("Estado Detalle Cliente");
		this.jLabelid_estado_detalle_clienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_detalle_clienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_detalle_clienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_clienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_clienteDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_clienteDetalleCliente.setToolTipText(DetalleClienteConstantesFunciones.LABEL_IDESTADODETALLECLIENTE);
		this.gridaBagLayoutDetalleCliente = new GridBagLayout();
		this.jPanelid_estado_detalle_clienteDetalleCliente.setLayout(this.gridaBagLayoutDetalleCliente);


		jComboBoxid_estado_detalle_clienteDetalleCliente= new JComboBoxMe();
		jComboBoxid_estado_detalle_clienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_clienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_detalle_clienteDetalleCliente.setEnabled(false);

		this.jButtonid_estado_detalle_clienteDetalleCliente= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleCliente.setText("Buscar");
		this.jButtonid_estado_detalle_clienteDetalleCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_clienteDetalleCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_clienteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleCliente"));

		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setText("U");
		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_clienteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleClienteBusqueda"));

		if(this.detalleclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_clienteDetalleClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_clienteDetalleClienteUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_clienteDetalleClienteUpdate.setText("U");
		this.jButtonid_estado_detalle_clienteDetalleClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_clienteDetalleClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_clienteDetalleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleClienteUpdate"));



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
		//this.jInternalFrameDetalleDetalleCliente = new DetalleClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCliente= new GridBagLayout();
		

		
		String sToolTipDetalleCliente="";
		sToolTipDetalleCliente=DetalleClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCliente+="(Cartera.DetalleCliente)";
		}
		
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleCliente = new JButtonMe();
		this.jButtonModificarDetalleCliente = new JButtonMe();
        this.jButtonActualizarDetalleCliente = new JButtonMe();
        this.jButtonEliminarDetalleCliente = new JButtonMe();
        this.jButtonCancelarDetalleCliente = new JButtonMe();
        this.jButtonGuardarCambiosDetalleCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleCliente = new JButtonMe();
		this.jButtonCerrarDetalleCliente = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleCliente = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cliente";
		
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleCliente.setName("jPanelCamposDetalleCliente"); 

		this.jPanelCamposOcultosDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleCliente.setName("jPanelCamposOcultosDetalleCliente"); 

        this.jPanelAccionesDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCliente.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleCliente.setText("Nuevo");
		this.jButtonModificarDetalleCliente.setText("Editar");
        this.jButtonActualizarDetalleCliente.setText("Actualizar");
        this.jButtonEliminarDetalleCliente.setText("Eliminar");
        this.jButtonCancelarDetalleCliente.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleCliente.setText("Guardar");
		this.jButtonCerrarDetalleCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCliente,"nuevo_button","Nuevo",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleCliente,"modificar_button","Editar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleCliente,"actualizar_button","Actualizar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleCliente,"eliminar_button","Eliminar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleCliente,"cancelar_button","Cancelar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleCliente,"guardarcambios_button","Guardar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCliente,"guardarcambiostabla_button","Guardar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCliente,"cerrar_button","Salir",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleCliente.setToolTipText("Nuevo"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleCliente.setToolTipText("Editar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleCliente.setToolTipText("Actualizar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleCliente.setToolTipText("Eliminar)"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleCliente.setToolTipText("Cancelar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleCliente.setToolTipText("Guardar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleCliente.setToolTipText("Guardar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCliente.setToolTipText("Salir"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCliente";
		inputMap = this.jButtonNuevoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleCliente";
		inputMap = this.jButtonActualizarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleCliente";
		inputMap = this.jButtonEliminarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleCliente";
		inputMap = this.jButtonCancelarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleCliente"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleCliente";
		inputMap = this.jButtonCerrarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCliente";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleCliente.setToolTipText("Nuevo DetalleCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleCliente.setToolTipText("Sin Cerrar Ventana DetalleCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCliente.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleCliente = new JLabelMe();
		
		this.jLabelAccionesDetalleCliente.setText("Acciones");		
		this.jLabelAccionesDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleCliente = new GridBagLayout();
		
		this.jPanelCamposDetalleCliente.setLayout(gridaBagLayoutCamposDetalleCliente);
		this.jPanelCamposOcultosDetalleCliente.setLayout(gridaBagLayoutCamposOcultosDetalleCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidDetalleCliente.add(jLabelIdDetalleCliente, this.gridBagConstraintsDetalleCliente);



	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidDetalleCliente.add(jLabelidDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaDetalleCliente.add(jLabelid_empresaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleCliente.add(jButtonid_empresaDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleCliente.add(jButtonid_empresaDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaDetalleCliente.add(jComboBoxid_empresaDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalDetalleCliente.add(jLabelid_sucursalDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleCliente.add(jButtonid_sucursalDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleCliente.add(jButtonid_sucursalDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalDetalleCliente.add(jComboBoxid_sucursalDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioDetalleCliente.add(jLabelid_ejercicioDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleCliente.add(jButtonid_ejercicioDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleCliente.add(jButtonid_ejercicioDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioDetalleCliente.add(jComboBoxid_ejercicioDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoDetalleCliente.add(jLabelid_periodoDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleCliente.add(jButtonid_periodoDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleCliente.add(jButtonid_periodoDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoDetalleCliente.add(jComboBoxid_periodoDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioDetalleCliente.add(jLabelid_anioDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleCliente.add(jButtonid_anioDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleCliente.add(jButtonid_anioDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioDetalleCliente.add(jComboBoxid_anioDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesDetalleCliente.add(jLabelid_mesDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleCliente.add(jButtonid_mesDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleCliente.add(jButtonid_mesDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesDetalleCliente.add(jComboBoxid_mesDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloDetalleCliente.add(jLabelid_moduloDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleCliente.add(jButtonid_moduloDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleCliente.add(jButtonid_moduloDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloDetalleCliente.add(jComboBoxid_moduloDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableDetalleCliente.add(jLabelid_asiento_contableDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 2;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetalleCliente.add(jButtonid_asiento_contableDetalleCliente, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleCliente.add(jButtonid_asiento_contableDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 4;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleCliente.add(jButtonid_asiento_contableDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableDetalleCliente.add(jComboBoxid_asiento_contableDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteDetalleCliente.add(jLabelid_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 2;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDetalleCliente.add(jButtonid_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleCliente.add(jButtonid_clienteDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 4;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleCliente.add(jButtonid_clienteDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteDetalleCliente.add(jComboBoxid_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionDetalleCliente.add(jLabelid_transaccionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleCliente.add(jButtonid_transaccionDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleCliente.add(jButtonid_transaccionDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionDetalleCliente.add(jComboBoxid_transaccionDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaDetalleCliente.add(jLabelid_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 2;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaDetalleCliente.add(jButtonid_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleCliente.add(jButtonid_facturaDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 4;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleCliente.add(jButtonid_facturaDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaDetalleCliente.add(jComboBoxid_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_facturaDetalleCliente.add(jLabelnumero_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaDetalleCliente.add(jButtonnumero_facturaDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_facturaDetalleCliente.add(jTextFieldnumero_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_venceDetalleCliente.add(jLabelfecha_venceDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceDetalleCliente.add(jButtonfecha_venceDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_venceDetalleCliente.add(jDateChooserfecha_venceDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionDetalleCliente.add(jLabeldescripcionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleCliente.add(jButtondescripcionDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionDetalleCliente.add(jscrollPanedescripcionDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_localDetalleCliente.add(jLabeldebito_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localDetalleCliente.add(jButtondebito_mone_localDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_localDetalleCliente.add(jTextFielddebito_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_localDetalleCliente.add(jLabelcredito_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localDetalleCliente.add(jButtoncredito_mone_localDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_localDetalleCliente.add(jTextFieldcredito_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_extraDetalleCliente.add(jLabeldebito_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraDetalleCliente.add(jButtondebito_mone_extraDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_extraDetalleCliente.add(jTextFielddebito_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_extraDetalleCliente.add(jLabelcredito_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_extraDetalleCliente.add(jButtoncredito_mone_extraDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_extraDetalleCliente.add(jTextFieldcredito_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaDetalleCliente.add(jLabelid_monedaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDetalleCliente.add(jButtonid_monedaDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDetalleCliente.add(jButtonid_monedaDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaDetalleCliente.add(jComboBoxid_monedaDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionDetalleCliente.add(jLabelcotizacionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionDetalleCliente.add(jButtoncotizacionDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionDetalleCliente.add(jTextFieldcotizacionDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursal_movimientoDetalleCliente.add(jLabelid_sucursal_movimientoDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_movimientoDetalleCliente.add(jButtonid_sucursal_movimientoDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_movimientoDetalleCliente.add(jButtonid_sucursal_movimientoDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursal_movimientoDetalleCliente.add(jComboBoxid_sucursal_movimientoDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloDetalleCliente.add(jLabelid_tipo_transaccion_moduloDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleCliente.add(jButtonid_tipo_transaccion_moduloDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleCliente.add(jButtonid_tipo_transaccion_moduloDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloDetalleCliente.add(jComboBoxid_tipo_transaccion_moduloDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionDetalleCliente.add(jLabelfecha_emisionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDetalleCliente.add(jButtonfecha_emisionDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionDetalleCliente.add(jDateChooserfecha_emisionDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbeneficiarioDetalleCliente.add(jLabelbeneficiarioDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioDetalleCliente.add(jButtonbeneficiarioDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbeneficiarioDetalleCliente.add(jscrollPanebeneficiarioDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_mone_localDetalleCliente.add(jLabelmonto_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_localDetalleCliente.add(jButtonmonto_mone_localDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_mone_localDetalleCliente.add(jTextFieldmonto_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_mone_extraDetalleCliente.add(jLabelmonto_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_extraDetalleCliente.add(jButtonmonto_mone_extraDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_mone_extraDetalleCliente.add(jTextFieldmonto_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteDetalleCliente.add(jLabelnumero_comprobanteDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleCliente.add(jButtonnumero_comprobanteDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteDetalleCliente.add(jTextFieldnumero_comprobanteDetalleCliente, this.gridBagConstraintsDetalleCliente);


	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 0;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_detalle_clienteDetalleCliente.add(jLabelid_estado_detalle_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 2;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_clienteDetalleCliente.add(jButtonid_estado_detalle_clienteDetalleClienteBusqueda, this.gridBagConstraintsDetalleCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 3;
		this.gridBagConstraintsDetalleCliente.ipadx = 0;
		this.gridBagConstraintsDetalleCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_clienteDetalleCliente.add(jButtonid_estado_detalle_clienteDetalleClienteUpdate, this.gridBagConstraintsDetalleCliente);
	}

	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCliente.gridy = 0;
	this.gridBagConstraintsDetalleCliente.gridx = 1;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_detalle_clienteDetalleCliente.add(jComboBoxid_estado_detalle_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelidDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelid_asiento_contableDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelid_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelid_transaccionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelid_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelnumero_facturaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelfecha_venceDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPaneldescripcionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPaneldebito_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelcredito_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPaneldebito_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelcredito_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelid_monedaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleCliente.add(this.jPanelcotizacionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposDetalleCliente % 2==0) {
		iXPanelCamposDetalleCliente=0;
		iYPanelCamposDetalleCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_empresaDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_sucursalDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_ejercicioDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_periodoDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_anioDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_mesDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_moduloDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_sucursal_movimientoDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_tipo_transaccion_moduloDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelfecha_emisionDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelbeneficiarioDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelmonto_mone_localDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelmonto_mone_extraDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelnumero_comprobanteDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
	}
	this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCliente.gridy = iYPanelCamposOcultosDetalleCliente;
	this.gridBagConstraintsDetalleCliente.gridx = iXPanelCamposOcultosDetalleCliente++;
	this.gridBagConstraintsDetalleCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCliente.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleCliente.add(this.jPanelid_estado_detalle_clienteDetalleCliente, this.gridBagConstraintsDetalleCliente);



	if(iXPanelCamposOcultosDetalleCliente % 2==0) {
		iXPanelCamposOcultosDetalleCliente=0;
		iYPanelCamposOcultosDetalleCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleCliente= new GridBagLayout();
		this.jPanelAccionesDetalleCliente.setLayout(gridaBagLayoutAccionesDetalleCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleCliente= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleCliente.setLayout(gridaBagLayoutAccionesFormularioDetalleCliente);
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCliente.add(this.jComboBoxTiposAccionesFormularioDetalleCliente, this.gridBagConstraintsDetalleCliente);

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCliente.add(this.jCheckBoxPostAccionNuevoDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCliente.add(this.jCheckBoxPostAccionSinCerrarDetalleCliente, this.gridBagConstraintsDetalleCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCliente.add(this.jCheckBoxPostAccionSinMensajeDetalleCliente, this.gridBagConstraintsDetalleCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleCliente.add(this.jButtonModificarDetalleCliente, this.gridBagConstraintsDetalleCliente);							

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleCliente.add(this.jButtonEliminarDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = 0;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCliente.add(this.jButtonActualizarDetalleCliente, this.gridBagConstraintsDetalleCliente);


		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = 0;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCliente.add(this.jButtonGuardarCambiosDetalleCliente, this.gridBagConstraintsDetalleCliente);	
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = 0;		
		this.gridBagConstraintsDetalleCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleCliente.add(this.jButtonCancelarDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCliente.gridx = 0;		
			//this.gridBagConstraintsDetalleCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCliente.gridx =0;
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCliente, this.gridBagConstraintsDetalleCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleCliente = new DetalleClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleClienteModel detalleclienteModel=new DetalleClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleClienteModel.DetalleClienteFocusTraversalPolicy detalleclienteFocusTraversalPolicy = detalleclienteModel.new DetalleClienteFocusTraversalPolicy(this);
			
			//detalleclienteFocusTraversalPolicy.setdetalleclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleclienteModel);
			
			
			this.jContentPaneDetalleDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleCliente = new GridBagLayout();	
			this.jContentPaneDetalleDetalleCliente.setLayout(gridaBagLayoutDetalleDetalleCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleCliente.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleCliente.add(jTtoolBarDetalleDetalleCliente, gridBagConstraintsDetalleCliente);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleCliente=   new JScrollPane(jContentPaneDetalleDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleCliente.gridx = 0;
	        
			this.jContentPaneDetalleDetalleCliente.add(jPanelCamposDetalleCliente, gridBagConstraintsDetalleCliente);
			
			
			
			
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
						&& detalleclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleRecap(this.puedeCargarPorParteDetalleRecap,false,-1);
					
					if(this.detalleclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleCliente= new GridBagConstraints();
						this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleCliente.gridx = 0;
						this.jContentPaneDetalleDetalleCliente.add(this.jTabbedPaneRelacionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleRecap(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
					this.gridBagConstraintsDetalleCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleCliente.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleCliente.add(jPanelCamposOcultosDetalleCliente, gridBagConstraintsDetalleCliente);
				
					this.jPanelCamposOcultosDetalleCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsDetalleCliente.gridx = 0;
	        this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleCliente.add(this.jPanelAccionesFormularioDetalleCliente, this.gridBagConstraintsDetalleCliente);							
			
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
	        this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsDetalleCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleCliente.add(this.jPanelAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleCliente=   new JScrollPane(this.jPanelCamposDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCliente.gridx = 0;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleCliente, this.gridBagConstraintsDetalleCliente);			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleRecap(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallerecapSessionBean=new DetalleRecapSessionBean();
		this.detallerecapSessionBean.setConGuardarRelaciones(false);
		this.detallerecapSessionBean.setEsGuardarRelacionado(true);

		this.detallerecapBeanSwingJInternalFrame=null;//new DetalleRecapBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallerecapBeanSwingJInternalFramePopup=new DetalleRecapBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallerecapBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {

				DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallerecapSessionBean.setEsGuardarRelacionado(true);

				this.detallerecapBeanSwingJInternalFrame=new DetalleRecapBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallerecapBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallerecapBeanSwingJInternalFrame.setdetallerecapSessionBean(this.detallerecapSessionBean);

				//this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
				//this.gridBagConstraintsDetalleCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleCliente.gridx = 0;
				//this.jContentPaneDetalleDetalleCliente.add(this.detallerecapBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleCliente.add("Detalle Recapes",this.detallerecapBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleCliente.setComponentAt(iIndexTab,this.detallerecapBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallerecapSessionBean.setEsGuardarRelacionado(false);
				this.detallerecapBeanSwingJInternalFrame=null;//new DetalleRecapBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleRecap) {
					this.jTabbedPaneRelacionesDetalleCliente.add("Detalle Recapes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleRecapBeanSwingJInternalFrame(List<DetalleCliente> detalleclientes,DetalleCliente detallecliente,DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallerecapBeanSwingJInternalFrame=new DetalleRecapBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallerecapBeanSwingJInternalFrame.getDetalleRecapLogic().setConnexion(this.detalleclienteLogic.getConnexion());

					detallerecapBeanSwingJInternalFrame.setdetalleclientesForeignKey(detalleclientes);
					detallerecapBeanSwingJInternalFrame.setdetalleclienteForeignKey(detallecliente);
					detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setisBusquedaDesdeForeignKeySesionDetalleCliente(true);
					detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setlidDetalleClienteActual(detallecliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallerecapBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleRecap(detallerecapBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallerecapBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleCliente(true);
					detallerecapBeanSwingJInternalFrame.setid_detalle_clienteFK_IdDetalleCliente(detallecliente.getId());

					if(!this.conCargarFormDetalle) {
						detallerecapBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallerecapBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleClienteForeignKey(detallecliente,1,false,true,true);
					detallerecapBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallerecapBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleCliente");
					detallerecapBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleCliente");
					detallerecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRecap(true);
					detallerecapBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleRecap("n",detallerecapBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallerecapBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallerecapBeanSwingJInternalFrame.setAutoscrolls(true);
					detallerecapBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallerecapBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRecap("relacionado");
					} else {
						detallerecapBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRecap("no_relacionado");
					}

					detallerecapBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleRecap().setVisible(false);

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
