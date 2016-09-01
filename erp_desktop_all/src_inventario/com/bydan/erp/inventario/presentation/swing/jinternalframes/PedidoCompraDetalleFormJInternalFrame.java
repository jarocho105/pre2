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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.PedidoCompraConstantesFunciones;

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
public class PedidoCompraDetalleFormJInternalFrame extends PedidoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidoCompra;
	
	protected JMenuBar jmenuBarDetallePedidoCompra;
	
	protected JMenu jmenuDetallePedidoCompra;
	protected JMenu jmenuDetalleArchivoPedidoCompra;
	protected JMenu jmenuDetalleAccionesPedidoCompra;
	protected JMenu jmenuDetalleDatosPedidoCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoCompra;	
	protected GridBagConstraints gridBagConstraintsPedidoCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoCompraBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidoCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EstadoPedidoCompraBeanSwingJInternalFrame estadopedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidocompra="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public PedidoCompraSessionBean pedidocompraSessionBean;
	
	

	public DetallePedidoCompraBeanSwingJInternalFrame detallepedidocompraBeanSwingJInternalFrame=null;
	public DetallePedidoCompraBeanSwingJInternalFrame detallepedidocompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedidoCompra=false;
	public DetallePedidoCompraSessionBean detallepedidocompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EstadoPedidoCompraSessionBean estadopedidocompraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;	
	
	public PedidoCompraLogic pedidocompraLogic;
	
	public JScrollPane jScrollPanelDatosPedidoCompra;
	public JScrollPane jScrollPanelDatosEdicionPedidoCompra;
	public JScrollPane jScrollPanelDatosGeneralPedidoCompra;
	
	protected JPanel jPanelCamposPedidoCompra;    
	protected JPanel jPanelCamposOcultosPedidoCompra;    	
	protected JPanel jPanelAccionesPedidoCompra;
	protected JPanel jPanelAccionesFormularioPedidoCompra;
    
	
	
	protected Integer iXPanelCamposPedidoCompra=0;
	protected Integer iYPanelCamposPedidoCompra=0;
	
	protected Integer iXPanelCamposOcultosPedidoCompra=0;
	protected Integer iYPanelCamposOcultosPedidoCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidoCompra;
	public JButton jButtonModificarPedidoCompra;
	public JButton jButtonActualizarPedidoCompra;
    public JButton jButtonEliminarPedidoCompra;
	public JButton jButtonCancelarPedidoCompra;
    public JButton jButtonGuardarCambiosPedidoCompra;
	public JButton jButtonGuardarCambiosTablaPedidoCompra;
	protected JButton jButtonCerrarPedidoCompra;
	
	
	protected JButton jButtonProcesarInformacionPedidoCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidoCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidoCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidoCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoCompra;
	protected JButton jButtonModificarToolBarPedidoCompra;
	protected JButton jButtonActualizarToolBarPedidoCompra;
    protected JButton jButtonEliminarToolBarPedidoCompra;
	protected JButton jButtonCancelarToolBarPedidoCompra;
    protected JButton jButtonGuardarCambiosToolBarPedidoCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoCompra;
	protected JButton jButtonCerrarToolBarPedidoCompra;
	
	protected JButton jButtonProcesarInformacionToolBarPedidoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoCompra;
	protected JMenuItem jMenuItemModificarPedidoCompra;
	protected JMenuItem jMenuItemActualizarPedidoCompra;
    protected JMenuItem jMenuItemEliminarPedidoCompra;
	protected JMenuItem jMenuItemCancelarPedidoCompra;
    protected JMenuItem jMenuItemGuardarCambiosPedidoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoCompra;
	protected JMenuItem jMenuItemCerrarPedidoCompra;
	protected JMenuItem jMenuItemDetalleCerrarPedidoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoCompra;
	protected JMenuItem jMenuItemMostrarOcultarPedidoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidoCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidoCompra;
	public JLabel jLabelIdPedidoCompra;
	public JLabel jLabelidPedidoCompra;
	public JButton jButtonidPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialPedidoCompra;
	public JLabel jLabelnumero_secuencialPedidoCompra;
	public JTextField jTextFieldnumero_secuencialPedidoCompra;
	public JButton jButtonnumero_secuencialPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotalPedidoCompra;
	public JLabel jLabeltotalPedidoCompra;
	public JTextField jTextFieldtotalPedidoCompra;
	public JButton jButtontotalPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelfechaPedidoCompra;
	public JLabel jLabelfechaPedidoCompra;
	//public JFormattedTextField jDateChooserfechaPedidoCompra;

	public JDateChooser jDateChooserfechaPedidoCompra;
	public JButton jButtonfechaPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelresponsablePedidoCompra;
	public JLabel jLabelresponsablePedidoCompra;
	public JTextArea jTextArearesponsablePedidoCompra;
	public JScrollPane jscrollPaneresponsablePedidoCompra;
	public JButton jButtonresponsablePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelsolicitado_porPedidoCompra;
	public JLabel jLabelsolicitado_porPedidoCompra;
	public JTextArea jTextAreasolicitado_porPedidoCompra;
	public JScrollPane jscrollPanesolicitado_porPedidoCompra;
	public JButton jButtonsolicitado_porPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelmotivo_solicitudPedidoCompra;
	public JLabel jLabelmotivo_solicitudPedidoCompra;
	public JTextArea jTextAreamotivo_solicitudPedidoCompra;
	public JScrollPane jscrollPanemotivo_solicitudPedidoCompra;
	public JButton jButtonmotivo_solicitudPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelarea_solicitudPedidoCompra;
	public JLabel jLabelarea_solicitudPedidoCompra;
	public JTextArea jTextAreaarea_solicitudPedidoCompra;
	public JScrollPane jscrollPanearea_solicitudPedidoCompra;
	public JButton jButtonarea_solicitudPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelpara_uso_dePedidoCompra;
	public JLabel jLabelpara_uso_dePedidoCompra;
	public JTextArea jTextAreapara_uso_dePedidoCompra;
	public JScrollPane jscrollPanepara_uso_dePedidoCompra;
	public JButton jButtonpara_uso_dePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanellugar_entregaPedidoCompra;
	public JLabel jLabellugar_entregaPedidoCompra;
	public JTextField jTextFieldlugar_entregaPedidoCompra;
	public JButton jButtonlugar_entregaPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPedidoCompra;
	public JLabel jLabeldescripcionPedidoCompra;
	public JTextArea jTextAreadescripcionPedidoCompra;
	public JScrollPane jscrollPanedescripcionPedidoCompra;
	public JButton jButtondescripcionPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPedidoCompra;
	public JLabel jLabelfecha_emisionPedidoCompra;
	//public JFormattedTextField jDateChooserfecha_emisionPedidoCompra;

	public JDateChooser jDateChooserfecha_emisionPedidoCompra;
	public JButton jButtonfecha_emisionPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaPedidoCompra;
	public JLabel jLabelfecha_entregaPedidoCompra;
	//public JFormattedTextField jDateChooserfecha_entregaPedidoCompra;

	public JDateChooser jDateChooserfecha_entregaPedidoCompra;
	public JButton jButtonfecha_entregaPedidoCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidoCompra;
	public JLabel jLabelid_empresaPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidoCompra;
	public JButton jButtonid_empresaPedidoCompra= new JButtonMe();
	public JButton jButtonid_empresaPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidoCompra;
	public JLabel jLabelid_sucursalPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidoCompra;
	public JButton jButtonid_sucursalPedidoCompra= new JButtonMe();
	public JButton jButtonid_sucursalPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloPedidoCompra;
	public JLabel jLabelid_moduloPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloPedidoCompra;
	public JButton jButtonid_moduloPedidoCompra= new JButtonMe();
	public JButton jButtonid_moduloPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_moduloPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPedidoCompra;
	public JLabel jLabelid_ejercicioPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPedidoCompra;
	public JButton jButtonid_ejercicioPedidoCompra= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPedidoCompra;
	public JLabel jLabelid_periodoPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPedidoCompra;
	public JButton jButtonid_periodoPedidoCompra= new JButtonMe();
	public JButton jButtonid_periodoPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPedidoCompra;
	public JLabel jLabelid_anioPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPedidoCompra;
	public JButton jButtonid_anioPedidoCompra= new JButtonMe();
	public JButton jButtonid_anioPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPedidoCompra;
	public JLabel jLabelid_mesPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPedidoCompra;
	public JButton jButtonid_mesPedidoCompra= new JButtonMe();
	public JButton jButtonid_mesPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePedidoCompra;
	public JLabel jLabelid_clientePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePedidoCompra;
	public JButton jButtonid_clientePedidoCompra= new JButtonMe();
	public JButton jButtonid_clientePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_clientePedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPedidoCompra;
	public JLabel jLabelid_usuarioPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPedidoCompra;
	public JButton jButtonid_usuarioPedidoCompra= new JButtonMe();
	public JButton jButtonid_usuarioPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaPedidoCompra;
	public JLabel jLabelid_monedaPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaPedidoCompra;
	public JButton jButtonid_monedaPedidoCompra= new JButtonMe();
	public JButton jButtonid_monedaPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_monedaPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_compraPedidoCompra;
	public JLabel jLabelid_estado_pedido_compraPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_compraPedidoCompra;
	public JButton jButtonid_estado_pedido_compraPedidoCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPedidoCompra;
	public JLabel jLabelid_empleadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPedidoCompra;
	public JButton jButtonid_empleadoPedidoCompra= new JButtonMe();
	public JButton jButtonid_empleadoPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoPedidoCompra;
	public JLabel jLabelid_formatoPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoPedidoCompra;
	public JButton jButtonid_formatoPedidoCompra= new JButtonMe();
	public JButton jButtonid_formatoPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_formatoPedidoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioPedidoCompra;
	public JLabel jLabelid_tipo_cambioPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioPedidoCompra;
	public JButton jButtonid_tipo_cambioPedidoCompra= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidoCompra;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=579;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidoCompra=new JPanel();
				this.jPanelAccionesFormularioPedidoCompra=new JPanel();
				this.jmenuBarDetallePedidoCompra=new JMenuBar();
				this.jTtoolBarDetallePedidoCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedidoCompra() {
		return this.jButtonActualizarToolBarPedidoCompra;
	}
	
	public JButton getjButtonEliminarToolBarPedidoCompra() {
		return this.jButtonEliminarToolBarPedidoCompra;
	}
	
	public JButton getjButtonCancelarToolBarPedidoCompra() {
		return this.jButtonCancelarToolBarPedidoCompra;
	}		
	
	public JButton getjButtonProcesarInformacionPedidoCompra() {
		return this.jButtonProcesarInformacionPedidoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoCompra)	{
		this.jButtonProcesarInformacionPedidoCompra = jButtonProcesarInformacionPedidoCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoCompra() {
		return this.jComboBoxTiposAccionesPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoCompra(
			JComboBox jComboBoxTiposRelacionesPedidoCompra) {
		this.jComboBoxTiposRelacionesPedidoCompra = jComboBoxTiposRelacionesPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoCompra(
			JComboBox jComboBoxTiposAccionesPedidoCompra) {
		this.jComboBoxTiposAccionesPedidoCompra = jComboBoxTiposAccionesPedidoCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidoCompra() {
		return this.jComboBoxTiposAccionesFormularioPedidoCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidoCompra(
			JComboBox jComboBoxTiposAccionesFormularioPedidoCompra) {
		this.jComboBoxTiposAccionesFormularioPedidoCompra = jComboBoxTiposAccionesFormularioPedidoCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidocompraSessionBean=new PedidoCompraSessionBean();
		
		this.pedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidocompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallepedidocompraSessionBean=new DetallePedidoCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidoCompra=new JButtonMe();
				this.jButtonModificarToolBarPedidoCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"actualizar","actualizar","Actualizar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"eliminar","eliminar","Eliminar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"cancelar","cancelar","Cancelar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidoCompra,this.jTtoolBarDetallePedidoCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidoCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidoCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidoCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidoCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidoCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidoCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidoCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidoCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidoCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidoCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidoCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidoCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidoCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidoCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidoCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidoCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidoCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidoCompra.add(this.jMenuItemDetalleCerrarPedidoCompra);
		
		this.jmenuDetalleAccionesPedidoCompra.add(this.jMenuItemActualizarPedidoCompra);
		this.jmenuDetalleAccionesPedidoCompra.add(this.jMenuItemEliminarPedidoCompra);
		this.jmenuDetalleAccionesPedidoCompra.add(this.jMenuItemCancelarPedidoCompra);		
		
		//this.jmenuDetalleDatosPedidoCompra.add(this.jMenuItemDetalleAbrirOrderByPedidoCompra);				
		this.jmenuDetalleDatosPedidoCompra.add(this.jMenuItemDetalleMostarOcultarPedidoCompra);				
				
		//this.jmenuDetalleAccionesPedidoCompra.add(this.jMenuItemGuardarCambiosPedidoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidoCompra.add(this.jmenuDetalleArchivoPedidoCompra);		
		this.jmenuBarDetallePedidoCompra.add(this.jmenuDetalleAccionesPedidoCompra);		
		this.jmenuBarDetallePedidoCompra.add(this.jmenuDetalleDatosPedidoCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoCompra.add(this.jmenuDetallePedidoCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposPedidoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidoCompra = new JLabelMe();
		jLabelIdPedidoCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidoCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidoCompra= new GridBagLayout();

		this.jPanelidPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);

		jLabelidPedidoCompra = new JLabel();
		jLabelidPedidoCompra.setText("Id");

		jLabelidPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialPedidoCompra = new JLabelMe();
		this.jLabelnumero_secuencialPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialPedidoCompra.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelnumero_secuencialPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextFieldnumero_secuencialPedidoCompra= new JTextFieldMe();

		jTextFieldnumero_secuencialPedidoCompra.setEnabled(false);
		jTextFieldnumero_secuencialPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_secuencialPedidoCompra.setEnabled(false);
		this.jButtonnumero_secuencialPedidoCompraBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialPedidoCompraBusqueda.setText("U");
		this.jButtonnumero_secuencialPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotalPedidoCompra = new JLabelMe();
		this.jLabeltotalPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPedidoCompra.setToolTipText("Total");
		this.jLabeltotalPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPaneltotalPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextFieldtotalPedidoCompra= new JTextFieldMe();
		jTextFieldtotalPedidoCompra.setEnabled(false);
		jTextFieldtotalPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPedidoCompra.setText("0.0");

		this.jButtontotalPedidoCompraBusqueda= new JButtonMe();
		this.jButtontotalPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPedidoCompraBusqueda.setText("U");
		this.jButtontotalPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelfechaPedidoCompra = new JLabelMe();
		this.jLabelfechaPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPedidoCompra.setToolTipText("Fecha");
		this.jLabelfechaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelfechaPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		//jFormattedTextFieldfechaPedidoCompra= new JFormattedTextFieldMe();

		jDateChooserfechaPedidoCompra= new JDateChooser();
		jDateChooserfechaPedidoCompra.setEnabled(false);
		jDateChooserfechaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPedidoCompra.setDate(new Date());
		jDateChooserfechaPedidoCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPedidoCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPedidoCompraBusqueda= new JButtonMe();
		this.jButtonfechaPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPedidoCompraBusqueda.setText("U");
		this.jButtonfechaPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelresponsablePedidoCompra = new JLabelMe();
		this.jLabelresponsablePedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_RESPONSABLE+" :");
		this.jLabelresponsablePedidoCompra.setToolTipText("Responsable");
		this.jLabelresponsablePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsablePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsablePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsablePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsablePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsablePedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelresponsablePedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextArearesponsablePedidoCompra= new JTextAreaMe();
		jTextArearesponsablePedidoCompra.setEnabled(false);
		jTextArearesponsablePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsablePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsablePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsablePedidoCompra.setLineWrap(true);
		jTextArearesponsablePedidoCompra.setWrapStyleWord(true);
		jTextArearesponsablePedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsablePedidoCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearesponsablePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsablePedidoCompra = new JScrollPane(jTextArearesponsablePedidoCompra);
		jscrollPaneresponsablePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneresponsablePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneresponsablePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonresponsablePedidoCompraBusqueda= new JButtonMe();
		this.jButtonresponsablePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsablePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsablePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsablePedidoCompraBusqueda.setText("U");
		this.jButtonresponsablePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsablePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsablePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsablePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsablePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsablePedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsablePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelsolicitado_porPedidoCompra = new JLabelMe();
		this.jLabelsolicitado_porPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_SOLICITADOPOR+" :");
		this.jLabelsolicitado_porPedidoCompra.setToolTipText("Solicitado Por");
		this.jLabelsolicitado_porPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsolicitado_porPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsolicitado_porPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsolicitado_porPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsolicitado_porPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsolicitado_porPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_SOLICITADOPOR);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelsolicitado_porPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextAreasolicitado_porPedidoCompra= new JTextAreaMe();
		jTextAreasolicitado_porPedidoCompra.setEnabled(false);
		jTextAreasolicitado_porPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasolicitado_porPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasolicitado_porPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasolicitado_porPedidoCompra.setLineWrap(true);
		jTextAreasolicitado_porPedidoCompra.setWrapStyleWord(true);
		jTextAreasolicitado_porPedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasolicitado_porPedidoCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreasolicitado_porPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesolicitado_porPedidoCompra = new JScrollPane(jTextAreasolicitado_porPedidoCompra);
		jscrollPanesolicitado_porPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanesolicitado_porPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanesolicitado_porPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonsolicitado_porPedidoCompraBusqueda= new JButtonMe();
		this.jButtonsolicitado_porPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsolicitado_porPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsolicitado_porPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsolicitado_porPedidoCompraBusqueda.setText("U");
		this.jButtonsolicitado_porPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsolicitado_porPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsolicitado_porPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasolicitado_porPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasolicitado_porPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"solicitado_porPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsolicitado_porPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelmotivo_solicitudPedidoCompra = new JLabelMe();
		this.jLabelmotivo_solicitudPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_MOTIVOSOLICITUD+" : *");
		this.jLabelmotivo_solicitudPedidoCompra.setToolTipText("Motivo Solicitud");
		this.jLabelmotivo_solicitudPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmotivo_solicitudPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmotivo_solicitudPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmotivo_solicitudPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmotivo_solicitudPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmotivo_solicitudPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_MOTIVOSOLICITUD);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelmotivo_solicitudPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextAreamotivo_solicitudPedidoCompra= new JTextAreaMe();
		jTextAreamotivo_solicitudPedidoCompra.setEnabled(false);
		jTextAreamotivo_solicitudPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivo_solicitudPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivo_solicitudPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivo_solicitudPedidoCompra.setLineWrap(true);
		jTextAreamotivo_solicitudPedidoCompra.setWrapStyleWord(true);
		jTextAreamotivo_solicitudPedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamotivo_solicitudPedidoCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreamotivo_solicitudPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemotivo_solicitudPedidoCompra = new JScrollPane(jTextAreamotivo_solicitudPedidoCompra);
		jscrollPanemotivo_solicitudPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanemotivo_solicitudPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanemotivo_solicitudPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonmotivo_solicitudPedidoCompraBusqueda= new JButtonMe();
		this.jButtonmotivo_solicitudPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmotivo_solicitudPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmotivo_solicitudPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmotivo_solicitudPedidoCompraBusqueda.setText("U");
		this.jButtonmotivo_solicitudPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmotivo_solicitudPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmotivo_solicitudPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamotivo_solicitudPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamotivo_solicitudPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"motivo_solicitudPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmotivo_solicitudPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelarea_solicitudPedidoCompra = new JLabelMe();
		this.jLabelarea_solicitudPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_AREASOLICITUD+" :");
		this.jLabelarea_solicitudPedidoCompra.setToolTipText("Area Solicitud");
		this.jLabelarea_solicitudPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarea_solicitudPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarea_solicitudPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelarea_solicitudPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarea_solicitudPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarea_solicitudPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_AREASOLICITUD);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelarea_solicitudPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextAreaarea_solicitudPedidoCompra= new JTextAreaMe();
		jTextAreaarea_solicitudPedidoCompra.setEnabled(false);
		jTextAreaarea_solicitudPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarea_solicitudPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarea_solicitudPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarea_solicitudPedidoCompra.setLineWrap(true);
		jTextAreaarea_solicitudPedidoCompra.setWrapStyleWord(true);
		jTextAreaarea_solicitudPedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaarea_solicitudPedidoCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaarea_solicitudPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanearea_solicitudPedidoCompra = new JScrollPane(jTextAreaarea_solicitudPedidoCompra);
		jscrollPanearea_solicitudPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanearea_solicitudPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanearea_solicitudPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonarea_solicitudPedidoCompraBusqueda= new JButtonMe();
		this.jButtonarea_solicitudPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarea_solicitudPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarea_solicitudPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarea_solicitudPedidoCompraBusqueda.setText("U");
		this.jButtonarea_solicitudPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarea_solicitudPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarea_solicitudPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaarea_solicitudPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaarea_solicitudPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"area_solicitudPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarea_solicitudPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelpara_uso_dePedidoCompra = new JLabelMe();
		this.jLabelpara_uso_dePedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_PARAUSODE+" : *");
		this.jLabelpara_uso_dePedidoCompra.setToolTipText("Para Uso De");
		this.jLabelpara_uso_dePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_uso_dePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_uso_dePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_uso_dePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_uso_dePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_uso_dePedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_PARAUSODE);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelpara_uso_dePedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextAreapara_uso_dePedidoCompra= new JTextAreaMe();
		jTextAreapara_uso_dePedidoCompra.setEnabled(false);
		jTextAreapara_uso_dePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapara_uso_dePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapara_uso_dePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapara_uso_dePedidoCompra.setLineWrap(true);
		jTextAreapara_uso_dePedidoCompra.setWrapStyleWord(true);
		jTextAreapara_uso_dePedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapara_uso_dePedidoCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreapara_uso_dePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepara_uso_dePedidoCompra = new JScrollPane(jTextAreapara_uso_dePedidoCompra);
		jscrollPanepara_uso_dePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanepara_uso_dePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanepara_uso_dePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonpara_uso_dePedidoCompraBusqueda= new JButtonMe();
		this.jButtonpara_uso_dePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_uso_dePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_uso_dePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_uso_dePedidoCompraBusqueda.setText("U");
		this.jButtonpara_uso_dePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_uso_dePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_uso_dePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapara_uso_dePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapara_uso_dePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_uso_dePedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_uso_dePedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabellugar_entregaPedidoCompra = new JLabelMe();
		this.jLabellugar_entregaPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_LUGARENTREGA+" :");
		this.jLabellugar_entregaPedidoCompra.setToolTipText("Lugar Entrega");
		this.jLabellugar_entregaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellugar_entregaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellugar_entregaPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellugar_entregaPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_LUGARENTREGA);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanellugar_entregaPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextFieldlugar_entregaPedidoCompra= new JTextFieldMe();

		jTextFieldlugar_entregaPedidoCompra.setEnabled(false);
		jTextFieldlugar_entregaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlugar_entregaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlugar_entregaPedidoCompraBusqueda= new JButtonMe();
		this.jButtonlugar_entregaPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlugar_entregaPedidoCompraBusqueda.setText("U");
		this.jButtonlugar_entregaPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlugar_entregaPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlugar_entregaPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlugar_entregaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlugar_entregaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lugar_entregaPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlugar_entregaPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPedidoCompra = new JLabelMe();
		this.jLabeldescripcionPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPedidoCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPaneldescripcionPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jTextAreadescripcionPedidoCompra= new JTextAreaMe();
		jTextAreadescripcionPedidoCompra.setEnabled(false);
		jTextAreadescripcionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoCompra.setLineWrap(true);
		jTextAreadescripcionPedidoCompra.setWrapStyleWord(true);
		jTextAreadescripcionPedidoCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPedidoCompra.setRows(7);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPedidoCompra = new JScrollPane(jTextAreadescripcionPedidoCompra);
		jscrollPanedescripcionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedescripcionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedescripcionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondescripcionPedidoCompraBusqueda= new JButtonMe();
		this.jButtondescripcionPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPedidoCompraBusqueda.setText("U");
		this.jButtondescripcionPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPedidoCompra = new JLabelMe();
		this.jLabelfecha_emisionPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPedidoCompra.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelfecha_emisionPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		//jFormattedTextFieldfecha_emisionPedidoCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPedidoCompra= new JDateChooser();
		jDateChooserfecha_emisionPedidoCompra.setEnabled(false);
		jDateChooserfecha_emisionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPedidoCompra.setDate(new Date());
		jDateChooserfecha_emisionPedidoCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPedidoCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPedidoCompraBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPedidoCompraBusqueda.setText("U");
		this.jButtonfecha_emisionPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPedidoCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaPedidoCompra = new JLabelMe();
		this.jLabelfecha_entregaPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaPedidoCompra.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelfecha_entregaPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		//jFormattedTextFieldfecha_entregaPedidoCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaPedidoCompra= new JDateChooser();
		jDateChooserfecha_entregaPedidoCompra.setEnabled(false);
		jDateChooserfecha_entregaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaPedidoCompra.setDate(new Date());
		jDateChooserfecha_entregaPedidoCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaPedidoCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaPedidoCompraBusqueda= new JButtonMe();
		this.jButtonfecha_entregaPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaPedidoCompraBusqueda.setText("U");
		this.jButtonfecha_entregaPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaPedidoCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidoCompra = new JLabelMe();
		this.jLabelid_empresaPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidoCompra.setToolTipText("Empresa");
		this.jLabelid_empresaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_empresaPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_empresaPedidoCompra= new JComboBoxMe();
		jComboBoxid_empresaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidoCompra.setEnabled(false);

		this.jButtonid_empresaPedidoCompra= new JButtonMe();
		this.jButtonid_empresaPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoCompra.setText("Buscar");
		this.jButtonid_empresaPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoCompra"));

		this.jButtonid_empresaPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoCompraBusqueda.setText("U");
		this.jButtonid_empresaPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoCompraUpdate.setText("U");
		this.jButtonid_empresaPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoCompraUpdate"));



					
		this.jLabelid_sucursalPedidoCompra = new JLabelMe();
		this.jLabelid_sucursalPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidoCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_sucursalPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_sucursalPedidoCompra= new JComboBoxMe();
		jComboBoxid_sucursalPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidoCompra.setEnabled(false);

		this.jButtonid_sucursalPedidoCompra= new JButtonMe();
		this.jButtonid_sucursalPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoCompra.setText("Buscar");
		this.jButtonid_sucursalPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoCompra"));

		this.jButtonid_sucursalPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoCompraBusqueda.setText("U");
		this.jButtonid_sucursalPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoCompraUpdate.setText("U");
		this.jButtonid_sucursalPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoCompraUpdate"));



					
		this.jLabelid_moduloPedidoCompra = new JLabelMe();
		this.jLabelid_moduloPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloPedidoCompra.setToolTipText("Modulo");
		this.jLabelid_moduloPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_moduloPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_moduloPedidoCompra= new JComboBoxMe();
		jComboBoxid_moduloPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloPedidoCompra.setEnabled(false);

		this.jButtonid_moduloPedidoCompra= new JButtonMe();
		this.jButtonid_moduloPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPedidoCompra.setText("Buscar");
		this.jButtonid_moduloPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPedidoCompra"));

		this.jButtonid_moduloPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_moduloPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloPedidoCompraBusqueda.setText("U");
		this.jButtonid_moduloPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_moduloPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_moduloPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloPedidoCompraUpdate.setText("U");
		this.jButtonid_moduloPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPedidoCompraUpdate"));



					
		this.jLabelid_ejercicioPedidoCompra = new JLabelMe();
		this.jLabelid_ejercicioPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPedidoCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_ejercicioPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_ejercicioPedidoCompra= new JComboBoxMe();
		jComboBoxid_ejercicioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPedidoCompra.setEnabled(false);

		this.jButtonid_ejercicioPedidoCompra= new JButtonMe();
		this.jButtonid_ejercicioPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoCompra.setText("Buscar");
		this.jButtonid_ejercicioPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoCompra"));

		this.jButtonid_ejercicioPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoCompraBusqueda.setText("U");
		this.jButtonid_ejercicioPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoCompraUpdate.setText("U");
		this.jButtonid_ejercicioPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoCompraUpdate"));



					
		this.jLabelid_periodoPedidoCompra = new JLabelMe();
		this.jLabelid_periodoPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPedidoCompra.setToolTipText("Periodo");
		this.jLabelid_periodoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_periodoPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_periodoPedidoCompra= new JComboBoxMe();
		jComboBoxid_periodoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPedidoCompra.setEnabled(false);

		this.jButtonid_periodoPedidoCompra= new JButtonMe();
		this.jButtonid_periodoPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoCompra.setText("Buscar");
		this.jButtonid_periodoPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoCompra"));

		this.jButtonid_periodoPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoCompraBusqueda.setText("U");
		this.jButtonid_periodoPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_periodoPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoCompraUpdate.setText("U");
		this.jButtonid_periodoPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoCompraUpdate"));



					
		this.jLabelid_anioPedidoCompra = new JLabelMe();
		this.jLabelid_anioPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPedidoCompra.setToolTipText("Anio");
		this.jLabelid_anioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_anioPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_anioPedidoCompra= new JComboBoxMe();
		jComboBoxid_anioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPedidoCompra.setEnabled(false);

		this.jButtonid_anioPedidoCompra= new JButtonMe();
		this.jButtonid_anioPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoCompra.setText("Buscar");
		this.jButtonid_anioPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoCompra"));

		this.jButtonid_anioPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_anioPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoCompraBusqueda.setText("U");
		this.jButtonid_anioPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_anioPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoCompraUpdate.setText("U");
		this.jButtonid_anioPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoCompraUpdate"));



					
		this.jLabelid_mesPedidoCompra = new JLabelMe();
		this.jLabelid_mesPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPedidoCompra.setToolTipText("Mes");
		this.jLabelid_mesPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_mesPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_mesPedidoCompra= new JComboBoxMe();
		jComboBoxid_mesPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPedidoCompra.setEnabled(false);

		this.jButtonid_mesPedidoCompra= new JButtonMe();
		this.jButtonid_mesPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoCompra.setText("Buscar");
		this.jButtonid_mesPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoCompra"));

		this.jButtonid_mesPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_mesPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoCompraBusqueda.setText("U");
		this.jButtonid_mesPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_mesPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoCompraUpdate.setText("U");
		this.jButtonid_mesPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoCompraUpdate"));



					
		this.jLabelid_clientePedidoCompra = new JLabelMe();
		this.jLabelid_clientePedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePedidoCompra.setToolTipText("Cliente");
		this.jLabelid_clientePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_clientePedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_clientePedidoCompra= new JComboBoxMe();
		jComboBoxid_clientePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePedidoCompra= new JButtonMe();
		this.jButtonid_clientePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoCompra.setText("Buscar");
		this.jButtonid_clientePedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoCompra"));

		this.jButtonid_clientePedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_clientePedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoCompraBusqueda.setText("U");
		this.jButtonid_clientePedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_clientePedidoCompraUpdate= new JButtonMe();
		this.jButtonid_clientePedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoCompraUpdate.setText("U");
		this.jButtonid_clientePedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoCompraUpdate"));



					
		this.jLabelid_usuarioPedidoCompra = new JLabelMe();
		this.jLabelid_usuarioPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPedidoCompra.setToolTipText("Usuario");
		this.jLabelid_usuarioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_usuarioPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_usuarioPedidoCompra= new JComboBoxMe();
		jComboBoxid_usuarioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPedidoCompra.setEnabled(false);

		this.jButtonid_usuarioPedidoCompra= new JButtonMe();
		this.jButtonid_usuarioPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoCompra.setText("Buscar");
		this.jButtonid_usuarioPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoCompra"));

		this.jButtonid_usuarioPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_usuarioPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoCompraBusqueda.setText("U");
		this.jButtonid_usuarioPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_usuarioPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoCompraUpdate.setText("U");
		this.jButtonid_usuarioPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoCompraUpdate"));



					
		this.jLabelid_monedaPedidoCompra = new JLabelMe();
		this.jLabelid_monedaPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaPedidoCompra.setToolTipText("Moneda");
		this.jLabelid_monedaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_monedaPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_monedaPedidoCompra= new JComboBoxMe();
		jComboBoxid_monedaPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaPedidoCompra= new JButtonMe();
		this.jButtonid_monedaPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoCompra.setText("Buscar");
		this.jButtonid_monedaPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoCompra"));

		this.jButtonid_monedaPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_monedaPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoCompraBusqueda.setText("U");
		this.jButtonid_monedaPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_monedaPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_monedaPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoCompraUpdate.setText("U");
		this.jButtonid_monedaPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoCompraUpdate"));



					
		this.jLabelid_estado_pedido_compraPedidoCompra = new JLabelMe();
		this.jLabelid_estado_pedido_compraPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDESTADOPEDIDOCOMPRA+" : *");
		this.jLabelid_estado_pedido_compraPedidoCompra.setToolTipText("Estado");
		this.jLabelid_estado_pedido_compraPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedido_compraPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedido_compraPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_compraPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_compraPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_compraPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDESTADOPEDIDOCOMPRA);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_compraPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_estado_pedido_compraPedidoCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_compraPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_compraPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_pedido_compraPedidoCompra.setEnabled(false);

		this.jButtonid_estado_pedido_compraPedidoCompra= new JButtonMe();
		this.jButtonid_estado_pedido_compraPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_compraPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_compraPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_compraPedidoCompra.setText("Buscar");
		this.jButtonid_estado_pedido_compraPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_compraPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_compraPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_compraPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_compraPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_compraPedidoCompra"));

		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_compraPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_compraPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_compraPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_compraPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_compraPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_compraPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_compraPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_compraPedidoCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_compraPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_compraPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_compraPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_compraPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_compraPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_compraPedidoCompraUpdate"));



					
		this.jLabelid_empleadoPedidoCompra = new JLabelMe();
		this.jLabelid_empleadoPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPedidoCompra.setToolTipText("Empleado");
		this.jLabelid_empleadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_empleadoPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_empleadoPedidoCompra= new JComboBoxMe();
		jComboBoxid_empleadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPedidoCompra= new JButtonMe();
		this.jButtonid_empleadoPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoCompra.setText("Buscar");
		this.jButtonid_empleadoPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoCompra"));

		this.jButtonid_empleadoPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_empleadoPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoCompraBusqueda.setText("U");
		this.jButtonid_empleadoPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_empleadoPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoCompraUpdate.setText("U");
		this.jButtonid_empleadoPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoCompraUpdate"));



					
		this.jLabelid_formatoPedidoCompra = new JLabelMe();
		this.jLabelid_formatoPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoPedidoCompra.setToolTipText("Formato");
		this.jLabelid_formatoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_formatoPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_formatoPedidoCompra= new JComboBoxMe();
		jComboBoxid_formatoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoPedidoCompra= new JButtonMe();
		this.jButtonid_formatoPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoCompra.setText("Buscar");
		this.jButtonid_formatoPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoCompra"));

		this.jButtonid_formatoPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_formatoPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoCompraBusqueda.setText("U");
		this.jButtonid_formatoPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_formatoPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_formatoPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoCompraUpdate.setText("U");
		this.jButtonid_formatoPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoCompraUpdate"));



					
		this.jLabelid_tipo_cambioPedidoCompra = new JLabelMe();
		this.jLabelid_tipo_cambioPedidoCompra.setText(""+PedidoCompraConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioPedidoCompra.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioPedidoCompra.setToolTipText(PedidoCompraConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutPedidoCompra = new GridBagLayout();
		this.jPanelid_tipo_cambioPedidoCompra.setLayout(this.gridaBagLayoutPedidoCompra);


		jComboBoxid_tipo_cambioPedidoCompra= new JComboBoxMe();
		jComboBoxid_tipo_cambioPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioPedidoCompra.setEnabled(false);

		this.jButtonid_tipo_cambioPedidoCompra= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoCompra.setText("Buscar");
		this.jButtonid_tipo_cambioPedidoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioPedidoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoCompra"));

		this.jButtonid_tipo_cambioPedidoCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoCompraBusqueda.setText("U");
		this.jButtonid_tipo_cambioPedidoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioPedidoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoCompraBusqueda"));

		if(this.pedidocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioPedidoCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioPedidoCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoCompraUpdate.setText("U");
		this.jButtonid_tipo_cambioPedidoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioPedidoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioPedidoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoCompraUpdate"));



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
		//this.jInternalFrameDetallePedidoCompra = new PedidoCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoCompra= new GridBagLayout();
		

		
		String sToolTipPedidoCompra="";
		sToolTipPedidoCompra=PedidoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoCompra+="(Inventario.PedidoCompra)";
		}
		
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidoCompra = new JButtonMe();
		this.jButtonModificarPedidoCompra = new JButtonMe();
        this.jButtonActualizarPedidoCompra = new JButtonMe();
        this.jButtonEliminarPedidoCompra = new JButtonMe();
        this.jButtonCancelarPedidoCompra = new JButtonMe();
        this.jButtonGuardarCambiosPedidoCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidoCompra = new JButtonMe();
		this.jButtonCerrarPedidoCompra = new JButtonMe();
		
		this.jScrollPanelDatosPedidoCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidoCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidoCompra = new JScrollPane();
				
		
		
		this.jPanelCamposPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Compra";
		
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposPedidoCompra.setName("jPanelCamposPedidoCompra"); 

		this.jPanelCamposOcultosPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidoCompra.setName("jPanelCamposOcultosPedidoCompra"); 

        this.jPanelAccionesPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesPedidoCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidoCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidoCompra.setText("Nuevo");
		this.jButtonModificarPedidoCompra.setText("Editar");
        this.jButtonActualizarPedidoCompra.setText("Actualizar");
        this.jButtonEliminarPedidoCompra.setText("Eliminar");
        this.jButtonCancelarPedidoCompra.setText("Cancelar");
        this.jButtonGuardarCambiosPedidoCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidoCompra.setText("Guardar");
		this.jButtonCerrarPedidoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoCompra,"nuevo_button","Nuevo",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidoCompra,"modificar_button","Editar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidoCompra,"actualizar_button","Actualizar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidoCompra,"eliminar_button","Eliminar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidoCompra,"cancelar_button","Cancelar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidoCompra,"guardarcambios_button","Guardar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoCompra,"guardarcambiostabla_button","Guardar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoCompra,"cerrar_button","Salir",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidoCompra.setToolTipText("Nuevo"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidoCompra.setToolTipText("Editar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidoCompra.setToolTipText("Actualizar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidoCompra.setToolTipText("Eliminar)"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidoCompra.setToolTipText("Cancelar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidoCompra.setToolTipText("Guardar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidoCompra.setToolTipText("Guardar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoCompra.setToolTipText("Salir"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoCompra";
		inputMap = this.jButtonNuevoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidoCompra";
		inputMap = this.jButtonActualizarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidoCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidoCompra";
		inputMap = this.jButtonEliminarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidoCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidoCompra";
		inputMap = this.jButtonCancelarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidoCompra"));
		
		//CERRAR		
		sMapKey = "CerrarPedidoCompra";
		inputMap = this.jButtonCerrarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoCompra";
		inputMap = this.jButtonGuardarCambiosTablaPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidoCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidoCompra.setToolTipText("Nuevo PedidoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidoCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidoCompra.setToolTipText("Sin Cerrar Ventana PedidoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidoCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidoCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoCompra.setText("Accion");
		this.jComboBoxTiposAccionesPedidoCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidoCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidoCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidoCompra = new JLabelMe();
		
		this.jLabelAccionesPedidoCompra.setText("Acciones");		
		this.jLabelAccionesPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidoCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidoCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidoCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidoCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidoCompra = new GridBagLayout();
		
		this.jPanelCamposPedidoCompra.setLayout(gridaBagLayoutCamposPedidoCompra);
		this.jPanelCamposOcultosPedidoCompra.setLayout(gridaBagLayoutCamposOcultosPedidoCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidoCompra.add(jLabelIdPedidoCompra, this.gridBagConstraintsPedidoCompra);



	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidoCompra.add(jLabelidPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidoCompra.add(jLabelid_empresaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoCompra.add(jButtonid_empresaPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoCompra.add(jButtonid_empresaPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidoCompra.add(jComboBoxid_empresaPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedidoCompra.add(jLabelid_sucursalPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoCompra.add(jButtonid_sucursalPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoCompra.add(jButtonid_sucursalPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedidoCompra.add(jComboBoxid_sucursalPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloPedidoCompra.add(jLabelid_moduloPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloPedidoCompra.add(jButtonid_moduloPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloPedidoCompra.add(jButtonid_moduloPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloPedidoCompra.add(jComboBoxid_moduloPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPedidoCompra.add(jLabelid_ejercicioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoCompra.add(jButtonid_ejercicioPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoCompra.add(jButtonid_ejercicioPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPedidoCompra.add(jComboBoxid_ejercicioPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPedidoCompra.add(jLabelid_periodoPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoCompra.add(jButtonid_periodoPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoCompra.add(jButtonid_periodoPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPedidoCompra.add(jComboBoxid_periodoPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPedidoCompra.add(jLabelid_anioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedidoCompra.add(jButtonid_anioPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedidoCompra.add(jButtonid_anioPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPedidoCompra.add(jComboBoxid_anioPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPedidoCompra.add(jLabelid_mesPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedidoCompra.add(jButtonid_mesPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedidoCompra.add(jButtonid_mesPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPedidoCompra.add(jComboBoxid_mesPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialPedidoCompra.add(jLabelnumero_secuencialPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialPedidoCompra.add(jButtonnumero_secuencialPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialPedidoCompra.add(jTextFieldnumero_secuencialPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePedidoCompra.add(jLabelid_clientePedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 2;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePedidoCompra.add(jButtonid_clientePedidoCompra, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoCompra.add(jButtonid_clientePedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 4;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoCompra.add(jButtonid_clientePedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePedidoCompra.add(jComboBoxid_clientePedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPedidoCompra.add(jLabelid_usuarioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoCompra.add(jButtonid_usuarioPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoCompra.add(jButtonid_usuarioPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPedidoCompra.add(jComboBoxid_usuarioPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaPedidoCompra.add(jLabelid_monedaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedidoCompra.add(jButtonid_monedaPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedidoCompra.add(jButtonid_monedaPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaPedidoCompra.add(jComboBoxid_monedaPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_compraPedidoCompra.add(jLabelid_estado_pedido_compraPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_compraPedidoCompra.add(jButtonid_estado_pedido_compraPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_compraPedidoCompra.add(jButtonid_estado_pedido_compraPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_compraPedidoCompra.add(jComboBoxid_estado_pedido_compraPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalPedidoCompra.add(jLabeltotalPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPedidoCompra.add(jButtontotalPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalPedidoCompra.add(jTextFieldtotalPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPedidoCompra.add(jLabelfechaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPedidoCompra.add(jButtonfechaPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPedidoCompra.add(jDateChooserfechaPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPedidoCompra.add(jLabelid_empleadoPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 2;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPedidoCompra.add(jButtonid_empleadoPedidoCompra, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedidoCompra.add(jButtonid_empleadoPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 4;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedidoCompra.add(jButtonid_empleadoPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPedidoCompra.add(jComboBoxid_empleadoPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsablePedidoCompra.add(jLabelresponsablePedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsablePedidoCompra.add(jButtonresponsablePedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsablePedidoCompra.add(jscrollPaneresponsablePedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsolicitado_porPedidoCompra.add(jLabelsolicitado_porPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsolicitado_porPedidoCompra.add(jButtonsolicitado_porPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsolicitado_porPedidoCompra.add(jscrollPanesolicitado_porPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmotivo_solicitudPedidoCompra.add(jLabelmotivo_solicitudPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelmotivo_solicitudPedidoCompra.add(jButtonmotivo_solicitudPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmotivo_solicitudPedidoCompra.add(jscrollPanemotivo_solicitudPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarea_solicitudPedidoCompra.add(jLabelarea_solicitudPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelarea_solicitudPedidoCompra.add(jButtonarea_solicitudPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarea_solicitudPedidoCompra.add(jscrollPanearea_solicitudPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_uso_dePedidoCompra.add(jLabelpara_uso_dePedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_uso_dePedidoCompra.add(jButtonpara_uso_dePedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_uso_dePedidoCompra.add(jscrollPanepara_uso_dePedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellugar_entregaPedidoCompra.add(jLabellugar_entregaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanellugar_entregaPedidoCompra.add(jButtonlugar_entregaPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellugar_entregaPedidoCompra.add(jTextFieldlugar_entregaPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPedidoCompra.add(jLabeldescripcionPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPedidoCompra.add(jButtondescripcionPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPedidoCompra.add(jscrollPanedescripcionPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPedidoCompra.add(jLabelfecha_emisionPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPedidoCompra.add(jButtonfecha_emisionPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPedidoCompra.add(jDateChooserfecha_emisionPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaPedidoCompra.add(jLabelfecha_entregaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaPedidoCompra.add(jButtonfecha_entregaPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaPedidoCompra.add(jDateChooserfecha_entregaPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoPedidoCompra.add(jLabelid_formatoPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 2;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoCompra.add(jButtonid_formatoPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoCompra.add(jButtonid_formatoPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoPedidoCompra.add(jComboBoxid_formatoPedidoCompra, this.gridBagConstraintsPedidoCompra);


	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 0;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioPedidoCompra.add(jLabelid_tipo_cambioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 2;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioPedidoCompra.add(jButtonid_tipo_cambioPedidoCompra, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 3;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedidoCompra.add(jButtonid_tipo_cambioPedidoCompraBusqueda, this.gridBagConstraintsPedidoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 4;
		this.gridBagConstraintsPedidoCompra.ipadx = 0;
		this.gridBagConstraintsPedidoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedidoCompra.add(jButtonid_tipo_cambioPedidoCompraUpdate, this.gridBagConstraintsPedidoCompra);
	}

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompra.gridy = 0;
	this.gridBagConstraintsPedidoCompra.gridx = 1;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioPedidoCompra.add(jComboBoxid_tipo_cambioPedidoCompra, this.gridBagConstraintsPedidoCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelidPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelnumero_secuencialPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelid_clientePedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelid_monedaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelid_estado_pedido_compraPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelid_empleadoPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelresponsablePedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelsolicitado_porPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelmotivo_solicitudPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelarea_solicitudPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelpara_uso_dePedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanellugar_entregaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.gridBagConstraintsPedidoCompra.gridwidth = 2;

	this.jPanelCamposPedidoCompra.add(this.jPaneldescripcionPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}

	iXPanelCamposPedidoCompra=0;
	iYPanelCamposPedidoCompra++;

	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelfecha_emisionPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelfecha_entregaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompra.add(this.jPanelid_formatoPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposPedidoCompra % 3==0) {
		iXPanelCamposPedidoCompra=0;
		iYPanelCamposPedidoCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_empresaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_sucursalPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_moduloPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_ejercicioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_periodoPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_anioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_mesPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_usuarioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPaneltotalPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelfechaPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
	}
	this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompra.gridy = iYPanelCamposOcultosPedidoCompra;
	this.gridBagConstraintsPedidoCompra.gridx = iXPanelCamposOcultosPedidoCompra++;
	this.gridBagConstraintsPedidoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompra.add(this.jPanelid_tipo_cambioPedidoCompra, this.gridBagConstraintsPedidoCompra);



	if(iXPanelCamposOcultosPedidoCompra % 3==0) {
		iXPanelCamposOcultosPedidoCompra=0;
		iYPanelCamposOcultosPedidoCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesPedidoCompra= new GridBagLayout();
		this.jPanelAccionesPedidoCompra.setLayout(gridaBagLayoutAccionesPedidoCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidoCompra= new GridBagLayout();
		this.jPanelAccionesFormularioPedidoCompra.setLayout(gridaBagLayoutAccionesFormularioPedidoCompra);
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoCompra.add(this.jComboBoxTiposAccionesFormularioPedidoCompra, this.gridBagConstraintsPedidoCompra);

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoCompra.add(this.jCheckBoxPostAccionNuevoPedidoCompra, this.gridBagConstraintsPedidoCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidocompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoCompra.add(this.jCheckBoxPostAccionSinCerrarPedidoCompra, this.gridBagConstraintsPedidoCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidocompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoCompra.add(this.jCheckBoxPostAccionSinMensajePedidoCompra, this.gridBagConstraintsPedidoCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidoCompra.add(this.jButtonModificarPedidoCompra, this.gridBagConstraintsPedidoCompra);							

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidoCompra.add(this.jButtonEliminarPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = 0;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoCompra.add(this.jButtonActualizarPedidoCompra, this.gridBagConstraintsPedidoCompra);


		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = 0;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoCompra.add(this.jButtonGuardarCambiosPedidoCompra, this.gridBagConstraintsPedidoCompra);	
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = 0;		
		this.gridBagConstraintsPedidoCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidoCompra.add(this.jButtonCancelarPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();						
			this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoCompra.gridx = 0;		
			//this.gridBagConstraintsPedidoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoCompra.gridx =0;
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoCompra, this.gridBagConstraintsPedidoCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidoCompra = new PedidoCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoCompraModel pedidocompraModel=new PedidoCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoCompraModel.PedidoCompraFocusTraversalPolicy pedidocompraFocusTraversalPolicy = pedidocompraModel.new PedidoCompraFocusTraversalPolicy(this);
			
			//pedidocompraFocusTraversalPolicy.setpedidocompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidocompraModel);
			
			
			this.jContentPaneDetallePedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidoCompra = new GridBagLayout();	
			this.jContentPaneDetallePedidoCompra.setLayout(gridaBagLayoutDetallePedidoCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionPedidoCompra=   new JScrollPane(jContentPaneDetallePedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsPedidoCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidoCompra.gridx = 0;
	        
			this.jContentPaneDetallePedidoCompra.add(jPanelCamposPedidoCompra, gridBagConstraintsPedidoCompra);
			
			
			
			
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
						&& pedidocompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompra(this.puedeCargarPorParteDetallePedidoCompra,false,-1);
					
					if(this.pedidocompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidoCompra= new GridBagConstraints();
						this.gridBagConstraintsPedidoCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidoCompra.gridx = 0;
						this.jContentPaneDetallePedidoCompra.add(this.jTabbedPaneRelacionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidoCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidoCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
					this.gridBagConstraintsPedidoCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidoCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidoCompra.gridx = 0;
					
				
					this.jContentPaneDetallePedidoCompra.add(jPanelCamposOcultosPedidoCompra, gridBagConstraintsPedidoCompra);
				
					this.jPanelCamposOcultosPedidoCompra.setVisible(true);
				}
			}					
			
			
			
			
			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsPedidoCompra.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPedidoCompra.gridx = 0;
	        
			
			this.jContentPaneDetallePedidoCompra.add(this.jPanelAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidoCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidoCompra=   new JScrollPane(this.jPanelCamposPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidoCompra.gridx = 0;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidoCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidoCompra, this.gridBagConstraintsPedidoCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidoCompra, this.gridBagConstraintsPedidoCompra);			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoCompra, this.gridBagConstraintsPedidoCompra);
			
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidoCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidoCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePedidoCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidocompraSessionBean=new DetallePedidoCompraSessionBean();
		this.detallepedidocompraSessionBean.setConGuardarRelaciones(false);
		this.detallepedidocompraSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidocompraBeanSwingJInternalFrame=null;//new DetallePedidoCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidocompraBeanSwingJInternalFramePopup=new DetallePedidoCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidocompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidocompraSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidocompraBeanSwingJInternalFrame=new DetallePedidoCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidocompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidocompraBeanSwingJInternalFrame.setdetallepedidocompraSessionBean(this.detallepedidocompraSessionBean);

				//this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
				//this.gridBagConstraintsPedidoCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedidoCompra.gridx = 0;
				//this.jContentPaneDetallePedidoCompra.add(this.detallepedidocompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedidoCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedidoCompra.add("Detalle Pedido Compras",this.detallepedidocompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedidoCompra.setComponentAt(iIndexTab,this.detallepedidocompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidocompraSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidocompraBeanSwingJInternalFrame=null;//new DetallePedidoCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidocompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedidoCompra) {
					this.jTabbedPaneRelacionesPedidoCompra.add("Detalle Pedido Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetallePedidoCompraBeanSwingJInternalFrame(List<PedidoCompra> pedidocompras,PedidoCompra pedidocompra,DetallePedidoCompraBeanSwingJInternalFrame detallepedidocompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidocompraBeanSwingJInternalFrame=new DetallePedidoCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidocompraBeanSwingJInternalFrame.getDetallePedidoCompraLogic().setConnexion(this.pedidocompraLogic.getConnexion());

					detallepedidocompraBeanSwingJInternalFrame.setpedidocomprasForeignKey(pedidocompras);
					detallepedidocompraBeanSwingJInternalFrame.setpedidocompraForeignKey(pedidocompra);
					detallepedidocompraBeanSwingJInternalFrame.detallepedidocompraSessionBean.setisBusquedaDesdeForeignKeySesionPedidoCompra(true);
					detallepedidocompraBeanSwingJInternalFrame.detallepedidocompraSessionBean.setlidPedidoCompraActual(pedidocompra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidocompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedidoCompra(detallepedidocompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidocompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedidoCompra(true);
					detallepedidocompraBeanSwingJInternalFrame.setid_pedido_compraFK_IdPedidoCompra(pedidocompra.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidocompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidocompraBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoCompraForeignKey(pedidocompra,1,false,true,true);
					detallepedidocompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidocompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedidoCompra");
					detallepedidocompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedidoCompra");
					detallepedidocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoCompra(true);
					detallepedidocompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedidoCompra("n",detallepedidocompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidocompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidocompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidocompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidocompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompra("relacionado");
					} else {
						detallepedidocompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompra("no_relacionado");
					}

					detallepedidocompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedidoCompra().setVisible(false);

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
