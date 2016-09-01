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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.AutoriPagoOrdenCompraConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class AutoriPagoOrdenCompraDetalleFormJInternalFrame extends AutoriPagoOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAutoriPagoOrdenCompra;
	
	protected JMenuBar jmenuBarDetalleAutoriPagoOrdenCompra;
	
	protected JMenu jmenuDetalleAutoriPagoOrdenCompra;
	protected JMenu jmenuDetalleArchivoAutoriPagoOrdenCompra;
	protected JMenu jmenuDetalleAccionesAutoriPagoOrdenCompra;
	protected JMenu jmenuDetalleDatosAutoriPagoOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriPagoOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsAutoriPagoOrdenCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AutoriPagoOrdenCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleAutoriPagoOrdenCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";
	
	public AutoriPagoOrdenCompraSessionBean autoripagoordencompraSessionBean;
	
	
	
	
	public TipoCambioSessionBean tipocambioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public OrdenCompraSessionBean ordencompraSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;	
	
	public AutoriPagoOrdenCompraLogic autoripagoordencompraLogic;
	
	public JScrollPane jScrollPanelDatosAutoriPagoOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionAutoriPagoOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralAutoriPagoOrdenCompra;
	
	protected JPanel jPanelCamposAutoriPagoOrdenCompra;    
	protected JPanel jPanelCamposOcultosAutoriPagoOrdenCompra;    	
	protected JPanel jPanelAccionesAutoriPagoOrdenCompra;
	protected JPanel jPanelAccionesFormularioAutoriPagoOrdenCompra;
    
	
	
	protected Integer iXPanelCamposAutoriPagoOrdenCompra=0;
	protected Integer iYPanelCamposAutoriPagoOrdenCompra=0;
	
	protected Integer iXPanelCamposOcultosAutoriPagoOrdenCompra=0;
	protected Integer iYPanelCamposOcultosAutoriPagoOrdenCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAutoriPagoOrdenCompra;
	public JButton jButtonModificarAutoriPagoOrdenCompra;
	public JButton jButtonActualizarAutoriPagoOrdenCompra;
    public JButton jButtonEliminarAutoriPagoOrdenCompra;
	public JButton jButtonCancelarAutoriPagoOrdenCompra;
    public JButton jButtonGuardarCambiosAutoriPagoOrdenCompra;
	public JButton jButtonGuardarCambiosTablaAutoriPagoOrdenCompra;
	protected JButton jButtonCerrarAutoriPagoOrdenCompra;
	
	
	protected JButton jButtonProcesarInformacionAutoriPagoOrdenCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAutoriPagoOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAutoriPagoOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAutoriPagoOrdenCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonModificarToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonActualizarToolBarAutoriPagoOrdenCompra;
    protected JButton jButtonEliminarToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonCancelarToolBarAutoriPagoOrdenCompra;
    protected JButton jButtonGuardarCambiosToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriPagoOrdenCompra;
	protected JButton jButtonCerrarToolBarAutoriPagoOrdenCompra;
	
	protected JButton jButtonProcesarInformacionToolBarAutoriPagoOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemModificarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemActualizarAutoriPagoOrdenCompra;
    protected JMenuItem jMenuItemEliminarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemCancelarAutoriPagoOrdenCompra;
    protected JMenuItem jMenuItemGuardarCambiosAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemCerrarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriPagoOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarAutoriPagoOrdenCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriPagoOrdenCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriPagoOrdenCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAutoriPagoOrdenCompra;
	public JLabel jLabelIdAutoriPagoOrdenCompra;
	public JLabel jLabelidAutoriPagoOrdenCompra;
	public JButton jButtonidAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteAutoriPagoOrdenCompra;
	public JLabel jLabelnumero_comprobanteAutoriPagoOrdenCompra;
	public JTextField jTextFieldnumero_comprobanteAutoriPagoOrdenCompra;
	public JButton jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfechaAutoriPagoOrdenCompra;
	public JLabel jLabelfechaAutoriPagoOrdenCompra;
	//public JFormattedTextField jDateChooserfechaAutoriPagoOrdenCompra;

	public JDateChooser jDateChooserfechaAutoriPagoOrdenCompra;
	public JButton jButtonfechaAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autoriAutoriPagoOrdenCompra;
	public JLabel jLabelfecha_autoriAutoriPagoOrdenCompra;
	//public JFormattedTextField jDateChooserfecha_autoriAutoriPagoOrdenCompra;

	public JDateChooser jDateChooserfecha_autoriAutoriPagoOrdenCompra;
	public JButton jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotalAutoriPagoOrdenCompra;
	public JLabel jLabeltotalAutoriPagoOrdenCompra;
	public JTextField jTextFieldtotalAutoriPagoOrdenCompra;
	public JButton jButtontotalAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_servidorAutoriPagoOrdenCompra;
	public JLabel jLabelfecha_servidorAutoriPagoOrdenCompra;
	//public JFormattedTextField jDateChooserfecha_servidorAutoriPagoOrdenCompra;

	public JDateChooser jDateChooserfecha_servidorAutoriPagoOrdenCompra;
	public JButton jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asientoAutoriPagoOrdenCompra;
	public JLabel jLabelcodigo_asientoAutoriPagoOrdenCompra;
	public JTextField jTextFieldcodigo_asientoAutoriPagoOrdenCompra;
	public JButton jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_asientoAutoriPagoOrdenCompra;
	public JLabel jLabelfecha_asientoAutoriPagoOrdenCompra;
	//public JFormattedTextField jDateChooserfecha_asientoAutoriPagoOrdenCompra;

	public JDateChooser jDateChooserfecha_asientoAutoriPagoOrdenCompra;
	public JButton jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_asientoAutoriPagoOrdenCompra;
	public JLabel jLabelvalor_asientoAutoriPagoOrdenCompra;
	public JTextField jTextFieldvalor_asientoAutoriPagoOrdenCompra;
	public JButton jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotal_saldoAutoriPagoOrdenCompra;
	public JLabel jLabeltotal_saldoAutoriPagoOrdenCompra;
	public JTextField jTextFieldtotal_saldoAutoriPagoOrdenCompra;
	public JButton jButtontotal_saldoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioAutoriPagoOrdenCompra;
	public JLabel jLabelid_tipo_cambioAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioAutoriPagoOrdenCompra;
	public JButton jButtonid_tipo_cambioAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaAutoriPagoOrdenCompra;
	public JLabel jLabelid_monedaAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaAutoriPagoOrdenCompra;
	public JButton jButtonid_monedaAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_monedaAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_monedaAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteAutoriPagoOrdenCompra;
	public JLabel jLabelid_clienteAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteAutoriPagoOrdenCompra;
	public JButton jButtonid_clienteAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_clienteAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaAutoriPagoOrdenCompra;
	public JLabel jLabelid_empresaAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAutoriPagoOrdenCompra;
	public JButton jButtonid_empresaAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_empresaAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAutoriPagoOrdenCompra;
	public JLabel jLabelid_sucursalAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAutoriPagoOrdenCompra;
	public JButton jButtonid_sucursalAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_sucursalAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_orden_compraAutoriPagoOrdenCompra;
	public JLabel jLabelid_orden_compraAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraAutoriPagoOrdenCompra;
	public JButton jButtonid_orden_compraAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_orden_compraAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraAutoriPagoOrdenCompraArbol= new JButtonMe();

	public JPanel jPanelid_transaccionAutoriPagoOrdenCompra;
	public JLabel jLabelid_transaccionAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionAutoriPagoOrdenCompra;
	public JButton jButtonid_transaccionAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_transaccionAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_transaccionAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloAutoriPagoOrdenCompra;
	public JLabel jLabelid_moduloAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloAutoriPagoOrdenCompra;
	public JButton jButtonid_moduloAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_moduloAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_moduloAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioAutoriPagoOrdenCompra;
	public JLabel jLabelid_ejercicioAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioAutoriPagoOrdenCompra;
	public JButton jButtonid_ejercicioAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_ejercicioAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioAutoriPagoOrdenCompra;
	public JLabel jLabelid_usuarioAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioAutoriPagoOrdenCompra;
	public JButton jButtonid_usuarioAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_usuarioAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_usuarioAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableAutoriPagoOrdenCompra;
	public JLabel jLabelid_asiento_contableAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableAutoriPagoOrdenCompra;
	public JButton jButtonid_asiento_contableAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoAutoriPagoOrdenCompra;
	public JLabel jLabelid_bancoAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoAutoriPagoOrdenCompra;
	public JButton jButtonid_bancoAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_bancoAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_bancoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_bancoAutoriPagoOrdenCompra;
	public JLabel jLabelid_cuenta_bancoAutoriPagoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra;
	public JButton jButtonid_cuenta_bancoAutoriPagoOrdenCompra= new JButtonMe();
	public JButton jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAutoriPagoOrdenCompra;
	
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
		
	public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=432;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAutoriPagoOrdenCompra=new JPanel();
				this.jPanelAccionesFormularioAutoriPagoOrdenCompra=new JPanel();
				this.jmenuBarDetalleAutoriPagoOrdenCompra=new JMenuBar();
				this.jTtoolBarDetalleAutoriPagoOrdenCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoOrdenCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriPagoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAutoriPagoOrdenCompra() {
		return this.jButtonActualizarToolBarAutoriPagoOrdenCompra;
	}
	
	public JButton getjButtonEliminarToolBarAutoriPagoOrdenCompra() {
		return this.jButtonEliminarToolBarAutoriPagoOrdenCompra;
	}
	
	public JButton getjButtonCancelarToolBarAutoriPagoOrdenCompra() {
		return this.jButtonCancelarToolBarAutoriPagoOrdenCompra;
	}		
	
	public JButton getjButtonProcesarInformacionAutoriPagoOrdenCompra() {
		return this.jButtonProcesarInformacionAutoriPagoOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriPagoOrdenCompra)	{
		this.jButtonProcesarInformacionAutoriPagoOrdenCompra = jButtonProcesarInformacionAutoriPagoOrdenCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposAccionesAutoriPagoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposRelacionesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposRelacionesAutoriPagoOrdenCompra = jComboBoxTiposRelacionesAutoriPagoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposAccionesAutoriPagoOrdenCompra) {
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra = jComboBoxTiposAccionesAutoriPagoOrdenCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra() {
		return this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra(
			JComboBox jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra) {
		this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra = jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.autoripagoordencompraSessionBean=new AutoriPagoOrdenCompraSessionBean();
		
		this.autoripagoordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoripagoordencompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriPagoOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autori Pago Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
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
	
		AutoriPagoOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutoriPagoOrdenCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAutoriPagoOrdenCompra=new JButtonMe();
				this.jButtonModificarToolBarAutoriPagoOrdenCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAutoriPagoOrdenCompra,this.jTtoolBarDetalleAutoriPagoOrdenCompra,
							"actualizar","actualizar","Actualizar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAutoriPagoOrdenCompra,this.jTtoolBarDetalleAutoriPagoOrdenCompra,
							"eliminar","eliminar","Eliminar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAutoriPagoOrdenCompra,this.jTtoolBarDetalleAutoriPagoOrdenCompra,
							"cancelar","cancelar","Cancelar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAutoriPagoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAutoriPagoOrdenCompra,this.jTtoolBarDetalleAutoriPagoOrdenCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAutoriPagoOrdenCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAutoriPagoOrdenCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAutoriPagoOrdenCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAutoriPagoOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAutoriPagoOrdenCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriPagoOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriPagoOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriPagoOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAutoriPagoOrdenCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAutoriPagoOrdenCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAutoriPagoOrdenCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAutoriPagoOrdenCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAutoriPagoOrdenCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAutoriPagoOrdenCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAutoriPagoOrdenCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAutoriPagoOrdenCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAutoriPagoOrdenCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAutoriPagoOrdenCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAutoriPagoOrdenCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAutoriPagoOrdenCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriPagoOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriPagoOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriPagoOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAutoriPagoOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAutoriPagoOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAutoriPagoOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAutoriPagoOrdenCompra.add(this.jMenuItemDetalleCerrarAutoriPagoOrdenCompra);
		
		this.jmenuDetalleAccionesAutoriPagoOrdenCompra.add(this.jMenuItemActualizarAutoriPagoOrdenCompra);
		this.jmenuDetalleAccionesAutoriPagoOrdenCompra.add(this.jMenuItemEliminarAutoriPagoOrdenCompra);
		this.jmenuDetalleAccionesAutoriPagoOrdenCompra.add(this.jMenuItemCancelarAutoriPagoOrdenCompra);		
		
		//this.jmenuDetalleDatosAutoriPagoOrdenCompra.add(this.jMenuItemDetalleAbrirOrderByAutoriPagoOrdenCompra);				
		this.jmenuDetalleDatosAutoriPagoOrdenCompra.add(this.jMenuItemDetalleMostarOcultarAutoriPagoOrdenCompra);				
				
		//this.jmenuDetalleAccionesAutoriPagoOrdenCompra.add(this.jMenuItemGuardarCambiosAutoriPagoOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAutoriPagoOrdenCompra.add(this.jmenuDetalleArchivoAutoriPagoOrdenCompra);		
		this.jmenuBarDetalleAutoriPagoOrdenCompra.add(this.jmenuDetalleAccionesAutoriPagoOrdenCompra);		
		this.jmenuBarDetalleAutoriPagoOrdenCompra.add(this.jmenuDetalleDatosAutoriPagoOrdenCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAutoriPagoOrdenCompra);				
	}
	
	
	public void inicializarElementosCamposAutoriPagoOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAutoriPagoOrdenCompra = new JLabelMe();
		jLabelIdAutoriPagoOrdenCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAutoriPagoOrdenCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAutoriPagoOrdenCompra= new GridBagLayout();

		this.jPanelidAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);

		jLabelidAutoriPagoOrdenCompra = new JLabel();
		jLabelidAutoriPagoOrdenCompra.setText("Id");

		jLabelidAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_comprobanteAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelnumero_comprobanteAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteAutoriPagoOrdenCompra.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelnumero_comprobanteAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra= new JTextFieldMe();

		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra.setEnabled(false);
		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfechaAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelfechaAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAutoriPagoOrdenCompra.setToolTipText("Fecha");
		this.jLabelfechaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelfechaAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		//jFormattedTextFieldfechaAutoriPagoOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfechaAutoriPagoOrdenCompra= new JDateChooser();
		jDateChooserfechaAutoriPagoOrdenCompra.setEnabled(false);
		jDateChooserfechaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAutoriPagoOrdenCompra.setDate(new Date());
		jDateChooserfechaAutoriPagoOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAutoriPagoOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autoriAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelfecha_autoriAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHAAUTORI+" : *");
		this.jLabelfecha_autoriAutoriPagoOrdenCompra.setToolTipText("Fecha Autori");
		this.jLabelfecha_autoriAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_autoriAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_autoriAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autoriAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autoriAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autoriAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHAAUTORI);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelfecha_autoriAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		//jFormattedTextFieldfecha_autoriAutoriPagoOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_autoriAutoriPagoOrdenCompra= new JDateChooser();
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.setEnabled(false);
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autoriAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.setDate(new Date());
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autoriAutoriPagoOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autoriAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autoriAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotalAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabeltotalAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalAutoriPagoOrdenCompra.setToolTipText("Total");
		this.jLabeltotalAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPaneltotalAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jTextFieldtotalAutoriPagoOrdenCompra= new JTextFieldMe();
		jTextFieldtotalAutoriPagoOrdenCompra.setEnabled(false);
		jTextFieldtotalAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalAutoriPagoOrdenCompra.setText("0.0");

		this.jButtontotalAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtontotalAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtontotalAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_servidorAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelfecha_servidorAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHASERVIDOR+" : *");
		this.jLabelfecha_servidorAutoriPagoOrdenCompra.setToolTipText("Fecha Servidor");
		this.jLabelfecha_servidorAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_servidorAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_servidorAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_servidorAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHASERVIDOR);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelfecha_servidorAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		//jFormattedTextFieldfecha_servidorAutoriPagoOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_servidorAutoriPagoOrdenCompra= new JDateChooser();
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.setEnabled(false);
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_servidorAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.setDate(new Date());
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_servidorAutoriPagoOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_servidorAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_servidorAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asientoAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelcodigo_asientoAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_CODIGOASIENTO+" : *");
		this.jLabelcodigo_asientoAutoriPagoOrdenCompra.setToolTipText("Codigo Asiento");
		this.jLabelcodigo_asientoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asientoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asientoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asientoAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_CODIGOASIENTO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelcodigo_asientoAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jTextFieldcodigo_asientoAutoriPagoOrdenCompra= new JTextFieldMe();

		jTextFieldcodigo_asientoAutoriPagoOrdenCompra.setEnabled(false);
		jTextFieldcodigo_asientoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asientoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asientoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asientoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asientoAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_asientoAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelfecha_asientoAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHAASIENTO+" : *");
		this.jLabelfecha_asientoAutoriPagoOrdenCompra.setToolTipText("Fecha Asiento");
		this.jLabelfecha_asientoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_asientoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_asientoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_asientoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_asientoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_asientoAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_FECHAASIENTO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelfecha_asientoAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		//jFormattedTextFieldfecha_asientoAutoriPagoOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_asientoAutoriPagoOrdenCompra= new JDateChooser();
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.setEnabled(false);
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_asientoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.setDate(new Date());
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_asientoAutoriPagoOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_asientoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_asientoAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_asientoAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelvalor_asientoAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_VALORASIENTO+" : *");
		this.jLabelvalor_asientoAutoriPagoOrdenCompra.setToolTipText("Valor Asiento");
		this.jLabelvalor_asientoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_asientoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_asientoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_asientoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_asientoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_asientoAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_VALORASIENTO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelvalor_asientoAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jTextFieldvalor_asientoAutoriPagoOrdenCompra= new JTextFieldMe();
		jTextFieldvalor_asientoAutoriPagoOrdenCompra.setEnabled(false);
		jTextFieldvalor_asientoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_asientoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_asientoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_asientoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_asientoAutoriPagoOrdenCompra.setText("0.0");

		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_asientoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_asientoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_asientoAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotal_saldoAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabeltotal_saldoAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_TOTALSALDO+" : *");
		this.jLabeltotal_saldoAutoriPagoOrdenCompra.setToolTipText("Total Saldo");
		this.jLabeltotal_saldoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_saldoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_saldoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_saldoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_saldoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_saldoAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_TOTALSALDO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPaneltotal_saldoAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jTextFieldtotal_saldoAutoriPagoOrdenCompra= new JTextFieldMe();
		jTextFieldtotal_saldoAutoriPagoOrdenCompra.setEnabled(false);
		jTextFieldtotal_saldoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_saldoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_saldoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_saldoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_saldoAutoriPagoOrdenCompra.setText("0.0");

		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_saldoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_saldoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_saldoAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_saldoAutoriPagoOrdenCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAutoriPagoOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_cambioAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_tipo_cambioAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDTIPOCAMBIO+" : *");
		this.jLabelid_tipo_cambioAutoriPagoOrdenCompra.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioAutoriPagoOrdenCompra"));

		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_monedaAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_monedaAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaAutoriPagoOrdenCompra.setToolTipText("Moneda");
		this.jLabelid_monedaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_monedaAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_monedaAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_monedaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_monedaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_monedaAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAutoriPagoOrdenCompra"));

		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_monedaAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_monedaAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_monedaAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_clienteAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_clienteAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteAutoriPagoOrdenCompra.setToolTipText("Cliente");
		this.jLabelid_clienteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_clienteAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_clienteAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_clienteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_clienteAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_clienteAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriPagoOrdenCompra"));

		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_clienteAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_clienteAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_clienteAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_empresaAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_empresaAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAutoriPagoOrdenCompra.setToolTipText("Empresa");
		this.jLabelid_empresaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_empresaAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_empresaAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_empresaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAutoriPagoOrdenCompra.setEnabled(false);

		this.jButtonid_empresaAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_empresaAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_empresaAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriPagoOrdenCompra"));

		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_empresaAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_empresaAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_sucursalAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_sucursalAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAutoriPagoOrdenCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_sucursalAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_sucursalAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_sucursalAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAutoriPagoOrdenCompra.setEnabled(false);

		this.jButtonid_sucursalAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_sucursalAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_sucursalAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriPagoOrdenCompra"));

		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_orden_compraAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_orden_compraAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA+" : *");
		this.jLabelid_orden_compraAutoriPagoOrdenCompra.setToolTipText("Orden Compra");
		this.jLabelid_orden_compraAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_compraAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_compraAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_orden_compraAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_orden_compraAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_compraAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_orden_compraAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_orden_compraAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_compraAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraAutoriPagoOrdenCompra"));

		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraAutoriPagoOrdenCompraUpdate"));


		jButtonid_orden_compraAutoriPagoOrdenCompraArbol= new JButtonMe();
		jButtonid_orden_compraAutoriPagoOrdenCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraAutoriPagoOrdenCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraAutoriPagoOrdenCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraAutoriPagoOrdenCompraArbol.setText("Arbol");
		jButtonid_orden_compraAutoriPagoOrdenCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_orden_compraAutoriPagoOrdenCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraAutoriPagoOrdenCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraAutoriPagoOrdenCompraArbol"));



					
		this.jLabelid_transaccionAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_transaccionAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionAutoriPagoOrdenCompra.setToolTipText("Transaccion");
		this.jLabelid_transaccionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_transaccionAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_transaccionAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_transaccionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_transaccionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_transaccionAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAutoriPagoOrdenCompra"));

		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_moduloAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_moduloAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloAutoriPagoOrdenCompra.setToolTipText("Modulo");
		this.jLabelid_moduloAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_moduloAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_moduloAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_moduloAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloAutoriPagoOrdenCompra.setEnabled(false);

		this.jButtonid_moduloAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_moduloAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_moduloAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAutoriPagoOrdenCompra"));

		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_moduloAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_moduloAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_moduloAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_ejercicioAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_ejercicioAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioAutoriPagoOrdenCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_ejercicioAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_ejercicioAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.setEnabled(false);

		this.jButtonid_ejercicioAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_ejercicioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_ejercicioAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAutoriPagoOrdenCompra"));

		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_usuarioAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_usuarioAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioAutoriPagoOrdenCompra.setToolTipText("Usuario");
		this.jLabelid_usuarioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_usuarioAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_usuarioAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_usuarioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioAutoriPagoOrdenCompra.setEnabled(false);

		this.jButtonid_usuarioAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_usuarioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_usuarioAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriPagoOrdenCompra"));

		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_asiento_contableAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_asiento_contableAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableAutoriPagoOrdenCompra.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_asiento_contableAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_asiento_contableAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_asiento_contableAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_asiento_contableAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableAutoriPagoOrdenCompra"));

		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_bancoAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_bancoAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoAutoriPagoOrdenCompra.setToolTipText("Banco");
		this.jLabelid_bancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_bancoAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_bancoAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_bancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_bancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_bancoAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoAutoriPagoOrdenCompra"));

		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_bancoAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_bancoAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_bancoAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoAutoriPagoOrdenCompraUpdate"));



					
		this.jLabelid_cuenta_bancoAutoriPagoOrdenCompra = new JLabelMe();
		this.jLabelid_cuenta_bancoAutoriPagoOrdenCompra.setText(""+AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDCUENTABANCO+" : *");
		this.jLabelid_cuenta_bancoAutoriPagoOrdenCompra.setToolTipText("Cuenta Banco");
		this.jLabelid_cuenta_bancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra.setToolTipText(AutoriPagoOrdenCompraConstantesFunciones.LABEL_IDCUENTABANCO);
		this.gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra.setLayout(this.gridaBagLayoutAutoriPagoOrdenCompra);


		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra= new JComboBoxMe();
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra= new JButtonMe();
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra.setText("Buscar");
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoAutoriPagoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoAutoriPagoOrdenCompra"));

		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setText("U");
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoAutoriPagoOrdenCompraBusqueda"));

		if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate.setText("U");
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoAutoriPagoOrdenCompraUpdate"));



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
		//this.jInternalFrameDetalleAutoriPagoOrdenCompra = new AutoriPagoOrdenCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Autori Pago Orden Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriPagoOrdenCompra= new GridBagLayout();
		

		
		String sToolTipAutoriPagoOrdenCompra="";
		sToolTipAutoriPagoOrdenCompra=AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriPagoOrdenCompra+="(Tesoreria.AutoriPagoOrdenCompra)";
		}
		
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriPagoOrdenCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonModificarAutoriPagoOrdenCompra = new JButtonMe();
        this.jButtonActualizarAutoriPagoOrdenCompra = new JButtonMe();
        this.jButtonEliminarAutoriPagoOrdenCompra = new JButtonMe();
        this.jButtonCancelarAutoriPagoOrdenCompra = new JButtonMe();
        this.jButtonGuardarCambiosAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra = new JButtonMe();
		this.jButtonCerrarAutoriPagoOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosAutoriPagoOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra = new JScrollPane();
				
		
		
		this.jPanelCamposAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Autori Pago Orden Compra";
		
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pago Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriPagoOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAutoriPagoOrdenCompra.setName("jPanelCamposAutoriPagoOrdenCompra"); 

		this.jPanelCamposOcultosAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAutoriPagoOrdenCompra.setName("jPanelCamposOcultosAutoriPagoOrdenCompra"); 

        this.jPanelAccionesAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriPagoOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesAutoriPagoOrdenCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAutoriPagoOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAutoriPagoOrdenCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAutoriPagoOrdenCompra.setText("Nuevo");
		this.jButtonModificarAutoriPagoOrdenCompra.setText("Editar");
        this.jButtonActualizarAutoriPagoOrdenCompra.setText("Actualizar");
        this.jButtonEliminarAutoriPagoOrdenCompra.setText("Eliminar");
        this.jButtonCancelarAutoriPagoOrdenCompra.setText("Cancelar");
        this.jButtonGuardarCambiosAutoriPagoOrdenCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.setText("Guardar");
		this.jButtonCerrarAutoriPagoOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriPagoOrdenCompra,"nuevo_button","Nuevo",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAutoriPagoOrdenCompra,"modificar_button","Editar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAutoriPagoOrdenCompra,"actualizar_button","Actualizar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAutoriPagoOrdenCompra,"eliminar_button","Eliminar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAutoriPagoOrdenCompra,"cancelar_button","Cancelar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAutoriPagoOrdenCompra,"guardarcambios_button","Guardar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra,"guardarcambiostabla_button","Guardar",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriPagoOrdenCompra,"cerrar_button","Salir",this.autoripagoordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAutoriPagoOrdenCompra.setToolTipText("Nuevo"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAutoriPagoOrdenCompra.setToolTipText("Editar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAutoriPagoOrdenCompra.setToolTipText("Actualizar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAutoriPagoOrdenCompra.setToolTipText("Eliminar)"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAutoriPagoOrdenCompra.setToolTipText("Cancelar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAutoriPagoOrdenCompra.setToolTipText("Guardar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.setToolTipText("Guardar"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriPagoOrdenCompra.setToolTipText("Salir"+" "+AutoriPagoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriPagoOrdenCompra";
		inputMap = this.jButtonNuevoAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriPagoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriPagoOrdenCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAutoriPagoOrdenCompra";
		inputMap = this.jButtonActualizarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAutoriPagoOrdenCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarAutoriPagoOrdenCompra";
		inputMap = this.jButtonEliminarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAutoriPagoOrdenCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarAutoriPagoOrdenCompra";
		inputMap = this.jButtonCancelarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAutoriPagoOrdenCompra"));
		
		//CERRAR		
		sMapKey = "CerrarAutoriPagoOrdenCompra";
		inputMap = this.jButtonCerrarAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriPagoOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriPagoOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriPagoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriPagoOrdenCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAutoriPagoOrdenCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAutoriPagoOrdenCompra.setToolTipText("Nuevo AutoriPagoOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAutoriPagoOrdenCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAutoriPagoOrdenCompra.setToolTipText("Sin Cerrar Ventana AutoriPagoOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAutoriPagoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAutoriPagoOrdenCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAutoriPagoOrdenCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAutoriPagoOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesAutoriPagoOrdenCompra.setText("Acciones");		
		this.jLabelAccionesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAutoriPagoOrdenCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAutoriPagoOrdenCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAutoriPagoOrdenCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesAutoriPagoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAutoriPagoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAutoriPagoOrdenCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAutoriPagoOrdenCompra = new GridBagLayout();
		
		this.jPanelCamposAutoriPagoOrdenCompra.setLayout(gridaBagLayoutCamposAutoriPagoOrdenCompra);
		this.jPanelCamposOcultosAutoriPagoOrdenCompra.setLayout(gridaBagLayoutCamposOcultosAutoriPagoOrdenCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAutoriPagoOrdenCompra.add(jLabelIdAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAutoriPagoOrdenCompra.add(jLabelidAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.add(jLabelid_tipo_cambioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.add(jButtonid_tipo_cambioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.add(jButtonid_tipo_cambioAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 4;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.add(jButtonid_tipo_cambioAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioAutoriPagoOrdenCompra.add(jComboBoxid_tipo_cambioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaAutoriPagoOrdenCompra.add(jLabelid_monedaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaAutoriPagoOrdenCompra.add(jButtonid_monedaAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaAutoriPagoOrdenCompra.add(jButtonid_monedaAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaAutoriPagoOrdenCompra.add(jComboBoxid_monedaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteAutoriPagoOrdenCompra.add(jLabelid_clienteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteAutoriPagoOrdenCompra.add(jButtonid_clienteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAutoriPagoOrdenCompra.add(jButtonid_clienteAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 4;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAutoriPagoOrdenCompra.add(jButtonid_clienteAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteAutoriPagoOrdenCompra.add(jComboBoxid_clienteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAutoriPagoOrdenCompra.add(jLabelid_empresaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriPagoOrdenCompra.add(jButtonid_empresaAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriPagoOrdenCompra.add(jButtonid_empresaAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAutoriPagoOrdenCompra.add(jComboBoxid_empresaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAutoriPagoOrdenCompra.add(jLabelid_sucursalAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriPagoOrdenCompra.add(jButtonid_sucursalAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriPagoOrdenCompra.add(jButtonid_sucursalAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAutoriPagoOrdenCompra.add(jComboBoxid_sucursalAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_compraAutoriPagoOrdenCompra.add(jLabelid_orden_compraAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraAutoriPagoOrdenCompra.add(jButtonid_orden_compraAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraAutoriPagoOrdenCompra.add(jButtonid_orden_compraAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_compraAutoriPagoOrdenCompra.add(jComboBoxid_orden_compraAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionAutoriPagoOrdenCompra.add(jLabelid_transaccionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAutoriPagoOrdenCompra.add(jButtonid_transaccionAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAutoriPagoOrdenCompra.add(jButtonid_transaccionAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionAutoriPagoOrdenCompra.add(jComboBoxid_transaccionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloAutoriPagoOrdenCompra.add(jLabelid_moduloAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAutoriPagoOrdenCompra.add(jButtonid_moduloAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAutoriPagoOrdenCompra.add(jButtonid_moduloAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloAutoriPagoOrdenCompra.add(jComboBoxid_moduloAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioAutoriPagoOrdenCompra.add(jLabelid_ejercicioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAutoriPagoOrdenCompra.add(jButtonid_ejercicioAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAutoriPagoOrdenCompra.add(jButtonid_ejercicioAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioAutoriPagoOrdenCompra.add(jComboBoxid_ejercicioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioAutoriPagoOrdenCompra.add(jLabelid_usuarioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAutoriPagoOrdenCompra.add(jButtonid_usuarioAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAutoriPagoOrdenCompra.add(jButtonid_usuarioAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioAutoriPagoOrdenCompra.add(jComboBoxid_usuarioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableAutoriPagoOrdenCompra.add(jLabelid_asiento_contableAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableAutoriPagoOrdenCompra.add(jButtonid_asiento_contableAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableAutoriPagoOrdenCompra.add(jButtonid_asiento_contableAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 4;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableAutoriPagoOrdenCompra.add(jButtonid_asiento_contableAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableAutoriPagoOrdenCompra.add(jComboBoxid_asiento_contableAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoAutoriPagoOrdenCompra.add(jLabelid_bancoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoAutoriPagoOrdenCompra.add(jButtonid_bancoAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoAutoriPagoOrdenCompra.add(jButtonid_bancoAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoAutoriPagoOrdenCompra.add(jComboBoxid_bancoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra.add(jLabelid_cuenta_bancoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra.add(jButtonid_cuenta_bancoAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 3;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra.add(jButtonid_cuenta_bancoAutoriPagoOrdenCompraUpdate, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra.add(jComboBoxid_cuenta_bancoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteAutoriPagoOrdenCompra.add(jLabelnumero_comprobanteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteAutoriPagoOrdenCompra.add(jButtonnumero_comprobanteAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteAutoriPagoOrdenCompra.add(jTextFieldnumero_comprobanteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAutoriPagoOrdenCompra.add(jLabelfechaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAutoriPagoOrdenCompra.add(jButtonfechaAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAutoriPagoOrdenCompra.add(jDateChooserfechaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_autoriAutoriPagoOrdenCompra.add(jLabelfecha_autoriAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autoriAutoriPagoOrdenCompra.add(jButtonfecha_autoriAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_autoriAutoriPagoOrdenCompra.add(jDateChooserfecha_autoriAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalAutoriPagoOrdenCompra.add(jLabeltotalAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalAutoriPagoOrdenCompra.add(jButtontotalAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalAutoriPagoOrdenCompra.add(jTextFieldtotalAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_servidorAutoriPagoOrdenCompra.add(jLabelfecha_servidorAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_servidorAutoriPagoOrdenCompra.add(jButtonfecha_servidorAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_servidorAutoriPagoOrdenCompra.add(jDateChooserfecha_servidorAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asientoAutoriPagoOrdenCompra.add(jLabelcodigo_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asientoAutoriPagoOrdenCompra.add(jButtoncodigo_asientoAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asientoAutoriPagoOrdenCompra.add(jTextFieldcodigo_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_asientoAutoriPagoOrdenCompra.add(jLabelfecha_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_asientoAutoriPagoOrdenCompra.add(jButtonfecha_asientoAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_asientoAutoriPagoOrdenCompra.add(jDateChooserfecha_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_asientoAutoriPagoOrdenCompra.add(jLabelvalor_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_asientoAutoriPagoOrdenCompra.add(jButtonvalor_asientoAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_asientoAutoriPagoOrdenCompra.add(jTextFieldvalor_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_saldoAutoriPagoOrdenCompra.add(jLabeltotal_saldoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 2;
		this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_saldoAutoriPagoOrdenCompra.add(jButtontotal_saldoAutoriPagoOrdenCompraBusqueda, this.gridBagConstraintsAutoriPagoOrdenCompra);
	}

	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 1;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_saldoAutoriPagoOrdenCompra.add(jTextFieldtotal_saldoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelidAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_tipo_cambioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_monedaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_clienteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_orden_compraAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_transaccionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_asiento_contableAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_bancoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelid_cuenta_bancoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelnumero_comprobanteAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelfechaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelfecha_autoriAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPaneltotalAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelfecha_servidorAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelcodigo_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelfecha_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPanelvalor_asientoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPagoOrdenCompra.add(this.jPaneltotal_saldoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposAutoriPagoOrdenCompra=0;
		iYPanelCamposAutoriPagoOrdenCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposOcultosAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposOcultosAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPagoOrdenCompra.add(this.jPanelid_empresaAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposOcultosAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposOcultosAutoriPagoOrdenCompra=0;
		iYPanelCamposOcultosAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposOcultosAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposOcultosAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPagoOrdenCompra.add(this.jPanelid_sucursalAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposOcultosAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposOcultosAutoriPagoOrdenCompra=0;
		iYPanelCamposOcultosAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposOcultosAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposOcultosAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPagoOrdenCompra.add(this.jPanelid_moduloAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposOcultosAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposOcultosAutoriPagoOrdenCompra=0;
		iYPanelCamposOcultosAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposOcultosAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposOcultosAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPagoOrdenCompra.add(this.jPanelid_ejercicioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposOcultosAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposOcultosAutoriPagoOrdenCompra=0;
		iYPanelCamposOcultosAutoriPagoOrdenCompra++;
	}
	this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iYPanelCamposOcultosAutoriPagoOrdenCompra;
	this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iXPanelCamposOcultosAutoriPagoOrdenCompra++;
	this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPagoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPagoOrdenCompra.add(this.jPanelid_usuarioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);



	if(iXPanelCamposOcultosAutoriPagoOrdenCompra % 3==0) {
		iXPanelCamposOcultosAutoriPagoOrdenCompra=0;
		iYPanelCamposOcultosAutoriPagoOrdenCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesAutoriPagoOrdenCompra= new GridBagLayout();
		this.jPanelAccionesAutoriPagoOrdenCompra.setLayout(gridaBagLayoutAccionesAutoriPagoOrdenCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAutoriPagoOrdenCompra= new GridBagLayout();
		this.jPanelAccionesFormularioAutoriPagoOrdenCompra.setLayout(gridaBagLayoutAccionesFormularioAutoriPagoOrdenCompra);
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriPagoOrdenCompra.add(this.jComboBoxTiposAccionesFormularioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriPagoOrdenCompra.add(this.jCheckBoxPostAccionNuevoAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.autoripagoordencompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriPagoOrdenCompra.add(this.jCheckBoxPostAccionSinCerrarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.autoripagoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriPagoOrdenCompra.add(this.jCheckBoxPostAccionSinMensajeAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesAutoriPagoOrdenCompra.add(this.jButtonModificarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);							

		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesAutoriPagoOrdenCompra.add(this.jButtonEliminarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriPagoOrdenCompra.add(this.jButtonActualizarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);


		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriPagoOrdenCompra.add(this.jButtonGuardarCambiosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);	
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = 0;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesAutoriPagoOrdenCompra.add(this.jButtonCancelarAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriPagoOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriPagoOrdenCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsAutoriPagoOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriPagoOrdenCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =0;
		this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriPagoOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AutoriPagoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAutoriPagoOrdenCompra = new AutoriPagoOrdenCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Autori Pago Orden Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Autori Pago Orden Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autori Pago Orden Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AutoriPagoOrdenCompraModel autoripagoordencompraModel=new AutoriPagoOrdenCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//AutoriPagoOrdenCompraModel.AutoriPagoOrdenCompraFocusTraversalPolicy autoripagoordencompraFocusTraversalPolicy = autoripagoordencompraModel.new AutoriPagoOrdenCompraFocusTraversalPolicy(this);
			
			//autoripagoordencompraFocusTraversalPolicy.setautoripagoordencompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(autoripagoordencompraModel);
			
			
			this.jContentPaneDetalleAutoriPagoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAutoriPagoOrdenCompra = new GridBagLayout();	
			this.jContentPaneDetalleAutoriPagoOrdenCompra.setLayout(gridaBagLayoutDetalleAutoriPagoOrdenCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriPagoOrdenCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
					
				
				this.jContentPaneDetalleAutoriPagoOrdenCompra.add(jTtoolBarDetalleAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);								
				
}
			
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra=   new JScrollPane(jContentPaneDetalleAutoriPagoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	        
			this.jContentPaneDetalleAutoriPagoOrdenCompra.add(jPanelCamposAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);
			
			
			
			
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
						&& autoripagoordencompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.autoripagoordencompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAutoriPagoOrdenCompra= new GridBagConstraints();
						this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
						this.jContentPaneDetalleAutoriPagoOrdenCompra.add(this.jTabbedPaneRelacionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAutoriPagoOrdenCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAutoriPagoOrdenCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
					this.gridBagConstraintsAutoriPagoOrdenCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
					
				
					this.jContentPaneDetalleAutoriPagoOrdenCompra.add(jPanelCamposOcultosAutoriPagoOrdenCompra, gridBagConstraintsAutoriPagoOrdenCompra);
				
					this.jPanelCamposOcultosAutoriPagoOrdenCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	        this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAutoriPagoOrdenCompra.add(this.jPanelAccionesFormularioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);							
			
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
	        this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleAutoriPagoOrdenCompra.add(this.jPanelAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAutoriPagoOrdenCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra=   new JScrollPane(this.jPanelCamposAutoriPagoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
			this.gridBagConstraintsAutoriPagoOrdenCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAutoriPagoOrdenCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAutoriPagoOrdenCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);			
			
			this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
			
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		
			
		this.gridBagConstraintsAutoriPagoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPagoOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriPagoOrdenCompra, this.gridBagConstraintsAutoriPagoOrdenCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAutoriPagoOrdenCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionAutoriPagoOrdenCompra;
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
